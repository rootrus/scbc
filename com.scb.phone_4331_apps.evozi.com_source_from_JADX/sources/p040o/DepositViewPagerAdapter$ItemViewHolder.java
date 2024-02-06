package p040o;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p040o.GiftOpenSharingMomentActivity;

@Deprecated
/* renamed from: o.DepositViewPagerAdapter$ItemViewHolder */
final class DepositViewPagerAdapter$ItemViewHolder extends CoachMarkViewPagerAdapter$TutorialItemHolder<GiftOpenSharingMomentActivity_ViewBinding, DealsSuccessActivity> {
    final GiftOpenSharingMomentActivity.SharedMoment_ViewBinding MediaBrowserCompat$ItemReceiver;
    final PrepaidTravelCoachMarkActivity_ViewBinding read;

    public DepositViewPagerAdapter$ItemViewHolder(PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding, String str, GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding, DealsSuccessActivity dealsSuccessActivity, TimeUnit timeUnit) {
        super(str, giftOpenSharingMomentActivity_ViewBinding, dealsSuccessActivity, 0, timeUnit);
        this.read = prepaidTravelCoachMarkActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = new GiftOpenSharingMomentActivity.SharedMoment_ViewBinding(giftOpenSharingMomentActivity_ViewBinding);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(long j) {
        boolean MediaBrowserCompat$CustomActionResultReceiver = super.MediaBrowserCompat$CustomActionResultReceiver(j);
        if (MediaBrowserCompat$CustomActionResultReceiver && this.read.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.read;
            StringBuilder sb = new StringBuilder();
            sb.append("Connection ");
            sb.append(this);
            sb.append(" expired @ ");
            sb.append(new Date(read()));
            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
