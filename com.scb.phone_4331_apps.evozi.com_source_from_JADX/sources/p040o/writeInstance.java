package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeInstance */
public final /* synthetic */ class writeInstance implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C9853xbd733978 IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ writeInstance(C9853xbd733978 addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.IconCompatParcelizer = addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C9853xbd733978 addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        Throwable th = this.read;
        addBarCodeFoundEventListener addbarcodefoundeventlistener = addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver.write;
        addbarcodefoundeventlistener.MediaBrowserCompat$ItemReceiver(addbarcodefoundeventlistener.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
