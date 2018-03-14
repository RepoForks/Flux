package com.vicky7230.flux.ui.home

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.vicky7230.flux.ui.home.discover.DiscoverFragment
import com.vicky7230.flux.ui.home.playlist.PlaylistFragment
import com.vicky7230.flux.ui.home.profile.ProfileFragment
import com.vicky7230.flux.ui.home.tv.TvFragment

/**
 * Created by vicky on 11/2/18.
 */
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> TvFragment.newInstance()
            1 -> DiscoverFragment.newInstance()
            2 -> PlaylistFragment.newInstance()
            3 -> ProfileFragment.newInstance()
            else -> null
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "TV"
            1 -> "DISCOVER"
            2 -> "PLAYLIST"
            3 -> "PROFILE"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 4
    }
}