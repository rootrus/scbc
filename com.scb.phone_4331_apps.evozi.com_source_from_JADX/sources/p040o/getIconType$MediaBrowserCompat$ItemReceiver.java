package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIconType$MediaBrowserCompat$ItemReceiver */
public final class getIconType$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ getIconType MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getIconType$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontImage> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFrontImage getfrontimage = (getFrontImage) obj;
            getfrontimage.IconCompatParcelizer();
            getfrontimage.read(true);
        }
    }

    getIconType$MediaBrowserCompat$ItemReceiver(getIconType geticontype) {
        this.MediaBrowserCompat$ItemReceiver = geticontype;
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        getIconType.read(this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = Boolean.TRUE;
    }

    public final void onComplete() {
        super.onComplete();
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = Boolean.TRUE;
        getIconType.read(this.MediaBrowserCompat$ItemReceiver);
        getIconType geticontype = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (geticontype.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(geticontype.RatingCompat);
        }
    }
}
