package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    String[] nombres={"Moncho","Lula","Amy","Bananín","Bananón","Barney","DJ","Babybop","Teletubbie","Blue"};
    String[] edades={"4","5","6","4","4","40","100","150","45","2"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);

        ArrayAdapter <String>adapter=new ArrayAdapter<String>(this,R.layout.list_item_opciones,nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de "+lv1.getItemAtPosition(i)+" es "+edades[i]+" años.");
            }
        });
    }
}