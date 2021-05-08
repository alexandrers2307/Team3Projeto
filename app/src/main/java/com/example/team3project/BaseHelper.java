package com.example.team3project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseHelper extends SQLiteOpenHelper {


    String tabela=("CREATE TABLE ALUNOS(ID INTEGER PRIMARY KEY,  NOME TEXT)");

    public BaseHelper(Context context, String nome, SQLiteDatabase.CursorFactory factory, int version){
        super(context, nome,factory,version);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(tabela);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table alunos");
        db.execSQL(tabela);

    }


}