package pozos.genesis.datos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        String nombre = getIntent().getStringExtra("KEY_NOMBRE");

        int day = getIntent().getIntExtra("KEY_DAY", 0);
        int month = getIntent().getIntExtra("KEY_MONTH", 0);
        int year = getIntent().getIntExtra("KEY_YEAR", 0);

        String fecha = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);

        String telefono = getIntent().getStringExtra("KEY_TELEFONO");
        String email = getIntent().getStringExtra("KEY_EMAIL");
        String descripcion = getIntent().getStringExtra("KEY_DESCRIPCION");


        TextView tv_nombre = (TextView) findViewById(R.id.nombre);
        tv_nombre.setText(nombre);

        TextView tv_fecha = (TextView) findViewById(R.id.fecha);
        tv_fecha.setText("Fecha de nacimiento: " + fecha);

        TextView tv_telefono = (TextView) findViewById(R.id.telefono);
        tv_telefono.setText("Tel. " + telefono);

        TextView tv_email = (TextView) findViewById(R.id.email);
        tv_email.setText("Email: " + email);

        TextView tv_descripcion = (TextView) findViewById(R.id.descripcion);
        tv_descripcion.setText("Descripción: " + descripcion);

        Button editar = (Button) findViewById(R.id.editar);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
