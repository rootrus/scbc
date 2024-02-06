package p040o;

import com.scb.phone.view.activity.bankingaccount.BankingActionActivity;

/* renamed from: o.getTimeOut */
public final /* synthetic */ class getTimeOut implements Runnable {
    private final /* synthetic */ BankingActionActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getTimeOut(BankingActionActivity bankingActionActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingActionActivity;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.tutorialView.setVisibility(8);
    }
}
