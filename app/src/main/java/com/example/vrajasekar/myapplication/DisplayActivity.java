package com.example.vrajasekar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String username = intent.getExtras().getString("username");
        TextView textView = (TextView)findViewById(R.id.displayText);
        textView.setText("Welcome "+username+"!");
        ListView listView = (ListView)findViewById(R.id.listview);
        final String[] reports = getMyReports(username);
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, reports);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),reports[i],Toast.LENGTH_SHORT).show();

            }
        });
    }

    private String[] getMyReports(String username){
        String[] reports  = {"AA","BB","CC"};

        //get the reportees based on uname from the tbl
        //form the string array and return it
        return reports;
    }

}
