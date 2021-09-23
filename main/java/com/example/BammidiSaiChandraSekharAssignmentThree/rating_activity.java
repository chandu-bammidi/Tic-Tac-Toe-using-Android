package com.example.BammidiSaiChandraSekharAssignmentThree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class rating_activity extends AppCompatActivity {
    Button ratbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_activity);
        ratbt=findViewById(R.id.ratbt);
        final RatingBar ratingBar = findViewById(R.id.ratingBar1);
        ratbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                if(rating>=0.5 && rating<=2.0)
                {
                    Toast.makeText(getApplicationContext(), "Thanks For the Rating!", Toast.LENGTH_LONG).show();
                }
                else if(rating>2.0 && rating<3.5)
                {
                    Toast.makeText(getApplicationContext(), "Thanks For the Rating!", Toast.LENGTH_LONG).show();
                }
                else if(rating>=3.5 && rating<=5)
                {
                    Toast.makeText(getApplicationContext(), "Thanks For the Rating!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}