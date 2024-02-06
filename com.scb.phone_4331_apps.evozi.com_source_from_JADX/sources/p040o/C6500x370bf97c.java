package p040o;

/* renamed from: o.FragmentBuilder_BindDepositSelectionFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6500x370bf97c {
    private C6500x370bf97c() {
    }

    public /* synthetic */ C6500x370bf97c(byte b) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        r3 = r9.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r10 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0091, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MediaBrowserCompat$ItemReceiver(android.content.Context r9, android.net.Uri r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r9 == 0) goto L_0x0017
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            if (r1 == 0) goto L_0x0017
            java.io.InputStream r1 = r1.openInputStream(r10)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r9 = move-exception
            goto L_0x0092
        L_0x0014:
            r9 = move-exception
            goto L_0x0098
        L_0x0017:
            r1 = r0
        L_0x0018:
            java.lang.String r2 = "_display_name"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            if (r9 == 0) goto L_0x002f
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            if (r3 == 0) goto L_0x002f
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            goto L_0x0030
        L_0x002f:
            r9 = r0
        L_0x0030:
            if (r9 == 0) goto L_0x0043
            int r10 = r9.getCount()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            if (r10 == 0) goto L_0x0043
            r9.moveToFirst()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r10 = 0
            java.lang.String r10 = r9.getString(r10)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            if (r10 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            java.lang.String r10 = "temp.pdf"
        L_0x0045:
            if (r9 == 0) goto L_0x004a
            r9.close()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
        L_0x004a:
            java.lang.String r9 = "java.io.tmpdir"
            java.lang.String r9 = java.lang.System.getProperty(r9)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r9 = 47
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r3.append(r10)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            java.lang.String r9 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            r9 = r1
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ all -> 0x008b }
            r10.<init>(r2)     // Catch:{ all -> 0x008b }
            java.io.OutputStream r10 = (java.io.OutputStream) r10     // Catch:{ all -> 0x008b }
            r3 = r10
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch:{ all -> 0x008b }
            com.google.android.gms.common.util.IOUtils.copyStream(r1, r10)     // Catch:{ all -> 0x0084 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x008b }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r9, (java.lang.Throwable) r0)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            java.lang.String r9 = r2.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            return r9
        L_0x0084:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r3, (java.lang.Throwable) r10)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r9, (java.lang.Throwable) r10)     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0014, Exception -> 0x0011 }
        L_0x0092:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p040o.onCheckBoxClick.IconCompatParcelizer(r9)
            return r0
        L_0x0098:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p040o.onCheckBoxClick.IconCompatParcelizer(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6500x370bf97c.MediaBrowserCompat$ItemReceiver(android.content.Context, android.net.Uri):java.lang.String");
    }
}
