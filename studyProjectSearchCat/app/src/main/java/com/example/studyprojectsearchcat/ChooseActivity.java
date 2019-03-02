package com.example.studyprojectsearchcat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {
    public final static String THIEF = "abc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void RadioClick(View view) {
        Intent answerIntent = new Intent();

        switch(view.getId()){
            case R.id.RadioDog:
                answerIntent.putExtra(THIEF,"Сраный пёсик");
                break;
            case R.id.RadioCrow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.RadioCat:
                answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
                break;

            default:
                break;
        }
        setResult(RESULT_OK,answerIntent);
        finish();
    }
}
