package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.MarshalByte */
public final /* synthetic */ class MarshalByte implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doBackgroundInitializationAsync MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ MarshalByte(doBackgroundInitializationAsync dobackgroundinitializationasync, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dobackgroundinitializationasync;
        this.write = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj);
    }
}
