package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setDismissalTime */
public final /* synthetic */ class setDismissalTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setDismissalTime(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaCheckExtractor_Factory) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
