package p040o;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.MwChangeCasaSuccessActivity */
public final class MwChangeCasaSuccessActivity {
    private static final boolean IconCompatParcelizer;
    private static final boolean MediaBrowserCompat$ItemReceiver = onClickRetry.class.desiredAssertionStatus();
    private static final AtomicLong read = new AtomicLong(0);
    private static final boolean write;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r0.equals("auto") != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r0.equals("on") != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r0.equals("") != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (r0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    static {
        /*
            java.lang.Class<o.onClickRetry> r0 = p040o.onClickRetry.class
            boolean r0 = r0.desiredAssertionStatus()
            MediaBrowserCompat$ItemReceiver = r0
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = p040o.EkycSuccessActivity_ViewBinding.IconCompatParcelizer(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006e
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0042
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0039
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x002f
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x004c
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x004c
            goto L_0x006e
        L_0x002f:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x004c
            r0 = r2
            goto L_0x0070
        L_0x0039:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x004c
            goto L_0x004a
        L_0x0042:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x004c
        L_0x004a:
            r0 = r1
            goto L_0x0070
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x006e:
            boolean r0 = MediaBrowserCompat$ItemReceiver
        L_0x0070:
            IconCompatParcelizer = r0
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            java.lang.String r3 = "propertyName"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r3)
            java.lang.String r0 = p040o.EkycSuccessActivity_ViewBinding.IconCompatParcelizer(r0)
            if (r0 == 0) goto L_0x0086
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L_0x0087
        L_0x0086:
            r0 = r1
        L_0x0087:
            if (r0 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r1 = r2
        L_0x008b:
            write = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            read = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MwChangeCasaSuccessActivity.<clinit>():void");
    }

    public static final boolean write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final boolean MediaBrowserCompat$ItemReceiver() {
        return IconCompatParcelizer;
    }

    public static final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public static final AtomicLong IconCompatParcelizer() {
        return read;
    }
}
