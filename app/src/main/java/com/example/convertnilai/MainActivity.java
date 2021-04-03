package com.example.convertnilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNama;
    TextView tvPassword;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Nama = getIntent().getExtras().getString("nama");
        String Pass = getIntent().getExtras().getString("password");
        String Hasil = getIntent().getExtras().getString("convert");

        tvNama = findViewById(R.id.tvNama);
        tvPassword = findViewById(R.id.tvPassword);
        tvHasil = findViewById(R.id.tvNilai);

        tvNama.setText("Nama            : " + Nama);
        tvPassword.setText("Password    : " + Pass);
        tvHasil.setText("Nilai              : " + Hasil);
    }
}