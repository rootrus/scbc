package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.personallimit.PersonalLimitFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBOperatingAccountActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlNTBOperatingAccountActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ PersonalLimitFragment write;

    public /* synthetic */ ActivityBuilder_ContributeHmlNTBOperatingAccountActivity(PersonalLimitFragment personalLimitFragment) {
        this.write = personalLimitFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PersonalLimitFragment personalLimitFragment = this.write;
        if (personalLimitFragment.getActivity() != null) {
            personalLimitFragment.getActivity().finish();
        }
    }
}
