package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.profilemanagement.promptpay.LinkAccountFragment;

/* renamed from: o.ActivityBuilder_ContributeMailingAddressDetailsActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMailingAddressDetailsActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ LinkAccountFragment write;

    public /* synthetic */ ActivityBuilder_ContributeMailingAddressDetailsActivity(LinkAccountFragment linkAccountFragment) {
        this.write = linkAccountFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.write.MediaBrowserCompat$CustomActionResultReceiver.read(z);
    }
}
