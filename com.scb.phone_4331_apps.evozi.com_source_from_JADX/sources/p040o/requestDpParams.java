package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomAcceptDecline;

/* renamed from: o.requestDpParams */
public final /* synthetic */ class requestDpParams implements View.OnClickListener {
    private final /* synthetic */ enablePublishingAndFlushPending MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomAcceptDecline MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ loginFingerPrint read;

    public /* synthetic */ requestDpParams(CustomAcceptDecline customAcceptDecline, loginFingerPrint loginfingerprint, enablePublishingAndFlushPending enablepublishingandflushpending) {
        this.MediaBrowserCompat$ItemReceiver = customAcceptDecline;
        this.read = loginfingerprint;
        this.MediaBrowserCompat$CustomActionResultReceiver = enablepublishingandflushpending;
    }

    public final void onClick(View view) {
        loginFingerPrint loginfingerprint = this.read;
        enablePublishingAndFlushPending enablepublishingandflushpending = this.MediaBrowserCompat$CustomActionResultReceiver;
        loginfingerprint.MediaBrowserCompat$CustomActionResultReceiver(enablepublishingandflushpending.write, enablepublishingandflushpending.read, enablepublishingandflushpending.IconCompatParcelizer, enablepublishingandflushpending.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
