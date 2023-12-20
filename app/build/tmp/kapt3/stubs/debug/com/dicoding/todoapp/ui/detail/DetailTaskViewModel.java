package com.dicoding.todoapp.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dicoding/todoapp/ui/detail/DetailTaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/dicoding/todoapp/data/TaskRepository;", "(Lcom/dicoding/todoapp/data/TaskRepository;)V", "_task", "Landroidx/lifecycle/LiveData;", "Lcom/dicoding/todoapp/data/Task;", "_taskId", "Landroidx/lifecycle/MutableLiveData;", "", "task", "getTask", "()Landroidx/lifecycle/LiveData;", "deleteTask", "", "setTaskId", "taskId", "(Ljava/lang/Integer;)V", "app_debug"})
public final class DetailTaskViewModel extends androidx.lifecycle.ViewModel {
    private final com.dicoding.todoapp.data.TaskRepository taskRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _taskId = null;
    private final androidx.lifecycle.LiveData<com.dicoding.todoapp.data.Task> _task = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.todoapp.data.Task> task = null;
    
    public DetailTaskViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.todoapp.data.Task> getTask() {
        return null;
    }
    
    public final void setTaskId(@org.jetbrains.annotations.Nullable
    java.lang.Integer taskId) {
    }
    
    public final void deleteTask() {
    }
}