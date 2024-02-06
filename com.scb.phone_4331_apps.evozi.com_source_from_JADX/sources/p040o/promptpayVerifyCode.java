package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity;
import com.scb.phone.view.fragment.easycash.LoanRequestorFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.promptpayVerifyCode */
public final /* synthetic */ class promptpayVerifyCode implements C6992x633f693d {
    private final /* synthetic */ LoanRequestorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ promptpayVerifyCode(LoanRequestorFragment loanRequestorFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = loanRequestorFragment;
    }

    public final boolean read(String str) {
        LoanRequestorFragment loanRequestorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent read = ScbPrivacyPolicyActivity.read(loanRequestorFragment.requireContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        LoanRequestorFragment.write(loanRequestorFragment, read);
        return true;
    }
}
