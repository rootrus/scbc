package p040o;

/* renamed from: o.VerifyIdentityTipsActivity */
public final class VerifyIdentityTipsActivity {
    public final ManagePromptpayLandingActivity MediaBrowserCompat$CustomActionResultReceiver;
    public final PurchaseReviewActivity read;

    public VerifyIdentityTipsActivity(ManagePromptpayLandingActivity managePromptpayLandingActivity, PurchaseReviewActivity purchaseReviewActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(managePromptpayLandingActivity, "Auth scheme");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(purchaseReviewActivity, "User credentials");
        this.MediaBrowserCompat$CustomActionResultReceiver = managePromptpayLandingActivity;
        this.read = purchaseReviewActivity;
    }

    public final String toString() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.toString();
    }
}
