package com.chanbang.android.chanbang

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

open class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_content,
            RentManagement.newInstance()
        ).commit()

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = resources.getString(R.string.main_title)

        val drawerToggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.drawer_open, R.string.drawer_close
        )

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        navigation_view.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.monthly_rent -> supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_content,
                    RentManagement.newInstance()
                ).commit()
                R.id.earning_calc -> supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_content,
                    EarningCalculator.newInstance()
                ).commit()
            }

            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }
}