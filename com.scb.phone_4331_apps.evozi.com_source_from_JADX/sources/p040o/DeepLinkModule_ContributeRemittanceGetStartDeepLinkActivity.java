package p040o;

import com.scb.phone.view.fragment.fastpay.FastPayInputFragment;

/* renamed from: o.DeepLinkModule_ContributeRemittanceGetStartDeepLinkActivity */
public final class DeepLinkModule_ContributeRemittanceGetStartDeepLinkActivity implements MileageQuantitySelectionActivity<FastPayInputFragment> {
    public static void write(FastPayInputFragment fastPayInputFragment, nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        fastPayInputFragment.fastPayInputPresenter = nativewriteimagetofilebuffer;
    }
}
