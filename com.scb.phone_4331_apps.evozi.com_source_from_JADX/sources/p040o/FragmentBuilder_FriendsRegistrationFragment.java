package p040o;

/* renamed from: o.FragmentBuilder_FriendsRegistrationFragment */
public final class FragmentBuilder_FriendsRegistrationFragment {
    public static final write MediaBrowserCompat$ItemReceiver = new write((byte) 0);

    /* renamed from: o.FragmentBuilder_FriendsRegistrationFragment$write */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static String read(String str, int i) {
            onGetStartedClick.write((Object) str, "s");
            int i2 = i % 26;
            if (i2 == 0) {
                return str;
            }
            char[] cArr = new char[str.length()];
            CharSequence charSequence = str;
            int length = charSequence.length();
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                if ('A' > charAt || 'Z' < charAt) {
                    if ('a' <= charAt) {
                        if ('z' >= charAt) {
                            charAt = (char) (charAt + i2);
                            if (charAt <= 'z') {
                            }
                        }
                    }
                    cArr[i3] = charAt;
                } else {
                    charAt = (char) (charAt + i2);
                    if (charAt <= 'Z') {
                        cArr[i3] = charAt;
                    }
                }
                charAt = (char) (charAt - 26);
                cArr[i3] = charAt;
            }
            CharSequence charSequence2 = "";
            CharSequence charSequence3 = "";
            CharSequence charSequence4 = "";
            CharSequence charSequence5 = "...";
            onGetStartedClick.write((Object) cArr, "$this$joinToString");
            onGetStartedClick.write((Object) charSequence2, "separator");
            onGetStartedClick.write((Object) charSequence3, "prefix");
            onGetStartedClick.write((Object) charSequence4, "postfix");
            onGetStartedClick.write((Object) charSequence5, "truncated");
            String obj = ((StringBuilder) HmlBusinessOwnerReviewSubmissionActivity.write(cArr, new StringBuilder(), charSequence2, charSequence3, charSequence4, -1, charSequence5, (FundFactSheetActivity<? super Character, ? extends CharSequence>) null)).toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "joinTo(StringBuilder(), …ed, transform).toString()");
            return obj;
        }
    }
}
