package com.example.jaewon.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1 (View view){

        Toast.makeText(getApplicationContext(), "버튼이 눌림", Toast.LENGTH_LONG).show();
    }
}
