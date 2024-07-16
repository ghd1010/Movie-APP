package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class lucaActivity extends AppCompatActivity {
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
        setContentView(R.layout.luca);

        title= findViewById(R.id.lucaTitle);
        label1= findViewById(R.id.lucaClass);
        label2= findViewById(R.id.lucaRating);
        label3= findViewById(R.id.lucaStoryLabel);
        label4= findViewById(R.id.lucaClassLabel);
        label5= findViewById(R.id.lucaRatingLabel);
        label6= findViewById(R.id.lucaStory);
        image= findViewById(R.id.lucaImage);


        Button button = (Button) findViewById(R.id.lucaBack);
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
