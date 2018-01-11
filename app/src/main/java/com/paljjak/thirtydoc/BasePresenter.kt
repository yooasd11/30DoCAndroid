package com.paljjak.thirtydoc

/**
 * Created by yooas on 2018-01-07.
 */
interface BasePresenter<T> {
    fun takeView(view: T)
    fun dropView()
}