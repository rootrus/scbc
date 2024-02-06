package p040o;

import p040o.access$2300;

/* renamed from: o.setTorchDelay$MediaBrowserCompat$ItemReceiver */
public class setTorchDelay$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
    private /* synthetic */ setTorchDelay read;

    public setTorchDelay$MediaBrowserCompat$ItemReceiver(setTorchDelay settorchdelay) {
        this.read = settorchdelay;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzuk zzuk = (zzuk) obj;
        setTorchDelay.IconCompatParcelizer(this.read);
        if (zzuk != null) {
            setTorchDelay settorchdelay = this.read;
            setCameraType setcameratype = setCameraType.read;
            if (settorchdelay.RatingCompat != null) {
                setcameratype.IconCompatParcelizer(settorchdelay.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        setTorchDelay.MediaBrowserCompat$ItemReceiver(this.read);
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
