package com.bekhruz.sportcars.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bekhruz.sportcars.R
import com.bekhruz.sportcars.model.Car

class ItemAdapter(
    private val context: Context,
    private val layoutType: Int,
    private val dataSet: List<Car>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private fun chooseAdapterLayout() = when (layoutType) {
        1 -> R.layout.grid_list_item
        else -> R.layout.linear_list_item
    }


    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val carImage: ImageView = view.findViewById(R.id.item_image)
        val carName: TextView = view.findViewById(R.id.item_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(chooseAdapterLayout(), parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.view.animation = AnimationUtils.loadAnimation(
            holder.view.context,
            R.anim.recyclerview_anim)
        val resources = context.resources
        val item = dataSet[position]
        holder.carImage.setImageResource(item.imageResourceId)
        holder.carName.text = resources.getString(item.stringResourceId)
    }
    override fun getItemCount(): Int = dataSet.size
}
