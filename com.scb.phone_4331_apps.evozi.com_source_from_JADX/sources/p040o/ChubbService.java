package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilityAssessmentAdapter;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.ChubbService */
public final /* synthetic */ class ChubbService implements View.OnClickListener {
    private final /* synthetic */ SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ SuitabilityAssessmentAdapter.SuitabilityFooterViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ChubbService(SuitabilityAssessmentAdapter.SuitabilityFooterViewHolder suitabilityFooterViewHolder, SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver suitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = suitabilityFooterViewHolder;
        this.IconCompatParcelizer = suitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor);
    }
}
