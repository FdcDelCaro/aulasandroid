package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText numero1;

    EditText numero2;
    Button bEnviar;
    Button subtracao;
    Button multiplicar;
    Button dividir;
    Button jogomemoria;
    Button convertdolar;

    Button calcimc;


    Button Strings;

    Button random;
    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        numero1 = findViewById(R.id.n1);
        numero2 = findViewById(R.id.n2);
        bEnviar = findViewById(R.id.soma);
        subtracao = findViewById(R.id.subtrair);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);
        jogomemoria = findViewById(R.id.jogo);
        convertdolar = findViewById(R.id.cdolar);
        calcimc = findViewById(R.id.imccalc);
        Strings = findViewById(R.id.strings);
        random = findViewById(R.id.rand);

        tvResultado = findViewById(R.id.resultado);

        if (savedInstanceState != null) {
            numero1.setText(savedInstanceState.getString("numero1"));
            numero2.setText(savedInstanceState.getString("numero2"));
        }


        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                int resultado = num1 + num2;

                //iniciando uma nova tela passando o resultado como um extra.

                Intent intent = new Intent(Calculator.this, Resultadocalc.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                int resultado = num1 - num2;

                Intent intent = new Intent(Calculator.this, Resultadocalc.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                int resultado = num1 * num2;

                Intent intent = new Intent(Calculator.this, Resultadocalc.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                int resultado = num1 / num2;

                Intent intent = new Intent(Calculator.this, Resultadocalc.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        jogomemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Calculator.this, gamemoriaprincipal.class);
                startActivity(intent);
            }
        });
        convertdolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Calculator.this, Converdolar.class);
                startActivity(intent);
            }
        });

        calcimc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Calculator.this, Imccalc.class);
                startActivity(intent);
            }
        });

        Strings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Calculator.this, Caractertroca.class);
                startActivity(intent);
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Calculator.this, Numerorandom.class);
                startActivity(intent);
            }
        });





    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Salve os valores dos EditTexts no Bundle
        outState.putString("numero1", numero1.getText().toString());
        outState.putString("numero2", numero2.getText().toString());
    }
}