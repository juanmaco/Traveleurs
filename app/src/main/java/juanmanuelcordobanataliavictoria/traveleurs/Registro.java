package juanmanuelcordobanataliavictoria.traveleurs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by JuanitoMatadragones on 23/04/17.
 */

public class Registro extends Activity {
    TextView nombre,apellido,usuario,correo,contraseña;
    ImageButton singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre= (TextView) findViewById(R.id.nombre);
        apellido= (TextView)findViewById(R.id.apellido);
        usuario= (TextView) findViewById(R.id.usuario);
        correo= (TextView) findViewById(R.id.email);
        contraseña= (TextView) findViewById(R.id.contraseña);
        singup= (ImageButton) findViewById(R.id.singup);
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
