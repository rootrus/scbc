package p040o;

/* renamed from: o.BillPaymentReviewActivity */
public class BillPaymentReviewActivity {
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public BillPaymentReviewActivity(PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidTravelCoachMarkActivity_ViewBinding == null ? PrepaidOtpActivity.write((Class) getClass()) : prepaidTravelCoachMarkActivity_ViewBinding;
    }

    public BillPaymentReviewActivity() {
        this((PrepaidTravelCoachMarkActivity_ViewBinding) null);
    }

    public final boolean write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, RegistrationNoDataActivity registrationNoDataActivity, ManagePromptpaySuccessActivity managePromptpaySuccessActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        if (registrationNoDataActivity.IconCompatParcelizer(privacyManagementLandingViewHolder, scbPrivacyPolicyActivity, creditCardBilledDetailAdapter$ParentViewHolder)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write("Authentication required");
            if (managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver == AccountManagementSuccessActivity.SUCCESS) {
                registrationNoDataActivity.write(privacyManagementLandingViewHolder, managePromptpaySuccessActivity.MediaBrowserCompat$CustomActionResultReceiver, creditCardBilledDetailAdapter$ParentViewHolder);
            }
            return true;
        }
        int i = C96661.MediaBrowserCompat$ItemReceiver[managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver.ordinal()];
        if (i == 1 || i == 2) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write("Authentication succeeded");
            AccountManagementSuccessActivity accountManagementSuccessActivity = AccountManagementSuccessActivity.SUCCESS;
            if (accountManagementSuccessActivity == null) {
                accountManagementSuccessActivity = AccountManagementSuccessActivity.UNCHALLENGED;
            }
            managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver = accountManagementSuccessActivity;
            registrationNoDataActivity.IconCompatParcelizer(privacyManagementLandingViewHolder, managePromptpaySuccessActivity.MediaBrowserCompat$CustomActionResultReceiver, creditCardBilledDetailAdapter$ParentViewHolder);
            return false;
        } else if (i == 3) {
            return false;
        } else {
            AccountManagementSuccessActivity accountManagementSuccessActivity2 = AccountManagementSuccessActivity.UNCHALLENGED;
            if (accountManagementSuccessActivity2 == null) {
                accountManagementSuccessActivity2 = AccountManagementSuccessActivity.UNCHALLENGED;
            }
            managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver = accountManagementSuccessActivity2;
            return false;
        }
    }

    /* renamed from: o.BillPaymentReviewActivity$1 */
    static /* synthetic */ class C96661 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.AccountManagementSuccessActivity[] r0 = p040o.AccountManagementSuccessActivity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.CHALLENGED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.HANDSHAKE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.FAILURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.BillPaymentReviewActivity.C96661.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0 A[Catch:{ MalformedChallengeException -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0112 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(p040o.PrivacyManagementLandingViewHolder r8, p040o.ScbPrivacyPolicyActivity r9, p040o.RegistrationNoDataActivity r10, p040o.ManagePromptpaySuccessActivity r11, p040o.CreditCardBilledDetailAdapter$ParentViewHolder r12) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            o.PrepaidTravelCoachMarkActivity_ViewBinding r2 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            boolean r2 = r2.IconCompatParcelizer()     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r2 == 0) goto L_0x0024
            o.PrepaidTravelCoachMarkActivity_ViewBinding r2 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedChallengeException -> 0x0113 }
            r3.<init>()     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r4 = r8.write()     // Catch:{ MalformedChallengeException -> 0x0113 }
            r3.append(r4)     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r4 = " requested authentication"
            r3.append(r4)     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r3 = r3.toString()     // Catch:{ MalformedChallengeException -> 0x0113 }
            r2.write(r3)     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x0024:
            java.util.Map r2 = r10.write((p040o.PrivacyManagementLandingViewHolder) r8, (p040o.ScbPrivacyPolicyActivity) r9, (p040o.CreditCardBilledDetailAdapter$ParentViewHolder) r12)     // Catch:{ MalformedChallengeException -> 0x0113 }
            boolean r3 = r2.isEmpty()     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r3 == 0) goto L_0x0036
            o.PrepaidTravelCoachMarkActivity_ViewBinding r8 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r9 = "Response contains no authentication challenges"
            r8.write(r9)     // Catch:{ MalformedChallengeException -> 0x0113 }
            return r0
        L_0x0036:
            o.ManagePromptpayLandingActivity r3 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            int[] r4 = p040o.BillPaymentReviewActivity.C96661.MediaBrowserCompat$ItemReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.AccountManagementSuccessActivity r5 = r11.MediaBrowserCompat$ItemReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            int r5 = r5.ordinal()     // Catch:{ MalformedChallengeException -> 0x0113 }
            r4 = r4[r5]     // Catch:{ MalformedChallengeException -> 0x0113 }
            r5 = 1
            if (r4 == r5) goto L_0x005f
            r6 = 2
            if (r4 == r6) goto L_0x005f
            r6 = 3
            if (r4 == r6) goto L_0x0054
            r6 = 4
            if (r4 == r6) goto L_0x0053
            r6 = 5
            if (r4 == r6) goto L_0x007e
            goto L_0x00d4
        L_0x0053:
            return r0
        L_0x0054:
            o.AccountManagementSuccessActivity r3 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$ItemReceiver = r3     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.IconCompatParcelizer = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.write = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            goto L_0x00d4
        L_0x005f:
            if (r3 != 0) goto L_0x007e
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r2 = "Auth scheme is null"
            r9.write(r2)     // Catch:{ MalformedChallengeException -> 0x0113 }
            r10.write((p040o.PrivacyManagementLandingViewHolder) r8, (p040o.ManagePromptpayLandingActivity) r1, (p040o.CreditCardBilledDetailAdapter$ParentViewHolder) r12)     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$ItemReceiver = r8     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.IconCompatParcelizer = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.write = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.FAILURE     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r8 != 0) goto L_0x007b
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x007b:
            r11.MediaBrowserCompat$ItemReceiver = r8     // Catch:{ MalformedChallengeException -> 0x0113 }
            return r0
        L_0x007e:
            if (r3 == 0) goto L_0x00d4
            java.lang.String r4 = r3.read()     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r4 = r4.toLowerCase(r6)     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.PrepaidRequestMarketConductActivity r4 = (p040o.PrepaidRequestMarketConductActivity) r4     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r4 == 0) goto L_0x00ca
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r2 = "Authorization challenge processed"
            r9.write(r2)     // Catch:{ MalformedChallengeException -> 0x0113 }
            r3.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ MalformedChallengeException -> 0x0113 }
            boolean r9 = r3.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r9 == 0) goto L_0x00c1
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r2 = "Authentication failed"
            r9.write(r2)     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.ManagePromptpayLandingActivity r9 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            r10.write((p040o.PrivacyManagementLandingViewHolder) r8, (p040o.ManagePromptpayLandingActivity) r9, (p040o.CreditCardBilledDetailAdapter$ParentViewHolder) r12)     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$ItemReceiver = r8     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.IconCompatParcelizer = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.write = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.FAILURE     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r8 != 0) goto L_0x00be
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x00be:
            r11.MediaBrowserCompat$ItemReceiver = r8     // Catch:{ MalformedChallengeException -> 0x0113 }
            return r0
        L_0x00c1:
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.HANDSHAKE     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r8 != 0) goto L_0x00c7
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x00c7:
            r11.MediaBrowserCompat$ItemReceiver = r8     // Catch:{ MalformedChallengeException -> 0x0113 }
            return r5
        L_0x00ca:
            o.AccountManagementSuccessActivity r3 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$ItemReceiver = r3     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.IconCompatParcelizer = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.write = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x00d4:
            java.util.Queue r8 = r10.read(r2, r8, r9, r12)     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r8 == 0) goto L_0x0112
            boolean r9 = r8.isEmpty()     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r9 != 0) goto L_0x0112
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            boolean r9 = r9.IconCompatParcelizer()     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r9 == 0) goto L_0x00fe
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ MalformedChallengeException -> 0x0113 }
            r10.<init>()     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r12 = "Selected authentication options: "
            r10.append(r12)     // Catch:{ MalformedChallengeException -> 0x0113 }
            r10.append(r8)     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r10 = r10.toString()     // Catch:{ MalformedChallengeException -> 0x0113 }
            r9.write(r10)     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x00fe:
            o.AccountManagementSuccessActivity r9 = p040o.AccountManagementSuccessActivity.CHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
            if (r9 != 0) goto L_0x0104
            o.AccountManagementSuccessActivity r9 = p040o.AccountManagementSuccessActivity.UNCHALLENGED     // Catch:{ MalformedChallengeException -> 0x0113 }
        L_0x0104:
            r11.MediaBrowserCompat$ItemReceiver = r9     // Catch:{ MalformedChallengeException -> 0x0113 }
            java.lang.String r9 = "Queue of auth options"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.read(r8, (java.lang.String) r9)     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.IconCompatParcelizer = r8     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            r11.write = r1     // Catch:{ MalformedChallengeException -> 0x0113 }
            return r5
        L_0x0112:
            return r0
        L_0x0113:
            r8 = move-exception
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r9.MediaBrowserCompat$CustomActionResultReceiver()
            if (r9 == 0) goto L_0x0136
            o.PrepaidTravelCoachMarkActivity_ViewBinding r9 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Malformed challenge: "
            r10.append(r12)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.IconCompatParcelizer(r8)
        L_0x0136:
            o.AccountManagementSuccessActivity r8 = p040o.AccountManagementSuccessActivity.UNCHALLENGED
            r11.MediaBrowserCompat$ItemReceiver = r8
            r11.IconCompatParcelizer = r1
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1
            r11.write = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BillPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(o.PrivacyManagementLandingViewHolder, o.ScbPrivacyPolicyActivity, o.RegistrationNoDataActivity, o.ManagePromptpaySuccessActivity, o.CreditCardBilledDetailAdapter$ParentViewHolder):boolean");
    }
}
