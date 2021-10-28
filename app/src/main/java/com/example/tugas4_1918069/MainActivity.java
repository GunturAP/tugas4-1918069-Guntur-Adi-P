package com.example.tugas4_1918069;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LaguAdapter adapter;
    private ArrayList<Lagu> laguArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleView);
        adapter = new LaguAdapter(laguArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
    private void addData() {
        laguArrayList = new ArrayList<>();
        laguArrayList.add(new Lagu("Easy On ME", "Adele", "2021",R.drawable.adele));
        laguArrayList.add((new Lagu("Hanya Rindu","Andmesh Kamaleng", "2019",R.drawable.andmesh)));
        laguArrayList.add((new Lagu("Kota", "Dere", "2020",R.drawable.dere)));
        laguArrayList.add((new Lagu("Here's You Perfect","Jamie Miller", "2021",R.drawable.jamie)));
        laguArrayList.add((new Lagu("It's Only Me", "Asal : Kaleb J", "2020", R.drawable.kaleb)));
        laguArrayList.add((new Lagu("Money", "Lisa", "2021", R.drawable.lisa)));
        laguArrayList.add((new Lagu("Reckless", "Madison Beer", "2021", R.drawable.madison)));
        laguArrayList.add((new Lagu("Dandelions","Ruth B","2017",R.drawable.ruthb)));
        laguArrayList.add((new Lagu("It's You","Sezairi","2018",R.drawable.sezairi)));
        laguArrayList.add((new Lagu("Pingal","Woro Widowati","2021",R.drawable.woro)));
        laguArrayList.add((new Lagu("Duka","Last Child","2017",R.drawable.lastchild)));
    }
}
