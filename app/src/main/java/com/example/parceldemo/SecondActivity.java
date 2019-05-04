package com.example.parceldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Author: Sanjeev Kumar
 * Created on: 04-May-19 2:43 PM
 * https://www.tutorialblocks.com
 */
public class SecondActivity extends AppCompatActivity {

    private ArrayList<Movie> movieArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        movieArrayList = getIntent().getParcelableArrayListExtra("bookingParcel");
        for (Movie movie : movieArrayList) {
            Log.d("Booking Parcel Data ::", movie.getMovieName());
            Log.d("Booking Parcel Data ::", movie.getMoviePoster());
            Log.d("Booking Parcel Data ::", "" + movie.getMovieRating());
        }
        findViewById(R.id.btnSendParcel2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sending parcel to Third Activity....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putParcelableArrayListExtra("bookingParcel", movieArrayList);
                startActivity(intent);
            }
        });
    }
}
