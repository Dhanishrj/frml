package com.example.tech4impact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonNavigate = findViewById(R.id.register_button);

        buttonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the method to navigate to the destination activity
                navigateToDestinationActivity();

            }
        });
    }

    // Method to navigate to the destination activity
    private void navigateToDestinationActivity() {
        // Create an Intent to specify the current activity (SourceActivity) and the destination activity (DestinationActivity)
        Intent intent = new Intent(MainActivity.this, AfterRegistrationActivity.class);

        // If you want to pass data to the destination activity, you can use extras in the Intent
        // intent.putExtra("key", value);

        // Start the destination activity
        startActivity(intent);
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
