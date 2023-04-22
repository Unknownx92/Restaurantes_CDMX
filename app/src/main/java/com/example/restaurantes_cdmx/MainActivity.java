package com.example.restaurantes_cdmx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RestaurantListAdapter.RestaurantClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuración del Toolbar personalizado
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Lista de restaurantes");

        // Inicialización de la lista de restaurantes
        ArrayList<Restaurante> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurante("La Cantina", "Calle 1, Ciudad de México"));
        restaurantList.add(new Restaurante("El Tizón", "Calle 2, Ciudad de México"));
        restaurantList.add(new Restaurante("El Sabor de Mexico", "Avenida 2, Ciudad de México"));
        restaurantList.add(new Restaurante("La Cocina Mexicana", "Calle 3, Ciudad de México"));
       

        // Configuración del RecyclerView y el adaptador
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RestaurantListAdapter adapter = new RestaurantListAdapter(restaurantList, this);
        recyclerView.setAdapter(adapter);
    }
}

