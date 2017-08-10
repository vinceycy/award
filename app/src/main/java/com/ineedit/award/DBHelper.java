package com.ineedit.award;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vince on 2017/7/23.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Award.db";

    public static final String TABLE_NAME = "GAME";
    public static final String SQL_CREATE_ENTRIES = "" +
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "( " +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "game_no INTEGER, " +
            "player TEXT, " +
            "round INTEGER, " +
            "point INTEGER" +
            ")";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
