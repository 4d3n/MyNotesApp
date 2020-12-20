package com.example.consumerapp

import android.view.View

class CustomOnItemClickListener(private val position: Int, private val onItemClickCallBack: OnItemClickCallBack): View.OnClickListener {
    interface OnItemClickCallBack {
        fun onItemClcked(view: View, position: Int)
    }

    override fun onClick(v: View) {
        onItemClickCallBack.onItemClcked(v, position)
    }
}