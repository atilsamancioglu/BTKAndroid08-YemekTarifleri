package com.atilsamancioglu.yemektariflerikitabi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.atilsamancioglu.yemektariflerikitabi.databinding.RecyclerRowBinding
import com.atilsamancioglu.yemektariflerikitabi.model.Tarif
import com.atilsamancioglu.yemektariflerikitabi.view.ListeFragmentDirections

class TarifAdapter(var tarifList: List<Tarif>) : RecyclerView.Adapter<TarifAdapter.TarifHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarifHolder {
        val recyclerRowBinding: RecyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TarifHolder(recyclerRowBinding)
    }

    override fun onBindViewHolder(holder: TarifHolder, position: Int) {
        holder.recyclerRowBinding.recyclerViewTextView.text = tarifList[position].isim
        holder.itemView.setOnClickListener {
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment(bilgi = "eski", id = tarifList[position].id)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return tarifList.size
    }

    class TarifHolder(val recyclerRowBinding: RecyclerRowBinding) : RecyclerView.ViewHolder(recyclerRowBinding.root) {

    }
}