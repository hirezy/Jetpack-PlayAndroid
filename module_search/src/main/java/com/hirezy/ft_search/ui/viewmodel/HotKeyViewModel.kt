package com.hirezy.ft_search.ui.viewmodel

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hirezy.ft_search.model.HotKeyModel
import com.hirezy.ft_search.ui.repository.SearchRepository
import com.hirezy.lib_base.utils.BaseContext
import com.hirezy.lib_net.model.NetResult
import kotlinx.coroutines.launch

/**
 * Create by liwen on 2020/6/1
 */
class HotKeyViewModel(private val repo: SearchRepository) : ViewModel() {

    private val hotKeyLiveData = MutableLiveData<MutableList<HotKeyModel>>()

    fun getHotKey(): MutableLiveData<MutableList<HotKeyModel>> {
        viewModelScope.launch {
            val hotKey = repo.getHotKey()
            if (hotKey is NetResult.Success) {
                hotKeyLiveData.postValue(hotKey.data)
            } else if (hotKey is NetResult.Error) {
                Toast.makeText(
                    BaseContext.instance.getContext(),
                    hotKey.exception.msg,
                    Toast.LENGTH_LONG
                ).show()            }
        }
        return hotKeyLiveData
    }
}