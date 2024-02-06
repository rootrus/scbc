package p040o;

import com.scb.phone.view.fragment.debitcard.DebitCardLandingFragment;

/* renamed from: o.getMHMCDetail */
public final /* synthetic */ class getMHMCDetail implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    private final /* synthetic */ DebitCardLandingFragment IconCompatParcelizer;

    public /* synthetic */ getMHMCDetail(DebitCardLandingFragment debitCardLandingFragment) {
        this.IconCompatParcelizer = debitCardLandingFragment;
    }

    public final void read(int i) {
        getRows getrows = this.IconCompatParcelizer.presenter;
        int intValue = getrows.IconCompatParcelizer.get(i).intValue();
        boolean z = false;
        if (intValue == 0) {
            serializeString serializestring = serializeString.IconCompatParcelizer;
            if (getrows.RatingCompat != null) {
                z = true;
            }
            if (z) {
                serializestring.IconCompatParcelizer(getrows.RatingCompat);
            }
        } else if (intValue == 1) {
            nativeSetConfidence nativesetconfidence = nativeSetConfidence.read;
            if (getrows.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativesetconfidence.IconCompatParcelizer(getrows.RatingCompat);
            }
        } else {
            throw new UnsupportedOperationException("Function not supported");
        }
    }
}
