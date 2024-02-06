package p040o;

import p040o.C10827Iterators;
import p040o.IdWorkflowActivity;

/* renamed from: o.XVrsPhaseDetector */
public final class XVrsPhaseDetector extends writeUInt64NoTag<IdWorkflowActivity.read> {
    /* access modifiers changed from: private */
    public final C10827Iterators.C35434 IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final lessThanUnsigned MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public XVrsPhaseDetector(C10827Iterators.C35434 r2, lessThanUnsigned lessthanunsigned, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "controller");
        onGetStartedClick.write((Object) lessthanunsigned, "billPaymentBillerDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = r2;
        this.MediaBrowserCompat$ItemReceiver = lessthanunsigned;
    }

    /* renamed from: o.XVrsPhaseDetector$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ onStopCallOnce MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        public /* synthetic */ write(onStopCallOnce onstopcallonce) {
            this.MediaBrowserCompat$ItemReceiver = onstopcallonce;
        }

        public final Object IconCompatParcelizer(Object obj) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageType = (ImageHeaderParser$ImageType) obj;
            if (imageHeaderParser$ImageType == null) {
                return null;
            }
            int i = imageHeaderParser$ImageType.read;
            String str = imageHeaderParser$ImageType.write;
            setOnPageChangeListener setonpagechangelistener = imageHeaderParser$ImageType.MediaBrowserCompat$CustomActionResultReceiver;
            return new zzur(i, str, new zzrm(setonpagechangelistener.MediaBrowserCompat$ItemReceiver(), setonpagechangelistener.write(), setonpagechangelistener.IconCompatParcelizer(), setonpagechangelistener.read()), imageHeaderParser$ImageType.MediaDescriptionCompat, imageHeaderParser$ImageType.IconCompatParcelizer, imageHeaderParser$ImageType.MediaBrowserCompat$SearchResultReceiver, imageHeaderParser$ImageType.MediaBrowserCompat$ItemReceiver, imageHeaderParser$ImageType.MediaMetadataCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(XVrsPhaseDetector xVrsPhaseDetector) {
        if (xVrsPhaseDetector.RatingCompat != null) {
            xVrsPhaseDetector.RatingCompat.ay_();
        }
    }

    public final void write() {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        C10827Iterators.C35434 r0 = this.IconCompatParcelizer;
        FundFactSheetActivity xVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver = new XVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver(this);
        FundFactSheetActivity xVrsPhaseDetector$MediaBrowserCompat$ItemReceiver = new XVrsPhaseDetector$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) xVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver, "onSuccess");
        onGetStartedClick.write((Object) xVrsPhaseDetector$MediaBrowserCompat$ItemReceiver, "onError");
        r0.IconCompatParcelizer(r0.read, xVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver, xVrsPhaseDetector$MediaBrowserCompat$ItemReceiver, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver());
    }
}
