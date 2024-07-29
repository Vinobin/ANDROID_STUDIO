package com.example.intentactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Penjualan extends AppCompatActivity {
    TextView tvPenjualan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_penjualan);
       load();
       ambildata();
    }
    public void load(){
       tvPenjualan = findViewById(R.id.tvPenjualan);
    }
    public void ambildata(){
        String ambil =getIntent().getStringExtra("ISI");
        tvPenjualan.setText(ambil);
    }
}