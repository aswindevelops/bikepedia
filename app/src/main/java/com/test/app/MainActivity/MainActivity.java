package com.test.app.MainActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.test.app.DetailedActivity.DetailedActivity;
import com.test.app.R;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private Button tempButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("BikePedia");


        //temporary
        tempButton = findViewById(R.id.home_temp_button);
        tempButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent detailedIntent = new Intent(MainActivity.this,DetailedActivity.class);
                        startActivity(detailedIntent);
                    }
                }
        );
    }
}
