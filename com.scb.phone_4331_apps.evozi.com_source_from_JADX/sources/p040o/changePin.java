package p040o;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: o.changePin */
public final /* synthetic */ class changePin implements InputFilter {
    public static final /* synthetic */ changePin MediaBrowserCompat$ItemReceiver = new changePin();

    private /* synthetic */ changePin() {
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return String.valueOf(charSequence).toLowerCase();
    }
}
