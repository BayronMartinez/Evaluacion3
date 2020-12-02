package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Promociones_act extends AppCompatActivity {

    private EditText promocion, envio;
    private Spinner spiner;
    private TextView texto, precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones_act);

        promocion = (EditText)findViewById(R.id.ed_promo);
        envio = (EditText)findViewById(R.id.ed_envio);
        spiner = (Spinner)findViewById(R.id.combobox);
        texto = (TextView)findViewById(R.id.txt_texto);
        precio = (TextView)findViewById(R.id.txt_valor);

        String[] clientes = {"Clientes", "Ramiro", "Rosa", "Robert"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, clientes);
        spiner.setAdapter(adapt);
    }

    public void calcular(View v)
    {
        String promo = promocion.getText().toString().toLowerCase();
        int costoE = Integer.parseInt(envio.getText().toString());
        if (promo.equals("pizzas promo"))
        {
            if (spiner.getSelectedItem().toString().equals("Ramiro"))
            {
                int total = 5990 + costoE;
                texto.setText("Estimado Ramiro el final segun la promocion y envio es");
                precio.setText(total);
            }
            else if (spiner.getSelectedItem().toString().equals("Rosa"))
            {
                int total = 5990 + costoE;
                texto.setText("Estimada Rosa el final segun la promocion y envio es");
                precio.setText(total);
            }
            else if (spiner.getSelectedItem().toString().equals("Robert"))
            {
                int total = 5990 + costoE;
                texto.setText("Estimado Robert el final segun la promocion y envio es");
                precio.setText(total);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Elija cliente", Toast.LENGTH_SHORT).show();
            }
        }
        else if (promo.equals("master pizza"))
        {
            if (spiner.getSelectedItem().toString().equals("Ramiro"))
            {
                int total = 12990 + costoE;
                texto.setText("Estimado Ramiro el final segun la promocion y envio es");
                precio.setText(total);
            }
            else if (spiner.getSelectedItem().toString().equals("Rosa"))
            {
                int total = 12990 + costoE;
                texto.setText("Estimada Rosa el final segun la promocion y envio es");
                precio.setText(total);
            }
            else if (spiner.getSelectedItem().toString().equals("Robert"))
            {
                int total = 12990 + costoE;
                texto.setText("Estimado Robert el final segun la promocion y envio es");
                precio.setText(total);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Elija cliente", Toast.LENGTH_SHORT).show();
            }
        }
        else if (promo.equals("pizza max"))
        {
            if (spiner.getSelectedItem().toString().equals("Ramiro"))
            {
                int total = 18500 + costoE;
                texto.setText("Estimado Ramiro el final segun la promocion y envio es");
                precio.setText(total);
            }
            else if (spiner.getSelectedItem().toString().equals("Rosa"))
            {
                int total = 18500 + costoE;
                texto.setText("Estimada Rosa el final segun la promocion y envio es");
                precio.setText(total);
            }
            else if (spiner.getSelectedItem().toString().equals("Robert"))
            {
                int total = 18500 + costoE;
                texto.setText("Estimado Robert el final segun la promocion y envio es");
                precio.setText(total);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Elija cliente", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Elija una promocion existente", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "Pizzas promo, Master pizza, Pizza max", Toast.LENGTH_SHORT).show();
        }
    }
}