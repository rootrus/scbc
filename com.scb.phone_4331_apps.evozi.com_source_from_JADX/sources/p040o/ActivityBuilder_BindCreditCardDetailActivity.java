package p040o;

import com.scb.phone.view.fragment.hml.C6009x7f2cab88;
import com.scb.phone.view.fragment.hml.HmlOutcomeCounterOfferFragment;

/* renamed from: o.ActivityBuilder_BindCreditCardDetailActivity */
public final /* synthetic */ class ActivityBuilder_BindCreditCardDetailActivity implements C6009x7f2cab88 {
    private final /* synthetic */ HmlOutcomeCounterOfferFragment write;

    public /* synthetic */ ActivityBuilder_BindCreditCardDetailActivity(HmlOutcomeCounterOfferFragment hmlOutcomeCounterOfferFragment) {
        this.write = hmlOutcomeCounterOfferFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        createPropertyInfo createpropertyinfo = this.write.presenter;
        getPackageVersion getpackageversion = new getPackageVersion(d);
        if (createpropertyinfo.RatingCompat != null) {
            getpackageversion.IconCompatParcelizer(createpropertyinfo.RatingCompat);
        }
    }
}
