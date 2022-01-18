package com.project.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.color.DynamicColors;

public class MainActivity extends AppCompatActivity {
    Button dummyLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DynamicColors.applyToActivitiesIfAvailable(getApplication());
        dummyLogin = findViewById(R.id.dummy_login);


        dummyLogin.setOnClickListener(view -> {
            Intent homeIntent = new Intent(this, HomeActivity.class);
            startActivity(homeIntent);
        });

    }
}