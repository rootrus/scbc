package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.content.Context;
import android.view.View;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AnalyticsConnector;
import p040o.getScbsOnboardingProductCatalog;

public class DeejungTransferMinFullSlipFragment extends BaseFragment implements getScbsOnboardingProductCatalog<AnalyticsConnector> {
    public final /* synthetic */ void read(Object obj, View view, Context context) {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) obj;
        new DeejungTransferConfirmationHeaderFragment().read(analyticsConnector.write, view);
        new DeejungTransferMinFullSummaryFragment().MediaBrowserCompat$CustomActionResultReceiver(analyticsConnector.IconCompatParcelizer, view, context);
    }
}
