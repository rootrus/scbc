package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlCaptureDocumentActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlCaptureDocumentActivity implements CustomAddressInput.IconCompatParcelizer {
    private final /* synthetic */ BaseAddressFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean write = true;

    public /* synthetic */ ActivityBuilder_ContributeHmlCaptureDocumentActivity(BaseAddressFragment baseAddressFragment, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseAddressFragment;
    }

    public final void write(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat(this.write, z);
    }
}
