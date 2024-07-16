package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class turningRedActivity extends AppCompatActivity {
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
        setContentView(R.layout.turning_red);

        title= findViewById(R.id.turningTitle);
        label1= findViewById(R.id.turningClass);
        label2= findViewById(R.id.turningRating);
        label3= findViewById(R.id.turningStoryLabel);
        label4= findViewById(R.id.turningClassLabel);
        label5= findViewById(R.id.turningRatingLabel);
        label6= findViewById(R.id.turningStory);
        image= findViewById(R.id.turningImage);


        Button button = (Button) findViewById(R.id.turningBack);
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
