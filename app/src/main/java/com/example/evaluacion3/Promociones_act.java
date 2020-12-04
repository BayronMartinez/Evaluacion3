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
        String nombre = spiner.getSelectedItem().toString();
        int promo1 = 5990;
        int promo2 = 12990;
        int promo3 = 18500;
        int total = 0;

        if (false == spiner.getSelectedItem().toString().equals("Clientes"))
        {
            if (promo.equals("pizzas promo"))
            {
                total = promo1 + costoE;
                texto.setText("Estimado " + nombre + " el final segun la promocion y envio es");
                precio.setText(total);
            }
            if (promo.equals("master pizza"))
            {
                total = promo2 + costoE;
                texto.setText("Estimado " + nombre + " el final segun la promocion y envio es");
                precio.setText(total);
            }
            if (promo.equals("pizza max"))
            {
                total = promo3 + costoE;
                texto.setText("Estimado " + nombre + " el final segun la promocion y envio es");
                precio.setText(total);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Elija una promocion existente", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Pizzas promo, Master pizza, Pizza max", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Elija cliente", Toast.LENGTH_SHORT).show();
        }
    }
}