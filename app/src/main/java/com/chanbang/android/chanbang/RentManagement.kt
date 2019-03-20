package com.chanbang.android.chanbang

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_rent_management.*

class RentManagement : Fragment() {
    companion object {
        fun newInstance() : RentManagement{
            return RentManagement()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_rent_management, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        calendarView.setTitleMonths(resources.getStringArray(R.array.monthly_kor_month))
        calendarView.setWeekDayLabels(resources.getStringArray(R.array.monthly_kor_weekday))
    }
}
