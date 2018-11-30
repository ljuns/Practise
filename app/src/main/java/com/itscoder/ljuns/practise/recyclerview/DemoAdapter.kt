package com.itscoder.ljuns.practise.recyclerview

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import com.itscoder.ljuns.practise.R
import kotlinx.android.synthetic.main.item_recycler_view.view.*

/**
 * @author ljuns
 * Created at 2018/11/25.
 */
class DemoAdapter : RecyclerView.Adapter<DemoAdapter.DemoHolder>() {

    private val mList = arrayListOf<String>("1")
    private var mItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        val holder = DemoHolder(view)

        holder.itemView.setOnClickListener {
            val pos = holder.layoutPosition + 1
            mList.add(pos.toString())
            notifyItemInserted(pos)

            this.mItemClickListener!!.onItemClick()
        }
        return holder
    }

    override fun onBindViewHolder(holder: DemoHolder, position: Int) {
        holder.itemView.text.text = "position = $position"
    }

    override fun getItemCount() = mList.size

    class DemoHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    interface OnItemClickListener {
        fun onItemClick()
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.mItemClickListener = listener
    }
}

