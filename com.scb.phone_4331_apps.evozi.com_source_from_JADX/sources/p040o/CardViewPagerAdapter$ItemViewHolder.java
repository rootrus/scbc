package p040o;

import java.net.InetAddress;
import org.apache.http.HttpException;
import p040o.GiftOpenSharingMomentActivity;

@Deprecated
/* renamed from: o.CardViewPagerAdapter$ItemViewHolder */
public final class CardViewPagerAdapter$ItemViewHolder implements GiftOpenSharingMomentActivity.SharedMoment {
    private onGiftsSendButtonClick MediaBrowserCompat$CustomActionResultReceiver;

    public CardViewPagerAdapter$ItemViewHolder(onGiftsSendButtonClick ongiftssendbuttonclick) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(ongiftssendbuttonclick, "Scheme registry");
        this.MediaBrowserCompat$CustomActionResultReceiver = ongiftssendbuttonclick;
    }

    public final GiftOpenSharingMomentActivity_ViewBinding MediaBrowserCompat$ItemReceiver(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, PrivacyConsentActivity privacyConsentActivity) throws HttpException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        GiftOpenSharingMomentActivity_ViewBinding MediaBrowserCompat$ItemReceiver = GiftOpenSharingMomentActivity.MediaBrowserCompat$ItemReceiver(privacyConsentActivity.write());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(privacyManagementLandingViewHolder, "Target host");
        InetAddress IconCompatParcelizer = GiftOpenSharingMomentActivity.IconCompatParcelizer(privacyConsentActivity.write());
        PrivacyManagementLandingViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = GiftOpenSharingMomentActivity.MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity.write());
        try {
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(privacyManagementLandingViewHolder.read).write;
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                return new GiftOpenSharingMomentActivity_ViewBinding(privacyManagementLandingViewHolder, IconCompatParcelizer, z);
            }
            return new GiftOpenSharingMomentActivity_ViewBinding(privacyManagementLandingViewHolder, IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver2, z);
        } catch (IllegalStateException e) {
            throw new HttpException(e.getMessage());
        }
    }
}
