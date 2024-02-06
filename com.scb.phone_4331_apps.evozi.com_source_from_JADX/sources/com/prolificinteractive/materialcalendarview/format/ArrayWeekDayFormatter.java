package com.prolificinteractive.materialcalendarview.format;

public class ArrayWeekDayFormatter implements WeekDayFormatter {
    private final CharSequence[] weekDayLabels;

    public ArrayWeekDayFormatter(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        } else if (charSequenceArr.length == 7) {
            this.weekDayLabels = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
    }

    public CharSequence format(int i) {
        return this.weekDayLabels[i - 1];
    }
}
