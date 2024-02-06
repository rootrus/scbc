package p040o;

import com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentInputFragment;
import p040o.ImageProcessor;

/* renamed from: o.getTravelWalletSummary */
public final class getTravelWalletSummary implements MileageQuantitySelectionActivity<AdditionDocumentInputFragment> {
    public static void write(AdditionDocumentInputFragment additionDocumentInputFragment, ImageProcessor.ImageOutListener imageOutListener) {
        additionDocumentInputFragment.additionDocumentInputPresenter = imageOutListener;
    }

    public static void read(AdditionDocumentInputFragment additionDocumentInputFragment, forEachClear foreachclear) {
        additionDocumentInputFragment.tracker = foreachclear;
    }
}
