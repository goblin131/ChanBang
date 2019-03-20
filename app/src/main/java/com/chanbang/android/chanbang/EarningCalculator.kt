package com.chanbang.android.chanbang

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class EarningCalculator : Fragment() {
    companion object {
        fun newInstance() : EarningCalculator {
            return EarningCalculator()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_earning_calculator, container, false)
    }
}