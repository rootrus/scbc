package p040o;

import p040o.access$2300;

/* renamed from: o.setPosX$MediaBrowserCompat$ItemReceiver */
public class setPosX$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getPhoto> {
    final /* synthetic */ setPosX write;

    private setPosX$MediaBrowserCompat$ItemReceiver(setPosX setposx) {
        this.write = setposx;
    }

    public /* synthetic */ setPosX$MediaBrowserCompat$ItemReceiver(setPosX setposx, byte b) {
        this(setposx);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getPhoto getphoto = (getPhoto) obj;
        super.onNext(getphoto);
        setPosX setposx = this.write;
        setRollThreshold setrollthreshold = new setRollThreshold(this, getphoto);
        if (setposx.RatingCompat != null) {
            setrollthreshold.IconCompatParcelizer(setposx.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
