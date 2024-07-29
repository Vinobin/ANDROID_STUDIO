package com.example.messagedialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    public void showToast(String pesan){
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
    }
    public void showAlert(String pesan){
        AlertDialog.Builder buatAlert =new AlertDialog.Builder(this);
        buatAlert.setTitle("WOOOIII");
        buatAlert.setMessage(pesan);
        buatAlert.show();
    }
    public void showAlertButton(String pesan){
        AlertDialog.Builder showAlert = new AlertDialog.Builder(this);
        showAlert.setTitle("PERINGATAN KERAS");
        showAlert.setMessage(pesan);
        showAlert.setPositiveButton("iyaaaaaa", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("udah dihapus");
            }
        });
        showAlert.setNegativeButton("enggaaaaa", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("blom dihapus");
            }
        });
        showAlert.show();
    }
    public void btnToast(View view) {
        showToast("Ayo kita bermain");
    }

    public void btnAlert(View view) {
        showAlert("INFO INFO'");
    }

    public void btnAlertDialogButton(View view) {
        showAlertButton(" aku mau ngehapus");
    }
}