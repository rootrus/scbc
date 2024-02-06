package p040o;

import java.util.Iterator;

/* renamed from: o.LoanDetailActivity */
public class LoanDetailActivity extends LoanInputActivity_ViewBinding {
    public static final boolean MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, boolean z) {
        onGetStartedClick.write((Object) str, "$this$replace");
        onGetStartedClick.write((Object) str2, "oldValue");
        onGetStartedClick.write((Object) str3, "newValue");
        return JuristicRequestFormActivity.read((BaseJuristicPinActivity_ViewBinding) GoodToKnowActivity.write(str, new String[]{str2}, false, 0), (CharSequence) str3);
    }

    public static final boolean read(String str, String str2, boolean z) {
        onGetStartedClick.write((Object) str, "$this$startsWith");
        onGetStartedClick.write((Object) str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return GoodToKnowActivity.read(str, 0, str2, 0, str2.length(), z);
    }

    public static final boolean write(String str, String str2, int i, boolean z) {
        onGetStartedClick.write((Object) str, "$this$startsWith");
        onGetStartedClick.write((Object) str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return GoodToKnowActivity.read(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean read(CharSequence charSequence) {
        boolean z;
        boolean z2;
        onGetStartedClick.write((Object) charSequence, "$this$isBlank");
        if (charSequence.length() == 0) {
            return true;
        }
        onGetStartedClick.write((Object) charSequence, "$this$indices");
        Iterator it = new AddAccountConsentActivity(0, charSequence.length() - 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            char charAt = charSequence.charAt(((HmlNationalIdHelpActivity) it).write());
            if (Character.isWhitespace(charAt) || Character.isSpaceChar(charAt)) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (!z2) {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static final boolean read(String str, int i, String str2, int i2, int i3, boolean z) {
        onGetStartedClick.write((Object) str, "$this$regionMatches");
        onGetStartedClick.write((Object) str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String read(CharSequence charSequence, int i) {
        onGetStartedClick.write((Object) charSequence, "$this$repeat");
        int i2 = 1;
        if (i >= 0) {
            if (i != 0) {
                if (i == 1) {
                    return charSequence.toString();
                }
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        if (i > 0) {
                            while (true) {
                                sb.append(charSequence);
                                if (i2 == i) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        String obj = sb.toString();
                        onGetStartedClick.IconCompatParcelizer((Object) obj, "sb.toString()");
                        return obj;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i3 = 0; i3 < i; i3++) {
                        cArr[i3] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Count 'n' must be non-negative, but was ");
        sb2.append(i);
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString().toString());
    }
}
