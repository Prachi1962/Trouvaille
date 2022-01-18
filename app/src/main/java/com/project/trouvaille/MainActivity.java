package com.project.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.color.DynamicColors;

public class MainActivity extends AppCompatActivity {
    Button dummyLogin;
    TextView member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DynamicColors.applyToActivitiesIfAvailable(getApplication());
        dummyLogin = findViewById(R.id.dummy_login);
        member = findViewById(R.id.not_a_member);

        member.setOnClickListener(view -> {
            Intent Signup = new Intent(this, SignupActivity.class);
            startActivity(Signup);
            finish();
        });


        dummyLogin.setOnClickListener(view -> {
            Intent homeIntent = new Intent(this, HomeActivity.class);
            startActivity(homeIntent);
            finish();
        });

    }
}