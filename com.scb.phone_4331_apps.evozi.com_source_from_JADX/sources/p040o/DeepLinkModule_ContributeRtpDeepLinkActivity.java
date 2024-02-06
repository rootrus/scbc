package p040o;

import com.scb.phone.view.fragment.fastpay.FastPaySuccessFragment;

/* renamed from: o.DeepLinkModule_ContributeRtpDeepLinkActivity */
public final class DeepLinkModule_ContributeRtpDeepLinkActivity implements MileageQuantitySelectionActivity<FastPaySuccessFragment> {
    public static void read(FastPaySuccessFragment fastPaySuccessFragment, setImageOutListener setimageoutlistener) {
        fastPaySuccessFragment.successPresenter = setimageoutlistener;
    }

    public static void write(FastPaySuccessFragment fastPaySuccessFragment, FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment) {
        fastPaySuccessFragment.successScreenshotHelper = fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
    }
}
