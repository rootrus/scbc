package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C4128bz;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.bj */
public final /* synthetic */ class C4104bj implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Boolean IconCompatParcelizer;
    private final /* synthetic */ C4128bz.C41291 read;

    public /* synthetic */ C4104bj(C4128bz.C41291 r1, Boolean bool) {
        this.read = r1;
        this.IconCompatParcelizer = bool;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4128bz.C41291 r0 = this.read;
        getFrontImage getfrontimage = (getFrontImage) obj;
        if (this.IconCompatParcelizer.booleanValue()) {
            getfrontimage.IconCompatParcelizer();
        } else {
            getfrontimage.write(C4128bz.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) RetrofitException.MediaBrowserCompat$CustomActionResultReceiver((ILocationSourceDelegate) null), access$2300.write.NAVIGATE_BACK));
        }
    }
}
