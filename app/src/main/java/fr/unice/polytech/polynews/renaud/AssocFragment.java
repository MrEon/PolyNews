package fr.unice.polytech.polynews.renaud;

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

import fr.unice.polytech.polynews.NewsDataBaseHelper;
import fr.unice.polytech.polynews.R;

/**
 * Created by Renaud on 19/04/2016.
 */
public class AssocFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "Association Showcase";

        public AssocFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static AssocFragment newInstance(int sectionNumber) {
            AssocFragment fragment = new AssocFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText("");
            return rootView;
        }
}
