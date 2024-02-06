package p040o;

import com.scb.phone.view.activity.ScbMapActivity;
import java.lang.ref.WeakReference;

/* renamed from: o.getKtaUserName */
final class getKtaUserName implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
    private final WeakReference<ScbMapActivity> read;

    public getKtaUserName(ScbMapActivity scbMapActivity) {
        onGetStartedClick.write((Object) scbMapActivity, "target");
        this.read = new WeakReference<>(scbMapActivity);
    }

    public final void write() {
        ScbMapActivity scbMapActivity = this.read.get();
        if (scbMapActivity != null) {
            onGetStartedClick.IconCompatParcelizer((Object) scbMapActivity, "weakTarget.get() ?: return");
            AppCompatRatingBar.write(scbMapActivity, ServerBuilder.MediaBrowserCompat$CustomActionResultReceiver, 57);
        }
    }

    public final void read() {
        ScbMapActivity scbMapActivity = this.read.get();
        if (scbMapActivity != null) {
            onGetStartedClick.IconCompatParcelizer((Object) scbMapActivity, "weakTarget.get() ?: return");
        }
    }
}
