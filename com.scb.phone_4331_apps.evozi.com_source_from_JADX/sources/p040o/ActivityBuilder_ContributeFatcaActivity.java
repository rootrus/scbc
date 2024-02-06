package p040o;

import com.scb.phone.view.fragment.ndid.NdidIdpVerificationFragment;

/* renamed from: o.ActivityBuilder_ContributeFatcaActivity */
public final /* synthetic */ class ActivityBuilder_ContributeFatcaActivity implements FundActionsSuccessActivity {
    private final /* synthetic */ NdidIdpVerificationFragment write;

    public /* synthetic */ ActivityBuilder_ContributeFatcaActivity(NdidIdpVerificationFragment ndidIdpVerificationFragment) {
        this.write = ndidIdpVerificationFragment;
    }

    public final Object invoke() {
        getAssetProvider getassetprovider = this.write.presenter;
        FileNotFoundException fileNotFoundException = FileNotFoundException.MediaBrowserCompat$CustomActionResultReceiver;
        if (getassetprovider.RatingCompat != null) {
            fileNotFoundException.IconCompatParcelizer(getassetprovider.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
