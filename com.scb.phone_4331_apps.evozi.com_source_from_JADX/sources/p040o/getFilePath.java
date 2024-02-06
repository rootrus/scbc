package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getFilePath */
public final /* synthetic */ class getFilePath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ensureBackgroundStateListenerRegistered MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getFilePath(ensureBackgroundStateListenerRegistered ensurebackgroundstatelistenerregistered) {
        this.MediaBrowserCompat$ItemReceiver = ensurebackgroundstatelistenerregistered;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setResultDeserializer) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
