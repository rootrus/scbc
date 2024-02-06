package com.scb.phone.view.fragment.investment.assessment;

import p040o.FragmentBuilder_BindChequeStatusFragment;
import p040o.cancelJob;
import p040o.onGetStartedClick;
import p040o.populateExecutionData;

final class RiskQuestionnaireFragment$MediaBrowserCompat$ItemReceiver implements FragmentBuilder_BindChequeStatusFragment {
    private /* synthetic */ RiskQuestionnaireFragment MediaBrowserCompat$ItemReceiver;

    RiskQuestionnaireFragment$MediaBrowserCompat$ItemReceiver(RiskQuestionnaireFragment riskQuestionnaireFragment) {
        this.MediaBrowserCompat$ItemReceiver = riskQuestionnaireFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(populateExecutionData populateexecutiondata) {
        cancelJob canceljob = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (canceljob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        canceljob.read = populateexecutiondata;
        canceljob.read();
    }
}
