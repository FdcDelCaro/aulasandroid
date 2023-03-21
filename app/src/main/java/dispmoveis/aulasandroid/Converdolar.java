package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Converdolar extends AppCompatActivity {

    EditText dolar;

    EditText real;

    TextView tvResultado;

    Button Calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converdolar);
        dolar = findViewById(R.id.ndolar);
        real = findViewById(R.id.nreal);
        tvResultado = findViewById(R.id.resultado);
        Calcular = findViewById(R.id.Calcularimc);

        if (savedInstanceState != null) {
            dolar.setText(savedInstanceState.getString("numero1"));
            real.setText(savedInstanceState.getString("numero2"));
        }

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = dolar.getText().toString();
                String n2 = real.getText().toString();

                float num1 = Float.parseFloat(n1);
                float num2 = Float.parseFloat(n2);

                float resultado = num1 * num2;

                String msg = "---CONVERTIDO---: ";
                tvResultado.setText(String.valueOf(msg+resultado));



            }
        });
    }





}