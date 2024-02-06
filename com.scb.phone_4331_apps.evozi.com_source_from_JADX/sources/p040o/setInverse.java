package p040o;

import p040o.LatLngBounds;

/* renamed from: o.setInverse */
public final class setInverse extends LatLngBounds.Builder {
    private final C6548x820c5aab MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public setInverse(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, C7514tY tYVar) {
        super(tYVar, closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, PlaceBuffer placeBuffer) {
        try {
            write(this.MediaBrowserCompat$ItemReceiver.read(new ImmutableSortedAsList(str, placeBuffer.read, write(str2))).doOnNext(new removeFromInverseMap(this)).doOnError(new removeFromBothMaps(this)));
        } catch (Exception e) {
            write(DebitCardResetOtpActivity.error((Throwable) e));
        }
    }
}
