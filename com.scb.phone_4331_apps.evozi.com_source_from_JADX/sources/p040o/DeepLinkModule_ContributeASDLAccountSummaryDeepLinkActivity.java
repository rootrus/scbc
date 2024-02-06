package p040o;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashLoanFeaturesAccountFragment;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ List read;
    private final /* synthetic */ EasycashLoanFeaturesAccountFragment write;

    public /* synthetic */ DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity(EasycashLoanFeaturesAccountFragment easycashLoanFeaturesAccountFragment, List list) {
        this.write = easycashLoanFeaturesAccountFragment;
        this.read = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.write.MediaBrowserCompat$CustomActionResultReceiver = (CrashlyticsReport.FilesPayload.File.Builder) this.read.get(i);
    }
}
