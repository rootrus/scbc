package p040o;

import p040o.GoogleMap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nA$MediaBrowserCompat$ItemReceiver */
public final class nA$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMarkerDragListener> {
    private /* synthetic */ C4995nA IconCompatParcelizer;

    /* renamed from: o.nA$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceRightPadding> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setFaceRightPadding) obj).write();
        }
    }

    public nA$MediaBrowserCompat$ItemReceiver(C4995nA nAVar) {
        this.IconCompatParcelizer = nAVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        GoogleMap.OnMarkerDragListener onMarkerDragListener = (GoogleMap.OnMarkerDragListener) obj;
        onGetStartedClick.write((Object) onMarkerDragListener, "userProfile");
        super.onNext(onMarkerDragListener);
        C4995nA.write(this.IconCompatParcelizer);
        boolean z = true;
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(true)) {
            C4995nA nAVar = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4996x211bf9cb.MediaBrowserCompat$ItemReceiver;
            if (nAVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(nAVar.RatingCompat);
                return;
            }
            return;
        }
        C4995nA nAVar2 = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.write;
        if (nAVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(nAVar2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
