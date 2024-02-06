package p040o;

import java.util.Locale;

/* renamed from: o.PaymentInfoAdapter$ViewTypeMiniQrHolder_ViewBinding */
public final class PaymentInfoAdapter$ViewTypeMiniQrHolder_ViewBinding extends ChequeDetailListAdapter$ChequeItemHolder implements ScbPrivacyPolicyActivity {
    private final ProfileManagementActivity IconCompatParcelizer;
    private Locale MediaBrowserCompat$ItemReceiver;
    private ReviewAccountsActivity MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private VerifyIdentityActivity RatingCompat;
    private int read;
    private PrepaidResetOtpActivity write;

    public PaymentInfoAdapter$ViewTypeMiniQrHolder_ViewBinding(VerifyIdentityActivity verifyIdentityActivity, ProfileManagementActivity profileManagementActivity, Locale locale) {
        this.RatingCompat = (VerifyIdentityActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(verifyIdentityActivity, "Status line");
        this.MediaDescriptionCompat = verifyIdentityActivity.write();
        this.read = verifyIdentityActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaMetadataCompat = verifyIdentityActivity.IconCompatParcelizer();
        this.IconCompatParcelizer = profileManagementActivity;
        this.MediaBrowserCompat$ItemReceiver = locale;
    }

    public final ReviewAccountsActivity MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final VerifyIdentityActivity IconCompatParcelizer() {
        if (this.RatingCompat == null) {
            ReviewAccountsActivity reviewAccountsActivity = this.MediaDescriptionCompat;
            if (reviewAccountsActivity == null) {
                reviewAccountsActivity = ManageAccountInboundActivity.IconCompatParcelizer;
            }
            int i = this.read;
            String str = this.MediaMetadataCompat;
            if (str == null) {
                ProfileManagementActivity profileManagementActivity = this.IconCompatParcelizer;
                if (profileManagementActivity != null) {
                    if (this.MediaBrowserCompat$ItemReceiver == null) {
                        Locale.getDefault();
                    }
                    str = profileManagementActivity.IconCompatParcelizer(i);
                } else {
                    str = null;
                }
            }
            this.RatingCompat = new PaymentInfoAdapter$ViewTypeTextAndImageHolder(reviewAccountsActivity, i, str);
        }
        return this.RatingCompat;
    }

    public final PrepaidResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrepaidResetOtpActivity prepaidResetOtpActivity) {
        this.write = prepaidResetOtpActivity;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(' ');
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (this.write != null) {
            sb.append(' ');
            sb.append(this.write);
        }
        return sb.toString();
    }
}
