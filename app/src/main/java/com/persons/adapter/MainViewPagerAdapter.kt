package com.persons.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.View

/**
 * Created by lmy on 2017/10/9.
 */
class MainViewPagerAdapter(fm: FragmentManager?,fragments: List<Fragment>) : FragmentPagerAdapter(fm) {

    private var fragemets = fragments

    override fun getItem(position: Int): Fragment {
        return fragemets[position]
    }

    override fun getCount(): Int {
        if (fragemets == null) {
            return 0
        }
        return fragemets.size
    }
}