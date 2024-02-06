package p040o;

import com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;

/* renamed from: o.setMaximumDate */
public final /* synthetic */ class setMaximumDate implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
    private final /* synthetic */ NdidNationalIdInputActivity write;

    public /* synthetic */ setMaximumDate(NdidNationalIdInputActivity ndidNationalIdInputActivity) {
        this.write = ndidNationalIdInputActivity;
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "XX/XX/XXXX");
    }
}
