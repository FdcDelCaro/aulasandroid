package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class Numerorandom extends AppCompatActivity {
TextView numerosalea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerorandom);
        numerosalea = findViewById(R.id.random);

        Set<Integer> numeros = gerarNumerosAleatorios(10);
        String texto = numeros.toString();
        numerosalea.setText(texto);


    }// funcao para random
    private Set<Integer> gerarNumerosAleatorios(int quantidadeNumeros) {
        Random random = new Random();
        Set<Integer> numeros = new HashSet<Integer>();

        while (numeros.size() < quantidadeNumeros) {
            int numero = random.nextInt(quantidadeNumeros);
            numeros.add(numero);
        }

        return numeros;
    }
}
