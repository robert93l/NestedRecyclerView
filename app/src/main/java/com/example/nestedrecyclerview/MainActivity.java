package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> favoriteList;
    ArrayList<ChildModelClass> recentlyWatchedList;
    ArrayList<ChildModelClass> lastestList;
    ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        recyclerView=findViewById(R.id.rv_parent);
        childModelClassArrayList=new ArrayList<>();
        favoriteList=new ArrayList<>();
        recentlyWatchedList=new ArrayList<>();
        lastestList=new ArrayList<>();
        parentModelClassArrayList=new ArrayList<>();


        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));
        lastestList.add(new ChildModelClass(R.drawable.coca));

        parentModelClassArrayList.add(new ParentModelClass("Lastest Movies", lastestList));

        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.coca1));

        parentModelClassArrayList.add(new ParentModelClass("recents", recentlyWatchedList));

        favoriteList.add(new ChildModelClass((R.drawable.coca2)));
        favoriteList.add(new ChildModelClass((R.drawable.coca2)));
        favoriteList.add(new ChildModelClass((R.drawable.coca2)));
        favoriteList.add(new ChildModelClass((R.drawable.coca2)));
        favoriteList.add(new ChildModelClass((R.drawable.coca2)));
        favoriteList.add(new ChildModelClass((R.drawable.coca2)));

        parentModelClassArrayList.add(new ParentModelClass("favorites", favoriteList));

        childModelClassArrayList.clear();
        childModelClassArrayList.add(new ChildModelClass(R.drawable.coca3));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.coca3));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.coca3));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.coca3));

        parentModelClassArrayList.add(new ParentModelClass("Recently",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Great",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Recently",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Great",childModelClassArrayList));

        parentAdapter = new ParentAdapter(parentModelClassArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();


    }
}