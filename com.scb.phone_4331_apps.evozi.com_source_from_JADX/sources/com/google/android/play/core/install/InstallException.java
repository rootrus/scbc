package com.google.android.play.core.install;

public class InstallException extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstallException(int r6) {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r0[r2] = r1
            java.util.Map<java.lang.Integer, java.lang.String> r1 = p040o.C1133x65c1ec57.MediaDescriptionCompat
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x006c
            java.util.Map<java.lang.Integer, java.lang.String> r1 = p040o.C1133x65c1ec57.RatingCompat
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x006c
            java.util.Map<java.lang.Integer, java.lang.String> r1 = p040o.C1133x65c1ec57.MediaDescriptionCompat
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.Integer, java.lang.String> r2 = p040o.C1133x65c1ec57.RatingCompat
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 103
            java.lang.String r4 = java.lang.String.valueOf(r6)
            int r4 = r4.length()
            int r3 = r3 + r4
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode"
            r2.append(r1)
            java.lang.String r1 = "#"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = ")"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto L_0x006e
        L_0x006c:
            java.lang.String r6 = ""
        L_0x006e:
            r1 = 1
            r0[r1] = r6
            java.lang.String r6 = "Install Error(%d): %s"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            r5.<init>(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }
}
