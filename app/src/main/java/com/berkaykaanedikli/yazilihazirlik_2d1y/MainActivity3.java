package com.berkaykaanedikli.yazilihazirlik_2d1y;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.berkaykaanedikli.yazilihazirlik_2d1y.databinding.ActivityMain3Binding;
import com.berkaykaanedikli.yazilihazirlik_2d1y.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        KisiBilgi kisiBilgi = intent.getParcelableExtra("kisiBilgi", KisiBilgi.class);

        binding.textUserName.setText(kisiBilgi.getUserName());
        binding.textEmail.setText(kisiBilgi.getEmail());
        binding.textPhoneNo.setText(kisiBilgi.getPhoneNo());
        binding.textPassword.setText(kisiBilgi.getPassword());

    }
}
