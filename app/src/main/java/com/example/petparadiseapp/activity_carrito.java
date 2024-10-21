package com.example.petparadiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_carrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_carrito);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView img_home = findViewById(R.id.img_home);

        img_home.setOnClickListener(v -> {
            Intent intent = new Intent(activity_carrito.this, activity_login_form.class);
            startActivity(intent);
        });

        ImageView img_carrito = findViewById(R.id.img_carrito);

        img_carrito.setOnClickListener(v -> {
            Intent intent = new Intent(activity_carrito.this, activity_carrito.class);
            startActivity(intent);
        });
    }
}