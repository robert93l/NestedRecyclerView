package com.example.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var parentModelClassArrayList: ArrayList<ParentModelClass>? = null
    var childModelClassArrayList: ArrayList<ChildModelClass>? = null
    var favoriteList: ArrayList<ChildModelClass>? = null
    var recentlyWatchedList: ArrayList<ChildModelClass>? = null
    var lastestList: ArrayList<ChildModelClass>? = null
    var parentAdapter: ParentAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Objects.requireNonNull(supportActionBar)?.hide()
        recyclerView = findViewById(R.id.rv_parent)
        childModelClassArrayList = ArrayList()
        favoriteList = ArrayList()
        recentlyWatchedList = ArrayList()
        lastestList = ArrayList()
        parentModelClassArrayList = ArrayList()
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        lastestList!!.add(ChildModelClass(R.drawable.coca))
        parentModelClassArrayList!!.add(ParentModelClass("Lastest Movies", lastestList!!))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        recentlyWatchedList!!.add(ChildModelClass(R.drawable.coca1))
        parentModelClassArrayList!!.add(ParentModelClass("recents", recentlyWatchedList!!))
        favoriteList!!.add(ChildModelClass(R.drawable.coca2))
        favoriteList!!.add(ChildModelClass(R.drawable.coca2))
        favoriteList!!.add(ChildModelClass(R.drawable.coca2))
        favoriteList!!.add(ChildModelClass(R.drawable.coca2))
        favoriteList!!.add(ChildModelClass(R.drawable.coca2))
        favoriteList!!.add(ChildModelClass(R.drawable.coca2))
        parentModelClassArrayList!!.add(ParentModelClass("favorites", favoriteList!!))
        childModelClassArrayList!!.clear()
        childModelClassArrayList!!.add(ChildModelClass(R.drawable.coca3))
        childModelClassArrayList!!.add(ChildModelClass(R.drawable.coca3))
        childModelClassArrayList!!.add(ChildModelClass(R.drawable.coca3))
        childModelClassArrayList!!.add(ChildModelClass(R.drawable.coca3))
        parentModelClassArrayList!!.add(ParentModelClass("Recently", childModelClassArrayList!!))
        parentModelClassArrayList!!.add(ParentModelClass("Great", childModelClassArrayList!!))
        parentModelClassArrayList!!.add(ParentModelClass("Recently", childModelClassArrayList!!))
        parentModelClassArrayList!!.add(ParentModelClass("Great", childModelClassArrayList!!))
        parentAdapter = ParentAdapter(parentModelClassArrayList!!, this@MainActivity)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = parentAdapter
        parentAdapter!!.notifyDataSetChanged()
    }
}