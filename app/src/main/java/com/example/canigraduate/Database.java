package com.example.canigraduate;

import android.provider.BaseColumns;

public final class Database {
    public static final class CreateDB implements BaseColumns{
        //계정
        public static final String ID = "USERID";
        public static final String PW = "PW";
        public static final String EMAIL = "EMAIL";

        // 초기 데이터
        public static final String NAME = "NAME";
        public static final String STUDENTNUM = "STUDENTNUM";
        public static final String MAJOR = "MAJOR";
        public static final String OTHERMAJOR = "OTHERMAJOR"; // 복수,연계전공
        public static final String EXAMGRADE = "EXAMGRADE";  // 수능성적
        public static final String KAKAOTRACK = "KAKAOTRACK";

        // 기타 데이터
        public static final String TOEIC = "TOEIC";
        public static final String TEST_CERT = "TESTCERT"; // 시험, 자격증

        //기초교양
        public static final String WRITING = "WRITING"; // 글쓰기
        public static final String FOREIGN = "FOREIGN1"; // 2과목 외 외국어
        public static final String FOREIGN_2 = "FOREIGN2"; // 외국어 2과목
        public static final String FOREIGN_FINAL = "FOREIGNFINAL"; // 최종 외국어 이수여부
        public static final String LOGIC = "LOGIC"; // 논리적사고

        //전공탐색
        public static final String HUMANITY = "HUMANITY"; // 인문계열
        public static final String SOCIETY = "SOCIETY";  // 사회계열
        public static final String SCIENCE = "SCIENCE";    // 자연계열
        public static final String ENGINERRING = "ENGINERRING";  // 공학계열
        public static final String ARTANDPHYSIC = "ARTANDPHYSIC"; // 예체능계열

        //전인교양
        public static final String LAGUAGE = "LAGUAGE";
        public static final String HISTORY = "HISTORY";
        public static final String CULTURE = "CULTURE";
        public static final String TECHNOLOGY = "TECHNOLOGY";
        public static final String ART = "ART";
        public static final String PERSONALITY = "PERSONALITY";

        //필수 전공
        public static final String DATASTRUCTURE = "DATASTRUCTURE";
        public static final String DATACOMMUNICATION = "DATACOMMUNICATION";
        public static final String CAPSTONE1 = "CAPSTONE1";
        public static final String CAPSTONE2 = "CAPSTONE2";
        public static final String CAPSTONE3 = "CAPSTONE3";

        //카카오2학년
        public static final String FILE = "FILE";
        public static final String OPENSOURCE = "OPENSOURCE";
        public static final String MATH = "MATH";

        //카카오3학년
        public static final String KAKAOWEB1 = "KAKAOWEB1";
        public static final String ALGORITHM = "ALGORITHM";
        public static final String OS = "OS";
        public static final String KAKAOWEB2 = "KAKAOWEB2";
        public static final String DB = "DB";

        //카카오4학년
        public static final String PORTAL = "PORTAL";
        public static final String PRACTICE = "PRACTICE";
        public static final String INTERNSHIP = "INTERNSHIP";

        //query
        public static final String _TABLENAME0 = "UserTable";
        public static final String _CREATE0 = "create table if not exists " + _TABLENAME0 + " ("
                +_ID+" integer primary key autoincrement, "
                + ID + " text not null, " + PW + " text not null, " + EMAIL + " text not null, "
                + NAME + " text not null, " + STUDENTNUM + " text not null, "
                + MAJOR + " text not null, " + OTHERMAJOR + " text, "
                + EXAMGRADE + " integer not null, " + KAKAOTRACK + " integer not null, " + TOEIC + " integer not null, "
                + TEST_CERT + " integer not null, " + WRITING + " integer not null, "
                + FOREIGN + " integer not null, " + FOREIGN_2 + " integer not null, " + FOREIGN_FINAL + " integer not null, "
                + LOGIC + " integer not null, " + HUMANITY + " integer not null, " + SOCIETY + " integer not null, "
                + SCIENCE + " integer not null, " + ENGINERRING + " integer not null, " + ARTANDPHYSIC + " integer not null, "
                + LAGUAGE + " integer not null, " + HISTORY + " integer not null, " + CULTURE + " integer not null, "
                + TECHNOLOGY + " integer not null, " + ART + " integer not null, " + PERSONALITY + " integer not null, "
                + DATASTRUCTURE + " integer not null, " + DATACOMMUNICATION + " integer not null, "
                + CAPSTONE1 + " integer not null, " + CAPSTONE2 + " integer not null, " + CAPSTONE3 + " integer not null, "
                + FILE + " integer not null, " + OPENSOURCE + " integer not null, " + MATH + " integer not null, "
                + KAKAOWEB1 + " integer not null, " + ALGORITHM + " integer not null, " + OS + " integer not null, "
                + KAKAOWEB2 + " integer not null, " + DB +" integer not null, " + PORTAL + " integer not null, "
                + PRACTICE + " integer not null, " + INTERNSHIP + " integer not null);";

    }

}
