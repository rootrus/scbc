package p040o;

import java.util.List;
import p040o.C10178z;

/* renamed from: o.z$10$MediaBrowserCompat$CustomActionResultReceiver */
class z$10$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<zzsf>> {
    final /* synthetic */ C10178z.C547010 read;

    private z$10$MediaBrowserCompat$CustomActionResultReceiver(C10178z.C547010 r1) {
        this.read = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        super.onNext(list);
        C10178z.C547010 r0 = this.read;
        C4882jw jwVar = new C4882jw(this, list);
        if (r0.RatingCompat != null) {
            jwVar.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        if (!this.read.MediaBrowserCompat$SearchResultReceiver(th)) {
            boolean z = true;
            if (this.read.RatingCompat != null) {
                C10178z.C547010 r5 = this.read;
                C4849jK jKVar = C4849jK.MediaBrowserCompat$CustomActionResultReceiver;
                if (r5.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    jKVar.IconCompatParcelizer(r5.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCarbonStrip$MediaBrowserCompat$CustomActionResultReceiver getcarbonstrip_mediabrowsercompat_customactionresultreceiver) {
        getcarbonstrip_mediabrowsercompat_customactionresultreceiver.write();
        getcarbonstrip_mediabrowsercompat_customactionresultreceiver.ay_();
    }

    public final void onComplete() {
        super.onComplete();
        C10178z.C547010 r0 = this.read;
        C4894ka kaVar = C4894ka.read;
        if (r0.RatingCompat != null) {
            kaVar.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}
