package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class moanaActivity extends AppCompatActivity {
    TextView title;
    TextView label1;
    TextView label2;
    TextView label3;
    TextView label4;
    TextView label5;
    TextView label6;
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moana);

        title= findViewById(R.id.moanaTitle);
        label1= findViewById(R.id.moanaClass);
        label2= findViewById(R.id.moanaRating);
        label3= findViewById(R.id.moanaStoryLabel);
        label4= findViewById(R.id.moanaClassLabel);
        label5= findViewById(R.id.moanaRatingLabel);
        label6= findViewById(R.id.moanaStory);
        image= findViewById(R.id.moanaImage);


        Button button = (Button) findViewById(R.id.moanaBack);
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
