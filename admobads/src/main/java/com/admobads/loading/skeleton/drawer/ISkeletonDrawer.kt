package com.admobads.loading.skeleton.drawer

interface ISkeletonDrawer {

    fun isLoading(): Boolean
    fun startLoading()
    fun stopLoading()
    fun getSkeletonDrawer(): SkeletonDrawer

}
