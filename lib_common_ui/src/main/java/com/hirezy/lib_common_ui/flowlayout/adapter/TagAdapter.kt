package com.hirezy.lib_common_ui.flowlayout.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hirezy.lib_common_ui.flowlayout.`interface`.NotifyDataSetChangedListener


abstract class TagAdapter {

    abstract fun getItemCount(): Int

    abstract fun createView(inflater: LayoutInflater, parent: ViewGroup, position: Int): View

    abstract fun bindView(view: View, position: Int)


    open fun onItemViewClick(view: View, position: Int) {

    }

    open fun toastForMultiple(context: Context) {
//        Toast.makeText(context, "已选择最大数量了", Toast.LENGTH_SHORT).show()
    }

    private lateinit var mListener: NotifyDataSetChangedListener

    fun setNotifyDataSetChangedListener(listener: NotifyDataSetChangedListener) {
        mListener = listener
    }

    fun notifyDataSetChanged() {
        mListener.onDataChanged()
    }

}