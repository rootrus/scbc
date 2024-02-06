package p040o;

import com.scb.phone.view.activity.emailverification.ManageEmailInputActivity;

/* renamed from: o.pj */
public final /* synthetic */ class C10105pj implements Runnable {
    private final /* synthetic */ ManageEmailInputActivity write;

    public /* synthetic */ C10105pj(ManageEmailInputActivity manageEmailInputActivity) {
        this.write = manageEmailInputActivity;
    }

    public final void run() {
        this.write.presenter.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
