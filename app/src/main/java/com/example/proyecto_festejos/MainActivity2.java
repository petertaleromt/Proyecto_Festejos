package com.example.proyecto_festejos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Agregar icono en el action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_festejos);
    }


    public boolean onCreateOptionsMenu(Menu menu_productos) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_productos, menu_productos);
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
        if (id == R.id.servicios)
        {
            Intent next_servicios = new Intent(this, MainActivity3.class);
            startActivity(next_servicios);
        }
        if (id == R.id.sucursales)
        {
            Intent next_sucursales = new Intent(this, MainActivity4.class);
            startActivity(next_sucursales);
        }
        return super.onOptionsItemSelected(item);
    }
}