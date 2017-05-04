package juanmanuelcordobanataliavictoria.traveleurs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton singin, singup;
    TextView usuario, contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario= (TextView) findViewById(R.id.usuario);
        contraseña= (TextView) findViewById(R.id.contraseña);
        singin= (ImageButton) findViewById(R.id.singin);
        singup= (ImageButton) findViewById(R.id.singup);
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, Registro.class);
                        startActivity(i);
                    }
        });
    }
}
