package com.example.gisela.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DetalleProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);

        //Obtenemos una referencia a los controles de la interfaz
        final Button atras = (Button)findViewById(R.id.volver);
//Implementamos el evento “click” del botón
        atras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(DetalleProducto.this, HolaMundo.class);
                startActivity(intent);
            }
        });
    }

}
