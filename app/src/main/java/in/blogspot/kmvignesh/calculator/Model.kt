package com.cretlabs.viewpager

import `in`.blogspot.kmvignesh.calculator.R

/**
 * Created by Gokul on 2/11/2018.
 */
enum class Model private constructor(val layoutResId: Int) {
    RED(R.layout.layout_cow_1),
    BLUE(R.layout.layout_cow_2),
    GREEN(R.layout.layout_cow_3)
}