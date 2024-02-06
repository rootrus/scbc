package p040o;

import android.view.View;
import com.scb.phone.view.fragment.profilemanagement.accounts.VerifyIdentityFragment;

/* renamed from: o.ActivityBuilder_ContributeJuristicRequestFormActivity */
public final /* synthetic */ class ActivityBuilder_ContributeJuristicRequestFormActivity implements View.OnClickListener {
    private final /* synthetic */ VerifyIdentityFragment read;

    public /* synthetic */ ActivityBuilder_ContributeJuristicRequestFormActivity(VerifyIdentityFragment verifyIdentityFragment) {
        this.read = verifyIdentityFragment;
    }

    public final void onClick(View view) {
        this.read.presenter.write();
    }
}
