package p040o;

import com.scb.phone.view.adapter.BaseHorizontalBubbleAdapter;
import com.scb.phone.view.fragment.easycash.loaninformation.BaseFeaturesLoanInformationFragment;

/* renamed from: o.resetPinVerifyByAtmCard */
public final /* synthetic */ class resetPinVerifyByAtmCard implements BaseHorizontalBubbleAdapter.IconCompatParcelizer {
    private final /* synthetic */ dispatchCrashlyticsOriginEvent IconCompatParcelizer;
    private final /* synthetic */ BaseFeaturesLoanInformationFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ resetPinVerifyByAtmCard(BaseFeaturesLoanInformationFragment baseFeaturesLoanInformationFragment, dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent) {
        this.MediaBrowserCompat$ItemReceiver = baseFeaturesLoanInformationFragment;
        this.IconCompatParcelizer = dispatchcrashlyticsoriginevent;
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer, i);
    }
}
