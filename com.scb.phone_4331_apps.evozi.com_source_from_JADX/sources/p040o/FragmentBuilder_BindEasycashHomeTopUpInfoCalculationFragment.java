package p040o;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: o.FragmentBuilder_BindEasycashHomeTopUpInfoCalculationFragment */
public final class FragmentBuilder_BindEasycashHomeTopUpInfoCalculationFragment implements InputFilter {
    private final int read;

    public FragmentBuilder_BindEasycashHomeTopUpInfoCalculationFragment(boolean z) {
        this.read = z ? 15 : 13;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder(spanned);
        sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(([0-9]{1})([0-9\\,]{0,");
        sb2.append(this.read - 1);
        sb2.append("})?)?(\\.[0-9]{0,");
        sb2.append(4);
        sb2.append("})?");
        if (!obj.matches(sb2.toString())) {
            return charSequence.length() == 0 ? spanned.subSequence(i3, i4) : "";
        }
        return null;
    }
}
