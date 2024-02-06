package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.deeplink.ExternalDeepLinkActivity;

/* renamed from: o.setServerTimeout */
public final /* synthetic */ class setServerTimeout implements DialogInterface.OnClickListener {
    private final /* synthetic */ ExternalDeepLinkActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setServerTimeout(ExternalDeepLinkActivity externalDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = externalDeepLinkActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ExternalDeepLinkActivity externalDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        dialogInterface.dismiss();
        externalDeepLinkActivity.finish();
    }
}
