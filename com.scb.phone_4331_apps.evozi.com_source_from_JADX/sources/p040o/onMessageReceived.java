package p040o;

import p040o.FirebaseApp;
import p040o.writeUInt64NoTag;

/* renamed from: o.onMessageReceived */
public final /* synthetic */ class onMessageReceived implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FirebaseApp.GlobalBackgroundStateListener write;

    public /* synthetic */ onMessageReceived(FirebaseApp.GlobalBackgroundStateListener globalBackgroundStateListener) {
        this.write = globalBackgroundStateListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setResultDeserializer) obj).MediaBrowserCompat$ItemReceiver(this.write.read, this.write.IconCompatParcelizer);
    }
}
