package com.hirezy.ft_home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hirezy.ft_home.R
import com.hirezy.ft_home.databinding.NavigationTabPageAdapterBinding
import com.hirezy.ft_home.model.navigation.NavigationItemDetail
import com.hirezy.lib_base.adapter.BaseRecyclerViewAdapter

class NavigationTabPageAdapter(context: Context) :
    BaseRecyclerViewAdapter<NavigationItemDetail, NavigationTabPageAdapter.ViewHolder>(
        context
    ) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = DataBindingUtil.inflate<NavigationTabPageAdapterBinding>(
            LayoutInflater.from(mContext), R.layout
                .navigation_tab_page_adapter, parent, false
        )

        return ViewHolder(binding.root, binding)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        holder.setItemData(dataList[position])

    }

    class ViewHolder(
        itemView: View,
        binding: NavigationTabPageAdapterBinding
    ) : RecyclerView.ViewHolder(itemView) {

        private val mBinding = binding

        fun setItemData(data: NavigationItemDetail) {
            mBinding.tvName.text = data.title
        }

    }
}