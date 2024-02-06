package p040o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: o.ModifyQuickTopUpReviewActivity */
public final class ModifyQuickTopUpReviewActivity {
    public int MediaBrowserCompat$ItemReceiver;
    public boolean write;

    public ModifyQuickTopUpReviewActivity() {
    }

    public static boolean write(CharSequence charSequence) {
        int length;
        if (charSequence == null || (length = charSequence.length()) == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String IconCompatParcelizer(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i = 0;
        if (str2.isEmpty()) {
            return str;
        }
        while (i != length && str2.indexOf(str.charAt(i)) != -1) {
            i++;
        }
        return str.substring(i);
    }

    public static String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else if (str2.isEmpty()) {
            return str;
        } else {
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return AddNewCurrencyActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, true, 0, charSequence2, charSequence.length());
    }

    public static boolean write(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence == null || charSequence2 == null)) {
            int length = charSequence2.length();
            int length2 = charSequence.length();
            for (int i = 0; i <= length2 - length; i++) {
                if (AddNewCurrencyActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, true, i, charSequence2, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || str2 == null || str3 == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(indexOf + str2.length(), indexOf2);
    }

    public static String[] MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        int i;
        boolean z;
        int i2;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return SetupQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver;
        }
        ArrayList arrayList = new ArrayList();
        if (str2.length() == 1) {
            char charAt = str2.charAt(0);
            i2 = 0;
            z = false;
            i = 0;
            int i3 = 1;
            while (i2 < length) {
                if (str.charAt(i2) == charAt) {
                    if (z) {
                        if (i3 == -1) {
                            i2 = length;
                        }
                        arrayList.add(str.substring(i, i2));
                        i3++;
                        z = false;
                    }
                    i = i2 + 1;
                    i2 = i;
                } else {
                    i2++;
                    z = true;
                }
            }
        } else {
            int i4 = 0;
            z = false;
            i = 0;
            int i5 = 1;
            while (i2 < length) {
                if (str2.indexOf(str.charAt(i2)) >= 0) {
                    if (z) {
                        if (i5 == -1) {
                            i2 = length;
                        }
                        arrayList.add(str.substring(i, i2));
                        i5++;
                        z = false;
                    }
                    i = i2 + 1;
                    i4 = i;
                } else {
                    i4 = i2 + 1;
                    z = true;
                }
            }
        }
        if (z) {
            arrayList.add(str.substring(i, i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String read(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(str);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        while (true) {
            i--;
            if (i < 0) {
                return new String(cArr);
            }
            cArr[i] = c;
        }
    }

    public static String read(String str, int i, char c) {
        while (str != null) {
            int length = i - str.length();
            if (length <= 0) {
                return str;
            }
            if (length <= 8192) {
                return MediaBrowserCompat$CustomActionResultReceiver(c, length).concat(str);
            }
            String valueOf = String.valueOf(c);
            if (str == null) {
                return null;
            }
            if (valueOf == null || valueOf.length() == 0) {
                valueOf = " ";
            }
            int length2 = valueOf.length();
            int length3 = i - str.length();
            if (length3 <= 0) {
                return str;
            }
            if (length2 == 1 && length3 <= 8192) {
                c = valueOf.charAt(0);
            } else if (length3 == length2) {
                return valueOf.concat(str);
            } else {
                if (length3 < length2) {
                    return valueOf.substring(0, length3).concat(str);
                }
                char[] cArr = new char[length3];
                char[] charArray = valueOf.toCharArray();
                for (int i2 = 0; i2 < length3; i2++) {
                    cArr[i2] = charArray[i2 % length2];
                }
                return new String(cArr).concat(str);
            }
        }
        return null;
    }

    public static boolean IconCompatParcelizer(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            if (charSequence2.length() > charSequence.length()) {
                return false;
            }
            return AddNewCurrencyActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, false, 0, charSequence2, charSequence2.length());
        } else if (charSequence == charSequence2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean read(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return AddNewCurrencyActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, true, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
        }
    }

    public static String write(String str, String str2) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str2.length() != 0) {
            z = false;
        }
        return (!z && str.endsWith(str2)) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String read(String str, String str2) {
        int lastIndexOf;
        boolean z = false;
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str2.length() == 0) {
            z = true;
        }
        if (z || (lastIndexOf = str.lastIndexOf(str2)) == -1 || lastIndexOf == str.length() - str2.length()) {
            return "";
        }
        return str.substring(lastIndexOf + str2.length());
    }

    public static String RatingCompat(String str, String str2) {
        if ((str == null || str.length() == 0) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public ModifyQuickTopUpReviewActivity(int i, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = z;
    }
}
