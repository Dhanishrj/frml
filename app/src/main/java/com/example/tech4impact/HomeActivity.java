package com.example.tech4impact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonNavigate = findViewById(R.id.button2);

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
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);

        // If you want to pass data to the destination activity, you can use extras in the Intent
        // intent.putExtra("key", value);

        // Start the destination activity
        startActivity(intent);
    }
}
