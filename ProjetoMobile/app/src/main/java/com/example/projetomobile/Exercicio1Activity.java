// Exercicio1Activity.java - Verificar Maioridade
package com.example.projetomobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activi
private EditText editTextty extends AppCompatActivity {
    Nome, editTextIdade;
    private Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        btnVerificar = findViewById(R.id.btnVerificar);

        btnVerificar.setOnClickListener(v -> {
            String nome = editTextNome.getText().toString();
            String idadeStr = editTextIdade.getText().toString();

            if (nome.isEmpty() || idadeStr.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                return;
            }

            int idade = Integer.parseInt(idadeStr);
            String mensagem = idade >= 18 ? nome + " é maior de idade!" : nome + " é menor de idade!";
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        });
    }
}