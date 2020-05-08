package com.example.dictionaryappactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MeaningActivity extends AppCompatActivity {
    private TextView meaningTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaning);
        Intent data = getIntent();
        int pos = data.getIntExtra("POS",0);
        String[] words = getResources().getStringArray(R.array.words);
        String[] meanings = getResources().getStringArray(R.array.meanings);
        meaningTV = findViewById(R.id.meaning_tv);
        meaningTV.setText("The meaning of the word:"+words[pos]+"is\n"+meanings[pos]);
    }
}
