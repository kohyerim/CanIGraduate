package com.example.canigraduate;

import android.provider.BaseColumns;

public final class Database {
    public static final class CreateDB implements BaseColumns{
        //계정
        public static final String ID = "userid";
        public static final String PW = "password";
        public static final String EMAIL = "email";

        // 초기 데이터
        public static final String NAME = "name";
        public static final String STUDENTNUM = "studentnum";
        public static final String MAJOR = "major";
        public static final String OTHERMAJOR = "othermajor"; // 복수,연계전공
        public static final String EXAMGRADE = "examgrade";  // 수능성적
        public static final String KAKAOTRACK = "kakaotrack";

        // 기타 데이터
        public static final String TOEIC = "toeic";
        public static final String TEST_CERT = "test_cert"; // 시험, 자격증

        //기초교양
        public static final String WRITING = "writing"; // 글쓰기
        public static final String FOREIGN = "foreign"; // 2과목 외 외국어
        public static final String FOREIGN_2 = "foreign2"; // 외국어 2과목
        public static final String FOREIGN_FINAL = "foreign_final"; // 최종 외국어 이수여부
        public static final String LOGIC = "logic"; // 논리적사고

        //전공탐색
        public static final String HUMANITY = "humanity"; // 인문계열
        public static final String SOCIETY = "society";  // 사회계열
        public static final String SCIENCE = "science";    // 자연계열
        public static final String ENGINERRING = "enginerring";  // 공학계열
        public static final String ARTANDPHYSIC = "artandphysic"; // 예체능계열

        //전인교양
        public static final String LAGUAGE = "language";
        public static final String HISTORY = "history";
        public static final String CULTURE = "culture";
        public static final String TECHNOLOGY = "technology";
        public static final String ART = "art";
        public static final String PERSONALITY = "personality";

        //필수 전공
        public static final String DATASTRUCTURE = "datastructure";
        public static final String DATACOMMUNICATION = "datacommunication";
        public static final String CAPSTONE1 = "capstone1";
        public static final String CAPSTONE2 = "capstone2";
        public static final String CAPSTONE3 = "capstone3";

        //카카오2학년
        public static final String FILE = "file";
        public static final String OPENSOURCE = "opensource";
        public static final String MATH = "math";

        //카카오3학년
        public static final String KAKAOWEB1 = "kakaoweb1";
        public static final String ALGORITHM = "algorithm";
        public static final String OS = "os";
        public static final String KAKAOWEB2 = "kakaoweb2";
        public static final String DB = "db";

        //카카오4학년
        public static final String PORTAL = "portal";
        public static final String PRACTICE = "practice";
        public static final String INTERNSHIP = "internship";

        //query
        public static final String _TABLENAME0 = "userTable";
        public static final String _CREATE0 = "create table if not exists " + _TABLENAME0 + "("
                + _ID + " integer primary key autoincrement, " + ID + " text not null , "+
                PW + " text not null , " + EMAIL + " text not null , " + NAME + " text not null , " +
                STUDENTNUM + " text not null , " + MAJOR + " text not null , " + OTHERMAJOR + "text , "
                + EXAMGRADE + " integer not null , " + KAKAOTRACK + " boolean not null , " + TOEIC + " integer not null , "
                + TEST_CERT + " boolean not null , " + WRITING + " boolean not null , " + FOREIGN + " boolean not null , " +
                FOREIGN_2 + " boolean not null , " + FOREIGN_FINAL + " boolean not null , " + LOGIC + " boolean not null , " +
                HUMANITY + " boolean not null , " + SOCIETY + " boolean not null , " + SCIENCE + " boolean not null , " +
                ENGINERRING + " boolean not null , " + ARTANDPHYSIC + " boolean not null , "
                + LAGUAGE + " boolean not null , " + HISTORY + " boolean not null , " +
                CULTURE + " boolean not null , " + TECHNOLOGY + " boolean not null , " + ART + " boolean not null , " +
                PERSONALITY + " boolean not null , " + DATASTRUCTURE + " boolean not null , " + DATACOMMUNICATION + " boolean not null , " +
                CAPSTONE1 + " boolean not null , " + CAPSTONE2 + " boolean not null , " + CAPSTONE3 + " boolean not null , " +
                FILE + " boolean not null , " + OPENSOURCE + " boolean not null , " + MATH + " boolean not null , " +
                KAKAOWEB1 + " boolean not null , " + ALGORITHM + " boolean not null , " + OS  + " boolean not null , " +
                KAKAOWEB2 + " boolean not null , " + DB + " boolean not null , " + PORTAL + " boolean not null , " +
                PRACTICE + " boolean not null , " + INTERNSHIP + " boolean not null );";
    }
}
