package com.example.apetoman.gitdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MasterActivity extends AppCompatActivity {


    public TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        Log.w("Tag", "YouGitDemo");
        Log.w("Tag", "Master");
        Log.w("Tag", "hahaha1");
        tv_name = (TextView) findViewById(R.id.tv_name);

        if (getIntent().getStringExtra("name")!=null){
            tv_name.setText(getIntent().getStringExtra("name"));
        }else{
            tv_name.setText(getIntent().getStringExtra("是null"));
        }


    }


    public static void openmaster(Context context, String name) {
        Intent intent = new Intent(context, MasterActivity.class);
        intent.putExtra("name",name);
        context.startActivity(intent);
        Log.w("name", name+"");
    }
}
