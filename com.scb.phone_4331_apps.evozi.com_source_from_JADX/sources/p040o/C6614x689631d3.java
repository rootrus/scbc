package p040o;

import java.net.URI;

/* renamed from: o.FragmentBuilder_BindOnboardingInputAddressFragment$AppCompatDelegateImpl$ListMenuDecorView */
final class C6614x689631d3 extends CheckEligibilityActivity implements FundFactSheetActivity<URI, URI> {
    public static final C6614x689631d3 write = new C6614x689631d3();

    C6614x689631d3() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if ((r0 == null || r0.length() == 0) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            java.net.URI r4 = (java.net.URI) r4
            if (r4 != 0) goto L_0x0005
            goto L_0x002e
        L_0x0005:
            java.lang.String r0 = r4.getPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r4.getAuthority()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x002a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x002a
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r4 = 0
            goto L_0x0056
        L_0x0030:
            java.lang.String r0 = r4.getScheme()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "android://"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.net.URI r4 = java.net.URI.create(r4)
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6614x689631d3.invoke(java.lang.Object):java.lang.Object");
    }
}
