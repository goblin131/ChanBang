package com.chanbang.android.chanbang

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import kotlinx.android.synthetic.main.content_monthly.*

class MonthlyAcvitiy : CommonActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var content = findViewById<ConstraintLayout>(R.id.content_layout)
        var layout = layoutInflater.inflate(R.layout.content_monthly, null)
        content.removeAllViews()
        content.addView(layout)

        var korLocaleMonth : Array<String> = resources.getStringArray(R.array.monthly_kor_month)
        var korLocaleWeek : Array<String> = resources.getStringArray(R.array.monthly_kor_weekday)
        calendarView.setTitleMonths(korLocaleMonth)
        calendarView.setWeekDayLabels(korLocaleWeek)
    }
}
