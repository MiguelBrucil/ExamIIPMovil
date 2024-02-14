package com.jmbp.examiipmovil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "prueba2"; // Cambio del nombre de la base de datos
    public static final int DATABASE_VERSION = 1;

    public BDHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Creación de las tablas
        db.execSQL("CREATE TABLE IF NOT EXISTS tblVehiculos (" +
                "vhe_placa TEXT PRIMARY KEY NOT NULL," +
                "vhe_color TEXT NOT NULL," +
                "vhe_marca TEXT NOT NULL," +
                "vhe_tipo TEXT NOT NULL," +
                "vhe_valor REAL NOT NULL)");

        db.execSQL("CREATE TABLE IF NOT EXISTS tblUsuarios (" +
                "usu_cedula TEXT PRIMARY KEY NOT NULL," +
                "usu_nombre TEXT NOT NULL," +
                "usu_correo TEXT NOT NULL," +
                "usu_genero TEXT NOT NULL," +
                "usu_fecha_nacimiento TEXT NOT NULL," +
                "usu_signo_zodiacal TEXT NOT NULL," +
                "usu_ciudad TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Si hay una actualización de la base de datos, puedes implementar acciones necesarias aquí.
        // En este caso, solo se eliminarán y volverán a crear las tablas.
        db.execSQL("DROP TABLE IF EXISTS tblVehiculos");
        db.execSQL("DROP TABLE IF EXISTS tblUsuarios");
        onCreate(db);
    }
}
