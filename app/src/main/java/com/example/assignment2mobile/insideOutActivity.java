package com.example.assignment2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class insideOutActivity extends AppCompatActivity {
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
        setContentView(R.layout.inside_out);

        title= findViewById(R.id.insideOutTitle);
        label1= findViewById(R.id.insideOutClass);
        label2= findViewById(R.id.insideOutRating);
        label3= findViewById(R.id.insideOutStoryLabel);
        label4= findViewById(R.id.insideOutClassLabel);
        label5= findViewById(R.id.insideOutRatingLabel);
        label6= findViewById(R.id.insideOutStory);
        image= findViewById(R.id.insideOutImage);


        Button button = (Button) findViewById(R.id.insideOutBack);
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
