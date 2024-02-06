package p040o;

import p040o.AppMeasurementSdk;
import p040o.Synchronized;
import p040o.access$2300;
import p040o.getCompressedFrontImageSize;

/* renamed from: o.fy */
public class C4442fy extends writeUInt64NoTag<getCompressedFrontImageSize.write> {
    public final AppMeasurementSdk.OnEventListener IconCompatParcelizer;
    public immediateCheckedFuture MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final callWithTimeout read;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedSet write;

    @HmlPinActivity
    public C4442fy(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener, callWithTimeout callwithtimeout, Synchronized.SynchronizedSet synchronizedSet) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = onEventListener;
        this.read = callwithtimeout;
        this.write = synchronizedSet;
    }

    /* renamed from: o.fy$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<animateCameraWithDurationAndCallback> {
        final Interner MediaBrowserCompat$CustomActionResultReceiver;
        final IGoogleMapDelegate MediaBrowserCompat$ItemReceiver;
        final String read;
        final animateCameraWithCallback write;

        public final /* synthetic */ void onNext(Object obj) {
            C4442fy fyVar = C4442fy.this;
            C9944ft ftVar = new C9944ft(this, (animateCameraWithDurationAndCallback) obj);
            if (fyVar.RatingCompat != null) {
                ftVar.IconCompatParcelizer(fyVar.RatingCompat);
            }
        }

        public write(animateCameraWithCallback animatecamerawithcallback, Interner interner, String str, IGoogleMapDelegate iGoogleMapDelegate) {
            this.write = animatecamerawithcallback;
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = iGoogleMapDelegate;
            this.MediaBrowserCompat$CustomActionResultReceiver = interner;
        }

        public final void onError(Throwable th) {
            C4442fy.this.MediaBrowserCompat$ItemReceiver(C4442fy.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
