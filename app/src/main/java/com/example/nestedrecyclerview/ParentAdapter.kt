package com.example.nestedrecyclerview

import android.content.Context
import com.example.nestedrecyclerview.ParentModelClass
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.ChildAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.TextView

class ParentAdapter(var parentModelClassList: List<ParentModelClass>, var context: Context) :
    RecyclerView.Adapter<ParentAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.parent_rv_layout, null, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_parent_title.text = parentModelClassList[position].title
        val childAdapter: ChildAdapter =
            ChildAdapter(parentModelClassList[position].childModelClassList, context)
        holder.rv_child.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.rv_child.adapter = childAdapter
        childAdapter.notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return parentModelClassList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rv_child: RecyclerView
        var tv_parent_title: TextView

        init {
            rv_child = itemView.findViewById(R.id.rv_child)
            tv_parent_title = itemView.findViewById(R.id.tv_parent_title)
        }
    }
}