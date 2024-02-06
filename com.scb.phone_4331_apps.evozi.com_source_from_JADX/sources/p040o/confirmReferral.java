package p040o;

import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import p040o.CrashlyticsReport;

/* renamed from: o.confirmReferral */
public final /* synthetic */ class confirmReferral implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ AccountSourceAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ confirmReferral(AccountSourceAdapter accountSourceAdapter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountSourceAdapter;
    }

    public final boolean write(Object obj) {
        return ((CrashlyticsReport.FilesPayload.File.Builder) obj).MediaSessionCompat$Token.equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }
}
