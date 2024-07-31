package com.example.recycleviewcardview;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> SiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }
    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void isiData(){
        SiswaList = new ArrayList<Siswa>();
        SiswaList.add(new Siswa("AMBA", "NGAWI"));
        SiswaList.add(new Siswa("RUSDI", "SIDOARJO"));
        SiswaList.add(new Siswa("FUAD", "SURABAYA"));
        SiswaList.add(new Siswa("ASEP", "JAKARTA"));
        SiswaList.add(new Siswa("IRONI", "AFRIKA"));
        SiswaList.add(new Siswa("SUCIPTO", "MALANG"));
        SiswaList.add(new Siswa("JOKO", "JAWA"));
        SiswaList.add(new Siswa("HANDOYO", "JAKSEL"));
        adapter = new SiswaAdapter(this,SiswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnNambah(View view) {
        SiswaList.add(new Siswa("AMBATRON", "NGUWAWI"));
        adapter.notifyDataSetChanged();
    }
}