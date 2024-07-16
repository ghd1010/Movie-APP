package com.example.assignment2mobile;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.view.MenuInflater;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            List<items> itemsList = new ArrayList<>();
            itemsList.add(new items(R.drawable.coco, "Coco"));
            itemsList.add(new items(R.drawable.encanto, "Encanto"));
            itemsList.add(new items(R.drawable.finding_nemo, "Finding Nemo"));
            itemsList.add(new items(R.drawable.inside_out, "Inside Out"));
            itemsList.add(new items(R.drawable.luca, "Luca"));
            itemsList.add(new items(R.drawable.madagascar3, "Madagascar 3"));
            itemsList.add(new items(R.drawable.moana, "Moana"));
            itemsList.add(new items(R.drawable.turning_red, "Turning Red"));
            GridView gridView = findViewById(R.id.grid_view);
            CustomAdapter customAdapter = new CustomAdapter(this, R.layout.grid_item, itemsList);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position==0){

                        Intent intent = new Intent(MainActivity.this, cocoActivity.class);
                        startActivity(intent);

                    } else if (position==1) {
                        Intent intent = new Intent(MainActivity.this, encantoActivity.class);
                        startActivity(intent);
                    }

                    else if (position==2) {
                        Intent intent = new Intent(MainActivity.this, findingNemoActivity.class);
                        startActivity(intent);
                    }
                    else if (position==3) {
                        Intent intent = new Intent(MainActivity.this, insideOutActivity.class);
                        startActivity(intent);
                    }
                    else if (position==4) {
                        Intent intent = new Intent(MainActivity.this, lucaActivity.class);
                        startActivity(intent);
                    }
                    else if (position==5) {
                        Intent intent = new Intent(MainActivity.this, madagascarActivity.class);
                        startActivity(intent);
                    }

                    else if (position==6) {
                        Intent intent = new Intent(MainActivity.this, moanaActivity.class);
                        startActivity(intent);
                    }

                    else if (position==7) {
                        Intent intent = new Intent(MainActivity.this, turningRedActivity.class);
                        startActivity(intent);
                    }

                }
            });
        }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "On Resume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(), "On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(), "On Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(), "On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.app_info,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.app_info) {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
            return true;
        }
        else {
                return super.onOptionsItemSelected(item);
        }
        }
    }











