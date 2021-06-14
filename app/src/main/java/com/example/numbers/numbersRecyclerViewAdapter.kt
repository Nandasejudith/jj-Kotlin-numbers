package com.example.numbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class numbersRecyclerViewAdapter(var numbersList: List<BigInteger>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item,parent,false)
    return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
    holder.tvNumbers.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
     return numbersList.size
    }
}
class NumbersViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}