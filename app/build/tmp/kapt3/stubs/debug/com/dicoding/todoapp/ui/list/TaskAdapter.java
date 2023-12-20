package com.dicoding.todoapp.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dicoding/todoapp/ui/list/TaskAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/dicoding/todoapp/data/Task;", "Lcom/dicoding/todoapp/ui/list/TaskAdapter$TaskViewHolder;", "onCheckedChange", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TaskViewHolder", "app_debug"})
public final class TaskAdapter extends androidx.paging.PagedListAdapter<com.dicoding.todoapp.data.Task, com.dicoding.todoapp.ui.list.TaskAdapter.TaskViewHolder> {
    private final kotlin.jvm.functions.Function2<com.dicoding.todoapp.data.Task, java.lang.Boolean, kotlin.Unit> onCheckedChange = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.todoapp.ui.list.TaskAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.dicoding.todoapp.data.Task> DIFF_CALLBACK = null;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.dicoding.todoapp.data.Task, ? super java.lang.Boolean, kotlin.Unit> onCheckedChange) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dicoding.todoapp.ui.list.TaskAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dicoding.todoapp.ui.list.TaskAdapter.TaskViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/dicoding/todoapp/ui/list/TaskAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/dicoding/todoapp/ui/list/TaskAdapter;Landroid/view/View;)V", "cbComplete", "Landroid/widget/CheckBox;", "getCbComplete", "()Landroid/widget/CheckBox;", "getTask", "Lcom/dicoding/todoapp/data/Task;", "getGetTask", "()Lcom/dicoding/todoapp/data/Task;", "setGetTask", "(Lcom/dicoding/todoapp/data/Task;)V", "tvDueDate", "Landroid/widget/TextView;", "tvTitle", "Lcom/dicoding/todoapp/ui/list/TaskTitleView;", "getTvTitle", "()Lcom/dicoding/todoapp/ui/list/TaskTitleView;", "bind", "", "task", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.dicoding.todoapp.ui.list.TaskTitleView tvTitle = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.CheckBox cbComplete = null;
        private final android.widget.TextView tvDueDate = null;
        public com.dicoding.todoapp.data.Task getTask;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.todoapp.ui.list.TaskTitleView getTvTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.CheckBox getCbComplete() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.todoapp.data.Task getGetTask() {
            return null;
        }
        
        public final void setGetTask(@org.jetbrains.annotations.NotNull
        com.dicoding.todoapp.data.Task p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.dicoding.todoapp.data.Task task) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/dicoding/todoapp/ui/list/TaskAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/dicoding/todoapp/data/Task;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}