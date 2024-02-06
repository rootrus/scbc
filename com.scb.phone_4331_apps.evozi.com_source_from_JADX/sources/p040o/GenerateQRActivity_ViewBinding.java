package p040o;

import android.app.Activity;

/* renamed from: o.GenerateQRActivity_ViewBinding */
public final /* synthetic */ class GenerateQRActivity_ViewBinding implements Runnable {
    private final /* synthetic */ BondErrorNoAccountsActivity read;

    public /* synthetic */ GenerateQRActivity_ViewBinding(BondErrorNoAccountsActivity bondErrorNoAccountsActivity) {
        this.read = bondErrorNoAccountsActivity;
    }

    public final void run() {
        BondErrorNoAccountsActivity bondErrorNoAccountsActivity = this.read;
        Activity activity = bondErrorNoAccountsActivity.read;
        if (activity != null) {
            bondErrorNoAccountsActivity.write.MediaBrowserCompat$CustomActionResultReceiver(activity);
            bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(bondErrorNoAccountsActivity.read);
        }
    }
}
