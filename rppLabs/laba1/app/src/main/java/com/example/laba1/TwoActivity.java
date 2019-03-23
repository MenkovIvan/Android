package com.example.laba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        ListView list = findViewById(R.id.listik);

        intInText intText = new intInText();

        final String numbers[] = new String [1000000];



        for (int i = 0; i < 100000; i++) {
            String str = "";
            numbers[i]=intText.convert(i, str);
        }
        list.setAdapter(new MyAdapter(this, numbers));
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        finish();
        System.exit(0);
    }
}

