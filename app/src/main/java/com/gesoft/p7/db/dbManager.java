package com.gesoft.p7.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class dbManager {
    private SQLiteDatabase db;
    private ContentValues values;
    private Context ctx;


    // CONSTRUCTOR
    public dbManager(Context c) {
        this.ctx = c;
    }

    // open connection
    public void open() throws SQLException {
        dbHelper helper = new dbHelper(ctx);
        db = helper.getWritableDatabase();
    }

    // close connection
    public void close() {
        this.db.close();
    }

    private static final String TABLE_RECORDS = "daily_records";

    // region columns table records
    private static final String CN_ID = "ID";
    private static final String CN_DATE = "DATE";
    // endregion column table records

    // region tables
    static final String CREATE_TABLE_RECORDS = "CREATE TABLE " + TABLE_RECORDS
            + " (" + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+ CN_DATE +" TEXT);";
    // endregion tables


    // region process on database

    public void insert_record(String date) {
        values = new ContentValues();
        values.put(CN_DATE, date);

        db.insert(TABLE_RECORDS,null, values);
    }

    // endregion process on database

}
