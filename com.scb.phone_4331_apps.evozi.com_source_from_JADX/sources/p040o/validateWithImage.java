package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.access$2300;
import p040o.zzmd;

/* renamed from: o.validateWithImage */
public class validateWithImage extends writeUInt64NoTag<CheckCaptureModule_GetLookAndFeelParametersFactory.write> {
    public immediateCheckedFuture IconCompatParcelizer;
    public List<immediateCheckedFuture> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final unmodifiableSortedSetMultimap MediaDescriptionCompat;
    public final withPhenotypePrefix MediaMetadataCompat;
    public final icon read;
    public List<String> write = new ArrayList();

    @HmlPinActivity
    public validateWithImage(RegularImmutableBiMap regularImmutableBiMap, icon icon, withPhenotypePrefix withphenotypeprefix, unmodifiableSortedSetMultimap unmodifiablesortedsetmultimap) {
        super(regularImmutableBiMap);
        this.read = icon;
        this.MediaMetadataCompat = withphenotypeprefix;
        this.MediaDescriptionCompat = unmodifiablesortedsetmultimap;
    }

    public void onDestroy() {
        super.onDestroy();
        withPhenotypePrefix withphenotypeprefix = this.MediaMetadataCompat;
        if (!withphenotypeprefix.MediaBrowserCompat$MediaItem.isDisposed()) {
            withphenotypeprefix.MediaBrowserCompat$MediaItem.dispose();
        }
        icon icon = this.read;
        if (!icon.MediaBrowserCompat$MediaItem.isDisposed()) {
            icon.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.validateWithImage$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isInfoWindowShown> {
        private read() {
        }

        public /* synthetic */ read(validateWithImage validatewithimage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            isInfoWindowShown isinfowindowshown = (isInfoWindowShown) obj;
            boolean z = true;
            if (isinfowindowshown.write == null || isinfowindowshown.MediaBrowserCompat$CustomActionResultReceiver == null) {
                validateWithImage validatewithimage = validateWithImage.this;
                ConsecutiveFramesClassified consecutiveFramesClassified = ConsecutiveFramesClassified.MediaBrowserCompat$CustomActionResultReceiver;
                if (validatewithimage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    consecutiveFramesClassified.IconCompatParcelizer(validatewithimage.RatingCompat);
                }
            } else {
                validateWithImage validatewithimage2 = validateWithImage.this;
                ConsecutiveFramesStable consecutiveFramesStable = new ConsecutiveFramesStable(this, isinfowindowshown);
                if (validatewithimage2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    consecutiveFramesStable.IconCompatParcelizer(validatewithimage2.RatingCompat);
                }
            }
            validateWithImage.write(validateWithImage.this);
        }

        public final void onError(Throwable th) {
            validateWithImage.this.MediaBrowserCompat$ItemReceiver(validateWithImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void write(zzmd.zzm.zzb.zza zza, CheckCaptureModule_GetLookAndFeelParametersFactory.write write2) {
        write2.write(zzmd.zzm.zzb.zza.JURISTIC == zza ? Iterables$3$MediaBrowserCompat$MediaItem.account_summary_my_business : Iterables$3$MediaBrowserCompat$MediaItem.account_summary_my_deposits);
    }

    static /* synthetic */ void write(validateWithImage validatewithimage) {
        if (validatewithimage.RatingCompat != null) {
            validatewithimage.RatingCompat.aj_();
        }
    }
}
