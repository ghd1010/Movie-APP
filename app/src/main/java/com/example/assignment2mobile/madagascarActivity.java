package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class madagascarActivity extends AppCompatActivity {
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
        setContentView(R.layout.madagascar3);

        title= findViewById(R.id.magagascarTitle);
        label1= findViewById(R.id.magagascarClass);
        label2= findViewById(R.id.magagascarRating);
        label3= findViewById(R.id.magagascarStoryLabel);
        label4= findViewById(R.id.magagascarClassLabel);
        label5= findViewById(R.id.magagascarRatingLabel);
        label6= findViewById(R.id.magagascarStory);
        image= findViewById(R.id.magagascarImage);


        Button button = (Button) findViewById(R.id.magagascarBack);
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
