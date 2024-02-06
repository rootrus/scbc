package p040o;

import android.app.Activity;
import android.view.View;

/* renamed from: o.GenerateQRActivity */
public final /* synthetic */ class GenerateQRActivity implements View.OnClickListener {
    private final /* synthetic */ Activity MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ BondErrorNoAccountsActivity read;

    public /* synthetic */ GenerateQRActivity(BondErrorNoAccountsActivity bondErrorNoAccountsActivity, DeejungTransferLandingActivity deejungTransferLandingActivity, Activity activity) {
        this.read = bondErrorNoAccountsActivity;
        this.MediaBrowserCompat$ItemReceiver = deejungTransferLandingActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = activity;
    }

    public final void onClick(View view) {
        BondErrorNoAccountsActivity bondErrorNoAccountsActivity = this.read;
        DeejungTransferLandingActivity deejungTransferLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        Activity activity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deejungTransferLandingActivity.MediaSessionCompat$Token) {
            bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity);
            bondErrorNoAccountsActivity.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(new C6831xda1855a8(deejungTransferLandingActivity));
            bondErrorNoAccountsActivity.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(C6829x6026a3c7.IconCompatParcelizer);
        }
    }
}
