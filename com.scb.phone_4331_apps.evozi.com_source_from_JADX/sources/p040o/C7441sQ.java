package p040o;

import p040o.C7431sF;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.sQ */
public final /* synthetic */ class C7441sQ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7431sF.write MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CrashlyticsReport.Session.Application.Builder read;

    public /* synthetic */ C7441sQ(C7431sF.write write, CrashlyticsReport.Session.Application.Builder builder) {
        this.MediaBrowserCompat$ItemReceiver = write;
        this.read = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        C7431sF.write write = this.MediaBrowserCompat$ItemReceiver;
        getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper gettopleftcornerwidth_mediasessioncompat_resultreceiverwrapper = (getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper) obj;
        gettopleftcornerwidth_mediasessioncompat_resultreceiverwrapper.write(this.read.read);
        C7431sF sFVar = C7431sF.this;
        gettopleftcornerwidth_mediasessioncompat_resultreceiverwrapper.read("03".equalsIgnoreCase(C7431sF.MediaBrowserCompat$CustomActionResultReceiver(sFVar, sFVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer).RatingCompat));
    }
}
