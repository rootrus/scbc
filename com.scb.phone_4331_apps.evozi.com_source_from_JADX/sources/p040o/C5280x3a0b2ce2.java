package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.zzjx;

/* renamed from: o.setCompatPressedTranslationZResource$MediaBrowserCompat$CustomActionResultReceiver */
final class C5280x3a0b2ce2<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ setCompatPressedTranslationZResource write;

    C5280x3a0b2ce2(setCompatPressedTranslationZResource setcompatpressedtranslationzresource) {
        this.write = setcompatpressedtranslationzresource;
    }

    public final /* synthetic */ Object write(Object obj) {
        FriendsLandingActivity_ViewBinding friendsLandingActivity_ViewBinding;
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        int i = setRippleColor.read[this.write.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i == 1) {
            BScanCNotificationDeepLinkActivity<zzjx.zze> MediaSessionCompat$QueueItem = this.write.IconCompatParcelizer.MediaSessionCompat$QueueItem(str);
            if (MediaSessionCompat$QueueItem instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
                return ((HmlLatestLoanOfferStatusDeepLinkActivity) MediaSessionCompat$QueueItem).MediaBrowserCompat$CustomActionResultReceiver();
            }
            friendsLandingActivity_ViewBinding = new FriendsLandingActivity_ViewBinding(MediaSessionCompat$QueueItem);
        } else if (i == 2) {
            BScanCNotificationDeepLinkActivity<zzjx.zze> Keep = this.write.read.Keep(str);
            if (Keep instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
                return ((HmlLatestLoanOfferStatusDeepLinkActivity) Keep).MediaBrowserCompat$CustomActionResultReceiver();
            }
            friendsLandingActivity_ViewBinding = new FriendsLandingActivity_ViewBinding(Keep);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return friendsLandingActivity_ViewBinding;
    }
}
