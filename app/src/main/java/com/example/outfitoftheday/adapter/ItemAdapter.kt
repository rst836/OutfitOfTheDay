package com.example.outfitoftheday.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.outfitoftheday.CustomClothes
import com.example.outfitoftheday.R
import com.example.outfitoftheday.outfit.Outfit

class ItemAdapter (private val context: Context,
    private val dataset: List<Outfit>,
    var isBlue: Array<Boolean>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageButton: ImageButton = view.findViewById(R.id.item_image)
        val color = "red"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceID)
        holder.imageButton.setImageResource(item.imageResourceID)
        holder.imageButton.setOnClickListener {
            if (!isBlue[position]) {
                item.imageResourceID = R.drawable.blue
                isBlue[position] = true
            }
            else{
                item.imageResourceID = R.drawable.red
                isBlue[position] = false
            }
            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = dataset.size

}