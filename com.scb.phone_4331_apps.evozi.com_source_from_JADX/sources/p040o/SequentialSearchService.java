package p040o;

import com.scb.phone.view.adapter.BaseHorizontalBubbleAdapter;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesPurposefulLoanInformationFragment;

/* renamed from: o.SequentialSearchService */
public final /* synthetic */ class SequentialSearchService implements BaseHorizontalBubbleAdapter.IconCompatParcelizer {
    private final /* synthetic */ dispatchCrashlyticsOriginEvent MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ EasycashFeaturesPurposefulLoanInformationFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ SequentialSearchService(EasycashFeaturesPurposefulLoanInformationFragment easycashFeaturesPurposefulLoanInformationFragment, dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent) {
        this.MediaBrowserCompat$ItemReceiver = easycashFeaturesPurposefulLoanInformationFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = dispatchcrashlyticsoriginevent;
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }
}
