package com.example.parceldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

/**
 * Author: Sanjeev Kumar
 * Created on: 04-May-19 2:43 PM
 * https://www.tutorialblocks.com
 */
public class MainActivity extends AppCompatActivity {
    private Movie movie;
    private ArrayList<Movie> moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moviesList = new ArrayList<>();
        movie = new Movie();
        movie.setMovieName("Avengers");
        movie.setMoviePoster("Yes");
        movie.setMovieRating(5);
        moviesList.add(movie);

        movie = new Movie();
        movie.setMovieName("Terminator");
        movie.setMoviePoster("No");
        movie.setMovieRating(4);
        moviesList.add(movie);

        findViewById(R.id.btnSendParcel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putParcelableArrayListExtra("bookingParcel", moviesList);
                startActivity(intent);
            }
        });
    }
}
