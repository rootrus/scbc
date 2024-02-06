package p040o;

import com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentScbAccountFragment;
import p040o.ImageProcessor;

/* renamed from: o.getPrepaidCashOutVerification */
public final class getPrepaidCashOutVerification implements MileageQuantitySelectionActivity<AdditionDocumentScbAccountFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment, ImageProcessor.ImageOutEvent imageOutEvent) {
        additionDocumentScbAccountFragment.scbAccountPresenter = imageOutEvent;
    }

    public static void MediaBrowserCompat$ItemReceiver(AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment, forEachClear foreachclear) {
        additionDocumentScbAccountFragment.tracker = foreachclear;
    }
}
