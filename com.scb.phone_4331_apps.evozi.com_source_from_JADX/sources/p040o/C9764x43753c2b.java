package p040o;

import p040o.zzbt;

/* renamed from: o.ImageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver */
public class C9764x43753c2b extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zzd.zza> {
    final /* synthetic */ ImageClassificationCompletedListener IconCompatParcelizer;

    private C9764x43753c2b(ImageClassificationCompletedListener imageClassificationCompletedListener) {
        this.IconCompatParcelizer = imageClassificationCompletedListener;
    }

    public /* synthetic */ C9764x43753c2b(ImageClassificationCompletedListener imageClassificationCompletedListener, byte b) {
        this(imageClassificationCompletedListener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        ImageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        ImageClassificationCompletedListener imageClassificationCompletedListener = this.IconCompatParcelizer;
        ABE_BarcodeEngine_GetVersion aBE_BarcodeEngine_GetVersion = new ABE_BarcodeEngine_GetVersion(this, (zzbt.zzd.zza) obj);
        if (imageClassificationCompletedListener.RatingCompat != null) {
            aBE_BarcodeEngine_GetVersion.IconCompatParcelizer(imageClassificationCompletedListener.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        ImageClassificationCompletedListener.IconCompatParcelizer(this.IconCompatParcelizer);
        ImageClassificationCompletedListener imageClassificationCompletedListener = this.IconCompatParcelizer;
        ABE_BarcodeEngine_Recognize aBE_BarcodeEngine_Recognize = new ABE_BarcodeEngine_Recognize(this, th);
        if (imageClassificationCompletedListener.RatingCompat != null) {
            aBE_BarcodeEngine_Recognize.IconCompatParcelizer(imageClassificationCompletedListener.RatingCompat);
        }
    }
}
