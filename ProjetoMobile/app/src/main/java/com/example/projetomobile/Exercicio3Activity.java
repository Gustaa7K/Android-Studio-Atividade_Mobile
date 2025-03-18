// Exercicio3Activity.java - Cadastro de Usuário
package com.example.projetomobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio3Activity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade, editTextUF, editTextCidade, editTextTelefone, editTextEmail;
    private RadioGroup radioGroupTamanho;
    private CheckBox checkBoxVermelho, checkBoxAzul, checkBoxVerde;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextUF = findViewById(R.id.editTextUF);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextEmail = findViewById(R.id.editTextEmail);

        radioGroupTamanho = findViewById(R.id.radioGroupTamanho);

        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVerde = findViewById(R.id.checkBoxVerde);

        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(v -> {
            String nome = editTextNome.getText().toString();
            String idade = editTextIdade.getText().toString();
            String uf = editTextUF.getText().toString();
            String cidade = editTextCidade.getText().toString();
            String telefone = editTextTelefone.getText().toString();
            String email = editTextEmail.getText().toString();

            int selectedId = radioGroupTamanho.getCheckedRadioButtonId();
            RadioButton selectedRadio = findViewById(selectedId);
            String tamanho = selectedRadio != null ? selectedRadio.getText().toString() : "Não selecionado";

            StringBuilder cores = new StringBuilder("Cores: ");
            if (checkBoxVermelho.isChecked()) cores.append("Vermelho ");
            if (checkBoxAzul.isChecked()) cores.append("Azul ");
            if (checkBoxVerde.isChecked()) cores.append("Verde ");

            String mensagem = "Cadastro:\n" + nome + ", " + idade + " anos, " + uf + " - " + cidade + "\nTelefone: " + telefone + "\nEmail: " + email + "\nTamanho: " + tamanho + "\n" + cores;
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
        });
    }
}