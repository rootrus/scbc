package p040o;

@HmlSetNTBPinActivity
/* renamed from: o.onCanceledRequested */
public final class onCanceledRequested extends IndoorBuilding {
    final fromDataField MediaBrowserCompat$CustomActionResultReceiver;

    @HmlPinActivity
    onCanceledRequested(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, fromDataField fromdatafield) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$CustomActionResultReceiver = fromdatafield;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, getCenter getcenter) {
        if (getcenter.RatingCompat == null) {
            write(DebitCardResetOtpActivity.error(new Throwable("Invalid request UUID.")));
            return;
        }
        write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new processPendingNotifications(str, getcenter.RatingCompat)).doOnNext(new TagManagerApiImpl(this, str, getcenter)));
    }
}
