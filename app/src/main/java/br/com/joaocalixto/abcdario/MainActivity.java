package br.com.joaocalixto.abcdario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rng = new Random();

    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
    TextView txtLetra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLetra = (TextView) findViewById(R.id.txt_letra);
    }

    public void gerarLetra(View v){

        try{
            Integer next = rng.nextInt(alphabet.length() -1) + 1;
            char letra = alphabet.charAt(next);
            txtLetra.setText(String.valueOf(letra));
            Log.i("ABC", "TERMINADO");
        }catch (Exception e){
            Log.e("ABC", "msg", e.getCause());
        }


    }
}
