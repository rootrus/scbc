package p040o;

@HmlSetNTBPinActivity
/* renamed from: o.OnTokenCanceledListener */
public final class OnTokenCanceledListener extends IndoorBuilding {
    private final fromDataField read;

    @HmlPinActivity
    public OnTokenCanceledListener(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, fromDataField fromdatafield) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = fromdatafield;
    }

    public final void write(String str, String str2, newValueReference newvaluereference) {
        write(this.read.MediaBrowserCompat$ItemReceiver(str, str2, newvaluereference).doOnNext(new CancellationToken(this.read)));
    }
}
