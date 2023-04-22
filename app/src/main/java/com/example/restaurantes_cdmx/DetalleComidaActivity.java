package com.example.restaurantes_cdmx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleComidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_comida);

        // Obtener el alimento seleccionado
        Intent intent = getIntent();
        Alimento alimentoSeleccionado = intent.getParcelable("ALIMENTO_SELECCIONADO");

        // Obtener los elementos de la interfaz gráfica de usuario
        TextView nombreAlimentoTextView = findViewById(R.id.nombre_alimento_textview);

        TextView descripcionAlimentoTextView = findViewById(R.id.descripcion_alimento_textview);

        // Verificar si el alimento seleccionado no es nulo antes de mostrar sus datos
        if (alimentoSeleccionado != null) {
            // Mostrar los datos del alimento en los TextViews correspondientes
            nombreAlimentoTextView.setText(alimentoSeleccionado.getNombre());
            descripcionAlimentoTextView.setText(alimentoSeleccionado.getDescripcion());
        }
    }
}




