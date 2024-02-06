package p040o;

/* renamed from: o.getEventLogSize$MediaBrowserCompat$CustomActionResultReceiver */
public class getEventLogSize$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ getEventLogSize IconCompatParcelizer;

    public final void onComplete() {
    }

    private getEventLogSize$MediaBrowserCompat$CustomActionResultReceiver(getEventLogSize geteventlogsize) {
        this.IconCompatParcelizer = geteventlogsize;
    }

    public /* synthetic */ getEventLogSize$MediaBrowserCompat$CustomActionResultReceiver(getEventLogSize geteventlogsize, byte b) {
        this(geteventlogsize);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            getEventLogSize geteventlogsize = this.IconCompatParcelizer;
            if (geteventlogsize.RatingCompat != null) {
                geteventlogsize.RatingCompat.aj_();
            }
            getEventLogSize geteventlogsize2 = this.IconCompatParcelizer;
            writeRawBytes writerawbytes = writeRawBytes.MediaBrowserCompat$CustomActionResultReceiver;
            if (geteventlogsize2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writerawbytes.IconCompatParcelizer(geteventlogsize2.RatingCompat);
            }
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            getEventLogSize geteventlogsize = this.IconCompatParcelizer;
            if (geteventlogsize.RatingCompat != null) {
                geteventlogsize.RatingCompat.aj_();
            }
            getEventLogSize geteventlogsize2 = this.IconCompatParcelizer;
            writeRawBytes writerawbytes = writeRawBytes.MediaBrowserCompat$CustomActionResultReceiver;
            if (geteventlogsize2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writerawbytes.IconCompatParcelizer(geteventlogsize2.RatingCompat);
            }
        }
    }
}
