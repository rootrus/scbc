package p040o;

import android.app.Activity;

/* renamed from: o.SelectPurchasesActivity_ViewBinding */
public final /* synthetic */ class SelectPurchasesActivity_ViewBinding implements Runnable {
    private final /* synthetic */ onAccountSummaryClick MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Activity read;

    public /* synthetic */ SelectPurchasesActivity_ViewBinding(onAccountSummaryClick onaccountsummaryclick, Activity activity) {
        this.MediaBrowserCompat$ItemReceiver = onaccountsummaryclick;
        this.read = activity;
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
