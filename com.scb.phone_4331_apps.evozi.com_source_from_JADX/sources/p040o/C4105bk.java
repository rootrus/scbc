package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C4128bz;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.bk */
public final /* synthetic */ class C4105bk implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4128bz.IconCompatParcelizer IconCompatParcelizer;
    private final /* synthetic */ Boolean write;

    public /* synthetic */ C4105bk(C4128bz.IconCompatParcelizer iconCompatParcelizer, Boolean bool) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.write = bool;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4128bz.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        getFrontImage getfrontimage = (getFrontImage) obj;
        if (this.write.booleanValue()) {
            getfrontimage.MediaBrowserCompat$CustomActionResultReceiver(C4128bz.this.MediaDescriptionCompat);
        } else {
            getfrontimage.write(C4128bz.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) RetrofitException.MediaBrowserCompat$CustomActionResultReceiver((ILocationSourceDelegate) null), access$2300.write.JUST_DISMISS));
        }
    }
}
