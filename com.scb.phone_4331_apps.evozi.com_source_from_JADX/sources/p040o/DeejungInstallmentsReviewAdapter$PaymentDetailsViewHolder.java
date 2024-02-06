package p040o;

import java.io.IOException;
import org.apache.http.HttpException;
import p040o.OPRRewardAdapter;
import p040o.PrivacyManagementLandingActivity;

/* renamed from: o.DeejungInstallmentsReviewAdapter$PaymentDetailsViewHolder */
public abstract class DeejungInstallmentsReviewAdapter$PaymentDetailsViewHolder<T extends PrivacyManagementLandingActivity> implements OPRRewardAdapter.RewardViewHolder_ViewBinding<T> {
    protected final DepositTransactionAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(128);
    protected final OPRRewardTiersAdapter$TierViewHolder MediaBrowserCompat$ItemReceiver;
    protected final AmountDetailsAdapter$DetailViewHolder write = PaymentInfoAdapter$ViewTypeMiniQrHolder.MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(T t) throws IOException;

    @Deprecated
    public DeejungInstallmentsReviewAdapter$PaymentDetailsViewHolder(OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder, AmountDetailsAdapter$DetailViewHolder amountDetailsAdapter$DetailViewHolder) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder, "Session input buffer");
        this.MediaBrowserCompat$ItemReceiver = oPRRewardTiersAdapter$TierViewHolder;
    }

    public final void write(T t) throws IOException, HttpException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(t, "HTTP message");
        IconCompatParcelizer(t);
        PrepaidResetPinSuccessActivity RatingCompat = t.RatingCompat();
        while (RatingCompat.hasNext()) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, RatingCompat.MediaBrowserCompat$ItemReceiver()));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 0;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
