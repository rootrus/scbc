package p040o;

import java.util.List;
import p040o.ImageProcessor;
import p040o.zzby;

/* renamed from: o.ImageProcessor$ImageOutListener$MediaBrowserCompat$CustomActionResultReceiver */
class C3488xb230e6e1 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzby.zzc.zza> {
    final /* synthetic */ ImageProcessor.ImageOutListener IconCompatParcelizer;

    private C3488xb230e6e1(ImageProcessor.ImageOutListener imageOutListener) {
        this.IconCompatParcelizer = imageOutListener;
    }

    /* synthetic */ C3488xb230e6e1(ImageProcessor.ImageOutListener imageOutListener, byte b) {
        this(imageOutListener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzby.zzc.zza zza = (zzby.zzc.zza) obj;
        super.onNext(zza);
        ImageProcessor.ImageOutListener.write(this.IconCompatParcelizer);
        zzby.zzc.zza unused = this.IconCompatParcelizer.write = zza;
        zzby.zzc.zza unused2 = this.IconCompatParcelizer.write;
        List list = null;
        boolean z = true;
        if (list.isEmpty()) {
            ImageProcessor.ImageOutListener imageOutListener = this.IconCompatParcelizer;
            setProcessedImageMimeType setprocessedimagemimetype = setProcessedImageMimeType.write;
            if (imageOutListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setprocessedimagemimetype.IconCompatParcelizer(imageOutListener.RatingCompat);
                return;
            }
            return;
        }
        ImageProcessor.ImageOutListener imageOutListener2 = this.IconCompatParcelizer;
        getImagePerfectionProfile getimageperfectionprofile = new getImagePerfectionProfile(this);
        if (imageOutListener2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getimageperfectionprofile.IconCompatParcelizer(imageOutListener2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new addProcessProgressEventListener(this)));
    }
}
