package p040o;

import p040o.access$2300;

/* renamed from: o.kb$MediaBrowserCompat$CustomActionResultReceiver */
public final class kb$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setTiltGesturesEnabled> {
    private final parseEventSignal MediaBrowserCompat$CustomActionResultReceiver;
    final /* synthetic */ C4895kb read;

    public final /* synthetic */ void onNext(Object obj) {
        setTiltGesturesEnabled settiltgesturesenabled = (setTiltGesturesEnabled) obj;
        C4895kb kbVar = this.read;
        C4848jF jFVar = C4848jF.write;
        boolean z = true;
        if (kbVar.RatingCompat != null) {
            jFVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
        SignedBytes unused = this.read.PlaybackStateCompat;
        notifyFailed unused2 = this.read.ParcelableVolumeInfo;
        setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver2 = SignedBytes.MediaBrowserCompat$CustomActionResultReceiver(notifyFailed.read(settiltgesturesenabled), this.MediaBrowserCompat$CustomActionResultReceiver, this.read.MediaMetadataCompat.IconCompatParcelizer());
        C4895kb kbVar2 = this.read;
        C10029jy jyVar = new C10029jy(this, MediaBrowserCompat$CustomActionResultReceiver2);
        if (kbVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            jyVar.IconCompatParcelizer(kbVar2.RatingCompat);
        }
    }

    public kb$MediaBrowserCompat$CustomActionResultReceiver(C4895kb kbVar, parseEventSignal parseeventsignal) {
        this.read = kbVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = parseeventsignal;
    }

    public final void onComplete() {
        C4895kb kbVar = this.read;
        C4848jF jFVar = C4848jF.write;
        if (kbVar.RatingCompat != null) {
            jFVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        C4895kb kbVar = this.read;
        kbVar.MediaBrowserCompat$ItemReceiver(kbVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
