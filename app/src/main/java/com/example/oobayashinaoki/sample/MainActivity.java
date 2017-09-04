package com.example.oobayashinaoki.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        String[] samples = getResources().getStringArray(R.array.sample);
        //startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("LiceCycle", "Destroy");
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show();
    }
}
