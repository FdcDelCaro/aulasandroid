package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultadocalc extends AppCompatActivity {
    Button voltarpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadocalculator);
        voltarpage=findViewById(R.id.voltar);


    // recuperando o resultado da intent da pagina principal calculator

    int resultado = getIntent().getIntExtra("resultado",0);

    //exibir o resultado em um textview

    TextView Resultado = findViewById(R.id.resultado);
    Resultado.setText("O resultado da operação escolhida é: " + resultado);
    voltarpage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent in = new Intent(Resultadocalc.this, Calculator.class);
            startActivity(in);
        }
    });

}
}
