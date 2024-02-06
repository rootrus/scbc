package p040o;

import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.getSessionAppSize$MediaBrowserCompat$ItemReceiver */
public final class getSessionAppSize$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<GoogleMap.OnInfoWindowClickListener>> {
    private /* synthetic */ getSessionAppSize MediaBrowserCompat$CustomActionResultReceiver;

    public final void onError(Throwable th) {
    }

    private getSessionAppSize$MediaBrowserCompat$ItemReceiver(getSessionAppSize getsessionappsize) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getsessionappsize;
    }

    public /* synthetic */ getSessionAppSize$MediaBrowserCompat$ItemReceiver(getSessionAppSize getsessionappsize, byte b) {
        this(getsessionappsize);
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
            getSessionAppSize getsessionappsize = this.MediaBrowserCompat$CustomActionResultReceiver;
            oldestEventFileFirst oldesteventfilefirst = oldestEventFileFirst.write;
            if (getsessionappsize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                oldesteventfilefirst.IconCompatParcelizer(getsessionappsize.RatingCompat);
            }
        }
    }
}
