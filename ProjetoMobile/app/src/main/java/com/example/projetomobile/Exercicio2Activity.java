// Exercicio2Activity.java - Calculadora Simples
package com.example.projetomobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Activity extends AppCompatActivity {

    private EditText editTextValor1, editTextValor2;
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        editTextValor1 = findViewById(R.id.editTextValor1);
        editTextValor2 = findViewById(R.id.editTextValor2);

        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        View.OnClickListener calcular = v -> {
            String valor1Str = editTextValor1.getText().toString();
            String valor2Str = editTextValor2.getText().toString();

            if (valor1Str.isEmpty() || valor2Str.isEmpty()) {
                Toast.makeText(this, "Preencha ambos os valores!", Toast.LENGTH_SHORT).show();
                return;
            }

            double valor1 = Double.parseDouble(valor1Str);
            double valor2 = Double.parseDouble(valor2Str);
            double resultado = 0;

            switch (v.getId()) {
                case R.id.btnSomar:
                    resultado = valor1 + valor2;
                    break;
                case R.id.btnSubtrair:
                    resultado = valor1 - valor2;
                    break;
                case R.id.btnMultiplicar:
                    resultado = valor1 * valor2;
                    break;
                case R.id.btnDividir:
                    if (valor2 == 0) {
                        Toast.makeText(this, "Divisão por zero não permitida!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    resultado = valor1 / valor2;
                    break;
            }

            Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
        };

        btnSomar.setOnClickListener(calcular);
        btnSubtrair.setOnClickListener(calcular);
        btnMultiplicar.setOnClickListener(calcular);
        btnDividir.setOnClickListener(calcular);
    }
}