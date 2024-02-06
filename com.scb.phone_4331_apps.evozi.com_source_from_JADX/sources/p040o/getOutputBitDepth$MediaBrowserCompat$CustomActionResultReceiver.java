package p040o;

import p040o.zzbt;

/* renamed from: o.getOutputBitDepth$MediaBrowserCompat$CustomActionResultReceiver */
public class getOutputBitDepth$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zzf.zza> {
    private final getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ getOutputBitDepth write;

    public final /* synthetic */ void onNext(Object obj) {
        zzbt.zzf.zza zza = (zzbt.zzf.zza) obj;
        getOutputBitDepth getoutputbitdepth = this.write;
        boolean z = true;
        if (getoutputbitdepth.RatingCompat != null) {
            getoutputbitdepth.RatingCompat.aj_();
        }
        getOutputBitDepth getoutputbitdepth2 = this.write;
        setDirection setdirection = new setDirection(getoutputbitdepth2, this.MediaBrowserCompat$CustomActionResultReceiver, getoutputbitdepth2.write.IconCompatParcelizer(zza));
        if (getoutputbitdepth2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setdirection.IconCompatParcelizer(getoutputbitdepth2.RatingCompat);
        }
    }

    getOutputBitDepth$MediaBrowserCompat$CustomActionResultReceiver(getOutputBitDepth getoutputbitdepth, getLegacySharedPrefs getlegacysharedprefs) {
        this.write = getoutputbitdepth;
        this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
    }

    public final void onError(Throwable th) {
        this.write.MediaDescriptionCompat(th);
    }
}
