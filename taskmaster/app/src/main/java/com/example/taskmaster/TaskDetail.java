package com.example.taskmaster;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TaskDetail extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        String taskName = getIntent().getStringExtra(MainActivity.TASK_NAME);
        TextView taskTitle = findViewById(R.id.taskDetailTitle);
        taskTitle.setText(taskName);
    }
}
