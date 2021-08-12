package com.example.taskmaster;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDB extends RoomDatabase {
    public abstract TaskDAO taskDAO();
}
