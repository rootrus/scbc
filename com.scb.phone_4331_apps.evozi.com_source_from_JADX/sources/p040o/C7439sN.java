package p040o;

import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.sN */
public final /* synthetic */ class C7439sN implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution IconCompatParcelizer;
    private final /* synthetic */ sF$MediaBrowserCompat$CustomActionResultReceiver read;

    public /* synthetic */ C7439sN(sF$MediaBrowserCompat$CustomActionResultReceiver sf_mediabrowsercompat_customactionresultreceiver, CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.read = sf_mediabrowsercompat_customactionresultreceiver;
        this.IconCompatParcelizer = execution;
    }

    public final void IconCompatParcelizer(Object obj) {
        sF$MediaBrowserCompat$CustomActionResultReceiver sf_mediabrowsercompat_customactionresultreceiver = this.read;
        ((getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper) obj).MediaBrowserCompat$CustomActionResultReceiver(sf_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaMetadataCompat.IconCompatParcelizer(sf_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, false));
    }
}
