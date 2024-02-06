package p040o;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashLoanFeaturesAccountFragment;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.DeepLinkModule_ContributeBankingAgentDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeBankingAgentDeepLinkActivity implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ EasycashLoanFeaturesAccountFragment read;
    private final /* synthetic */ List write;

    public /* synthetic */ DeepLinkModule_ContributeBankingAgentDeepLinkActivity(EasycashLoanFeaturesAccountFragment easycashLoanFeaturesAccountFragment, List list) {
        this.read = easycashLoanFeaturesAccountFragment;
        this.write = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.read.IconCompatParcelizer = ((CrashlyticsReport.FilesPayload.File.Builder) this.write.get(i)).f2695x50fd9e4a;
    }
}
