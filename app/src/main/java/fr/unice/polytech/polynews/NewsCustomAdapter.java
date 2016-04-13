package fr.unice.polytech.polynews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;



/**
 * Created by user on 13/04/2016.
 */
public class NewsCustomAdapter extends ArrayAdapter<News> {
    public NewsCustomAdapter(Context context, int resource) {
        super(context, resource);
    }

    public View getView(){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View convertView = null;
        if(convertView == null)
            convertView = inflater.inflate(R.layout.fragment_news_list, null);

        return convertView;
    }
}
