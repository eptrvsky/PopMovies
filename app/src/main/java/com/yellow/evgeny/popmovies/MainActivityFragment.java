package com.yellow.evgeny.popmovies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by Evgeny on 11.08.2015.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecastArray = {
                "Title,YEAR,120min",
                "Trailer",
                "Trailer",
                "Trailer",
                "Trailer",
                "Trailer",
        };
        return rootView;
    }
}