package com.gjiazhe.springlistview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.gjiazhe.springlistview.SpringListView;

public class MainActivity extends AppCompatActivity {
    private SpringListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (SpringListView) findViewById(R.id.spring_list_view);
        setAdapter();
    }

    private void setAdapter() {
        String[] array = new String[20];
        for (int i=0; i<array.length; i++) {
            array[i] = "List item " + (i+1);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(arrayAdapter);
    }
}
