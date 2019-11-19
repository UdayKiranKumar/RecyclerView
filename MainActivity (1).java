package com.example.recyclerviewtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1 ,et2;
    Button b1;
    RecyclerView rv;
    RecyclerView.LayoutManager lm;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(lm);
        rv.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }
    public void dothis(View view){
        String name = et1.getText().toString();

    }

}
