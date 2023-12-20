package com.dicoding.todoapp.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000fH\'J!\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0012\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/dicoding/todoapp/data/TaskDao;", "", "deleteTask", "", "task", "Lcom/dicoding/todoapp/data/Task;", "(Lcom/dicoding/todoapp/data/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearestActiveTask", "getTaskById", "Landroidx/lifecycle/LiveData;", "taskId", "", "getTasks", "Landroidx/paging/DataSource$Factory;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "insertAll", "tasks", "", "([Lcom/dicoding/todoapp/data/Task;)V", "insertTask", "", "updateCompleted", "completed", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.dicoding.todoapp.data.Task.class})
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.dicoding.todoapp.data.Task> getTasks(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE id IN (:taskId)")
    public abstract androidx.lifecycle.LiveData<com.dicoding.todoapp.data.Task> getTaskById(int taskId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE completed = 0 ORDER BY dueDate ASC LIMIT 1")
    public abstract com.dicoding.todoapp.data.Task getNearestActiveTask();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task... tasks);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "UPDATE tasks SET completed = (:completed) WHERE id = (:taskId)")
    public abstract java.lang.Object updateCompleted(int taskId, boolean completed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}