package com.dicoding.todoapp.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/dicoding/todoapp/ui/list/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/dicoding/todoapp/data/TaskRepository;", "(Lcom/dicoding/todoapp/data/TaskRepository;)V", "_filter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dicoding/todoapp/utils/TasksFilterType;", "_snackbarText", "Lcom/dicoding/todoapp/utils/Event;", "", "snackbarText", "Landroidx/lifecycle/LiveData;", "getSnackbarText", "()Landroidx/lifecycle/LiveData;", "tasks", "Landroidx/paging/PagedList;", "Lcom/dicoding/todoapp/data/Task;", "getTasks", "completeTask", "Lkotlinx/coroutines/Job;", "task", "completed", "", "deleteTask", "", "filter", "filterType", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    private final com.dicoding.todoapp.data.TaskRepository taskRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.dicoding.todoapp.utils.TasksFilterType> _filter = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dicoding.todoapp.data.Task>> tasks = null;
    private final androidx.lifecycle.MutableLiveData<com.dicoding.todoapp.utils.Event<java.lang.Integer>> _snackbarText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.todoapp.utils.Event<java.lang.Integer>> snackbarText = null;
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dicoding.todoapp.data.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.todoapp.utils.Event<java.lang.Integer>> getSnackbarText() {
        return null;
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.utils.TasksFilterType filterType) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job completeTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task task, boolean completed) {
        return null;
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.data.Task task) {
    }
}