package com.hirezy.ft_home.di

import com.hirezy.ft_home.ui.home.HomeListViewModel
import com.hirezy.ft_home.ui.main.MainViewModel
import com.hirezy.ft_home.ui.home.HomeRepository
import com.hirezy.ft_home.ui.home.HomeViewModel
import com.hirezy.ft_home.ui.mine.MineViewModel
import com.hirezy.ft_home.ui.navi.NavigationDataPageViewModel
import com.hirezy.ft_home.ui.navi.NavigationRepository
import com.hirezy.ft_home.ui.navi.NavigationViewModel
import com.hirezy.ft_home.ui.project.ProjectRepository
import com.hirezy.ft_home.ui.project.ProjectViewModel
import com.hirezy.ft_home.ui.project.TabItemViewModel
import com.hirezy.ft_home.ui.tree.TreeRepository
import com.hirezy.ft_home.ui.tree.TreeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Create by liwen on 2020/5/25
 */

val treeRepoModule = module {
    single { TreeRepository(get()) }
    single { HomeRepository(get()) }
    single { ProjectRepository(get()) }
    single { NavigationRepository(get()) }
}


val treeViewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { TreeViewModel(get()) }
    viewModel { HomeViewModel(get()) }
    viewModel { ProjectViewModel(get()) }
    viewModel { TabItemViewModel(get()) }
    viewModel { MineViewModel() }
    viewModel { NavigationViewModel(get()) }
    viewModel { NavigationDataPageViewModel() }
    viewModel { HomeListViewModel(get()) }
}

