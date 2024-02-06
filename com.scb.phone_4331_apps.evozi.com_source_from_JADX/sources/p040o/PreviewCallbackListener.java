package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.PreviewCallbackListener */
public final /* synthetic */ class PreviewCallbackListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ PreviewCallbackListener(getPosX getposx) {
        this.MediaBrowserCompat$ItemReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonPassport) obj).write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}
