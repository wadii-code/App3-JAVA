package com.example.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationinclass.R;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Étape 4 : Récupération des composants
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Étape 5 : Clic sur le bouton Login
        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            // Étape 6 : Vérification des champs vides
            if (TextUtils.isEmpty(username)) {
                etUsername.setError("Username requis");
                etUsername.requestFocus();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                etPassword.setError("Password requis");
                etPassword.requestFocus();
                return;
            }

            // Étape 7 : Vérification des identifiants
            if (username.equals("admin") && password.equals("1234")) {
                Toast.makeText(this, "Welcome admin", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
