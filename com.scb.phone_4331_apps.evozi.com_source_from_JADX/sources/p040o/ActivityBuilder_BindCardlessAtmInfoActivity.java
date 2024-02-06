package p040o;

import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;

/* renamed from: o.ActivityBuilder_BindCardlessAtmInfoActivity */
public final /* synthetic */ class ActivityBuilder_BindCardlessAtmInfoActivity implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
    private final /* synthetic */ HmlNTBPersonalInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindCardlessAtmInfoActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBPersonalInfoFragment;
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "X-XXXX-XXXXX-XX-X");
    }
}
