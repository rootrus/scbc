package p040o;

import p040o.nativeConfigure;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsValid */
public final /* synthetic */ class nativeIsValid implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigure.C50291 IconCompatParcelizer;
    private final /* synthetic */ setStrokePattern MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeIsValid(nativeConfigure.C50291 r1, setStrokePattern setstrokepattern) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$ItemReceiver = setstrokepattern;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure.C50291 r0 = this.IconCompatParcelizer;
        setStrokePattern setstrokepattern = this.MediaBrowserCompat$ItemReceiver;
        onSuccessTask read = nativeConfigure.this.MediaMetadataCompat;
        read.write.write(nativeConfigure.this.MediaDescriptionCompat);
        ((IdCaptureModule_GetIParametersFactory) obj).read(setstrokepattern.MediaDescriptionCompat, setstrokepattern.MediaBrowserCompat$SearchResultReceiver);
    }
}
