package com.example.canigraduate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbOpenHelper {

    public static final String DATABASE_NAME = "InnerDatabase(SQLite).db";
    public static final int DATABASE_VERSION = 1;
    public static SQLiteDatabase mDB;
    private DatabaseHelper mDBHelper;
    private Context mCtx;

    private class DatabaseHelper extends SQLiteOpenHelper {
        public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
            super(context, name, factory, version);
        }

        public void onCreate(SQLiteDatabase db){
            db.execSQL(Database.CreateDB._CREATE0);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            db.execSQL("DROP TABLE IF EXISTS " + Database.CreateDB._TABLENAME0);
            onCreate(db);
        }
    }

    public DbOpenHelper(Context context){
        this.mCtx = context;
    }

    public DbOpenHelper open() throws SQLException{
        mDBHelper = new DatabaseHelper(mCtx, DATABASE_NAME, null, DATABASE_VERSION);
        mDB = mDBHelper.getWritableDatabase();
        return this;
    }

    public void create(){
        mDBHelper.onCreate(mDB);
    }

    public void close(){
        mDBHelper.close();
    }


    public long insertSignUpColumn(String id, String pw, String email){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.ID, id);
        values.put(Database.CreateDB.PW, pw);
        values.put(Database.CreateDB.EMAIL, email);

        return mDB.insert(Database.CreateDB._TABLENAME0, null, values);
    }


    public Cursor selectColumn(){
        return mDB.query(Database.CreateDB._TABLENAME0, null, null, null, null, null, null);
    }

    public boolean updatePrimaryColumn(long id, String name, String studentID, String major, String otherMajor, int grade, boolean kakaoTrack){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.NAME, name);
        values.put(Database.CreateDB.STUDENTNUM, studentID);
        values.put(Database.CreateDB.MAJOR, major);
//        values.put(Database.CreateDB.OTHERMAJOR, otherMajor);
//        values.put("EXAMGRADE", grade);
//        values.put("KAKAOTRACK", kakaoTrack);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id=" + id, null) > 0;
    }


}
