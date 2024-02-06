package p040o;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ntb.address.CurrentAddressFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.ContactInfoFragment;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlExternalInstructionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlExternalInstructionActivity implements View.OnClickListener {
    private final /* synthetic */ ContactInfoFragment read;

    public /* synthetic */ ActivityBuilder_ContributeHmlExternalInstructionActivity(ContactInfoFragment contactInfoFragment) {
        this.read = contactInfoFragment;
    }

    public final void onClick(View view) {
        ContactInfoFragment contactInfoFragment = this.read;
        if ((contactInfoFragment.getActivity() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) && contactInfoFragment.IconCompatParcelizer != null) {
            CurrentAddressFragment currentAddressFragment = new CurrentAddressFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("BUNDLE_ADDRESS_TYPE", 1);
            currentAddressFragment.setArguments(bundle);
            currentAddressFragment.setTargetFragment(contactInfoFragment, 2);
            contactInfoFragment.IconCompatParcelizer.write((Fragment) currentAddressFragment);
        }
    }
}
