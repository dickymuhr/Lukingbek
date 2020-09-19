package com.dicci.hellooldme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMomentAdapter(private val listMoment: ArrayList<Moment>) : RecyclerView.Adapter<ListMomentAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Moment)
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvDate:TextView = itemView.findViewById(R.id.tv_item_date)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_moment, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMoment.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val moment = listMoment[position]
        Glide.with(holder.itemView.context)
            .load(moment.photo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgPhoto)
        holder.tvName.text = moment.name
        holder.tvDetail.text = moment.detail
        holder.tvDate.text=moment.date
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listMoment[holder.adapterPosition]) }
    }

}