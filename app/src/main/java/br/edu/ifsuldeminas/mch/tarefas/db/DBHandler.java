package br.edu.ifsuldeminas.mch.tarefas.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    private static final String DB_NAME= "tarefas.db";
    private static final Integer DB_VERSION = 1;
    private static final String CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS tasks" +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "description text," + "active varchar(1))";

    // É necessário criar um construtor pois a classe SQLiteOpenHelper não tem um construtor padrão
    public DBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Aqui não vamos tratar
    }
}

