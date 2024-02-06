package okhttp3.internal.platform.android;

public final class UtilKt {
    private static final int MAX_LOG_LENGTH = 4000;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r1 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void androidLog(int r5, java.lang.String r6, java.lang.Throwable r7) {
        /*
            java.lang.String r0 = "message"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            r0 = 5
            if (r5 == r0) goto L_0x0009
            r0 = 3
        L_0x0009:
            if (r7 == 0) goto L_0x0023
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "\n"
            r5.append(r6)
            java.lang.String r6 = android.util.Log.getStackTraceString(r7)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
        L_0x0023:
            int r5 = r6.length()
            r7 = 0
            r1 = r7
        L_0x0029:
            if (r1 >= r5) goto L_0x005e
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 10
            r4 = 4
            int r2 = p040o.GoodToKnowActivity.read((java.lang.CharSequence) r2, (char) r3, (int) r1, (boolean) r7, (int) r4)
            r3 = -1
            if (r2 != r3) goto L_0x0039
            r2 = r5
        L_0x0039:
            int r3 = r1 + 4000
            int r3 = java.lang.Math.min(r2, r3)
            if (r6 == 0) goto L_0x0056
            java.lang.String r1 = r6.substring(r1, r3)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            java.lang.String r4 = "OkHttp"
            android.util.Log.println(r0, r4, r1)
            if (r3 < r2) goto L_0x0054
            int r1 = r3 + 1
            goto L_0x0029
        L_0x0054:
            r1 = r3
            goto L_0x0039
        L_0x0056:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r6)
            throw r5
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.android.UtilKt.androidLog(int, java.lang.String, java.lang.Throwable):void");
    }
}
