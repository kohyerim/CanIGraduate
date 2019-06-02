package com.example.canigraduate;

import android.content.ContentValues;
import android.database.Cursor;

import static com.example.canigraduate.DbOpenHelper.mDB;

public class DbControl {
    public boolean updatePrimalColumn(String name, String stududentNum, String major, String otherMajor, int examGrade, int kakao, int toeic, int test){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.NAME, name);
        values.put(Database.CreateDB.STUDENTNUM, stududentNum);
        values.put(Database.CreateDB.MAJOR, major);
        values.put(Database.CreateDB.OTHERMAJOR, otherMajor);
        values.put(Database.CreateDB.EXAMGRADE, examGrade);
        values.put(Database.CreateDB.KAKAOTRACK, kakao);
        values.put(Database.CreateDB.TOEIC, toeic);
        values.put(Database.CreateDB.TEST_CERT, test);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }

    public boolean updateBasicColumn(int writting, int foreign1, int foreign2, int foreignFinal, int logic){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.WRITING, writting);
        values.put(Database.CreateDB.FOREIGN, foreign1);
        values.put(Database.CreateDB.FOREIGN_2, foreign2);
        values.put(Database.CreateDB.FOREIGN_FINAL, foreignFinal);
        values.put(Database.CreateDB.LOGIC, logic);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }

    public boolean updateMajorSearchColumn(int humnan, int society, int science, int engineering, int artPhysic){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.HUMANITY, humnan);
        values.put(Database.CreateDB.SOCIETY, society);
        values.put(Database.CreateDB.SCIENCE, science);
        values.put(Database.CreateDB.ENGINERRING, engineering);
        values.put(Database.CreateDB.ARTANDPHYSIC, artPhysic);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }
    public boolean updateWholeCultureColumn(int language, int history, int culture, int technology, int art, int personality){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.LAGUAGE, language);
        values.put(Database.CreateDB.HISTORY, history);
        values.put(Database.CreateDB.CULTURE, culture);
        values.put(Database.CreateDB.TECHNOLOGY, technology);
        values.put(Database.CreateDB.ART, art);
        values.put(Database.CreateDB.PERSONALITY, personality);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }

    public boolean updateMajorDetailColumn(int dataStructure, int dataCommunication, int cap1, int cap2, int cap3){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.DATASTRUCTURE, dataStructure);
        values.put(Database.CreateDB.DATACOMMUNICATION, dataCommunication);
        values.put(Database.CreateDB.CAPSTONE1, cap1);
        values.put(Database.CreateDB.CAPSTONE2, cap2);
        values.put(Database.CreateDB.CAPSTONE3, cap3);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }

    public boolean updateKakao2Column(int file, int opensource, int math){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.FILE, file);
        values.put(Database.CreateDB.OPENSOURCE, opensource);
        values.put(Database.CreateDB.MATH, math);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }


    public boolean updateKakao3Column(int kakaoweb1, int algorithm, int os, int kakaoweb2, int database){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.KAKAOWEB1, kakaoweb1);
        values.put(Database.CreateDB.ALGORITHM, algorithm);
        values.put(Database.CreateDB.OS, os);
        values.put(Database.CreateDB.KAKAOWEB2, kakaoweb2);
        values.put(Database.CreateDB.DB, database);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }

    public boolean updateKakao4Column(int portal, int practice, int internship){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.PORTAL, portal);
        values.put(Database.CreateDB.PRACTICE, practice);
        values.put(Database.CreateDB.INTERNSHIP, internship);

        return mDB.update(Database.CreateDB._TABLENAME0, values, "_id = " + UserInfo.id, null) > 0;
    }


    public Cursor selectColumn(){
        return mDB.query(Database.CreateDB._TABLENAME0, null, null, null, null, null, null);
    }


    public long insertColumn(String id, String pw, String email){
        ContentValues values = new ContentValues();
        values.put(Database.CreateDB.ID, id);
        values.put(Database.CreateDB.PW, pw);
        values.put(Database.CreateDB.EMAIL, email);
        values.put(Database.CreateDB.NAME, "name");
        values.put(Database.CreateDB.STUDENTNUM, "0000");
        values.put(Database.CreateDB.MAJOR, "major");
        values.put(Database.CreateDB.OTHERMAJOR, "other");
        values.put(Database.CreateDB.EXAMGRADE, 1);
        values.put(Database.CreateDB.KAKAOTRACK, 0);
        values.put(Database.CreateDB.TOEIC, 0);
        values.put(Database.CreateDB.TEST_CERT, 0);
        values.put(Database.CreateDB.WRITING, 0);
        values.put(Database.CreateDB.FOREIGN, 0);
        values.put(Database.CreateDB.FOREIGN_2, 0);
        values.put(Database.CreateDB.FOREIGN_FINAL, 0);
        values.put(Database.CreateDB.LOGIC, 0);
        values.put(Database.CreateDB.HUMANITY, 0);
        values.put(Database.CreateDB.SOCIETY, 0);
        values.put(Database.CreateDB.SCIENCE, 0);
        values.put(Database.CreateDB.ENGINERRING, 0);
        values.put(Database.CreateDB.ARTANDPHYSIC, 0);
        values.put(Database.CreateDB.LAGUAGE, 0);
        values.put(Database.CreateDB.HISTORY, 0);
        values.put(Database.CreateDB.CULTURE, 0);
        values.put(Database.CreateDB.TECHNOLOGY, 0);
        values.put(Database.CreateDB.ART, 0);
        values.put(Database.CreateDB.PERSONALITY, 0);
        values.put(Database.CreateDB.DATASTRUCTURE, 0);
        values.put(Database.CreateDB.DATACOMMUNICATION, 0);
        values.put(Database.CreateDB.CAPSTONE1, 0);
        values.put(Database.CreateDB.CAPSTONE2, 0);
        values.put(Database.CreateDB.CAPSTONE3, 0);
        values.put(Database.CreateDB.FILE, 0);
        values.put(Database.CreateDB.OPENSOURCE, 0);
        values.put(Database.CreateDB.MATH, 0);
        values.put(Database.CreateDB.KAKAOWEB1, 0);
        values.put(Database.CreateDB.ALGORITHM, 0);
        values.put(Database.CreateDB.OS, 0);
        values.put(Database.CreateDB.KAKAOWEB2, 0);
        values.put(Database.CreateDB.DB, 0);
        values.put(Database.CreateDB.PORTAL, 0);
        values.put(Database.CreateDB.PRACTICE, 0);
        values.put(Database.CreateDB.INTERNSHIP, 0);

        return mDB.insert(Database.CreateDB._TABLENAME0, null, values);
    }
}
