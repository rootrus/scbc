package p040o;

/* renamed from: o.synchronizedMultimap */
public final class synchronizedMultimap {
    public static String write(String str, boolean z) {
        onGetStartedClick.write((Object) str, "account");
        if (str.length() != 10) {
            return str;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("xxx-xxx");
            sb.append(str.subSequence(6, 9));
            sb.append('-');
            sb.append(str.subSequence(9, 10));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 3);
        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append('-');
        String substring2 = str.substring(3, 9);
        onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb2.append(substring2);
        sb2.append('-');
        String substring3 = str.substring(9, 10);
        onGetStartedClick.IconCompatParcelizer((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb2.append(substring3);
        return sb2.toString();
    }
}
