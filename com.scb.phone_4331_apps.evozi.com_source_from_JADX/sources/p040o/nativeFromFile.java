package p040o;

import p040o.adornBoundary;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeFromFile */
public final /* synthetic */ class nativeFromFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ adornBoundary.read read;

    public /* synthetic */ nativeFromFile(adornBoundary.read read2) {
        this.read = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        adornBoundary.read read2 = this.read;
        ((CheckCaptureModule_GetUriKtaFactory) obj).write(new CrashlyticsNativeComponent(adornBoundary.this.MediaMetadataCompat, getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(adornBoundary.this.IconCompatParcelizer.setPopupCallback, true), adornBoundary.this.MediaDescriptionCompat, adornBoundary.this.read, read2.MediaBrowserCompat$ItemReceiver));
    }
}
