package com.example.nestedrecyclerview

import android.content.Context
import com.example.nestedrecyclerview.ChildModelClass
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.nestedrecyclerview.R

class ChildAdapter(private var childModelClassList: List<ChildModelClass>, var context: Context) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.child_rv_layout, null, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivchildimage.setImageResource(childModelClassList[position].image)
    }

    override fun getItemCount(): Int {
        return childModelClassList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivchildimage: ImageView

        init {
            ivchildimage = itemView.findViewById(R.id.iv_child_item)
        }
    }
}