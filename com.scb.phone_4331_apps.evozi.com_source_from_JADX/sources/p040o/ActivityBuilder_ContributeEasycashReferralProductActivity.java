package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressDepartmentFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashReferralProductActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashReferralProductActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressDepartmentFragment read;

    public /* synthetic */ ActivityBuilder_ContributeEasycashReferralProductActivity(MwShopAddressDepartmentFragment mwShopAddressDepartmentFragment) {
        this.read = mwShopAddressDepartmentFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        MwShopAddressDepartmentFragment mwShopAddressDepartmentFragment = this.read;
        ErrorInfo errorInfo = mwShopAddressDepartmentFragment.presenter;
        boolean z2 = true;
        setChangedValue setchangedvalue = new setChangedValue(mwShopAddressDepartmentFragment.IconCompatParcelizer && mwShopAddressDepartmentFragment.MediaBrowserCompat$CustomActionResultReceiver && mwShopAddressDepartmentFragment.MediaBrowserCompat$SearchResultReceiver);
        if (errorInfo.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setchangedvalue.IconCompatParcelizer(errorInfo.RatingCompat);
        }
    }
}
