package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Terceiratelagame extends AppCompatActivity {



        private TextView textView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_terceiratelagame);

                textView = findViewById(R.id.resultadogame);

                // Obter resultado da segunda tela
                boolean result = getIntent().getBooleanExtra("result", false);

                // Exibir mensagem de acordo com o resultado
                if (result) {
                        textView.setText("Você acertou!");
                } else {
                        textView.setText("Você errou!");
                }

                // Aguardar 3 segundos antes de fechar a aplicação
                new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                                finishAffinity();
                        }
                }, 3000);
        }
}