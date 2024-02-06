package p040o;

import p040o.C7475st;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.rh */
public final /* synthetic */ class C10124rh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder IconCompatParcelizer;
    private final /* synthetic */ C7475st.IconCompatParcelizer write;

    public /* synthetic */ C10124rh(C7475st.IconCompatParcelizer iconCompatParcelizer, CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder) {
        this.write = iconCompatParcelizer;
        this.IconCompatParcelizer = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver = (getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver) obj;
        gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver.write(this.IconCompatParcelizer, C7475st.this.MediaSessionCompat$ResultReceiverWrapper);
    }
}
