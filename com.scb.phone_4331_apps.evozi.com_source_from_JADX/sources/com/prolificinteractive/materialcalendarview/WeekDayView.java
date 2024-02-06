package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;
import java.util.Calendar;

class WeekDayView extends TextView {
    private int dayOfWeek;
    private WeekDayFormatter formatter = WeekDayFormatter.DEFAULT;

    public WeekDayView(Context context, int i) {
        super(context);
        setGravity(17);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextAlignment(4);
        }
        setDayOfWeek(i);
    }

    public void setWeekDayFormatter(WeekDayFormatter weekDayFormatter) {
        if (weekDayFormatter == null) {
            weekDayFormatter = WeekDayFormatter.DEFAULT;
        }
        this.formatter = weekDayFormatter;
        setDayOfWeek(this.dayOfWeek);
    }

    public void setDayOfWeek(int i) {
        this.dayOfWeek = i;
        setText(this.formatter.format(i));
    }

    public void setDayOfWeek(Calendar calendar) {
        setDayOfWeek(CalendarUtils.getDayOfWeek(calendar));
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        applyCustomTypeface(i);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        applyCustomTypeface(i);
    }

    private void applyCustomTypeface(int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C1043R.styleable.MaterialCalendarView);
        if (obtainStyledAttributes != null) {
            String string = obtainStyledAttributes.getString(C1043R.styleable.MaterialCalendarView_mcv_textAppearanceFontPath);
            if (!TextUtils.isEmpty(string)) {
                try {
                    setTypeface(Typeface.createFromAsset(getResources().getAssets(), string));
                } catch (Exception e) {
                    Log.e("WeekDayView", "cannot apply custom font path", e);
                }
            }
        }
    }
}
