package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class gamemoriaprincipal extends AppCompatActivity {


        private TextView textView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gamemoriaprincipal);

            textView = findViewById(R.id.texto);

            // Gerando letras aleatorias
            String sequence = generateRandomSequence(5);

            // Exibir sequência na TextView
            textView.setText(sequence);

            // metodo para tela de 10 segundos para memorizar os caracteres
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(gamemoriaprincipal.this, Seguntatelagame.class);
                    intent.putExtra("sequence", sequence);
                    startActivity(intent);
                    finish();
                }
            }, 10000);
        }

        // Método para gerar as letras
        private String generateRandomSequence(int length) {
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder sequence = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = (int) (Math.random() * alphabet.length());
                sequence.append(alphabet.charAt(index));
            }

            return sequence.toString();
        }
    }