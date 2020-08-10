package com.example.algorithmcheatsheet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.algorithms.view.*

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    //use a map later to fix this up baby
    private val titles = listOf("O(N)^2", "O(NlogN)")
    private val squaredTimes = listOf("MergeSort, HeapSort, CubeSort",
        "Quicksort, BubbleSort, InsertionSort, SelectionSort")
    private val imgs = listOf(R.drawable.nlogn, R.drawable.on2)

    //number of items within the list
    override fun getItemCount(): Int {
        return imgs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.algorithms, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            holder.v.textView.text = squaredTimes[position]
            holder.v.textView2.text =titles[position]
            holder.v.imageView2.setImageResource(imgs[position])
    }

}

class CustomViewHolder(val v: View) : RecyclerView.ViewHolder(v) {

}