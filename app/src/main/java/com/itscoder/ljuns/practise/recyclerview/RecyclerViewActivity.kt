package com.itscoder.ljuns.practise.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import com.itscoder.ljuns.practise.R
import com.itscoder.ljuns.practise.recyclerview.DemoAdapter.OnItemClickListener
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity(), OnItemClickListener {
    var mLayoutManager: LinearLayoutManager? = null
    override fun onItemClick() {
        Log.d("ljuns", "layoutParams.height = " + recyclerView.height)
        Log.d("ljuns", "layoutManager.height = " + mLayoutManager!!.height)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        mLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = mLayoutManager
        val adapter = DemoAdapter()
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerView.setHasFixedSize(true)

        adapter!!.setOnItemClickListener(this)
    }
}
