package p040o;

import p040o.CharMatcher;
import p040o.access$2300;
import p040o.injectRttiCheckDeserializer;

/* renamed from: o.unmuteAutoTorch */
public class unmuteAutoTorch extends writeUInt64NoTag<injectRttiCheckDeserializer.MediaMetadataCompat> {
    public int IconCompatParcelizer = 0;
    public ExpandableBehavior MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public getOrCreate read;
    public CharMatcher.C315813 write;

    @HmlPinActivity
    public unmuteAutoTorch(CharMatcher.C315813 r1, getOrCreate getorcreate, RegularImmutableBiMap regularImmutableBiMap, ExpandableBehavior expandableBehavior) {
        super(regularImmutableBiMap);
        this.write = r1;
        this.read = getorcreate;
        this.MediaBrowserCompat$ItemReceiver = expandableBehavior;
    }

    /* renamed from: o.unmuteAutoTorch$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
        public write() {
        }

        public final void onError(Throwable th) {
            super.onError(th);
            unmuteAutoTorch.MediaBrowserCompat$SearchResultReceiver(unmuteAutoTorch.this);
            unmuteAutoTorch.this.MediaBrowserCompat$ItemReceiver(unmuteAutoTorch.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            unmuteAutoTorch.IconCompatParcelizer(unmuteAutoTorch.this);
            unmuteAutoTorch unmuteautotorch = unmuteAutoTorch.this;
            isFlashSupported isflashsupported = isFlashSupported.MediaBrowserCompat$CustomActionResultReceiver;
            if (unmuteautotorch.RatingCompat != null) {
                isflashsupported.IconCompatParcelizer(unmuteautotorch.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(unmuteAutoTorch unmuteautotorch) {
        if (unmuteautotorch.RatingCompat != null) {
            unmuteautotorch.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(unmuteAutoTorch unmuteautotorch) {
        if (unmuteautotorch.RatingCompat != null) {
            unmuteautotorch.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(unmuteAutoTorch unmuteautotorch) {
        if (unmuteautotorch.RatingCompat != null) {
            unmuteautotorch.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(unmuteAutoTorch unmuteautotorch) {
        if (unmuteautotorch.RatingCompat != null) {
            unmuteautotorch.RatingCompat.aj_();
        }
    }

    static /* synthetic */ boolean IconCompatParcelizer(setFiles setfiles) {
        String str = setfiles.MediaMetadataCompat;
        return str == null || str.length() == 0;
    }
}
