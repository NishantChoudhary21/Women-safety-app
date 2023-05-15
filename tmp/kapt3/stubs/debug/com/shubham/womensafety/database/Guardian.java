package com.shubham.womensafety.database;

import java.lang.System;

@androidx.room.Entity(tableName = "guardian_table")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003JB\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/shubham/womensafety/database/Guardian;", "", "guardianId", "", "guardianName", "", "guardianRelation", "guardianPhoneNo", "guardianEmail", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuardianEmail", "()Ljava/lang/String;", "setGuardianEmail", "(Ljava/lang/String;)V", "getGuardianId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGuardianName", "setGuardianName", "getGuardianPhoneNo", "setGuardianPhoneNo", "getGuardianRelation", "setGuardianRelation", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shubham/womensafety/database/Guardian;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Guardian {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Long guardianId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "guardian_name")
    private java.lang.String guardianName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "guardian_relation")
    private java.lang.String guardianRelation;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "guardian_phoneno")
    private java.lang.String guardianPhoneNo;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "guardian_emailid")
    private java.lang.String guardianEmail;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getGuardianId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuardianName() {
        return null;
    }
    
    public final void setGuardianName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuardianRelation() {
        return null;
    }
    
    public final void setGuardianRelation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuardianPhoneNo() {
        return null;
    }
    
    public final void setGuardianPhoneNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuardianEmail() {
        return null;
    }
    
    public final void setGuardianEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Guardian(@org.jetbrains.annotations.Nullable()
    java.lang.Long guardianId, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianName, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianRelation, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianPhoneNo, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianEmail) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shubham.womensafety.database.Guardian copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long guardianId, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianName, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianRelation, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianPhoneNo, @org.jetbrains.annotations.NotNull()
    java.lang.String guardianEmail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}