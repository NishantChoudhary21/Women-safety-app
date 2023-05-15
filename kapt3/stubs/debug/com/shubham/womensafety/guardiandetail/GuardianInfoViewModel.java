package com.shubham.womensafety.guardiandetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0017H\u0014R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/shubham/womensafety/guardiandetail/GuardianInfoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_showSnackbarEvent", "Landroidx/lifecycle/MutableLiveData;", "", "allGuardians", "Landroidx/lifecycle/LiveData;", "", "Lcom/shubham/womensafety/database/Guardian;", "getAllGuardians$app_debug", "()Landroidx/lifecycle/LiveData;", "db", "Lcom/shubham/womensafety/database/GuardianDatabase;", "showSnackBarEvent", "getShowSnackBarEvent", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "doneShowingSnackbar", "", "insert", "guardian", "onClear", "onCleared", "app_debug"})
public final class GuardianInfoViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.shubham.womensafety.database.GuardianDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.shubham.womensafety.database.Guardian>> allGuardians = null;
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showSnackbarEvent;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.shubham.womensafety.database.Guardian>> getAllGuardians$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowSnackBarEvent() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.shubham.womensafety.database.Guardian guardian) {
    }
    
    public final void onClear() {
    }
    
    public final void doneShowingSnackbar() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public GuardianInfoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}