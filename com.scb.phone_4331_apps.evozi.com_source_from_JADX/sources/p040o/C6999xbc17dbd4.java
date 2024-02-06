package p040o;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$CustomActionResultReceiver */
abstract class C6999xbc17dbd4 extends PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem {
    private Pattern IconCompatParcelizer;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(Calendar calendar, String str);

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return false;
    }

    private C6999xbc17dbd4() {
        super((byte) 0);
    }

    /* synthetic */ C6999xbc17dbd4(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(StringBuilder sb) {
        this.IconCompatParcelizer = Pattern.compile(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer = Pattern.compile(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.IconCompatParcelizer.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
        IconCompatParcelizer(calendar, matcher.group(1));
        return true;
    }
}
