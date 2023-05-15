package com.shubham.womensafety.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class GuardianDatabase_Impl extends GuardianDatabase {
  private volatile GuardianDao _guardianDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `guardian_table` (`guardianId` INTEGER PRIMARY KEY AUTOINCREMENT, `guardian_name` TEXT NOT NULL, `guardian_relation` TEXT NOT NULL, `guardian_phoneno` TEXT NOT NULL, `guardian_emailid` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d605234b34afc6ea3ec0670063408950\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `guardian_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGuardianTable = new HashMap<String, TableInfo.Column>(5);
        _columnsGuardianTable.put("guardianId", new TableInfo.Column("guardianId", "INTEGER", false, 1));
        _columnsGuardianTable.put("guardian_name", new TableInfo.Column("guardian_name", "TEXT", true, 0));
        _columnsGuardianTable.put("guardian_relation", new TableInfo.Column("guardian_relation", "TEXT", true, 0));
        _columnsGuardianTable.put("guardian_phoneno", new TableInfo.Column("guardian_phoneno", "TEXT", true, 0));
        _columnsGuardianTable.put("guardian_emailid", new TableInfo.Column("guardian_emailid", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGuardianTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGuardianTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGuardianTable = new TableInfo("guardian_table", _columnsGuardianTable, _foreignKeysGuardianTable, _indicesGuardianTable);
        final TableInfo _existingGuardianTable = TableInfo.read(_db, "guardian_table");
        if (! _infoGuardianTable.equals(_existingGuardianTable)) {
          throw new IllegalStateException("Migration didn't properly handle guardian_table(com.shubham.womensafety.database.Guardian).\n"
                  + " Expected:\n" + _infoGuardianTable + "\n"
                  + " Found:\n" + _existingGuardianTable);
        }
      }
    }, "d605234b34afc6ea3ec0670063408950", "89c432602e9485784ac541c447da52ee");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "guardian_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `guardian_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public GuardianDao guardianDatabaseDao() {
    if (_guardianDao != null) {
      return _guardianDao;
    } else {
      synchronized(this) {
        if(_guardianDao == null) {
          _guardianDao = new GuardianDao_Impl(this);
        }
        return _guardianDao;
      }
    }
  }
}
