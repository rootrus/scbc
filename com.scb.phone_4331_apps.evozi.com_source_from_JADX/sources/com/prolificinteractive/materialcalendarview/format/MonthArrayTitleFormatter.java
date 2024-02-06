package com.prolificinteractive.materialcalendarview.format;

import android.text.SpannableStringBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;

public class MonthArrayTitleFormatter implements TitleFormatter {
    private final CharSequence[] monthLabels;

    public MonthArrayTitleFormatter(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        } else if (charSequenceArr.length >= 12) {
            this.monthLabels = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Label array is too short");
        }
    }

    public CharSequence format(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.monthLabels[calendarDay.getMonth()]).append(" ").append(String.valueOf(calendarDay.getYear()));
    }
}
