package com.project.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.color.DynamicColors;

public class SignupActivity extends AppCompatActivity {
    Button signup_dummy;
    TextView already_member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        DynamicColors.applyToActivitiesIfAvailable(getApplication());
        signup_dummy = findViewById(R.id.dummy_signup);
        already_member = findViewById(R.id.already_a_member);

        signup_dummy.setOnClickListener(view -> {
            Intent SignupIntent = new Intent(this, HomeActivity.class);
            startActivity(SignupIntent);
            finish();
        });


        already_member.setOnClickListener(view -> {
            Intent loginIntent = new Intent(this, MainActivity.class);
            startActivity(loginIntent);
            finish();
        });
    }
}