package monti.com.mapassanjuan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapaIschigualasto(View view){
        Intent mapa = new Intent(this, MapsActivity1.class);
        mapa.putExtra("lugar", "ischigualasto");
        startActivity(mapa);
    }

    public void mapaLeoncito(View view){
        Intent mapa = new Intent(this, MapsActivity1.class);
        mapa.putExtra("lugar", "leoncito");
        startActivity(mapa);
    }

    public void mapaValleFertil(View view){
        Intent mapa = new Intent(this, MapsActivity1.class);
        mapa.putExtra("lugar", "vallefertil");
        startActivity(mapa);
    }

    public void mapaUllum(View view){
        Intent mapa = new Intent(this, MapsActivity1.class);
        mapa.putExtra("lugar", "ullum");
        startActivity(mapa);
    }
}
