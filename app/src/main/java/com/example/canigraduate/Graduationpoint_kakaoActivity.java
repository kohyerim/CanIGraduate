package com.example.canigraduate;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class Graduationpoint_kakaoActivity extends Activity {

    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;
    int[] pbBasic = new int[] {0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduationpoint_kakao);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.PB_basic);
        mDbOpenHelper = new DbOpenHelper(Graduationpoint_kakaoActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();
        mDbOpenHelper.create();

        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int writing = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.WRITING));
        int foreign2  = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.FOREIGN_2));
        int foreign = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.FOREIGN));;
        int logic = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.LOGIC));;
        int foreignfinal = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.FOREIGN_FINAL));;
        pbBasic = new int[]{writing,foreign2,foreign,logic,foreignfinal};

        for(int i = 0; i<pbBasic.length-1; i++){
            if (pbBasic[i]==1){
                progressBar.setProgress(progressBar.getProgress()+2);
            }
        }

        int[] pbMajorsearch = new int[] {0,0,0,0,0};
        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int humanity = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.HUMANITY));
        int society = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.SOCIETY));
        int science = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.SCIENCE));
        int enginer = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.ENGINERRING));;
        int artphysical = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.ARTANDPHYSIC));;
        pbMajorsearch = new int[]{humanity,society,science,enginer,artphysical};
        final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.PB_majorsearch);

        for(int i = 0; i<pbMajorsearch.length; i++){
            if (pbMajorsearch[i]==1){
                progressBar2.setProgress(progressBar2.getProgress()+2);
            }
        }

        int[] pbwholeculture = new int[] {0,0,0,0,0,0};
        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int language = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.LAGUAGE));
        int history = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.HISTORY));
        int culture = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CULTURE));
        int technology = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.TECHNOLOGY));
        int art = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.ART));
        int personality = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.PERSONALITY));
        pbwholeculture = new int[]{language,history,culture,technology,art,personality};
        final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.PB_wholecultre);

        int[] pbMajor = new int[] {0,0,0,0,0};
        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int dataStructure = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.DATASTRUCTURE));
        int datacommunication = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.DATACOMMUNICATION));
        int capStone1 = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CAPSTONE1));
        int capStone2 = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CAPSTONE2));;
        int capStone3 = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CAPSTONE3));;
        pbMajor = new int[]{dataStructure,datacommunication,capStone1,capStone2,capStone3};
        final ProgressBar progressBar4 = (ProgressBar) findViewById(R.id.PB_major);
        for(int i = 0; i<pbMajor.length; i++){
            if(i<2){
                if (pbMajor[i]==1){
                    progressBar4.setProgress(progressBar4.getProgress()+3);
                }
            }else {
                if (pbMajor[i]==1){
                    progressBar4.setProgress(progressBar4.getProgress()+2);
                }
            }
        }

        for(int i = 0; i<pbwholeculture.length; i++){
            if (pbwholeculture[i]==1){
                progressBar3.setProgress(progressBar3.getProgress()+2);
            }
        }
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.B_기초교양:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, BasicActivity.class));
                finish();
                break;
            case R.id.B_전공탐색:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, MajorsearchActivity.class));
                finish();
                break;
            case R.id.B_전인교양:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, WholecultureActivity.class));
                finish();
                break;
            case R.id.B_JNU:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, JnupopupActivity.class));
                finish();
                break;
            case R.id.B_필수전공:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, MajordetailActivity.class));
                finish();
                break;
            case R.id.B_카카오트랙:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, KakaopopupActivity.class));
                finish();
                break;
            case R.id.B_Back:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, CollectviewActivity.class));
                finish();
                break;
        }
    }
}
