package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.content.Context;
import android.view.View;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.getGcmSenderId;
import p040o.getScbsOnboardingProductCatalog;

public class DeejungTransferInstallmentSlipFragment extends BaseFragment implements getScbsOnboardingProductCatalog<getGcmSenderId> {
    public final /* synthetic */ void read(Object obj, View view, Context context) {
        getGcmSenderId getgcmsenderid = (getGcmSenderId) obj;
        new DeejungTransferConfirmationHeaderFragment().read(getgcmsenderid.read, view);
        new DeejungTransferInstallmentsSummaryFragment().MediaBrowserCompat$CustomActionResultReceiver(getgcmsenderid.write, view);
    }
}
