package p040o;

import android.text.Spannable;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: o.setHoverListener */
public class setHoverListener implements Spannable {
    private static Executor MediaBrowserCompat$CustomActionResultReceiver = null;
    private static final Object write = new Object();
    private final Spannable IconCompatParcelizer;
    private final setHoverListener$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public setHoverListener$MediaBrowserCompat$ItemReceiver write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.IconCompatParcelizer.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.IconCompatParcelizer.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.IconCompatParcelizer.getSpans(i, i2, cls);
    }

    public int getSpanStart(Object obj) {
        return this.IconCompatParcelizer.getSpanStart(obj);
    }

    public int getSpanEnd(Object obj) {
        return this.IconCompatParcelizer.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.IconCompatParcelizer.getSpanFlags(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.IconCompatParcelizer.nextSpanTransition(i, i2, cls);
    }

    public int length() {
        return this.IconCompatParcelizer.length();
    }

    public char charAt(int i) {
        return this.IconCompatParcelizer.charAt(i);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.IconCompatParcelizer.subSequence(i, i2);
    }

    public String toString() {
        return this.IconCompatParcelizer.toString();
    }
}
