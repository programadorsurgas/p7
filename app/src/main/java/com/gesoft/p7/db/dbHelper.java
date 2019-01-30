package com.gesoft.p7.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "dbP7";
    private static final int DB_SCHEME_VERSION = 1;

    dbHelper(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("SQLITE", "table reated");
        db.execSQL(dbManager.CREATE_TABLE_RECORDS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
