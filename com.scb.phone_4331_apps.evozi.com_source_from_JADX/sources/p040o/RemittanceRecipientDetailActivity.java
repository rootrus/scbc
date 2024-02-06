package p040o;

import java.util.Queue;
import org.apache.http.auth.AuthenticationException;

@Deprecated
/* renamed from: o.RemittanceRecipientDetailActivity */
abstract class RemittanceRecipientDetailActivity implements PrivacyManagementLandingViewHolder_ViewBinding {
    final PrepaidTravelCoachMarkActivity_ViewBinding IconCompatParcelizer = PrepaidOtpActivity.write((Class) getClass());

    /* renamed from: o.RemittanceRecipientDetailActivity$2 */
    static /* synthetic */ class C98102 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.AccountManagementSuccessActivity[] r0 = p040o.AccountManagementSuccessActivity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.FAILURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.AccountManagementSuccessActivity r1 = p040o.AccountManagementSuccessActivity.CHALLENGED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RemittanceRecipientDetailActivity.C98102.<clinit>():void");
        }
    }

    private static PrepaidRequestMarketConductActivity IconCompatParcelizer(ManagePromptpayLandingActivity managePromptpayLandingActivity, PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws AuthenticationException {
        DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(managePromptpayLandingActivity, "Auth scheme");
        if (managePromptpayLandingActivity instanceof RegistrationCardDetailActivity) {
            return ((RegistrationCardDetailActivity) managePromptpayLandingActivity).read(purchaseReviewActivity, privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        }
        return managePromptpayLandingActivity.IconCompatParcelizer(purchaseReviewActivity, privacyConsentActivity);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(ManagePromptpaySuccessActivity managePromptpaySuccessActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        ManagePromptpayLandingActivity managePromptpayLandingActivity = managePromptpaySuccessActivity.MediaBrowserCompat$CustomActionResultReceiver;
        PurchaseReviewActivity purchaseReviewActivity = managePromptpaySuccessActivity.write;
        int i = C98102.read[managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver.ordinal()];
        if (i != 1) {
            if (i == 2) {
                DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(managePromptpayLandingActivity, "Auth scheme");
                if (managePromptpayLandingActivity.MediaBrowserCompat$ItemReceiver()) {
                    return;
                }
            } else if (i == 3) {
                Queue<VerifyIdentityTipsActivity> queue = managePromptpaySuccessActivity.IconCompatParcelizer;
                if (queue != null) {
                    while (!queue.isEmpty()) {
                        VerifyIdentityTipsActivity remove = queue.remove();
                        ManagePromptpayLandingActivity managePromptpayLandingActivity2 = remove.MediaBrowserCompat$CustomActionResultReceiver;
                        PurchaseReviewActivity purchaseReviewActivity2 = remove.read;
                        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(managePromptpayLandingActivity2, "Auth scheme");
                        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(purchaseReviewActivity2, "Credentials");
                        managePromptpaySuccessActivity.MediaBrowserCompat$CustomActionResultReceiver = managePromptpayLandingActivity2;
                        managePromptpaySuccessActivity.write = purchaseReviewActivity2;
                        managePromptpaySuccessActivity.IconCompatParcelizer = null;
                        if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.IconCompatParcelizer;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Generating response to an authentication challenge using ");
                            sb.append(managePromptpayLandingActivity2.read());
                            sb.append(" scheme");
                            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
                        }
                        try {
                            privacyConsentActivity.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer(managePromptpayLandingActivity2, purchaseReviewActivity2, privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder));
                            return;
                        } catch (AuthenticationException e) {
                            if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()) {
                                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.IconCompatParcelizer;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(managePromptpayLandingActivity2);
                                sb2.append(" authentication error: ");
                                sb2.append(e.getMessage());
                                prepaidTravelCoachMarkActivity_ViewBinding2.IconCompatParcelizer(sb2.toString());
                            }
                        }
                    }
                    return;
                }
                DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(managePromptpayLandingActivity, "Auth scheme");
            }
            if (managePromptpayLandingActivity != null) {
                try {
                    privacyConsentActivity.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer(managePromptpayLandingActivity, purchaseReviewActivity, privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder));
                } catch (AuthenticationException e2) {
                    if (this.IconCompatParcelizer.read()) {
                        PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding3 = this.IconCompatParcelizer;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(managePromptpayLandingActivity);
                        sb3.append(" authentication error: ");
                        sb3.append(e2.getMessage());
                        prepaidTravelCoachMarkActivity_ViewBinding3.MediaBrowserCompat$ItemReceiver(sb3.toString());
                    }
                }
            }
        }
    }
}
