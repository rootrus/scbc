package p040o;

import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.getViewBitmap */
public final /* synthetic */ class getViewBitmap implements CheckExtractor_MembersInjector {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ List read;

    public /* synthetic */ getViewBitmap(List list, String str) {
        this.read = list;
        this.IconCompatParcelizer = str;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        return ((CrashlyticsReport.FilesPayload.File.Builder) this.read.get(i)).MediaSessionCompat$Token.equals(this.IconCompatParcelizer);
    }
}
