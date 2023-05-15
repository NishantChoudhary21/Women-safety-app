package com.shubham.womensafety.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lcom/shubham/womensafety/utils/PermissionUtils;", "", "()V", "isAccessFineLocationGranted", "", "context", "Landroid/content/Context;", "isLocationEnabled", "requestAccessFineLocationPermission", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "requestId", "", "app_debug"})
public final class PermissionUtils {
    public static final com.shubham.womensafety.utils.PermissionUtils INSTANCE = null;
    
    /**
     * * Function to request permission from the user
     */
    public final void requestAccessFineLocationPermission(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, int requestId) {
    }
    
    /**
     * * Function to check if the location permissions are granted or not
     */
    public final boolean isAccessFineLocationGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Function to check if location of the device is enabled or not
     */
    public final boolean isLocationEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private PermissionUtils() {
        super();
    }
}