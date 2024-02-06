package p040o;

/* renamed from: o.NdidNationalIdInputActivity_ViewBinding */
public final class NdidNationalIdInputActivity_ViewBinding extends onEditNicknameClick implements MwChangeCasaSuccessActivity_ViewBinding {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final Throwable read;

    public final /* synthetic */ void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        write();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void write(long j, MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "continuation");
        write();
        throw null;
    }

    public /* synthetic */ NdidNationalIdInputActivity_ViewBinding(Throwable th) {
        this(th, (String) null);
    }

    public NdidNationalIdInputActivity_ViewBinding(Throwable th, String str) {
        this.read = th;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        write();
        throw null;
    }

    public final MwCurrentUserEwalletActivity MediaBrowserCompat$ItemReceiver(long j, Runnable runnable) {
        onGetStartedClick.write((Object) runnable, "block");
        write();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void write() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.read
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.read
            r1.<init>(r0, r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.NdidNationalIdInputActivity_ViewBinding.write():java.lang.Void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Main[missing");
        if (this.read != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", cause=");
            sb2.append(this.read);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
