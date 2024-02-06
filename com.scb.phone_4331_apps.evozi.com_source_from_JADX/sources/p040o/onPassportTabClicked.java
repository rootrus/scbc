package p040o;

/* renamed from: o.onPassportTabClicked */
public final class onPassportTabClicked implements HowToAddAccountStep2Activity {
    private boolean IconCompatParcelizer;
    private final SCBUniversalWebViewActivity MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private final NsipPartnerPaymentOtpActivity MediaMetadataCompat;
    private PersonalizeActivity read;
    private int write;

    public onPassportTabClicked(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "upstream");
        this.MediaMetadataCompat = nsipPartnerPaymentOtpActivity;
        SCBUniversalWebViewActivity MediaMetadataCompat2 = nsipPartnerPaymentOtpActivity.MediaMetadataCompat();
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaMetadataCompat2;
        this.read = MediaMetadataCompat2.write;
        PersonalizeActivity personalizeActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        this.write = personalizeActivity != null ? personalizeActivity.read : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == r2.read) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long read(p040o.SCBUniversalWebViewActivity r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            boolean r0 = r8.IconCompatParcelizer
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x007e
            o.PersonalizeActivity r0 = r8.read
            if (r0 == 0) goto L_0x0026
            o.SCBUniversalWebViewActivity r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.PersonalizeActivity r2 = r2.write
            if (r0 != r2) goto L_0x0025
            int r0 = r8.write
            o.SCBUniversalWebViewActivity r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.PersonalizeActivity r2 = r2.write
            if (r2 != 0) goto L_0x0020
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0020:
            int r2 = r2.read
            if (r0 != r2) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x0070
            o.NsipPartnerPaymentOtpActivity r0 = r8.MediaMetadataCompat
            long r1 = r8.MediaBrowserCompat$ItemReceiver
            long r1 = r1 + r10
            r0.MediaBrowserCompat$SearchResultReceiver(r1)
            o.PersonalizeActivity r0 = r8.read
            if (r0 != 0) goto L_0x004d
            o.SCBUniversalWebViewActivity r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.PersonalizeActivity r0 = r0.write
            if (r0 == 0) goto L_0x004d
            o.SCBUniversalWebViewActivity r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.PersonalizeActivity r0 = r0.write
            r8.read = r0
            o.SCBUniversalWebViewActivity r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.PersonalizeActivity r0 = r0.write
            if (r0 != 0) goto L_0x0049
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0049:
            int r0 = r0.read
            r8.write = r0
        L_0x004d:
            o.SCBUniversalWebViewActivity r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            long r0 = r0.read
            long r2 = r8.MediaBrowserCompat$ItemReceiver
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0061
            r9 = -1
            return r9
        L_0x0061:
            o.SCBUniversalWebViewActivity r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            long r4 = r8.MediaBrowserCompat$ItemReceiver
            r3 = r9
            r6 = r10
            r2.MediaBrowserCompat$ItemReceiver(r3, r4, r6)
            long r0 = r8.MediaBrowserCompat$ItemReceiver
            long r0 = r0 + r10
            r8.MediaBrowserCompat$ItemReceiver = r0
            return r10
        L_0x0070:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x007e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onPassportTabClicked.read(o.SCBUniversalWebViewActivity, long):long");
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.MediaMetadataCompat.timeout();
    }

    public final void close() {
        this.IconCompatParcelizer = true;
    }
}
