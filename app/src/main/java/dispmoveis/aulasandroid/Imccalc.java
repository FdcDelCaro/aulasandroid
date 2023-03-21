package dispmoveis.aulasandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Imccalc extends AppCompatActivity {

    EditText peso;

    EditText altura;

    TextView tvResultado;
    TextView tvResultado2;

    Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        peso = findViewById(R.id.npeso);
        altura = findViewById(R.id.naltura);
        tvResultado = findViewById(R.id.resultadoimc);
        tvResultado2 = findViewById(R.id.resultadoimc2);
        Calcular = findViewById(R.id.Calcularimc);

        if (savedInstanceState != null) {
            peso.setText(savedInstanceState.getString("numero1"));
            altura.setText(savedInstanceState.getString("numero2"));
        }

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = peso.getText().toString();
                String n2 = altura.getText().toString();

                float num1 = Float.parseFloat(n1);
                float num2 = Float.parseFloat(n2);
                float n3 = num2*num2;
                float resultado = num1 / n3;


                tvResultado.setText(String.valueOf(resultado));
                if(resultado<18){
                    tvResultado2.setText(String.valueOf("muito abaixo do peso"));
                }
                else if (resultado<=18.5) {
                    tvResultado2.setText(String.valueOf("peso normal"));
                }
                else if (resultado<=24.9){
                    tvResultado2.setText(String.valueOf("sobrepeso"));
                }
                else if (resultado > 25 && resultado < 29){
                    tvResultado2.setText(String.valueOf("sobrepeso grave"));
                }

                else if (resultado > 30 && resultado < 39.9){
                    tvResultado2.setText(String.valueOf("obeso"));
                }

                else if (resultado > 40 && resultado < 1000){
                    tvResultado2.setText(String.valueOf("obesidade grave"));
                }

            }

        });
    }
}