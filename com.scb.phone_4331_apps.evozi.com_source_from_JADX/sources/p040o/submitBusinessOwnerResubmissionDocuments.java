package p040o;

import com.scb.phone.view.fragment.directdebit.DirectDebitInputMainFragment;

/* renamed from: o.submitBusinessOwnerResubmissionDocuments */
public final class submitBusinessOwnerResubmissionDocuments implements MileageQuantitySelectionActivity<DirectDebitInputMainFragment> {
    public static void read(DirectDebitInputMainFragment directDebitInputMainFragment, XVrsAutoCrop xVrsAutoCrop) {
        directDebitInputMainFragment.presenter = xVrsAutoCrop;
    }
}
