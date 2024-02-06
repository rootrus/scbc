package p040o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: o.ScheduleLandingActivity */
public interface ScheduleLandingActivity extends ScheduleTransactionActivity, SequentialSearchActivity, SummaryDetailActivity {
    void IconCompatParcelizer(boolean z, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;

    void MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;

    void MediaBrowserCompat$CustomActionResultReceiver(GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;

    void MediaBrowserCompat$ItemReceiver(Object obj);

    GiftOpenSharingMomentActivity_ViewBinding MediaBrowserCompat$MediaItem();

    void MediaSessionCompat$QueueItem();

    void ParcelableVolumeInfo();

    void read(long j, TimeUnit timeUnit);
}
