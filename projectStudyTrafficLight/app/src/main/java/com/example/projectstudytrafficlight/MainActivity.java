package com.example.projectstudytrafficlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mStatusBackground;
    private ConstraintLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLayout = findViewById(R.id.relelativeLayout);
        mStatusBackground = findViewById(R.id.status);
    }

    public void clickRed(View view) {
        mStatusBackground.setText(R.string.red);
        mLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
    }

    public void clickYellow(View view) {
        mStatusBackground.setText(R.string.yellow);
        mLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));
    }

    public void clickGreen(View view) {
        mStatusBackground.setText(R.string.green);
        mLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.greenColor));
    }
}
