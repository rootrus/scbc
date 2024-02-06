package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.createScaledBitmapFromBitmapWithMatrix */
public final /* synthetic */ class createScaledBitmapFromBitmapWithMatrix implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ createScaledBitmapFromBitmapWithMatrix(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain.write(this.MediaBrowserCompat$CustomActionResultReceiver, (ExtractionParameters_Factory) obj);
    }
}
