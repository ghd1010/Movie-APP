package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class encantoActivity extends AppCompatActivity {
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
        setContentView(R.layout.encanto);

        title= findViewById(R.id.encantoTitle);
        label1= findViewById(R.id.encantoRating);
        label2= findViewById(R.id.encantoClass);
        label3= findViewById(R.id.encantoClassLabel);
        label4= findViewById(R.id.encantoStoryLabel);
        label5= findViewById(R.id.encantoRatingLabel);
        label6= findViewById(R.id.encantoStory);
        image= findViewById(R.id.encantoImage);


        Button button = (Button) findViewById(R.id.encantoBack);
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
