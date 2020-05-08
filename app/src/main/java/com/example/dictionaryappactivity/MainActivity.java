package com.example.dictionaryappactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView wordsLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordsLV = findViewById(R.id.WordsListView);

        ArrayAdapter<String> listArrAdapter = new ArrayAdapter<String>(this, R.layout.list_item,getResources().getStringArray(R.array.words));
        wordsLV.setAdapter(listArrAdapter);
        wordsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, meanings[position], Toast.LENGTH_SHORT).show();
                Intent newInt = new Intent();
                newInt.setClass(getApplicationContext(), MeaningActivity.class);
                newInt.putExtra("POS",position);
                startActivity(newInt);
            }
        });
    }
}
