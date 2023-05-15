package com.shubham.womensafety.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class GuardianDao_Impl implements GuardianDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGuardian;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public GuardianDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGuardian = new EntityInsertionAdapter<Guardian>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `guardian_table`(`guardianId`,`guardian_name`,`guardian_relation`,`guardian_phoneno`,`guardian_emailid`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Guardian value) {
        if (value.getGuardianId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getGuardianId());
        }
        if (value.getGuardianName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGuardianName());
        }
        if (value.getGuardianRelation() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGuardianRelation());
        }
        if (value.getGuardianPhoneNo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGuardianPhoneNo());
        }
        if (value.getGuardianEmail() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGuardianEmail());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from guardian_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(Guardian night) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGuardian.insert(night);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Guardian>> getAllGuardians() {
    final String _sql = "SELECT * from guardian_table ORDER BY guardianId DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Guardian>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Guardian> compute() {
        if (_observer == null) {
          _observer = new Observer("guardian_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfGuardianId = _cursor.getColumnIndexOrThrow("guardianId");
          final int _cursorIndexOfGuardianName = _cursor.getColumnIndexOrThrow("guardian_name");
          final int _cursorIndexOfGuardianRelation = _cursor.getColumnIndexOrThrow("guardian_relation");
          final int _cursorIndexOfGuardianPhoneNo = _cursor.getColumnIndexOrThrow("guardian_phoneno");
          final int _cursorIndexOfGuardianEmail = _cursor.getColumnIndexOrThrow("guardian_emailid");
          final List<Guardian> _result = new ArrayList<Guardian>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Guardian _item;
            final Long _tmpGuardianId;
            if (_cursor.isNull(_cursorIndexOfGuardianId)) {
              _tmpGuardianId = null;
            } else {
              _tmpGuardianId = _cursor.getLong(_cursorIndexOfGuardianId);
            }
            final String _tmpGuardianName;
            _tmpGuardianName = _cursor.getString(_cursorIndexOfGuardianName);
            final String _tmpGuardianRelation;
            _tmpGuardianRelation = _cursor.getString(_cursorIndexOfGuardianRelation);
            final String _tmpGuardianPhoneNo;
            _tmpGuardianPhoneNo = _cursor.getString(_cursorIndexOfGuardianPhoneNo);
            final String _tmpGuardianEmail;
            _tmpGuardianEmail = _cursor.getString(_cursorIndexOfGuardianEmail);
            _item = new Guardian(_tmpGuardianId,_tmpGuardianName,_tmpGuardianRelation,_tmpGuardianPhoneNo,_tmpGuardianEmail);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public List<Guardian> getEmail() {
    final String _sql = "SELECT * from guardian_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfGuardianId = _cursor.getColumnIndexOrThrow("guardianId");
      final int _cursorIndexOfGuardianName = _cursor.getColumnIndexOrThrow("guardian_name");
      final int _cursorIndexOfGuardianRelation = _cursor.getColumnIndexOrThrow("guardian_relation");
      final int _cursorIndexOfGuardianPhoneNo = _cursor.getColumnIndexOrThrow("guardian_phoneno");
      final int _cursorIndexOfGuardianEmail = _cursor.getColumnIndexOrThrow("guardian_emailid");
      final List<Guardian> _result = new ArrayList<Guardian>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Guardian _item;
        final Long _tmpGuardianId;
        if (_cursor.isNull(_cursorIndexOfGuardianId)) {
          _tmpGuardianId = null;
        } else {
          _tmpGuardianId = _cursor.getLong(_cursorIndexOfGuardianId);
        }
        final String _tmpGuardianName;
        _tmpGuardianName = _cursor.getString(_cursorIndexOfGuardianName);
        final String _tmpGuardianRelation;
        _tmpGuardianRelation = _cursor.getString(_cursorIndexOfGuardianRelation);
        final String _tmpGuardianPhoneNo;
        _tmpGuardianPhoneNo = _cursor.getString(_cursorIndexOfGuardianPhoneNo);
        final String _tmpGuardianEmail;
        _tmpGuardianEmail = _cursor.getString(_cursorIndexOfGuardianEmail);
        _item = new Guardian(_tmpGuardianId,_tmpGuardianName,_tmpGuardianRelation,_tmpGuardianPhoneNo,_tmpGuardianEmail);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
