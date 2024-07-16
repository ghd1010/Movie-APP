package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class cocoActivity extends AppCompatActivity {
    TextView title;
    TextView label1;
    TextView label2;
    TextView label3;
    TextView label4;
    TextView label5Rating;
    TextView label6;
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coco_movie);

        title= findViewById(R.id.cocoTitle);
        label1= findViewById(R.id.cocoClass);
        label2= findViewById(R.id.cocoRating);
        label3= findViewById(R.id.cocoStoryLabel);
        label4= findViewById(R.id.cocoClassLabel);
        label5Rating= findViewById(R.id.cocoRatingLabel);
        label6= findViewById(R.id.cocoStory);
        image= findViewById(R.id.cocoImage);


        Button button = (Button) findViewById(R.id.cocoBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMainActivity();
            }
        });

    }

    public void backToMainActivity(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
