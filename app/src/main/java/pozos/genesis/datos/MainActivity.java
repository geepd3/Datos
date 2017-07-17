package pozos.genesis.datos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button siguiente = (Button) findViewById(R.id.siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText et_nombre = (EditText) findViewById(R.id.nombre);
                String nombre = et_nombre.getText().toString();

                DatePicker date = (DatePicker) findViewById(R.id.fecha);
                int day = date.getDayOfMonth();
                int month = date.getMonth();
                int year = date.getYear();

                EditText et_telefono = (EditText) findViewById(R.id.telefono);
                String telefono = et_telefono.getText().toString();

                EditText et_email = (EditText) findViewById(R.id.email);
                String email = et_email.getText().toString();

                EditText et_descripcion = (EditText) findViewById(R.id.descripcion);
                String descripcion = et_descripcion.getText().toString();

                Intent intent = new Intent(MainActivity.this, ConfirmarActivity.class);
                intent.putExtra("KEY_NOMBRE", nombre);
                intent.putExtra("KEY_DAY", day);
                intent.putExtra("KEY_MONTH", month);
                intent.putExtra("KEY_YEAR", year);
                intent.putExtra("KEY_TELEFONO", telefono);
                intent.putExtra("KEY_EMAIL", email);
                intent.putExtra("KEY_DESCRIPCION", descripcion);

                startActivity(intent);
            }
        });
    }
}
