package com.example.swipeable_tabbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.swipeable_tabbar.databinding.ActivityMainBinding
import com.example.swipeable_tabbar.ui.main.PlaceholderFragment
import com.example.swipeable_tabbar.ui.main.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PlaceholderFragment(), "$25000 \n Tab1Tab1")
        adapter.addFragment(PlaceholderFragment(), "$55000 \n Tab2")
        adapter.addFragment(PlaceholderFragment(), "$65000 \n Tab3")
        adapter.addFragment(PlaceholderFragment(), "$25000 \n Tab4")
        adapter.addFragment(PlaceholderFragment(), "$55000 \n Tab5")
        adapter.addFragment(PlaceholderFragment(), "$65000 \n Tab6")
        viewBinding.viewPager.adapter = adapter
        viewBinding.tabs.setupWithViewPager(viewBinding.viewPager)
    }
}