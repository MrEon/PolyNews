package fr.unice.polytech.polynews;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by user on 13/04/2016.
 */
public class NewsListFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "The NEWS!";
    private NewsDataBaseHelper mDB;
    public NewsListFragment() {
        try {
            mDB = new NewsDataBaseHelper(getContext());
            mDB.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static NewsListFragment newInstance(int sectionNumber) {
        NewsListFragment fragment = new NewsListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_news_list, container, false);
        GridView cards = (GridView) rootView.findViewById(R.id.gridView);
        cards.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getContext(), "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        View tiles = inflater.inflate(R.layout.article_layout, cards, false );
        tiles.setBackgroundColor(Color.DKGRAY);
        /*TextView textView = (TextView) rootView.findViewById(R.id.title);
        textView.setText(getString(R.string.societe, "Article Lambda"));*/
        return rootView;
    }
}
