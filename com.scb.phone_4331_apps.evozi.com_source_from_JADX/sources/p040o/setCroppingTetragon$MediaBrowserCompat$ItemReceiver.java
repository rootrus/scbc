package p040o;

import p040o.access$2300;
import p040o.zzfo;

/* renamed from: o.setCroppingTetragon$MediaBrowserCompat$ItemReceiver */
class setCroppingTetragon$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfo.zzf> {
    final boolean MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ setCroppingTetragon write;

    public final /* synthetic */ void onNext(Object obj) {
        zzfo.zzf zzf = (zzfo.zzf) obj;
        setCroppingTetragon.read(this.write);
        boolean z = true;
        if (zzf.write) {
            setCroppingTetragon setcroppingtetragon = this.write;
            getInputDocLongEdge getinputdoclongedge = new getInputDocLongEdge(this, zzf);
            if (setcroppingtetragon.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getinputdoclongedge.IconCompatParcelizer(setcroppingtetragon.RatingCompat);
                return;
            }
            return;
        }
        setCroppingTetragon setcroppingtetragon2 = this.write;
        getDoDeskew getdodeskew = new getDoDeskew(this, zzf);
        if (setcroppingtetragon2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getdodeskew.IconCompatParcelizer(setcroppingtetragon2.RatingCompat);
        }
    }

    setCroppingTetragon$MediaBrowserCompat$ItemReceiver(setCroppingTetragon setcroppingtetragon, boolean z) {
        this.write = setcroppingtetragon;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
