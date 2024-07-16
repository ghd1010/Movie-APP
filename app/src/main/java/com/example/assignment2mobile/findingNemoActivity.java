package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class findingNemoActivity extends AppCompatActivity {
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
        setContentView(R.layout.finding_nemo);

        title= findViewById(R.id.nemoTitle);
        label1= findViewById(R.id.nemoClass);
        label2= findViewById(R.id.nemoRating);
        label3= findViewById(R.id.nemoStoryLabel);
        label4= findViewById(R.id.nemoClassLabel);
        label5= findViewById(R.id.nemoRatingLabel);
        label6= findViewById(R.id.nemoStory);
        image= findViewById(R.id.nemoImage);


        Button button = (Button) findViewById(R.id.nemoBack);
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
