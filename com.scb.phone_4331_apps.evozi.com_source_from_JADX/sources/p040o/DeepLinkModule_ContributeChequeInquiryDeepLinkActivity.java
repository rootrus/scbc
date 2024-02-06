package p040o;

import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesLoanAccountFragment;
import p040o.Image;

/* renamed from: o.DeepLinkModule_ContributeChequeInquiryDeepLinkActivity */
public final class DeepLinkModule_ContributeChequeInquiryDeepLinkActivity implements MileageQuantitySelectionActivity<EasycashFeaturesLoanAccountFragment> {
    public static void write(EasycashFeaturesLoanAccountFragment easycashFeaturesLoanAccountFragment, Image.FileRestriction fileRestriction) {
        easycashFeaturesLoanAccountFragment.presenter = fileRestriction;
    }
}
