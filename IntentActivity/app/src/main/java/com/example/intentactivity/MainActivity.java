package com.example.intentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        load();
    }
   public void load(){
         etBarang= findViewById(R.id.etBarang);
    }

    public void btnBarang(View view) {
        String barang = etBarang.getText().toString();
        Intent intent = new Intent(this, Barang.class);
        intent.putExtra("ISI",barang);
        startActivity(intent);;
    }

    public void btnPenjualan(View view) {
        String barang = etBarang.getText().toString();
        Intent intent = new Intent(this, Barang.class);
        intent.putExtra("ISI",barang);
        startActivity(intent);;
    }

    public void btnPembelian(View view) {
        String barang = etBarang.getText().toString();
        Intent intent = new Intent(this, Barang.class);
        intent.putExtra("ISI",barang);
        startActivity(intent);;
    }
}