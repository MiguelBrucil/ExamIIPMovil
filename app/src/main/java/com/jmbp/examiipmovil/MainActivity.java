package com.jmbp.examiipmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numCedula, emailCorreo;
    private RadioGroup rdGrupGen;
    private RadioButton radioButtonMasculino, radioButtonFemenino;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numCedula = findViewById(R.id.numCedula);
        emailCorreo = findViewById(R.id.emailCorreo);
        rdGrupGen = findViewById(R.id.rdGrupGen);
        radioButtonMasculino = findViewById(R.id.radiomasculino);
        radioButtonFemenino = findViewById(R.id.radiofemenino);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los datos ingresados
                String cedula = numCedula.getText().toString();
                String correo = emailCorreo.getText().toString();
                String genero = radioButtonMasculino.isChecked() ? "Masculino" : "Femenino";

                // Pasar los datos a la siguiente actividad
                Intent intent = new Intent(MainActivity.this, Datos.class);
                intent.putExtra("CEDULA", cedula);
                intent.putExtra("CORREO", correo);
                intent.putExtra("GENERO", genero);
                startActivity(intent);
            }
        });

        Spinner marcas = findViewById(R.id.cbxsigno);
        String[] opMarcas = {
                "aries",
                "leo",
                "libra"
        };
        ArrayAdapter<String> marcasVehiculo = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opMarcas);
        marcas.setAdapter(marcasVehiculo);

        Spinner colores = findViewById(R.id.cbxciudad);
        String[] opColor = {
                "QUITO",
                "IBARRA",
                "LOJA",
                "OTAVALO"
        };
        ArrayAdapter<String> coloresVehiculo = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opColor);
        colores.setAdapter(coloresVehiculo);
    }
}
