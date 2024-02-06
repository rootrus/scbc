package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.MicrLine;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import com.kofax.mobile.sdk._internal.C0767k;
import p040o.ModifyQuickTopUpReviewActivity;

public class MicrParser {
    private final String TAG;

    /* renamed from: nR */
    private MicrLine f3609nR;

    public MicrParser(String str) {
        this.TAG = MicrParser.class.getSimpleName();
        ParseMicr(str);
    }

    public MicrParser() {
        this.TAG = MicrParser.class.getSimpleName();
        this.f3609nR = new MicrLine();
    }

    public boolean ParseMicr(String str) throws NullPointerException {
        String str2;
        this.f3609nR = new MicrLine();
        if (str == null || str.length() == 0) {
            return this.f3609nR.getValueSet();
        }
        String str3 = "C";
        String str4 = ",";
        if (str.contains(str3) && str.contains("P")) {
            str4 = "P";
        } else if (!str.contains(".") || !str.contains(str4)) {
            return this.f3609nR.getValueSet();
        } else {
            str3 = ".";
        }
        String obj = new StringBuilder(m3800b(m3799a(str, str4, this.f3609nR), str3, this.f3609nR)).reverse().toString();
        if (obj.startsWith("/")) {
            int indexOf = obj.indexOf("/", 1);
            if (indexOf <= 0) {
                C0767k.m1820e(this.TAG, "Unable to parse amount");
                return this.f3609nR.getValueSet();
            }
            this.f3609nR.setAmount(new StringBuilder(obj.substring(1, indexOf)).reverse().toString());
            int i = indexOf + 1;
            if (i > obj.length()) {
                return this.f3609nR.getValueSet();
            }
            obj = obj.substring(i);
        }
        if (obj == null) {
            str2 = null;
        } else {
            str2 = new StringBuilder(obj).reverse().toString();
        }
        try {
            String c = m3801c(str2, str3, this.f3609nR);
            this.f3609nR.setOnUs(c);
            m3803e(m3802d(c, str4, this.f3609nR), str4, this.f3609nR);
            return this.f3609nR.getValueSet();
        } catch (C7884a unused) {
            return this.f3609nR.getValueSet();
        }
    }

    public boolean isMicrValid() {
        String transitNumber = this.f3609nR.getTransitNumber();
        if (transitNumber != null && transitNumber.length() == 9) {
            String amount = this.f3609nR.getAmount();
            if ((amount == null || amount.length() == 0) || amount.length() == 10) {
                return true;
            }
        }
        return false;
    }

    public MicrLine getMicrLine() {
        return this.f3609nR;
    }

    public String getAccountNumber() {
        String o = m3805o(this.f3609nR.getAuxiliaryOnUs());
        String o2 = m3805o(this.f3609nR.getOnUs1());
        boolean z = false;
        if (!(o == null || o.length() == 0)) {
            return o2;
        }
        String o3 = m3805o(this.f3609nR.getOnUs2());
        if (o3 == null || o3.length() == 0) {
            z = true;
        }
        return !z ? o2.length() < o3.length() ? o3 : o2 : o2.length() >= 14 ? o2.substring(4) : o2;
    }

    public String getTransitNumber() {
        return this.f3609nR.getTransitNumber();
    }

    public String getCheckNumber() {
        String o = m3805o(this.f3609nR.getAuxiliaryOnUs());
        boolean z = true;
        if (!(o == null || o.length() == 0)) {
            return o;
        }
        String o2 = m3805o(this.f3609nR.getOnUs1());
        String o3 = m3805o(this.f3609nR.getOnUs2());
        if (!(o3 == null || o3.length() == 0)) {
            z = false;
        }
        return !z ? o2.length() >= o3.length() ? o3 : o2 : o2.length() >= 14 ? o2.substring(0, 4) : "";
    }

    /* renamed from: a */
    private static String m3799a(String str, String str2, MicrLine micrLine) {
        String RatingCompat = ModifyQuickTopUpReviewActivity.RatingCompat(str, str2);
        String MediaBrowserCompat$ItemReceiver = ModifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver(str, str2, str2);
        if (!m3804n(RatingCompat) || MediaBrowserCompat$ItemReceiver == null) {
            micrLine.setCheckType(MicrLine.CheckType.PERSONAL_CHECK);
            return str;
        }
        micrLine.setAuxiliaryOnUs(MediaBrowserCompat$ItemReceiver);
        micrLine.setCheckType(MicrLine.CheckType.BUSINESS_CHECK);
        return str.substring(RatingCompat.length() + str2.length() + MediaBrowserCompat$ItemReceiver.length() + str2.length());
    }

