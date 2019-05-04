package com.example.parceldemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Author: Sanjeev Kumar
 * Created on: 04-May-19 2:43 PM
 * https://www.tutorialblocks.com
 */
public class MainFragment extends Fragment {
    View view;
    private ArrayList<Movie> movieArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.main_fragment, container, false);
        }
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.getClass().getSimpleName(), "-------------Printing data on Main Fragment ----------");
        movieArrayList = getActivity().getIntent().getParcelableArrayListExtra("bookingParcel");
        for (Movie movie : movieArrayList) {
            Log.d("Booking Parcel Data ::", movie.getMovieName());
            Log.d("Booking Parcel Data ::", movie.getMoviePoster());
            Log.d("Booking Parcel Data ::", "" + movie.getMovieRating());
        }
    }
}
