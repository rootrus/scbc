package p040o;

import com.scb.phone.view.fragment.address.AddressSearchFragment;

/* renamed from: o.PDFService */
public final class PDFService implements MileageQuantitySelectionActivity<AddressSearchFragment> {
    public static void write(AddressSearchFragment addressSearchFragment, CreateAppSpiCall createAppSpiCall) {
        addressSearchFragment.presenter = createAppSpiCall;
    }
}
