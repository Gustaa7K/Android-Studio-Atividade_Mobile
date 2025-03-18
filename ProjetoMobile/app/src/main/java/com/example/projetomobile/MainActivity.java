// MainActivity.java - Tela inicial com navegação entre as Activities
package com.example.projetomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnExercicio1, btnExercicio2, btnExercicio3, btnExercicio4, btnExercicio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExercicio1 = findViewById(R.id.btnExercicio1);
        btnExercicio2 = findViewById(R.id.btnExercicio2);
        btnExercicio3 = findViewById(R.id.btnExercicio3);
        btnExercicio4 = findViewById(R.id.btnExercicio4);
        btnExercicio5 = findViewById(R.id.btnExercicio5);

        btnExercicio1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Exercicio1Activity.class)));
        btnExercicio2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Exercicio2Activity.class)));
        btnExercicio3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Exercicio3Activity.class)));
        btnExercicio4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Exercicio4Activity.class)));
        btnExercicio5.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Exercicio5Activity.class)));
    }
}
