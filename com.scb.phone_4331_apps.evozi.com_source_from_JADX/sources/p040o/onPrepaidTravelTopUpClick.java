package p040o;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.onPrepaidTravelTopUpClick */
public class onPrepaidTravelTopUpClick extends Format {
    private static final PrepaidInputActivity<onPrepaidTravelTopUpClick> IconCompatParcelizer = new PrepaidInputActivity<onPrepaidTravelTopUpClick>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Format IconCompatParcelizer(String str, TimeZone timeZone, Locale locale) {
            return new onPrepaidTravelTopUpClick(str, timeZone, locale);
        }
    };
    public final PrepaidCardAdapter$PrepaidHolder MediaBrowserCompat$ItemReceiver;
    public final onTransferOutClick read;

    public static onPrepaidTravelTopUpClick MediaBrowserCompat$ItemReceiver(String str) {
        return IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str, (Locale) null);
    }

    public static onPrepaidTravelTopUpClick read(String str, Locale locale) {
        return IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str, locale);
    }

    protected onPrepaidTravelTopUpClick(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, (byte) 0);
    }

    private onPrepaidTravelTopUpClick(String str, TimeZone timeZone, Locale locale, byte b) {
        this.read = new onTransferOutClick(str, timeZone, locale);
        this.MediaBrowserCompat$ItemReceiver = new PrepaidCardAdapter$PrepaidHolder(str, timeZone, locale, (Date) null);
    }

    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String str;
        String str2;
        onTransferOutClick ontransferoutclick = this.read;
        if (obj instanceof Date) {
            Calendar instance = Calendar.getInstance(ontransferoutclick.MediaBrowserCompat$CustomActionResultReceiver, ontransferoutclick.MediaBrowserCompat$ItemReceiver);
            instance.setTime((Date) obj);
            str = ((StringBuilder) ontransferoutclick.write(instance, new StringBuilder(ontransferoutclick.read))).toString();
        } else if (obj instanceof Calendar) {
            Calendar calendar = (Calendar) obj;
            StringBuilder sb = new StringBuilder(ontransferoutclick.read);
            if (!calendar.getTimeZone().equals(ontransferoutclick.MediaBrowserCompat$CustomActionResultReceiver)) {
                calendar = (Calendar) calendar.clone();
                calendar.setTimeZone(ontransferoutclick.MediaBrowserCompat$CustomActionResultReceiver);
            }
            str = ((StringBuilder) ontransferoutclick.write(calendar, sb)).toString();
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            Calendar instance2 = Calendar.getInstance(ontransferoutclick.MediaBrowserCompat$CustomActionResultReceiver, ontransferoutclick.MediaBrowserCompat$ItemReceiver);
            instance2.setTimeInMillis(longValue);
            str = ((StringBuilder) ontransferoutclick.write(instance2, new StringBuilder(ontransferoutclick.read))).toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown class: ");
            if (obj == null) {
                str2 = "<null>";
            } else {
                str2 = obj.getClass().getName();
            }
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        stringBuffer.append(str);
        return stringBuffer;
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.MediaBrowserCompat$ItemReceiver.read(str, parsePosition);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof onPrepaidTravelTopUpClick)) {
            return false;
        }
        return this.read.equals(((onPrepaidTravelTopUpClick) obj).read);
    }

    public int hashCode() {
        return this.read.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FastDateFormat[");
        sb.append(this.read.write);
        sb.append(",");
        sb.append(this.read.MediaBrowserCompat$ItemReceiver);
        sb.append(",");
        sb.append(this.read.MediaBrowserCompat$CustomActionResultReceiver.getID());
        sb.append("]");
        return sb.toString();
    }
}
