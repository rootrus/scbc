package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C4128bz;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getWeight */
public final /* synthetic */ class getWeight implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4128bz.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getWeight(C4128bz.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4128bz.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        getFrontImage getfrontimage = (getFrontImage) obj;
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (!(retrofitException.write != RetrofitException.read.API_ERROR || retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null)) {
                String str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                if ("3014".equals(str)) {
                    getfrontimage.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                } else if ("9101".equals(str)) {
                    getfrontimage.write();
                    return;
                } else if ("9102".equals(str)) {
                    getfrontimage.read();
                    return;
                }
            }
        }
        getfrontimage.write(C4128bz.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
