package com.example.taskmaster;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TASK_NAME = "taskName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newTaskButton = findViewById(R.id.addTaskButton);
        newTaskButton.setOnClickListener(goToNewTaskCreator);

        Button allTasksButton = findViewById(R.id.allTasksButton);
        allTasksButton.setOnClickListener(goToAllTasks);

        Button makeTaskDetailsButton = findViewById(R.id.makeTaskDetailsButton);
        makeTaskDetailsButton.setOnClickListener(goToTaskDetail);

        Button makeTaskDetailsButton1 = findViewById(R.id.makeTaskDetailsButton1);
        makeTaskDetailsButton1.setOnClickListener(goToTaskDetail1);

        Button makeTaskDetailsButton2 = findViewById(R.id.makeTaskDetailsButton2);
        makeTaskDetailsButton2.setOnClickListener(goToTaskDetail2);


        Button settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(goToSettings);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String username = preference.getString("username", "user") + "'s Tasks";
        TextView userLabel = findViewById(R.id.userTasksLabel);
        userLabel.setText(username);
    }

    private View.OnClickListener goToNewTaskCreator = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), AddTask.class);
            startActivity(i);
        }
    };

    private View.OnClickListener goToAllTasks = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), AllTasks.class);
            startActivity(i);
        }
    };

    private final View.OnClickListener goToTaskDetail = new View.OnClickListener() {
        public void onClick(View v) {
            Button makeTaskDetailsButton = findViewById(R.id.makeTaskDetailsButton);
            String buttonText = makeTaskDetailsButton.getText().toString();
            Intent i = new Intent(getBaseContext(), TaskDetail.class);
            i.putExtra(TASK_NAME, buttonText);
            startActivity(i);
        }
    };

    private final View.OnClickListener goToTaskDetail1 = new View.OnClickListener() {
        public void onClick(View v) {
            Button makeTaskDetailsButton1 = findViewById(R.id.makeTaskDetailsButton1);
            String buttonText = makeTaskDetailsButton1.getText().toString();
            Intent i = new Intent(getBaseContext(), TaskDetail.class);
            i.putExtra(TASK_NAME, buttonText);
            startActivity(i);
        }
    };

    private final View.OnClickListener goToTaskDetail2 = new View.OnClickListener() {
        public void onClick(View v) {
            Button makeTaskDetailsButton2 = findViewById(R.id.makeTaskDetailsButton2);
            String buttonText = makeTaskDetailsButton2.getText().toString();
            Intent i = new Intent(getBaseContext(), TaskDetail.class);
            i.putExtra(TASK_NAME, buttonText);
            startActivity(i);
        }
    };

    private final View.OnClickListener goToSettings = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(getBaseContext(), Settings.class);
            startActivity(i);
        }
    };


}