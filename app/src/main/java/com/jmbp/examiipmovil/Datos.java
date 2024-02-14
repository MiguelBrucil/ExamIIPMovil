package com.jmbp.examiipmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Datos extends AppCompatActivity {
    TextView txtCedula, txtfecha, txtsigno, txtciudad, txtcorreo, txtgenero, tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        // Obtener los datos enviados desde la actividad anterior (MainActivity)
        String cedula = getIntent().getStringExtra("CEDULA");
        String fecha = getIntent().getStringExtra("FECHA");
        String signo = getIntent().getStringExtra("SIGNO");
        String ciudad = getIntent().getStringExtra("CIUDAD");
        String correo = getIntent().getStringExtra("CORREO");
        String genero = getIntent().getStringExtra("GENERO");

        // Referenciar los TextViews en tu layout
        txtCedula = findViewById(R.id.lblCedula2);
        txtfecha = findViewById(R.id.lblFechaNacimiento);
        txtsigno = findViewById(R.id.lblsignoS);
        txtciudad = findViewById(R.id.lblCiudad2);
        txtcorreo = findViewById(R.id.lblCorreo2);
        txtgenero = findViewById(R.id.lblGenero2);

        // Establecer los valores recibidos en los TextViews
        txtCedula.setText("Cédula: " + cedula);
        txtfecha.setText("Fecha: " + fecha);
        txtsigno.setText("Signo: " + signo);
        txtciudad.setText("Ciudad: " + ciudad);
        txtcorreo.setText("Correo: " + correo);
        txtgenero.setText("Género: " + genero);
    }
}
