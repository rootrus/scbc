package p040o;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: o.FragmentBuilder_BindEasycashCreditPowerSummaryFragment */
public final class FragmentBuilder_BindEasycashCreditPowerSummaryFragment implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        onGetStartedClick.write((Object) charSequence, "source");
        onGetStartedClick.write((Object) spanned, "dest");
        while (i < i2) {
            int type = Character.getType(charSequence.charAt(i));
            if (type == 19 || type == 28) {
                return "";
            }
            i++;
        }
        return null;
    }
}
