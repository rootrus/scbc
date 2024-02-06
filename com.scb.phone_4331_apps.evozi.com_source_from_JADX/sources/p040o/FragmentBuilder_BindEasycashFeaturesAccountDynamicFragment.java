package p040o;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* renamed from: o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment */
public final class FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment implements InputFilter {
    private Pattern read;

    public FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(String str) {
        this(Pattern.compile(str));
    }

    private FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(Pattern pattern) {
        this.read = pattern;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder(spanned);
        sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("filter input: ");
        sb2.append(sb);
        onCheckBoxClick.read(sb2.toString(), new Object[0]);
        if (this.read.matcher(sb).matches()) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (this.read.matcher(String.valueOf(charSequence.charAt(i5))).matches()) {
                sb3.append(String.valueOf(charSequence.charAt(i5)));
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("filter output: ");
        sb4.append(sb3.toString());
        onCheckBoxClick.read(sb4.toString(), new Object[0]);
        return sb3;
    }
}
