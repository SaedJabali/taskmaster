package com.example.taskmaster;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddTask extends AppCompatActivity {


    private View.OnClickListener newTaskCreateListener = new View.OnClickListener() {
        public void onClick(View v) {
            TextView successLabel = findViewById(R.id.newTaskSubmitSuccess);
            successLabel.setVisibility(View.VISIBLE);

        }
    };

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        TextView successLabel = findViewById(R.id.newTaskSubmitSuccess);
        successLabel.setVisibility(View.GONE);

        Button newTaskCreateButton = findViewById(R.id.newTaskSubmit);
        newTaskCreateButton.setOnClickListener(newTaskCreateListener);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

}