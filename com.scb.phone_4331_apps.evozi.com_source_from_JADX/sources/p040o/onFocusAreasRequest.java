package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C4124by;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.onFocusAreasRequest */
public final /* synthetic */ class onFocusAreasRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4124by.C41275 IconCompatParcelizer;
    private final /* synthetic */ Boolean write;

    public /* synthetic */ onFocusAreasRequest(C4124by.C41275 r1, Boolean bool) {
        this.IconCompatParcelizer = r1;
        this.write = bool;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4124by.C41275 r0 = this.IconCompatParcelizer;
        getExtractFaceImage getextractfaceimage = (getExtractFaceImage) obj;
        if (this.write.booleanValue()) {
            getextractfaceimage.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            getextractfaceimage.write(C4124by.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) RetrofitException.MediaBrowserCompat$CustomActionResultReceiver((ILocationSourceDelegate) null), access$2300.write.JUST_DISMISS));
        }
    }
}
