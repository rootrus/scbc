package p040o;

import java.text.MessageFormat;
import p040o.C10178z;
import p040o.C9854aj;

/* renamed from: o.extractData */
public class extractData extends C4353eU<getBarcodes> {
    public final synchronizedSupplier IconCompatParcelizer;
    public final propagateIfPossible MediaBrowserCompat$ItemReceiver;
    private final getRootCause MediaSessionCompat$QueueItem;
    public final Throwables read;
    public final ChequeInquiryDeepLinkActivity write = new ChequeInquiryDeepLinkActivity();

    @HmlPinActivity
    public extractData(RegularImmutableBiMap regularImmutableBiMap, TaskCompletionSource$MediaBrowserCompat$ItemReceiver taskCompletionSource$MediaBrowserCompat$ItemReceiver, initDetectorJni initdetectorjni, trackSingleFaceJni tracksinglefacejni, finalizeDetectorJni finalizedetectorjni, NativeFaceDetectorV2Creator nativeFaceDetectorV2Creator, propagateIfPossible propagateifpossible, Throwables throwables, getRootCause getrootcause, synchronizedSupplier synchronizedsupplier) {
        super(regularImmutableBiMap, taskCompletionSource$MediaBrowserCompat$ItemReceiver, initdetectorjni, tracksinglefacejni, finalizedetectorjni, nativeFaceDetectorV2Creator);
        this.MediaBrowserCompat$ItemReceiver = propagateifpossible;
        this.read = throwables;
        this.MediaSessionCompat$QueueItem = getrootcause;
        this.IconCompatParcelizer = synchronizedsupplier;
    }

    public void onDestroy() {
        this.write.dispose();
        super.onDestroy();
    }

    static /* synthetic */ void write(extractData extractdata) {
        if (extractdata.RatingCompat != null) {
            extractdata.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(extractData extractdata, onMarkerDragEnd onmarkerdragend, String str) {
        boolean z = false;
        extractdata.MediaSessionCompat$QueueItem.write.IconCompatParcelizer(false);
        extractdata.IconCompatParcelizer.IconCompatParcelizer.write();
        if (!onmarkerdragend.IconCompatParcelizer.booleanValue()) {
            C9854aj.C9855a aVar = new C9854aj.C9855a(onmarkerdragend);
            if (extractdata.RatingCompat != null) {
                z = true;
            }
            if (z) {
                aVar.IconCompatParcelizer(extractdata.RatingCompat);
            }
        } else if (onmarkerdragend.read) {
            C10178z.C1018523 r4 = C10178z.C1018523.IconCompatParcelizer;
            if (extractdata.RatingCompat != null) {
                z = true;
            }
            if (z) {
                r4.IconCompatParcelizer(extractdata.RatingCompat);
            }
        } else {
            extractInBackground extractinbackground = new extractInBackground(MessageFormat.format("FastEasyRegisteration_{0}", new Object[]{str.toUpperCase()}));
            if (extractdata.RatingCompat != null) {
                z = true;
            }
            if (z) {
                extractinbackground.IconCompatParcelizer(extractdata.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(extractData extractdata, onMarkerDragEnd onmarkerdragend) {
        boolean z = true;
        extractdata.MediaSessionCompat$QueueItem.write.IconCompatParcelizer(true);
        if (!onmarkerdragend.IconCompatParcelizer.booleanValue()) {
            C10059mr mrVar = new C10059mr(onmarkerdragend);
            if (extractdata.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mrVar.IconCompatParcelizer(extractdata.RatingCompat);
                return;
            }
            return;
        }
        C10178z.C1018014 r4 = C10178z.C1018014.read;
        if (extractdata.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r4.IconCompatParcelizer(extractdata.RatingCompat);
        }
    }

    static /* synthetic */ void read(extractData extractdata) {
        if (extractdata.RatingCompat != null) {
            extractdata.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(extractData extractdata) {
        if (extractdata.RatingCompat != null) {
            extractdata.RatingCompat.aj_();
        }
    }
}
