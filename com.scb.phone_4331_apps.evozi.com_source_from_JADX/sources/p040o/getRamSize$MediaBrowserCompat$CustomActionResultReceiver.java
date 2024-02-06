package p040o;

import p040o.access$2300;

/* renamed from: o.getRamSize$MediaBrowserCompat$CustomActionResultReceiver */
public final class getRamSize$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ getRamSize write;

    private getRamSize$MediaBrowserCompat$CustomActionResultReceiver(getRamSize getramsize) {
        this.write = getramsize;
    }

    public /* synthetic */ getRamSize$MediaBrowserCompat$CustomActionResultReceiver(getRamSize getramsize, byte b) {
        this(getramsize);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
            getRamSize getramsize = this.write;
            genNextNewObject gennextnewobject = new genNextNewObject(this, th);
            if (getramsize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gennextnewobject.IconCompatParcelizer(getramsize.RatingCompat);
            }
        } else if (writeUInt64NoTag.read(th)) {
            getRamSize getramsize2 = this.write;
            getramsize2.MediaBrowserCompat$ItemReceiver(getramsize2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        } else if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            String str = this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer;
            if (str != null) {
                getRamSize getramsize3 = this.write;
                C9845aK aKVar = new C9845aK(str);
                if (getramsize3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    aKVar.IconCompatParcelizer(getramsize3.RatingCompat);
                }
            }
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = true;
        if (this.write.RatingCompat != null) {
            getRamSize getramsize = this.write;
            fireExportStatusEvent fireexportstatusevent = fireExportStatusEvent.write;
            if (getramsize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                fireexportstatusevent.IconCompatParcelizer(getramsize.RatingCompat);
            }
        }
    }
}
