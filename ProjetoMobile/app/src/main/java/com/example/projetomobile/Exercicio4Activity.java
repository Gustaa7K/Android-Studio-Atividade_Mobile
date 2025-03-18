// Exercicio4Activity.java - Checkbox para cada letra do nome
package com.example.projetomobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4Activity extends AppCompatActivity {

    private EditText editTextNome;
    private Button btnMostrarCheckBoxes;
    private LinearLayout linearLayoutCheckBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        editTextNome = findViewById(R.id.editTextNome);
        btnMostrarCheckBoxes = findViewById(R.id.btnMostrarCheckBoxes);
        linearLayoutCheckBoxes = findViewById(R.id.linearLayoutCheckBoxes);

        btnMostrarCheckBoxes.setOnClickListener(v -> {
            String nome = editTextNome.getText().toString();
            if (nome.isEmpty()) {
                Toast.makeText(this, "Digite um nome!", Toast.LENGTH_SHORT).show();
                return;
            }

            linearLayoutCheckBoxes.removeAllViews();

            for (char letra : nome.toCharArray()) {
                CheckBox checkBox = new CheckBox(this);
                checkBox.setText(String.valueOf(letra));
                linearLayoutCheckBoxes.addView(checkBox);
            }
        });
    }
}
