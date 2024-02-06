package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressOnlineFragment;

/* renamed from: o.ActivityBuilder_ContributeErrorGenericActivity */
public final /* synthetic */ class ActivityBuilder_ContributeErrorGenericActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressOnlineFragment write;

    public /* synthetic */ ActivityBuilder_ContributeErrorGenericActivity(MwShopAddressOnlineFragment mwShopAddressOnlineFragment) {
        this.write = mwShopAddressOnlineFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        getErr geterr = this.write.presenter;
        geterr.MediaBrowserCompat$SearchResultReceiver = z;
        setSource setsource = new setSource(geterr);
        if (geterr.RatingCompat != null) {
            setsource.IconCompatParcelizer(geterr.RatingCompat);
        }
    }
}
