package p040o;

import com.scb.phone.view.fragment.remittance.RemittanceSuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributePrepaidResetPinSuccessActivity */
final class ActivityBuilder_ContributePrepaidResetPinSuccessActivity implements HistoryAdapter$GroupFooterViewHolder {
    private final setImportance IconCompatParcelizer;
    private final WeakReference<RemittanceSuccessFragment> MediaBrowserCompat$ItemReceiver;
    private final boolean read;

    public final void read() {
    }

    public ActivityBuilder_ContributePrepaidResetPinSuccessActivity(RemittanceSuccessFragment remittanceSuccessFragment, setImportance setimportance, boolean z) {
        onGetStartedClick.write((Object) remittanceSuccessFragment, "target");
        onGetStartedClick.write((Object) setimportance, "display");
        this.IconCompatParcelizer = setimportance;
        this.read = z;
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(remittanceSuccessFragment);
    }

    public final void write() {
        RemittanceSuccessFragment remittanceSuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
        if (remittanceSuccessFragment != null) {
            onGetStartedClick.IconCompatParcelizer((Object) remittanceSuccessFragment, "weakTarget.get() ?: return");
            remittanceSuccessFragment.requestPermissions(ActivityBuilder_ContributePrepaidRequestReviewActivity.write, 50);
        }
    }

    public final void IconCompatParcelizer() {
        RemittanceSuccessFragment remittanceSuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
        if (remittanceSuccessFragment != null) {
            onGetStartedClick.IconCompatParcelizer((Object) remittanceSuccessFragment, "weakTarget.get() ?: return");
            remittanceSuccessFragment.read(this.IconCompatParcelizer, this.read);
        }
    }
}
