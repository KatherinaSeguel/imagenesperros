package com.example.imagenesperros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imagenesperros.model.DataPerros
import kotlinx.android.synthetic.main.item_list_view.view.*

class DogAdapter (var mPasstheData:PasstheData) : RecyclerView.Adapter<DogAdapter.DogViewHolder>(){  //paso 4 ,Implementar Recycler View

   private var mData = emptyList<DataPerros>()  //paso 1

    fun updateDog(mStringList: List<DataPerros>) {

        mData = mStringList        //paso 2
        notifyDataSetChanged()
    }

    inner class DogViewHolder(itemView:View): RecyclerView.ViewHolder(itemView),View.OnClickListener{  //paso 3


       // val itemView = itemView.setOnClickListener(this) cuando es imagen

        val mitemView = itemView.idtextView

        override fun onClick(p0: View?) {  //Paso 5
           mPasstheData.passTheData(mData[adapterPosition])
        }

    }
//esto se genera después del paso 4, son los métodos que se generan

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {  //paso 4.1
        //creas el viewholder, trabaja en el xml,se crea el XML
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.item_list_view,parent,false)

        return DogViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: DogViewHolder, position: Int) { //paso 4.2
        //llena el xml con los objetos del listado, une los datos con los elementos

        val mDog= mData[position]
        holder.mitemView.text=mDog.message.toString()

    }

    override fun getItemCount(): Int {  // paso 4.3
        //este tienen el total de elementos
        return mData.size
    }
    //esta interface está pasando el dato al primer fragmento
    interface PasstheData{

        fun passTheData(mDog:DataPerros)
    }

}