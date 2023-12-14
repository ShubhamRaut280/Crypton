package com.shubham.crypto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.shubham.crypto.recycler.Adapter;
import com.shubham.crypto.recycler.model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        ArrayList<model> list = new ArrayList<>();
        model item = new model("bitcon","bit","1089887",null);
        list.add(item);list.add(item);list.add(item);list.add(item);list.add(item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(list));
    }
}