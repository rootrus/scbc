package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressOnlineFragment;

/* renamed from: o.ActivityBuilder_ContributeErrorPageActivity */
public final /* synthetic */ class ActivityBuilder_ContributeErrorPageActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressOnlineFragment read;

    public /* synthetic */ ActivityBuilder_ContributeErrorPageActivity(MwShopAddressOnlineFragment mwShopAddressOnlineFragment) {
        this.read = mwShopAddressOnlineFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        getErr geterr = this.read.presenter;
        geterr.IconCompatParcelizer = z;
        setSource setsource = new setSource(geterr);
        if (geterr.RatingCompat != null) {
            setsource.IconCompatParcelizer(geterr.RatingCompat);
        }
    }
}
