package p040o;

import p040o.CrashlyticsReport;
import p040o.access$2300;

/* renamed from: o.kb$MediaBrowserCompat$ItemReceiver */
final class kb$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getPanningGesturesEnabled> {
    final /* synthetic */ C4895kb read;

    private kb$MediaBrowserCompat$ItemReceiver(C4895kb kbVar) {
        this.read = kbVar;
    }

    /* synthetic */ kb$MediaBrowserCompat$ItemReceiver(C4895kb kbVar, byte b) {
        this(kbVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        CrashlyticsReport.Session.Application.Builder IconCompatParcelizer = this.read.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver((getPanningGesturesEnabled) obj);
        C4895kb.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        this.read.read.MediaBrowserCompat$MediaItem = IconCompatParcelizer.read;
        boolean z = true;
        if (this.read.RatingCompat != null) {
            C4895kb kbVar = this.read;
            C4883jx jxVar = new C4883jx(this);
            if (kbVar.RatingCompat != null) {
                jxVar.IconCompatParcelizer(kbVar.RatingCompat);
            }
            C4895kb kbVar2 = this.read;
            C4843jA jAVar = new C4843jA(this);
            if (kbVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jAVar.IconCompatParcelizer(kbVar2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.read.RatingCompat != null) {
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }
}
