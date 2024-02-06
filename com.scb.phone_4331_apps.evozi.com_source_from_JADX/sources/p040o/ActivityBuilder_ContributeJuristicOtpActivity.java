package p040o;

import com.scb.phone.R;
import com.scb.phone.view.fragment.profilemanagement.accounts.VerifyIdentityFragment;

/* renamed from: o.ActivityBuilder_ContributeJuristicOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeJuristicOtpActivity implements Runnable {
    private final /* synthetic */ VerifyIdentityFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeJuristicOtpActivity(VerifyIdentityFragment verifyIdentityFragment) {
        this.MediaBrowserCompat$ItemReceiver = verifyIdentityFragment;
    }

    public final void run() {
        VerifyIdentityFragment verifyIdentityFragment = this.MediaBrowserCompat$ItemReceiver;
        verifyIdentityFragment.cardNoInput.setErrorInLine(R.string.invalid_account_inline_error);
        verifyIdentityFragment.presenter.read();
    }
}
