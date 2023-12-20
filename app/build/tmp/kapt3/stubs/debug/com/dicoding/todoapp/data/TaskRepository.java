package com.dicoding.todoapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/dicoding/todoapp/data/TaskRepository;", "", "tasksDao", "Lcom/dicoding/todoapp/data/TaskDao;", "(Lcom/dicoding/todoapp/data/TaskDao;)V", "completeTask", "", "task", "Lcom/dicoding/todoapp/data/Task;", "isCompleted", "", "(Lcom/dicoding/todoapp/data/Task;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "(Lcom/dicoding/todoapp/data/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearestActiveTask", "getTaskById", "Landroidx/lifecycle/LiveData;", "taskId", "", "getTasks", "Landroidx/paging/PagedList;", "filter", "Lcom/dicoding/todoapp/utils/TasksFilterType;", "insertTask", "", "newTask", "Companion", "app_debug"})
public final class TaskRepository {
    private final com.dicoding.todoapp.data.TaskDao tasksDao = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.todoapp.data.TaskRepository.Companion Companion = null;
    public static final int PAGE_SIZE = 30;
    public static final boolean PLACEHOLDERS = true;
    @kotlin.jvm.Volatile
    private static volatile com.dicoding.todoapp.data.TaskRepository instance;
    
    public TaskRepository(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.TaskDao tasksDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dicoding.todoapp.data.Task>> getTasks(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.utils.TasksFilterType filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.todoapp.data.Task> getTaskById(int taskId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.todoapp.data.Task getNearestActiveTask() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task newTask, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object completeTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task task, boolean isCompleted, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/dicoding/todoapp/data/TaskRepository$Companion;", "", "()V", "PAGE_SIZE", "", "PLACEHOLDERS", "", "instance", "Lcom/dicoding/todoapp/data/TaskRepository;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.todoapp.data.TaskRepository getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}