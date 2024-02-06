package p040o;

import com.scb.phone.view.adapter.transferandpay.FavouriteTargetAdapter;
import p040o.CrashlyticsReport;

/* renamed from: o.getDocumentUploaded */
public final /* synthetic */ class getDocumentUploaded implements CheckExtractor_MembersInjector {
    private final /* synthetic */ FavouriteTargetAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ getDocumentUploaded(FavouriteTargetAdapter favouriteTargetAdapter, String str) {
        this.MediaBrowserCompat$ItemReceiver = favouriteTargetAdapter;
        this.write = str;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        return this.write.equals(((CrashlyticsReport.Session.Builder) this.MediaBrowserCompat$ItemReceiver.read.get(i)).read());
    }
}
