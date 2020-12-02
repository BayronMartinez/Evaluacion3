package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user, contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.Ed_usuario);
        contra = (EditText)findViewById(R.id.Ed_contraseña);
    }

    public void inicio_sesion(View v)
    {
        String usuario = user.getText().toString().toLowerCase();
        String contraseña = contra.getText().toString().toLowerCase();
        if (usuario.equals("android") && contraseña.equals("123"))
        {
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Usuario o contraseña erroneas", Toast.LENGTH_SHORT).show();
        }
    }
}