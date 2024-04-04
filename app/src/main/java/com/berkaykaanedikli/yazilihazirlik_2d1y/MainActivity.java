package com.berkaykaanedikli.yazilihazirlik_2d1y;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.berkaykaanedikli.yazilihazirlik_2d1y.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.textViewHata.setVisibility(View.INVISIBLE);

        binding.userName.getText().toString();
        binding.eMail.getText().toString();
        binding.phoneNo.getText().toString();
        binding.password.getText().toString();
        binding.passwordAgain.getText().toString();
    }

    public void KayitOl(View view) {
        String userName = binding.userName.getText().toString();
        String eMail = binding.eMail.getText().toString();
        String phoneNo = binding.phoneNo.getText().toString();
        String password = binding.password.getText().toString();
        String passwordAgain = binding.passwordAgain.getText().toString();
        Intent intent = new Intent(this, MainActivity3.class);


        if (password.equals(passwordAgain)) {
            KisiBilgi kisiBilgi = new KisiBilgi(userName, eMail, phoneNo, password, passwordAgain);
            intent.putExtra("kisiBilgi", kisiBilgi);
            startActivity(intent);
        }
        else {
            binding.textViewHata.setVisibility(View.VISIBLE);
        }

    }
}