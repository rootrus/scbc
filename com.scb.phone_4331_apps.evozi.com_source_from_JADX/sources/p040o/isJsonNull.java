package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isJsonNull */
public final /* synthetic */ class isJsonNull implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getArrayComponentType MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ intoSetBuilder read;

    public /* synthetic */ isJsonNull(getArrayComponentType getarraycomponenttype, intoSetBuilder intosetbuilder) {
        this.MediaBrowserCompat$ItemReceiver = getarraycomponenttype;
        this.read = intosetbuilder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule) obj).IconCompatParcelizer(getArrayComponentType.read(this.read.MediaSessionCompat$Token));
    }
}
