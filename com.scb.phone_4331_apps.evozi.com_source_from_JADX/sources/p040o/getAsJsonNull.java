package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAsJsonNull */
public final /* synthetic */ class getAsJsonNull implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isEagerInDefaultApp read;
    private final /* synthetic */ checkNotPrimitive write;

    public /* synthetic */ getAsJsonNull(checkNotPrimitive checknotprimitive, isEagerInDefaultApp iseagerindefaultapp) {
        this.write = checknotprimitive;
        this.read = iseagerindefaultapp;
    }

    public final void IconCompatParcelizer(Object obj) {
        isEagerInDefaultApp iseagerindefaultapp = this.read;
        isOcrRead isocrread = (isOcrRead) obj;
        isocrread.MediaBrowserCompat$SearchResultReceiver();
        isocrread.read();
        isocrread.MediaBrowserCompat$CustomActionResultReceiver();
        if (checkNotPrimitive.MediaBrowserCompat$CustomActionResultReceiver(iseagerindefaultapp)) {
            isocrread.IconCompatParcelizer();
        } else {
            isocrread.write();
        }
    }
}
