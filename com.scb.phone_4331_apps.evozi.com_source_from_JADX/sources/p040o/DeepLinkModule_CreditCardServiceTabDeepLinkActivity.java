package p040o;

import com.scb.phone.view.fragment.help.HelpFragment;

/* renamed from: o.DeepLinkModule_CreditCardServiceTabDeepLinkActivity */
public final class DeepLinkModule_CreditCardServiceTabDeepLinkActivity implements MileageQuantitySelectionActivity<HelpFragment> {
    public static void write(HelpFragment helpFragment, SessionProtobufHelper sessionProtobufHelper) {
        helpFragment.helpPresenter = sessionProtobufHelper;
    }
}
