package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Caractertroca extends AppCompatActivity {

    TextView original;
    TextView resultado;


    Button trocar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caractertroca);
        original = findViewById(R.id.original);
        resultado = findViewById(R.id.caracter2);
        trocar=findViewById(R.id.mudar);
                trocar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String char1 = ("vamos mudar os caracteres");
                        original.setText(String.valueOf(char1));
                        String char2 = char1.replace('s','$');

                        resultado.setText(String.valueOf(char2));



                    }
                });
    }


}