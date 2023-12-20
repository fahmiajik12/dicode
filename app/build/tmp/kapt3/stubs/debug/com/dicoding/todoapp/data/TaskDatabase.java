package com.dicoding.todoapp.data;

import java.lang.System;

@androidx.room.Database(entities = {com.dicoding.todoapp.data.Task.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dicoding/todoapp/data/TaskDatabase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lcom/dicoding/todoapp/data/TaskDao;", "Companion", "app_debug"})
public abstract class TaskDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.todoapp.data.TaskDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.dicoding.todoapp.data.TaskDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.ExecutorService executor = null;
    
    public TaskDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.dicoding.todoapp.data.TaskDao taskDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/dicoding/todoapp/data/TaskDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/dicoding/todoapp/data/TaskDatabase;", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "fillWithStartingData", "", "context", "Landroid/content/Context;", "dao", "Lcom/dicoding/todoapp/data/TaskDao;", "getInstance", "loadJsonArray", "Lorg/json/JSONArray;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.ExecutorService getExecutor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.todoapp.data.TaskDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final void fillWithStartingData(android.content.Context context, com.dicoding.todoapp.data.TaskDao dao) {
        }
        
        private final org.json.JSONArray loadJsonArray(android.content.Context context) {
            return null;
        }
    }
}