package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressOnlineFragment;

/* renamed from: o.ActivityBuilder_ContributeEkycTermsAndConditionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEkycTermsAndConditionActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressOnlineFragment write;

    public /* synthetic */ ActivityBuilder_ContributeEkycTermsAndConditionActivity(MwShopAddressOnlineFragment mwShopAddressOnlineFragment) {
        this.write = mwShopAddressOnlineFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        getErr geterr = this.write.presenter;
        geterr.read = z;
        setSource setsource = new setSource(geterr);
        if (geterr.RatingCompat != null) {
            setsource.IconCompatParcelizer(geterr.RatingCompat);
        }
    }
}
