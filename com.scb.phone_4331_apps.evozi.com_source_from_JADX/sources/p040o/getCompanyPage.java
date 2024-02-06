package p040o;

import com.scb.phone.view.fragment.donations.DonationsFoundationDetailsFragment;

/* renamed from: o.getCompanyPage */
public final class getCompanyPage implements MileageQuantitySelectionActivity<DonationsFoundationDetailsFragment> {
    public static void write(DonationsFoundationDetailsFragment donationsFoundationDetailsFragment, nativeChannels nativechannels) {
        donationsFoundationDetailsFragment.donationsFoundationDetailPresenter = nativechannels;
    }
}
