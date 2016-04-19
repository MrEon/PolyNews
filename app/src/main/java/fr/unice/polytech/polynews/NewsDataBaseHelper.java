package fr.unice.polytech.polynews;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * this class extracts the news from the database
 */
public class NewsDataBaseHelper extends SQLiteOpenHelper {

    private static String DB_PATH = "/data/data/fr.unice.polytech.polynews/databases/";
    private static String DB_NAME = "polynews_database";

    private SQLiteDatabase myDataBase;
    private final Context myContext;

    public NewsDataBaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
        this.myContext = context;
    }

    public void createDataBase() throws IOException {
        boolean dbExist = isDBExisting();
        if(!dbExist){
            this.getReadableDatabase();
            try {
                copyDataBase();
            } catch (IOException e) {
                throw new Error("an error has occured while copying the database");
            }
        }
    }

    private boolean isDBExisting(){
        SQLiteDatabase checkDB = null;
        try{
            String myPath = DB_PATH + DB_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        } catch(SQLiteException e){
        }
        if(checkDB != null){
            checkDB.close();
        }
        return checkDB != null;
    }

    private void copyDataBase() throws IOException{
        InputStream myInput = myContext.getAssets().open(DB_NAME);
        String outFileName = DB_PATH + DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer))>0){
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    public void openDataBase() throws SQLException {
        String myPath = DB_PATH + DB_NAME;
        myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
    }

    public List<News> extractNewsFromDB(){
        List<News> newsList = new ArrayList<>();
        Cursor c = myDataBase.rawQuery("SELECT * FROM news ORDER BY date DESC", null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            newsList.add(new News(c.getInt(0), c.getString(0), c.getString(1),
                    c.getString(2), c.getString(3), c.getInt(4), c.getInt(5),
                    c.getString(6)));
            c.moveToNext();
        }
        c.close();
        return newsList;
    }

    @Override
    public synchronized void close() {
        if(myDataBase != null)
            myDataBase.close();
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}