package com.chanbang.android.chanbang

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MonthlyAcvitiy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.monthly_rent -> goMonthlyActivity()
            R.id.earning_calc -> goEarningCalculatorActivity()
            R.id.market_price -> goMarketPriceActivity()
            R.id.setting -> goSettingActivity()
            else -> super.onOptionsItemSelected(item)
        }
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
