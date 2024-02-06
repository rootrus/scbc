package p040o;

import com.scb.phone.view.activity.bankingagent.BankingAgentSuccessActivity;
import java.lang.ref.WeakReference;
import p040o.MoreExecutors;

/* renamed from: o.iq */
final class C7177iq implements HistoryAdapter$GroupFooterViewHolder {
    private final boolean IconCompatParcelizer;
    private final WeakReference<BankingAgentSuccessActivity> MediaBrowserCompat$ItemReceiver;
    private final MoreExecutors.SameThreadExecutorService read;

    public final void read() {
    }

    public C7177iq(BankingAgentSuccessActivity bankingAgentSuccessActivity, MoreExecutors.SameThreadExecutorService sameThreadExecutorService, boolean z) {
        onGetStartedClick.write((Object) bankingAgentSuccessActivity, "target");
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        this.read = sameThreadExecutorService;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(bankingAgentSuccessActivity);
    }

    public final void write() {
        BankingAgentSuccessActivity bankingAgentSuccessActivity = this.MediaBrowserCompat$ItemReceiver.get();
        if (bankingAgentSuccessActivity != null) {
            onGetStartedClick.IconCompatParcelizer((Object) bankingAgentSuccessActivity, "weakTarget.get() ?: return");
            AppCompatRatingBar.write(bankingAgentSuccessActivity, C7181iz.IconCompatParcelizer, 2);
        }
    }

    public final void IconCompatParcelizer() {
        BankingAgentSuccessActivity bankingAgentSuccessActivity = this.MediaBrowserCompat$ItemReceiver.get();
        if (bankingAgentSuccessActivity != null) {
            onGetStartedClick.IconCompatParcelizer((Object) bankingAgentSuccessActivity, "weakTarget.get() ?: return");
            bankingAgentSuccessActivity.MediaBrowserCompat$ItemReceiver(this.read, this.IconCompatParcelizer);
        }
    }
}
