package com.example.recycleviewsexemples

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val dataList: ArrayList<DataClass>) :
    RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    // Cria um viewHolder, onde estará o seu tipo e grupo, retornando uma viewHolderClass.
    // Cria o item que será visto, e o "infla"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false);
        return ViewHolderClass(itemView);
    }

    // Deixa visivel os itens da lista, referente a posição deles.
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position];
        holder.rvImage.setImageResource(currentItem.dataImage);
        holder.rvTitle.text = currentItem.dataTitle;
    }

    // Vai "DIZER", para a nossa recycleView, quantos items a mesma comportará
    override fun getItemCount(): Int {
        return dataList.size;
    }


    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.image);
        val rvTitle: TextView = itemView.findViewById(R.id.title);
    }

}