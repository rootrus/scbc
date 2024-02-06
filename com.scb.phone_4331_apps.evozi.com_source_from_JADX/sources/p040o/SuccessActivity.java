package p040o;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* renamed from: o.SuccessActivity */
public abstract class SuccessActivity extends btnReturnClicked {
    private byte[] IconCompatParcelizer;
    private SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean MediaBrowserCompat$SearchResultReceiver;
    private final boolean read;
    private final PrepaidTravelCoachMarkActivity_ViewBinding write;

    /* access modifiers changed from: protected */
    @Deprecated
    public byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, String str) throws GSSException {
        return null;
    }

    SuccessActivity(boolean z, boolean z2) {
        this.write = PrepaidOtpActivity.write((Class) getClass());
        new SetupQuickTopUpActivity(0);
        this.read = z;
        this.MediaBrowserCompat$SearchResultReceiver = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.UNINITIATED;
    }

    SuccessActivity() {
        this(true, true);
    }

    /* access modifiers changed from: protected */
    public byte[] IconCompatParcelizer(byte[] bArr, String str, PurchaseReviewActivity purchaseReviewActivity) throws GSSException {
        return MediaBrowserCompat$CustomActionResultReceiver(bArr, str);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver == SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.TOKEN_GENERATED || this.MediaBrowserCompat$CustomActionResultReceiver == SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.FAILED;
    }

    @Deprecated
    public final PrepaidRequestMarketConductActivity IconCompatParcelizer(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity) throws AuthenticationException {
        return read(purchaseReviewActivity, privacyConsentActivity, (CreditCardBilledDetailAdapter$ParentViewHolder) null);
    }

    /* renamed from: o.SuccessActivity$5 */
    static /* synthetic */ class C98275 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver[] r0 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.UNINITIATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.FAILED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.CHALLENGE_RECEIVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.TOKEN_GENERATED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SuccessActivity.C98275.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:14|(2:16|(1:18))(1:19)|20|(3:22|23|(1:25))|26|27|(1:29)(1:30)|31|(1:33)|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f A[Catch:{ GSSException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ GSSException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ GSSException -> 0x010c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040o.PrepaidRequestMarketConductActivity read(p040o.PurchaseReviewActivity r3, p040o.PrivacyConsentActivity r4, p040o.CreditCardBilledDetailAdapter$ParentViewHolder r5) throws org.apache.http.auth.AuthenticationException {
        /*
            r2 = this;
            java.lang.String r0 = "HTTP request"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r4, (java.lang.String) r0)
            int[] r4 = p040o.SuccessActivity.C98275.IconCompatParcelizer
            o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r0 = r2.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.ordinal()
            r4 = r4[r0]
            r0 = 1
            if (r4 == r0) goto L_0x0184
            r0 = 2
            if (r4 == r0) goto L_0x0169
            r0 = 3
            if (r4 == r0) goto L_0x0036
            r3 = 4
            if (r4 != r3) goto L_0x001d
            goto L_0x00b0
        L_0x001d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Illegal state: "
            r3.append(r4)
            o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r3.append(r4)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L_0x0036:
            java.lang.String r4 = "http.route"
            java.lang.Object r4 = r5.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ GSSException -> 0x010c }
            o.GiftOpenSharingMomentActivity_ViewBinding r4 = (p040o.GiftOpenSharingMomentActivity_ViewBinding) r4     // Catch:{ GSSException -> 0x010c }
            if (r4 == 0) goto L_0x0104
            boolean r5 = r2.write()     // Catch:{ GSSException -> 0x010c }
            if (r5 == 0) goto L_0x004f
            o.PrivacyManagementLandingViewHolder r5 = r4.read()     // Catch:{ GSSException -> 0x010c }
            if (r5 != 0) goto L_0x0051
            o.PrivacyManagementLandingViewHolder r5 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ GSSException -> 0x010c }
            goto L_0x0051
        L_0x004f:
            o.PrivacyManagementLandingViewHolder r5 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ GSSException -> 0x010c }
        L_0x0051:
            java.lang.String r4 = r5.write     // Catch:{ GSSException -> 0x010c }
            boolean r0 = r2.MediaBrowserCompat$SearchResultReceiver     // Catch:{ GSSException -> 0x010c }
            if (r0 == 0) goto L_0x006b
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r4)     // Catch:{ UnknownHostException -> 0x006b }
            java.lang.String r1 = r0.getCanonicalHostName()     // Catch:{ UnknownHostException -> 0x006b }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x006b }
            boolean r0 = r0.contentEquals(r1)     // Catch:{ UnknownHostException -> 0x006b }
            if (r0 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r4 = r1
        L_0x006b:
            boolean r0 = r2.read     // Catch:{ GSSException -> 0x010c }
            if (r0 == 0) goto L_0x0070
            goto L_0x0086
        L_0x0070:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x010c }
            r0.<init>()     // Catch:{ GSSException -> 0x010c }
            r0.append(r4)     // Catch:{ GSSException -> 0x010c }
            java.lang.String r4 = ":"
            r0.append(r4)     // Catch:{ GSSException -> 0x010c }
            int r4 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ GSSException -> 0x010c }
            r0.append(r4)     // Catch:{ GSSException -> 0x010c }
            java.lang.String r4 = r0.toString()     // Catch:{ GSSException -> 0x010c }
        L_0x0086:
            o.PrepaidTravelCoachMarkActivity_ViewBinding r5 = r2.write     // Catch:{ GSSException -> 0x010c }
            boolean r5 = r5.IconCompatParcelizer()     // Catch:{ GSSException -> 0x010c }
            if (r5 == 0) goto L_0x00a4
            o.PrepaidTravelCoachMarkActivity_ViewBinding r5 = r2.write     // Catch:{ GSSException -> 0x010c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x010c }
            r0.<init>()     // Catch:{ GSSException -> 0x010c }
            java.lang.String r1 = "init "
            r0.append(r1)     // Catch:{ GSSException -> 0x010c }
            r0.append(r4)     // Catch:{ GSSException -> 0x010c }
            java.lang.String r0 = r0.toString()     // Catch:{ GSSException -> 0x010c }
            r5.write(r0)     // Catch:{ GSSException -> 0x010c }
        L_0x00a4:
            byte[] r5 = r2.IconCompatParcelizer     // Catch:{ GSSException -> 0x010c }
            byte[] r3 = r2.IconCompatParcelizer(r5, r4, r3)     // Catch:{ GSSException -> 0x010c }
            r2.IconCompatParcelizer = r3     // Catch:{ GSSException -> 0x010c }
            o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.TOKEN_GENERATED     // Catch:{ GSSException -> 0x010c }
            r2.MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ GSSException -> 0x010c }
        L_0x00b0:
            java.lang.String r3 = new java.lang.String
            byte[] r4 = r2.IconCompatParcelizer
            byte[] r4 = p040o.SetupQuickTopUpActivity.IconCompatParcelizer(r4)
            r3.<init>(r4)
            o.PrepaidTravelCoachMarkActivity_ViewBinding r4 = r2.write
            boolean r4 = r4.IconCompatParcelizer()
            if (r4 == 0) goto L_0x00de
            o.PrepaidTravelCoachMarkActivity_ViewBinding r4 = r2.write
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Sending response '"
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = "' back to the auth server"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.write(r5)
        L_0x00de:
            o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r4 = new o.DepositTransactionAdapter$ChildViewHolder_ViewBinding
            r5 = 32
            r4.<init>(r5)
            boolean r5 = r2.write()
            if (r5 == 0) goto L_0x00f1
            java.lang.String r5 = "Proxy-Authorization"
            r4.read((java.lang.String) r5)
            goto L_0x00f6
        L_0x00f1:
            java.lang.String r5 = "Authorization"
            r4.read((java.lang.String) r5)
        L_0x00f6:
            java.lang.String r5 = ": Negotiate "
            r4.read((java.lang.String) r5)
            r4.read((java.lang.String) r3)
            o.AmountDetailsAdapter$SuccessRow r3 = new o.AmountDetailsAdapter$SuccessRow
            r3.<init>(r4)
            return r3
        L_0x0104:
            org.apache.http.auth.AuthenticationException r3 = new org.apache.http.auth.AuthenticationException     // Catch:{ GSSException -> 0x010c }
            java.lang.String r4 = "Connection route is not available"
            r3.<init>(r4)     // Catch:{ GSSException -> 0x010c }
            throw r3     // Catch:{ GSSException -> 0x010c }
        L_0x010c:
            r3 = move-exception
            o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver r4 = p040o.SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.FAILED
            r2.MediaBrowserCompat$CustomActionResultReceiver = r4
            int r4 = r3.getMajor()
            r5 = 9
            if (r4 == r5) goto L_0x015f
            int r4 = r3.getMajor()
            r5 = 8
            if (r4 == r5) goto L_0x015f
            int r4 = r3.getMajor()
            r5 = 13
            if (r4 == r5) goto L_0x0155
            int r4 = r3.getMajor()
            r5 = 10
            if (r4 == r5) goto L_0x014b
            int r4 = r3.getMajor()
            r5 = 19
            if (r4 == r5) goto L_0x014b
            int r4 = r3.getMajor()
            r5 = 20
            if (r4 == r5) goto L_0x014b
            org.apache.http.auth.AuthenticationException r4 = new org.apache.http.auth.AuthenticationException
            java.lang.String r3 = r3.getMessage()
            r4.<init>(r3)
            throw r4
        L_0x014b:
            org.apache.http.auth.AuthenticationException r4 = new org.apache.http.auth.AuthenticationException
            java.lang.String r5 = r3.getMessage()
            r4.<init>(r5, r3)
            throw r4
        L_0x0155:
            org.apache.http.auth.InvalidCredentialsException r4 = new org.apache.http.auth.InvalidCredentialsException
            java.lang.String r5 = r3.getMessage()
            r4.<init>(r5, r3)
            throw r4
        L_0x015f:
            org.apache.http.auth.InvalidCredentialsException r4 = new org.apache.http.auth.InvalidCredentialsException
            java.lang.String r5 = r3.getMessage()
            r4.<init>(r5, r3)
            throw r4
        L_0x0169:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.read()
            r3.append(r4)
            java.lang.String r4 = " authentication has failed"
            r3.append(r4)
            org.apache.http.auth.AuthenticationException r4 = new org.apache.http.auth.AuthenticationException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L_0x0184:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.read()
            r3.append(r4)
            java.lang.String r4 = " authentication has not been initiated"
            r3.append(r4)
            org.apache.http.auth.AuthenticationException r4 = new org.apache.http.auth.AuthenticationException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SuccessActivity.read(o.PurchaseReviewActivity, o.PrivacyConsentActivity, o.CreditCardBilledDetailAdapter$ParentViewHolder):o.PrepaidRequestMarketConductActivity");
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, int i, int i2) throws MalformedChallengeException {
        String write2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(i, i2);
        if (this.write.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append("Received challenge '");
            sb.append(write2);
            sb.append("' from the auth server");
            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.UNINITIATED) {
            this.IconCompatParcelizer = SetupQuickTopUpActivity.MediaBrowserCompat$ItemReceiver(write2.getBytes());
            this.MediaBrowserCompat$CustomActionResultReceiver = SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.CHALLENGE_RECEIVED;
            return;
        }
        this.write.write("Authentication already attempted");
        this.MediaBrowserCompat$CustomActionResultReceiver = SuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.FAILED;
    }

    protected static byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, Oid oid, String str, PurchaseReviewActivity purchaseReviewActivity) throws GSSException {
        GSSManager instance = GSSManager.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP@");
        sb.append(str);
        GSSContext createContext = instance.createContext(instance.createName(sb.toString(), GSSName.NT_HOSTBASED_SERVICE).canonicalize(oid), oid, (GSSCredential) null, 0);
        createContext.requestMutualAuth(true);
        return bArr != null ? createContext.initSecContext(bArr, 0, bArr.length) : createContext.initSecContext(new byte[0], 0, 0);
    }
}
