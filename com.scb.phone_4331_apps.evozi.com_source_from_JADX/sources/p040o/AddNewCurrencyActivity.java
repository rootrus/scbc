package p040o;

/* renamed from: o.AddNewCurrencyActivity */
public final class AddNewCurrencyActivity {
    public Long write;

    public AddNewCurrencyActivity() {
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2) {
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (i < 0 || i2 < 0 || length - i < i2 || length2 < i2) {
                return false;
            }
            int i3 = 0;
            while (i2 > 0) {
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence2.charAt(i3);
                if (charAt != charAt2) {
                    if (!z) {
                        return false;
                    }
                    if (!(Character.toUpperCase(charAt) == Character.toUpperCase(charAt2) || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2))) {
                        return false;
                    }
                }
                i++;
                i2--;
                i3++;
            }
            return true;
        }
        return ((String) charSequence).regionMatches(z, i, (String) charSequence2, 0, i2);
    }

    public AddNewCurrencyActivity(Long l) {
        this.write = l;
    }
}
