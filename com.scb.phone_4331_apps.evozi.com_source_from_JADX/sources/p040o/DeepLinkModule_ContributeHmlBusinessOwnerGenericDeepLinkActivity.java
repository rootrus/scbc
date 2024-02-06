package p040o;

import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionBillerListFragment;
import p040o.ImagePerfectionProfile;

/* renamed from: o.DeepLinkModule_ContributeHmlBusinessOwnerGenericDeepLinkActivity */
public final class DeepLinkModule_ContributeHmlBusinessOwnerGenericDeepLinkActivity implements MileageQuantitySelectionActivity<EBillSubscriptionBillerListFragment> {
    public static void IconCompatParcelizer(EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment, ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection) {
        eBillSubscriptionBillerListFragment.eBillSubscriptionBillerListPresenter = useMRZPassportDetection;
    }
}
