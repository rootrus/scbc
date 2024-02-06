package p040o;

import p040o.access$2300;
import p040o.addBarCodeFoundEventListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.AutoFocusResultListener */
public final /* synthetic */ class AutoFocusResultListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ addBarCodeFoundEventListener.IconCompatParcelizer write;

    public /* synthetic */ AutoFocusResultListener(addBarCodeFoundEventListener.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.write = iconCompatParcelizer;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener.IconCompatParcelizer iconCompatParcelizer = this.write;
        Throwable th = this.IconCompatParcelizer;
        addBarCodeFoundEventListener addbarcodefoundeventlistener = addBarCodeFoundEventListener.this;
        addbarcodefoundeventlistener.MediaBrowserCompat$ItemReceiver(addbarcodefoundeventlistener.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
