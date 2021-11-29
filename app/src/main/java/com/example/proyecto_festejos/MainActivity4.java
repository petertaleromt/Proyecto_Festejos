package com.example.proyecto_festejos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Agregar icono en el action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_festejos);
    }

    public boolean onCreateOptionsMenu(Menu menu_sucursales) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_sucursales, menu_sucursales);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.principal)
        {
            Intent next_principal = new Intent(this, MainActivity.class);
            startActivity(next_principal);
        }
        if (id == R.id.productos)
        {
            Intent next_productos = new Intent(this, MainActivity2.class);
            startActivity(next_productos);
        }
        if (id == R.id.servicios)
        {
            Intent next_servicios = new Intent(this, MainActivity4.class);
            startActivity(next_servicios);
        }
        return super.onOptionsItemSelected(item);
    }
}