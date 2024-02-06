package p040o;

/* renamed from: o.FatcaQuestionnaireAdapter$ViewHolder_ViewBinding */
public final class FatcaQuestionnaireAdapter$ViewHolder_ViewBinding {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    private final String write;

    private FatcaQuestionnaireAdapter$ViewHolder_ViewBinding(String str, String str2, String str3, String str4, String str5) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Package identifier");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2 == null ? "UNAVAILABLE" : str2;
        this.MediaBrowserCompat$ItemReceiver = str3 == null ? "UNAVAILABLE" : str3;
        this.IconCompatParcelizer = str4 == null ? "UNAVAILABLE" : str4;
        this.read = str5 == null ? "UNAVAILABLE" : str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.MediaBrowserCompat$CustomActionResultReceiver.length() + 20 + this.write.length() + this.MediaBrowserCompat$ItemReceiver.length() + this.IconCompatParcelizer.length() + this.read.length());
        sb.append("VersionInfo(");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(':');
        sb.append(this.write);
        if (!"UNAVAILABLE".equals(this.MediaBrowserCompat$ItemReceiver)) {
            sb.append(':');
            sb.append(this.MediaBrowserCompat$ItemReceiver);
        }
        if (!"UNAVAILABLE".equals(this.IconCompatParcelizer)) {
            sb.append(':');
            sb.append(this.IconCompatParcelizer);
        }
        sb.append(')');
        if (!"UNAVAILABLE".equals(this.read)) {
            sb.append('@');
            sb.append(this.read);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.FatcaQuestionnaireAdapter$ViewHolder_ViewBinding IconCompatParcelizer(java.lang.String r10, java.lang.ClassLoader r11) {
        /*
            java.lang.String r0 = "Package identifier"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r10, (java.lang.String) r0)
            if (r11 != 0) goto L_0x000f
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r11 = r11.getContextClassLoader()
        L_0x000f:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0045 }
            r2.<init>()     // Catch:{ IOException -> 0x0045 }
            r3 = 46
            r4 = 47
            java.lang.String r3 = r10.replace(r3, r4)     // Catch:{ IOException -> 0x0045 }
            r2.append(r3)     // Catch:{ IOException -> 0x0045 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ IOException -> 0x0045 }
            java.lang.String r3 = "version.properties"
            r2.append(r3)     // Catch:{ IOException -> 0x0045 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0045 }
            java.io.InputStream r2 = r11.getResourceAsStream(r2)     // Catch:{ IOException -> 0x0045 }
            if (r2 == 0) goto L_0x0045
            java.util.Properties r3 = new java.util.Properties     // Catch:{ all -> 0x0040 }
            r3.<init>()     // Catch:{ all -> 0x0040 }
            r3.load(r2)     // Catch:{ all -> 0x0040 }
            r2.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0040:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0045 }
            throw r3     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r3 = r1
        L_0x0046:
            if (r3 == 0) goto L_0x00a5
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r10, (java.lang.String) r0)
            if (r3 == 0) goto L_0x0094
            java.lang.String r0 = "info.module"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x005e
            int r2 = r0.length()
            if (r2 > 0) goto L_0x005e
            r0 = r1
        L_0x005e:
            java.lang.String r2 = "info.release"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0077
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0076
            java.lang.String r4 = "${pom.version}"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0077
        L_0x0076:
            r2 = r1
        L_0x0077:
            java.lang.String r4 = "info.timestamp"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0090
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x008f
            java.lang.String r4 = "${mvn.timestamp}"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0090
        L_0x008f:
            r3 = r1
        L_0x0090:
            r6 = r0
            r7 = r2
            r8 = r3
            goto L_0x0097
        L_0x0094:
            r6 = r1
            r7 = r6
            r8 = r7
        L_0x0097:
            if (r11 == 0) goto L_0x009d
            java.lang.String r1 = r11.toString()
        L_0x009d:
            r9 = r1
            o.FatcaQuestionnaireAdapter$ViewHolder_ViewBinding r1 = new o.FatcaQuestionnaireAdapter$ViewHolder_ViewBinding
            r4 = r1
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FatcaQuestionnaireAdapter$ViewHolder_ViewBinding.IconCompatParcelizer(java.lang.String, java.lang.ClassLoader):o.FatcaQuestionnaireAdapter$ViewHolder_ViewBinding");
    }
}
