package p040o;

import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;

/* renamed from: o.JustForYouService */
public final class JustForYouService implements MileageQuantitySelectionActivity<EasycashCommonReviewFragment> {
    public static void write(EasycashCommonReviewFragment easycashCommonReviewFragment, forEachClear foreachclear) {
        easycashCommonReviewFragment.tracker = foreachclear;
    }

    public static void write(EasycashCommonReviewFragment easycashCommonReviewFragment, IDocumentDetector iDocumentDetector) {
        easycashCommonReviewFragment.presenter = iDocumentDetector;
    }
}