    /* renamed from: b */
    private static String m3800b(String str, String str2, MicrLine micrLine) {
        int indexOf = str.indexOf(str2) - 1;
        if (indexOf < 0) {
            return str;
        }
        char charAt = str.charAt(indexOf);
        if (!Character.isDigit(charAt)) {
            return str;
        }
        String substring = str.substring(0, indexOf);
        if (!m3804n(substring)) {
            return str;
        }
        String valueOf = String.valueOf(charAt);
        micrLine.setEPC(valueOf);
        return str.substring(substring.length() + valueOf.length());
    }

    /* renamed from: c */
    private static String m3801c(String str, String str2, MicrLine micrLine) throws C7884a {
        String RatingCompat = ModifyQuickTopUpReviewActivity.RatingCompat(str, str2);
        if (m3804n(RatingCompat)) {
            String MediaBrowserCompat$ItemReceiver = ModifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver(str, str2, str2);
            if (MediaBrowserCompat$ItemReceiver != null) {
                micrLine.setTransitNumber(m3806p(MediaBrowserCompat$ItemReceiver));
                return str.substring(RatingCompat.length() + str2.length() + MediaBrowserCompat$ItemReceiver.length() + str2.length());
            }
            throw new C7884a();
        }
        throw new C7884a();
    }

    /* renamed from: d */
    private static String m3802d(String str, String str2, MicrLine micrLine) throws C7884a {
        String RatingCompat = ModifyQuickTopUpReviewActivity.RatingCompat(str, str2);
        if (!m3804n(RatingCompat)) {
            micrLine.setOnUs1(RatingCompat);
            return str.substring(RatingCompat.length());
        }
        String substring = str.substring(RatingCompat.length() + str2.length());
        String RatingCompat2 = ModifyQuickTopUpReviewActivity.RatingCompat(substring, str2);
        if (!m3805o(RatingCompat2).isEmpty()) {
            micrLine.setOnUs1(RatingCompat2);
            return substring.substring(RatingCompat2.length());
        }
        throw new C7884a();
    }

    /* renamed from: e */
    private static String m3803e(String str, String str2, MicrLine micrLine) {
        if (!str.startsWith(str2)) {
            return str;
        }
        micrLine.setOnUs2(str.substring(str2.length()));
        return "";
    }

    /* renamed from: o */
    private static String m3805o(String str) {
        return str == null ? "" : m3807q(str);
    }

    /* renamed from: p */
    private static String m3806p(String str) {
        return str == null ? "" : m3807q(str);
    }

    /* renamed from: q */
    private static String m3807q(String str) {
        return str.replaceAll("[^0-9]", "");
    }

    /* renamed from: com.kofax.kmc.kut.utilities.MicrParser$a */
    static class C7884a extends Exception {
        private C7884a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m3804n(java.lang.String r10) {
        /*
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 32
            r3 = 0
            r1[r3] = r2
            if (r10 != 0) goto L_0x000c
        L_0x000a:
            r0 = r3
            goto L_0x005a
        L_0x000c:
            int r2 = r10.length()
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            if (r10 == 0) goto L_0x001d
            int r2 = r10.length()
            if (r2 == 0) goto L_0x001d
            r2 = r3
            goto L_0x001e
        L_0x001d:
            r2 = r0
        L_0x001e:
            r4 = -1
            if (r2 != 0) goto L_0x0057
            boolean r2 = p040o.SetupQuickTopUpReviewActivity.read(r1)
            if (r2 != 0) goto L_0x0057
            int r2 = r10.length()
            r5 = r3
        L_0x002c:
            if (r5 >= r2) goto L_0x0057
            char r6 = r10.charAt(r5)
            r7 = r3
        L_0x0033:
            if (r7 > 0) goto L_0x0058
            char r8 = r1[r7]
            if (r8 != r6) goto L_0x0054
            int r8 = r2 + -1
            if (r5 >= r8) goto L_0x0051
            if (r7 >= 0) goto L_0x0051
            boolean r8 = java.lang.Character.isHighSurrogate(r6)
            if (r8 == 0) goto L_0x0051
            int r8 = r7 + 1
            char r8 = r1[r8]
            int r9 = r5 + 1
            char r9 = r10.charAt(r9)
            if (r8 != r9) goto L_0x0054
        L_0x0051:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0054:
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0057:
            r5 = r4
        L_0x0058:
            if (r5 != r4) goto L_0x000a
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.MicrParser.m3804n(java.lang.String):boolean");
    }
}
