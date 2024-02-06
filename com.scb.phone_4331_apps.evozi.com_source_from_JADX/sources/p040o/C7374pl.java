package p040o;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: o.pl */
public final /* synthetic */ class C7374pl implements InputFilter {
    public static final /* synthetic */ C7374pl MediaBrowserCompat$CustomActionResultReceiver = new C7374pl();

    private /* synthetic */ C7374pl() {
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return String.valueOf(charSequence).toLowerCase();
    }
}
