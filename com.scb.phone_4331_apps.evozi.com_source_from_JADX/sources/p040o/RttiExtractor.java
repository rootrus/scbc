package p040o;

import p040o.C5162qF;
import p040o.MapDifference;

/* renamed from: o.RttiExtractor */
public final class RttiExtractor implements OPRStatusRewardsLandingActivity_ViewBinding<convertStreamToString> {
    public static convertStreamToString read(RegularImmutableBiMap regularImmutableBiMap, MapDifference.ValueDifference valueDifference, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new convertStreamToString(regularImmutableBiMap, valueDifference, streetViewPanoramaOrientation);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        hmlReviewDocumentActivity.get();
        return new convertStreamToString((RegularImmutableBiMap) hmlReviewDocumentActivity.get(), (MapDifference.ValueDifference) hmlReviewDocumentActivity.get(), (StreetViewPanoramaOrientation) hmlReviewDocumentActivity.get());
    }

    /* renamed from: o.RttiExtractor$RttiRequest */
    public final /* synthetic */ class RttiRequest implements Runnable {
        private final /* synthetic */ C5162qF.write MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ RttiRequest(C5162qF.write write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write;
        }

        public final void run() {
            C5162qF qFVar = C5162qF.this;
            RttiJsonExactionHelper rttiJsonExactionHelper = RttiJsonExactionHelper.write;
            if (qFVar.RatingCompat != null) {
                rttiJsonExactionHelper.IconCompatParcelizer(qFVar.RatingCompat);
            }
        }
    }
}
