package p040o;

import p040o.setDomain;
import p040o.zzcz;

/* renamed from: o.setDomain$MediaBrowserCompat$CustomActionResultReceiver */
public class setDomain$MediaBrowserCompat$CustomActionResultReceiver extends setDomain.write {
    private /* synthetic */ setDomain MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private setDomain$MediaBrowserCompat$CustomActionResultReceiver(setDomain setdomain) {
        super();
        this.MediaBrowserCompat$ItemReceiver = setdomain;
    }

    public /* synthetic */ setDomain$MediaBrowserCompat$CustomActionResultReceiver(setDomain setdomain, byte b) {
        this(setdomain);
    }

    public final /* synthetic */ void onNext(Object obj) {
        onNext((zzcz.zzg) obj);
    }

    public final void write(zzcz.zzg zzg) {
        super.onNext(zzg);
        setDomain setdomain = this.MediaBrowserCompat$ItemReceiver;
        OcrRegion ocrRegion = OcrRegion.IconCompatParcelizer;
        if (setdomain.RatingCompat != null) {
            ocrRegion.IconCompatParcelizer(setdomain.RatingCompat);
        }
    }
}
