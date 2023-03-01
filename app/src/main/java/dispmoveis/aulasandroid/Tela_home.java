package dispmoveis.aulasandroid;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_home extends AppCompatActivity {
    Button botaoprxpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_home);

        botaoprxpage=findViewById(R.id.bp1);

        botaoprxpage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent (Tela_home.this, Activity_Tela2.class);
                startActivity(in);
            }
        });
    }
}