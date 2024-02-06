package p040o;

import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$ItemReceiver */
class PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$ItemReceiver extends C6999xbc17dbd4 {
    private Locale IconCompatParcelizer;
    private final Map<String, Integer> MediaBrowserCompat$ItemReceiver;
    private final int write;

    PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$ItemReceiver(int i, Calendar calendar, Locale locale) {
        super((byte) 0);
        this.write = i;
        this.IconCompatParcelizer = locale;
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)");
        this.MediaBrowserCompat$ItemReceiver = PrepaidCardAdapter$PrepaidHolder.MediaBrowserCompat$ItemReceiver(calendar, locale, i, sb);
        sb.setLength(sb.length() - 1);
        sb.append(")");
        MediaBrowserCompat$ItemReceiver(sb);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.IconCompatParcelizer);
        Integer num = this.MediaBrowserCompat$ItemReceiver.get(lowerCase);
        if (num == null) {
            Map<String, Integer> map = this.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(lowerCase);
            sb.append('.');
            num = map.get(sb.toString());
        }
        calendar.set(this.write, num.intValue());
    }
}
