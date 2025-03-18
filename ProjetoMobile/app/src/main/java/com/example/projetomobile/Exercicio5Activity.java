// Exercicio5Activity.java - Preferências de usuário
package com.example.projetomobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio5Activity extends AppCompatActivity {

    private CheckBox checkBoxNotificacoes, checkBoxModoEscuro, checkBoxLembrarLogin;
    private Button btnSalvarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5);

        checkBoxNotificacoes = findViewById(R.id.checkBoxNotificacoes);
        checkBoxModoEscuro = findViewById(R.id.checkBoxModoEscuro);
        checkBoxLembrarLogin = findViewById(R.id.checkBoxLembrarLogin);

        btnSalvarPreferencias = findViewById(R.id.btnSalvarPreferencias);

        btnSalvarPreferencias.setOnClickListener(v -> {
            StringBuilder preferencias = new StringBuilder();

            if (checkBoxNotificacoes.isChecked()) preferencias.append("Receber notificações ");
            if (checkBoxModoEscuro.isChecked()) preferencias.append("Modo escuro ");
            if (checkBoxLembrarLogin.isChecked()) preferencias.append("Lembrar login");

            if (preferencias.length() == 0) {
                Toast.makeText(this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Preferências: " + preferencias, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
