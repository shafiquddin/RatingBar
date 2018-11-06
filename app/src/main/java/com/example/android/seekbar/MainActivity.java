package com.example.android.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {
    TextView textView;
    RatingBar ratingbar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addOnclickListeners();
    }

    public void addOnclickListeners(){
        textView= findViewById(R.id.text);
        ratingbar= findViewById(R.id.rating);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating=String.valueOf(ratingbar.getRating());
                textView.setText(String.valueOf(rating));
            }
        });
    }
}
