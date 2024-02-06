package p040o;

import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.sO */
public final /* synthetic */ class C10139sO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Signal MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ sF$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ C10139sO(sF$MediaBrowserCompat$ItemReceiver sf_mediabrowsercompat_itemreceiver, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, String str) {
        this.read = sf_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = signal;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper gettopleftcornerwidth_mediasessioncompat_resultreceiverwrapper = (getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper) obj;
        gettopleftcornerwidth_mediasessioncompat_resultreceiverwrapper.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read.write.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker());
    }
}
