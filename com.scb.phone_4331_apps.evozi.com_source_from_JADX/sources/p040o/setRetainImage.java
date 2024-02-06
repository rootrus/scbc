package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setRetainImage */
public final /* synthetic */ class setRetainImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ LevelnessEvent write;

    public /* synthetic */ setRetainImage(LevelnessEvent levelnessEvent, boolean z) {
        this.write = levelnessEvent;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportParameters_MembersInjector) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, 0);
    }
}
