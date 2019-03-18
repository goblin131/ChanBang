package com.chanbang.android.chanbang

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_common.*

open class CommonActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = resources.getString(R.string.main_title)

        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.drawer_open,R.string.drawer_close
        ){
            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
            }

            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
            }
        }

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        navigation_view.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.monthly_rent -> goMonthlyActivity()
                R.id.earning_calc -> goEarningCalculatorActivity()
                R.id.market_price -> goMarketPriceActivity()
                R.id.setting -> goSettingActivity()
            }

            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }

    fun changeContent() : Boolean {

        return true
    }

    fun goMonthlyActivity() :Boolean {
        Log.d("MainActivity","Start Monthly Activity")
        return true
    }

    fun goEarningCalculatorActivity() :Boolean {
        Log.d("MainActivity","Start EarningCalculator Activity")
        return true
    }

    fun goMarketPriceActivity() :Boolean {
        Log.d("MainActivity","Start MarketPrice Activity")
        return true
    }

    fun goSettingActivity() : Boolean{
        Log.d("MainActivity","Start Setting Activity")
        return true
    }
}