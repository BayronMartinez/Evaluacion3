package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Clases.Cliente;

public class Firebase_act extends AppCompatActivity {

    private EditText nombre, destino, promocion;
    private Button guardar;
    FirebaseDatabase firebase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_act);

        nombre = (EditText)findViewById(R.id.ed_nombre);
        destino = (EditText)findViewById(R.id.ed_destino);
        promocion = (EditText)findViewById(R.id.ed_promocion);

        guardar = (Button)findViewById(R.id.btn_guardar);

        inicializarBase();
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nombre.getText().toString().trim().isEmpty()&& !destino.getText().toString().trim().isEmpty() && !promocion.getText().toString().trim().isEmpty()) {
                    //añade
                    Cliente c = new Cliente();
                    c.setId(UUID.randomUUID().toString());
                    c.setNombre(nombre.getText().toString().trim());
                    c.setDestino(destino.getText().toString().trim());
                    c.setPromocion(promocion.getText().toString().trim());
                    databaseReference.child("Clientes").child(c.getId()).setValue(c);
                    Toast.makeText(getApplicationContext(), "se ha guardado el Cliente: " + nombre.getText(), Toast.LENGTH_SHORT).show();
                    nombre.setText("");
                    destino.setText("");
                    promocion.setText("");
                } else { Toast.makeText(getApplicationContext(), "Debe completar todos los campos", Toast.LENGTH_SHORT).show(); }
            }
        });

    }

    public void listado(View v)
    {
        Intent i = new Intent(this, Listado_clientes_act.class);
        startActivity(i);
    }

    public void inicializarBase(){
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference= firebase.getReference();
    }
}