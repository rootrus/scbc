package p040o;

import java.util.Queue;

/* renamed from: o.ManagePromptpaySuccessActivity */
public class ManagePromptpaySuccessActivity {
    public Queue<VerifyIdentityTipsActivity> IconCompatParcelizer;
    public ManagePromptpayLandingActivity MediaBrowserCompat$CustomActionResultReceiver;
    public AccountManagementSuccessActivity MediaBrowserCompat$ItemReceiver = AccountManagementSuccessActivity.UNCHALLENGED;
    public PurchaseReviewActivity write;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("state:");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(";");
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            sb.append("auth scheme:");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.read());
            sb.append(";");
        }
        if (this.write != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
