package com.example.apetoman.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("Tag", "GitDemo");
        btSub = findViewById(R.id.bt_sub);
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MasterActivity.openmaster(MainActivity.this, null);
            }
        });

    }
}
