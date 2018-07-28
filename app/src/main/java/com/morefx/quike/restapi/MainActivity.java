package com.morefx.quike.restapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import modelos.Producto;
import retrofit2.Retrofit;
import servicios.ProductoService;

public class MainActivity extends AppCompatActivity {

    Producto producto = new Producto();
    ProductoService productoService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit servicio = new Retrofit.Builder()
                .baseUrl("http://192.168.22.74:8000/api/")
                .build();

        this.productoService = servicio.create(ProductoService.class);
    }

    public void guardar(View v) {
        producto.nombre = findViewById(R.id.nombre).toString();
        producto.descripcion = findViewById(R.id.descripcion).toString();
        producto.precio = Float.parseFloat(findViewById(R.id.precio).toString());
        producto.cantidad = Integer.parseInt(findViewById(R.id.cantidad).toString());
        this.productoService.crear(producto);
    }
    public void listar(View v) {
        this.productoService.listar();
    }



}
