package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.assertFullConsumption */
public final /* synthetic */ class assertFullConsumption implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isEagerInDefaultApp MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ assertFullConsumption(isEagerInDefaultApp iseagerindefaultapp) {
        this.MediaBrowserCompat$ItemReceiver = iseagerindefaultapp;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getEyes) obj).read(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.read());
    }
}
