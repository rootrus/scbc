package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;
import p040o.nativeWriteTiffImageWithMetaData;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBitDepth */
public final /* synthetic */ class getBitDepth implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ nativeWriteTiffImageWithMetaData.write write;

    public /* synthetic */ getBitDepth(nativeWriteTiffImageWithMetaData.write write2, Throwable th) {
        this.write = write2;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteTiffImageWithMetaData.write write2 = this.write;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        FieldLocation fieldLocation = (FieldLocation) obj;
        fieldLocation.aj_();
        if (nativeWriteTiffImageWithMetaData.this.MediaBrowserCompat$CustomActionResultReceiver(th, true)) {
            return;
        }
        if (!(th instanceof RetrofitException) || !RetrofitException.read.REQUIRED_OTP.equals(((RetrofitException) th).write)) {
            fieldLocation.write(nativeWriteTiffImageWithMetaData.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        } else {
            fieldLocation.IconCompatParcelizer(write2.read.read, write2.read.MediaBrowserCompat$ItemReceiver);
        }
    }
}
