package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlBusinessInformationActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlBusinessInformationActivity implements CustomAddressInput.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer = false;
    private final /* synthetic */ BaseAddressFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlBusinessInformationActivity(BaseAddressFragment baseAddressFragment, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseAddressFragment;
    }

    public final void write(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(this.IconCompatParcelizer, z);
    }
}
