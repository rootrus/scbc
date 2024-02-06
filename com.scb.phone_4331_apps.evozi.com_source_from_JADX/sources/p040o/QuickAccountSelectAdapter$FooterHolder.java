package p040o;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/* renamed from: o.QuickAccountSelectAdapter$FooterHolder */
public final class QuickAccountSelectAdapter$FooterHolder {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String read;
    public final List<String> write;

    private QuickAccountSelectAdapter$FooterHolder() {
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding toInstant(Date date) {
        return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochMilli(date.getTime());
    }

    public static Date toDate(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        try {
            return new Date(quickAccountSelectAdapter$HeaderHolder_ViewBinding.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding toInstant(Calendar calendar) {
        return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochMilli(calendar.getTimeInMillis());
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding toZonedDateTime(Calendar calendar) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.ofInstant(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochMilli(calendar.getTimeInMillis()), toZoneId(calendar.getTimeZone()));
    }

    public static GregorianCalendar toGregorianCalendar(ProfileManagementAdapter$ProfileManagementHolder_ViewBinding profileManagementAdapter$ProfileManagementHolder_ViewBinding) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(toTimeZone(profileManagementAdapter$ProfileManagementHolder_ViewBinding.getZone()));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setFirstDayOfWeek(2);
        gregorianCalendar.setMinimalDaysInFirstWeek(4);
        try {
            gregorianCalendar.setTimeInMillis(profileManagementAdapter$ProfileManagementHolder_ViewBinding.toInstant().toEpochMilli());
            return gregorianCalendar;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding toZoneId(TimeZone timeZone) {
        return LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3071of(timeZone.getID(), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.SHORT_IDS);
    }

    public static TimeZone toTimeZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        String id = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getId();
        if (id.startsWith("+") || id.startsWith("-")) {
            StringBuilder sb = new StringBuilder();
            sb.append("GMT");
            sb.append(id);
            id = sb.toString();
        } else if (id.equals("Z")) {
            id = "UTC";
        }
        return TimeZone.getTimeZone(id);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder toLocalDate(java.sql.Date date) {
        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    public static java.sql.Date toSqlDate(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return new java.sql.Date(quickAccountSelectAdapter$UnselectedHolder.getYear() - 1900, quickAccountSelectAdapter$UnselectedHolder.getMonthValue() - 1, quickAccountSelectAdapter$UnselectedHolder.getDayOfMonth());
    }

    public static QuickAccountSelectAdapter$SelectedHolder toLocalTime(Time time) {
        return QuickAccountSelectAdapter$SelectedHolder.m3544of(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public static Time toSqlTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return new Time(quickAccountSelectAdapter$SelectedHolder.getHour(), quickAccountSelectAdapter$SelectedHolder.getMinute(), quickAccountSelectAdapter$SelectedHolder.getSecond());
    }

    public static Timestamp toSqlTimestamp(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        int year = quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getYear();
        return new Timestamp(year - 1900, quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getMonthValue() - 1, quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getDayOfMonth(), quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getHour(), quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getMinute(), quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getSecond(), quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getNano());
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding toLocalDateTime(Timestamp timestamp) {
        int year = timestamp.getYear();
        return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3551of(year + 1900, timestamp.getMonth() + 1, timestamp.getDate(), timestamp.getHours(), timestamp.getMinutes(), timestamp.getSeconds(), timestamp.getNanos());
    }

    public static Timestamp toSqlTimestamp(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        try {
            Timestamp timestamp = new Timestamp(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond() * 1000);
            timestamp.setNanos(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano());
            return timestamp;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding toInstant(Timestamp timestamp) {
        return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(timestamp.getTime() / 1000, (long) timestamp.getNanos());
    }

    public QuickAccountSelectAdapter$FooterHolder(String str, String str2, String str3, String str4, String str5, List<String> list) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "accountType");
        onGetStartedClick.write((Object) str3, "accountTypeDesc");
        onGetStartedClick.write((Object) str5, "accountName");
        onGetStartedClick.write((Object) list, "allowTag");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.read = str5;
        this.write = list;
    }
}
