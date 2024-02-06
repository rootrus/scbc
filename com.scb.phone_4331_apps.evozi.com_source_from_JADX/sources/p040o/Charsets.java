package p040o;

import p040o.CharMatcher;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.Charsets */
public final class Charsets extends IndoorBuilding {
    public final OnDeviceIdExtractor.C6966a.C69693 MediaBrowserCompat$CustomActionResultReceiver;
    public final CharMatcher.LookupTable MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Charsets(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a.C69693 r4, CharMatcher.LookupTable lookupTable) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) r4, "mwRepository");
        onGetStartedClick.write((Object) lookupTable, "merchantWalletCase");
        this.MediaBrowserCompat$CustomActionResultReceiver = r4;
        this.MediaBrowserCompat$ItemReceiver = lookupTable;
    }

    /* renamed from: o.Charsets$read */
    public static final class read implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ EnumBiMap IconCompatParcelizer;

        private read() {
        }

        public /* synthetic */ read(EnumBiMap enumBiMap) {
            this.IconCompatParcelizer = enumBiMap;
        }

        public final boolean write(Object obj) {
            return !this.IconCompatParcelizer.write.equals(((MergePaths) obj).MediaSessionCompat$ResultReceiverWrapper);
        }
    }
}
