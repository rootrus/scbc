package p040o;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: o.FragmentBuilder_BindETBProductTermConditionFragment */
public final class FragmentBuilder_BindETBProductTermConditionFragment implements InputFilter {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final int read;

    public FragmentBuilder_BindETBProductTermConditionFragment(int i) {
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = 2;
    }

    public FragmentBuilder_BindETBProductTermConditionFragment(int i, int i2) {
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder(spanned);
        sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(([\\,0-9]{1})([0-9\\,]{0,");
        sb2.append(this.read - 1);
        sb2.append("})?)?");
        String obj2 = sb2.toString();
        if (this.MediaBrowserCompat$CustomActionResultReceiver > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append("(\\.[0-9]{0,");
            sb3.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb3.append("})?");
            obj2 = sb3.toString();
        }
        if (!obj.matches(obj2)) {
            return charSequence.length() == 0 ? spanned.subSequence(i3, i4) : "";
        }
        return null;
    }
}
