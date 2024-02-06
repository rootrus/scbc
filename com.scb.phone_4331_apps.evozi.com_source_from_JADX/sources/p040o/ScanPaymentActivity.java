package p040o;

import java.util.Locale;

/* renamed from: o.ScanPaymentActivity */
public final class ScanPaymentActivity implements ManageAccountInboundActivity_ViewBinding {
    public static final ScanPaymentActivity IconCompatParcelizer = new ScanPaymentActivity();
    private ProfileManagementActivity read;

    private ScanPaymentActivity(ProfileManagementActivity profileManagementActivity) {
        this.read = (ProfileManagementActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(profileManagementActivity, "Reason phrase catalog");
    }

    public ScanPaymentActivity() {
        this(btnScanAgainClicked.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final ScbPrivacyPolicyActivity MediaBrowserCompat$ItemReceiver(VerifyIdentityActivity verifyIdentityActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(verifyIdentityActivity, "Status line");
        return new PaymentInfoAdapter$ViewTypeMiniQrHolder_ViewBinding(verifyIdentityActivity, this.read, Locale.getDefault());
    }
}
