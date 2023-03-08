package dispmoveis.aulasandroid;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Tela2 extends AppCompatActivity {
    Button pxpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        pxpage=findViewById(R.id.bp2);
        pxpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity_Tela2.this, Tela3.class);
                startActivity(in);
            }
        });
    }
}