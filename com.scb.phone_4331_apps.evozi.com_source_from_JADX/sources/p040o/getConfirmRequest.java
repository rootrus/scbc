package p040o;

import com.scb.phone.view.adapter.purchase.PurchaseAccountSourceAdapter;
import p040o.CrashlyticsReport;

/* renamed from: o.getConfirmRequest */
public final /* synthetic */ class getConfirmRequest implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ PurchaseAccountSourceAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getConfirmRequest(PurchaseAccountSourceAdapter purchaseAccountSourceAdapter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = purchaseAccountSourceAdapter;
    }

    public final boolean write(Object obj) {
        return ((CrashlyticsReport.FilesPayload.File.Builder) obj).MediaSessionCompat$Token.equalsIgnoreCase((String) null);
    }
}