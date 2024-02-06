package p040o;

import com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;

/* renamed from: o.resetAndGetWorkingCalendar */
public final /* synthetic */ class resetAndGetWorkingCalendar implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
    private final /* synthetic */ NdidNationalIdInputActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ resetAndGetWorkingCalendar(NdidNationalIdInputActivity ndidNationalIdInputActivity) {
        this.MediaBrowserCompat$ItemReceiver = ndidNationalIdInputActivity;
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "XX/XX/XXXX");
    }
}
