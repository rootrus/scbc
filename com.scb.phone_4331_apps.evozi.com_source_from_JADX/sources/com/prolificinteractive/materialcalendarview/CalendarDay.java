package com.prolificinteractive.materialcalendarview;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;

public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new Parcelable.Creator<CalendarDay>() {
        public final CalendarDay createFromParcel(Parcel parcel) {
            return new CalendarDay(parcel);
        }

        public final CalendarDay[] newArray(int i) {
            return new CalendarDay[i];
        }
    };
    private transient Calendar _calendar;
    private transient Date _date;
    private final int day;
    private final int month;
    private final int year;

    private static int hashCode(int i, int i2, int i3) {
        return (i * 10000) + (i2 * 100) + i3;
    }

    public final int describeContents() {
        return 0;
    }

    public static CalendarDay today() {
        return from(CalendarUtils.getInstance());
    }

    public static CalendarDay from(int i, int i2, int i3) {
        return new CalendarDay(i, i2, i3);
    }

    public static CalendarDay from(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return from(CalendarUtils.getYear(calendar), CalendarUtils.getMonth(calendar), CalendarUtils.getDay(calendar));
    }

    public static CalendarDay from(Date date) {
        if (date == null) {
            return null;
        }
        return from(CalendarUtils.getInstance(date));
    }

    @Deprecated
    public CalendarDay() {
        this(CalendarUtils.getInstance());
    }

    @Deprecated
    public CalendarDay(Calendar calendar) {
        this(CalendarUtils.getYear(calendar), CalendarUtils.getMonth(calendar), CalendarUtils.getDay(calendar));
    }

    @Deprecated
    public CalendarDay(int i, int i2, int i3) {
        this.year = i;
        this.month = i2;
        this.day = i3;
    }

    @Deprecated
    public CalendarDay(Date date) {
        this(CalendarUtils.getInstance(date));
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDay() {
        return this.day;
    }

    public final Date getDate() {
        if (this._date == null) {
            this._date = getCalendar().getTime();
        }
        return this._date;
    }

    public final Calendar getCalendar() {
        if (this._calendar == null) {
            Calendar instance = CalendarUtils.getInstance();
            this._calendar = instance;
            copyTo(instance);
        }
        return this._calendar;
    }

    /* access modifiers changed from: package-private */
    public final void copyToMonthOnly(Calendar calendar) {
        calendar.clear();
        calendar.set(this.year, this.month, 1);
    }

    public final void copyTo(Calendar calendar) {
        calendar.clear();
        calendar.set(this.year, this.month, this.day);
    }

    public final boolean isInRange(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return (calendarDay == null || !calendarDay.isAfter(this)) && (calendarDay2 == null || !calendarDay2.isBefore(this));
    }

    public final boolean isBefore(CalendarDay calendarDay) {
        if (calendarDay != null) {
            int i = this.year;
            int i2 = calendarDay.year;
            if (i == i2) {
                int i3 = this.month;
                int i4 = calendarDay.month;
                if (i3 == i4) {
                    if (this.day >= calendarDay.day) {
                        return false;
                    }
                } else if (i3 >= i4) {
                    return false;
                }
                return true;
            } else if (i < i2) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IllegalArgumentException("other cannot be null");
        }
    }

    public final boolean isAfter(CalendarDay calendarDay) {
        if (calendarDay != null) {
            int i = this.year;
            int i2 = calendarDay.year;
            if (i == i2) {
                int i3 = this.month;
                int i4 = calendarDay.month;
                if (i3 == i4) {
                    if (this.day <= calendarDay.day) {
                        return false;
                    }
                } else if (i3 <= i4) {
                    return false;
                }
                return true;
            } else if (i > i2) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IllegalArgumentException("other cannot be null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CalendarDay calendarDay = (CalendarDay) obj;
        if (this.day == calendarDay.day && this.month == calendarDay.month && this.year == calendarDay.year) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode(this.year, this.month, this.day);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CalendarDay{");
        sb.append(this.year);
        sb.append("-");
        sb.append(this.month);
        sb.append("-");
        sb.append(this.day);
        sb.append("}");
        return sb.toString();
    }

    public CalendarDay(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
        parcel.writeInt(this.day);
    }
}
