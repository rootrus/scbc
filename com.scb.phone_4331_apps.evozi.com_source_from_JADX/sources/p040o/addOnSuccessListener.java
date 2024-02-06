package p040o;

import p040o.LatLngBounds;

@HmlSetNTBPinActivity
/* renamed from: o.addOnSuccessListener */
public final class addOnSuccessListener extends LatLngBounds.Builder {

    /* renamed from: o.addOnSuccessListener$write */
    public static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ addOnSuccessListener read;

        public write(addOnSuccessListener addonsuccesslistener, String str) {
            this.read = addonsuccesslistener;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ Object write(Object obj) {
            PlaceBuffer placeBuffer = (PlaceBuffer) obj;
            onGetStartedClick.write((Object) placeBuffer, "preAuthenticate");
            String write = this.read.write(this.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) write, "encrypt(newPin)");
            String str = placeBuffer.read;
            onGetStartedClick.IconCompatParcelizer((Object) str, "preAuthenticate.e2eeSid");
            String str2 = placeBuffer.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "preAuthenticate.serverRandom");
            return new setCenter(write, str, str2, String.valueOf(placeBuffer.MediaDescriptionCompat));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public addOnSuccessListener(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar) {
        super(tYVar, closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
    }
}
