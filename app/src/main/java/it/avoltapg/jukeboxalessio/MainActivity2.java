package it.avoltapg.jukeboxalessio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    final String TAG="Main Activity2";
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int numero = bundle.getInit(key,"Numero");
        Log.d(TAG, "Numero passato: " + numero);
    }

    Button Button1= findViewById(R.id.button1);

    public void Button1( View view){
        Intent intent= new Intent(getApplicationContext(), MainActivity2.class);
        MainActivity2.putExtra();
        startActivity(MainActivity2);


    }



} final String TAG;
    Button Button1;
@Override