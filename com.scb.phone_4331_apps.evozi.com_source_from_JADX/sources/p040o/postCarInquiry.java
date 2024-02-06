package p040o;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesRefillableInformationFragment;

/* renamed from: o.postCarInquiry */
public final /* synthetic */ class postCarInquiry implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ EasycashFeaturesRefillableInformationFragment write;

    public /* synthetic */ postCarInquiry(EasycashFeaturesRefillableInformationFragment easycashFeaturesRefillableInformationFragment) {
        this.write = easycashFeaturesRefillableInformationFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.write.MediaBrowserCompat$ItemReceiver(i);
    }
}
