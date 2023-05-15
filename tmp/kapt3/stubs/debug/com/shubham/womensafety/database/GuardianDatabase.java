package com.shubham.womensafety.database;

import java.lang.System;

@androidx.room.Database(entities = {com.shubham.womensafety.database.Guardian.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/shubham/womensafety/database/GuardianDatabase;", "Landroidx/room/RoomDatabase;", "()V", "guardianDatabaseDao", "Lcom/shubham/womensafety/database/GuardianDao;", "Companion", "app_debug"})
public abstract class GuardianDatabase extends androidx.room.RoomDatabase {
    private static com.shubham.womensafety.database.GuardianDatabase INSTANCE;
    public static final com.shubham.womensafety.database.GuardianDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shubham.womensafety.database.GuardianDao guardianDatabaseDao();
    
    public GuardianDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/shubham/womensafety/database/GuardianDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/shubham/womensafety/database/GuardianDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.shubham.womensafety.database.GuardianDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}