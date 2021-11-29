package com.example.proyecto_festejos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button Btn1;
    TextView Txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Agregar icono en el action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_festejos);

        Btn1 = (Button) findViewById(R.id.Btn1_principal);
        Txt1 = (TextView) findViewById(R.id.Text_prueba);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Txt1.setText("Prueba ejecución del Boton - Evento OnClick - Activity");
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu_options) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu_options);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.productos)
        {
            //Toast.makeText(getApplicationContext(), "Oprimir Productos", Toast.LENGTH_LONG).show();
            Intent next_productos = new Intent(this, MainActivity2.class);
            startActivity(next_productos);
        }
        if (id == R.id.servicios)
        {
            //Toast.makeText(getApplicationContext(), "Oprimir Servicios", Toast.LENGTH_LONG).show();
            Intent next_servicios = new Intent(this, MainActivity3.class);
            startActivity(next_servicios);
        }
        if (id == R.id.sucursales)
        {
            //Toast.makeText(getApplicationContext(), "Oprimir Sucursales", Toast.LENGTH_LONG).show();
            Intent next_sucursales = new Intent(this, MainActivity4.class);
            startActivity(next_sucursales);
        }
        return super.onOptionsItemSelected(item);
    }
}