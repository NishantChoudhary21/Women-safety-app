package com.shubham.womensafety.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/shubham/womensafety/database/GuardianDao;", "", "clear", "", "getAllGuardians", "Landroidx/lifecycle/LiveData;", "", "Lcom/shubham/womensafety/database/Guardian;", "getEmail", "insert", "night", "app_debug"})
public abstract interface GuardianDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.shubham.womensafety.database.Guardian night);
    
    @androidx.room.Query(value = "DELETE from guardian_table")
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from guardian_table ORDER BY guardianId DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.shubham.womensafety.database.Guardian>> getAllGuardians();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from guardian_table")
    public abstract java.util.List<com.shubham.womensafety.database.Guardian> getEmail();
}