package dispmoveis.aulasandroid;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4 extends AppCompatActivity {
    Button pxpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        pxpage=findViewById(R.id.bp4);
        pxpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Tela4.this, Tela5.class);
                startActivity(in);
            }
        });
    }
}