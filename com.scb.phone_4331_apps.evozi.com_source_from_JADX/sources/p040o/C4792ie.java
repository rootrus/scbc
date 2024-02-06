package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.ie */
public final /* synthetic */ class C4792ie implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Builder MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ startCenterMessage read;

    public /* synthetic */ C4792ie(startCenterMessage startcentermessage, CrashlyticsReport.Session.Event.Application.Builder builder) {
        this.read = startcentermessage;
        this.MediaBrowserCompat$ItemReceiver = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(Ints.write(this.MediaBrowserCompat$ItemReceiver));
    }
}
