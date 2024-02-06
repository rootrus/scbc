package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getRotationLandscape */
public final /* synthetic */ class getRotationLandscape implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getRotationLandscape(getPosX getposx) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonPassport) obj).MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }
}
