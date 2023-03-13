package dispmoveis.aulasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Seguntatelagame extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private String sequence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguntatelagame);

        editText = findViewById(R.id.digitador);
        button = findViewById(R.id.verificar);

        // Obter sequência da primeira tela
        sequence = getIntent().getStringExtra("sequence");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                // Verificar se o input do usuário é igual à sequência exibida na primeira tela
                if (input.equals(sequence)) {
                    Intent intent = new Intent(Seguntatelagame.this, Terceiratelagame.class);
                    intent.putExtra("result", true);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(Seguntatelagame.this, Terceiratelagame.class);
                    intent.putExtra("result", false);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}