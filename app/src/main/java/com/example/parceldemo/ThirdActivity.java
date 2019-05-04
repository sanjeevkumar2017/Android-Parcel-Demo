package com.example.parceldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * Author: Sanjeev Kumar
 * Created on: 04-May-19 2:43 PM
 * https://www.tutorialblocks.com
 */
public class ThirdActivity extends AppCompatActivity {

    private ArrayList<Movie> movieArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d(this.getClass().getSimpleName(), "-------------Printing data on third Activity----------");
        movieArrayList = getIntent().getParcelableArrayListExtra("bookingParcel");
        for (Movie movie : movieArrayList) {
            Log.d("Booking Parcel Data ::", movie.getMovieName());
            Log.d("Booking Parcel Data ::", movie.getMoviePoster());
            Log.d("Booking Parcel Data ::", "" + movie.getMovieRating());
        }

        findViewById(R.id.btnSendParcel3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, DashboardActivity.class);
                intent.putExtra("bookingParcel", movieArrayList);
                startActivity(intent);
            }
        });
    }
}