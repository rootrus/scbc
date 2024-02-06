package p040o;

import com.scb.phone.view.fragment.hml.HmlBaseOnlineSuccessFragment;
import p040o.Iterables;
import p040o.getDocumentID;

/* renamed from: o.ActivityBuilder_BindDiscoverActivity */
public final class ActivityBuilder_BindDiscoverActivity<T extends getDocumentID> implements MileageQuantitySelectionActivity<HmlBaseOnlineSuccessFragment<T>> {
    public static <T extends getDocumentID> void MediaBrowserCompat$CustomActionResultReceiver(HmlBaseOnlineSuccessFragment<T> hmlBaseOnlineSuccessFragment, setExitButtonEnabled setexitbuttonenabled) {
        hmlBaseOnlineSuccessFragment.themesSlipPresenter = setexitbuttonenabled;
    }

    public static <T extends getDocumentID> void write(HmlBaseOnlineSuccessFragment<T> hmlBaseOnlineSuccessFragment, Iterables.C352414 r1) {
        hmlBaseOnlineSuccessFragment.componentFactory = r1;
    }

    public static <T extends getDocumentID> void MediaBrowserCompat$CustomActionResultReceiver(HmlBaseOnlineSuccessFragment<T> hmlBaseOnlineSuccessFragment, T t) {
        hmlBaseOnlineSuccessFragment.presenter = t;
    }
}
