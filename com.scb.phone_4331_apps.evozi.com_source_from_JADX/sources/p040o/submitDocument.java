package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.deeplink.DeepLinkActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.submitDocument */
public final /* synthetic */ class submitDocument implements DialogInterface.OnClickListener {
    private final /* synthetic */ DeepLinkActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ submitDocument(DeepLinkActivity deepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = deepLinkActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeepLinkActivity deepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        dialogInterface.dismiss();
        Intent flags = new Intent(deepLinkActivity, SplashActivity.class).setFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        DeepLinkActivity.read(deepLinkActivity, flags);
        deepLinkActivity.finish();
    }
}
