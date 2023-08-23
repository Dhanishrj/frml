package com.example.tech4impact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AfterRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_registration);

        Toolbar toolbar = findViewById(R.id.toolbar2);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle back button click here
        if (item.getItemId() == android.R.id.home) {
            // Perform your desired action, e.g., navigate back or finish the current activity
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
