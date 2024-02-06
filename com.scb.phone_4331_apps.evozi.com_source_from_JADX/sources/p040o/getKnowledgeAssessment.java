package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;

/* renamed from: o.getKnowledgeAssessment */
public final /* synthetic */ class getKnowledgeAssessment implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PurchaseSuccessFragment read;

    public /* synthetic */ getKnowledgeAssessment(PurchaseSuccessFragment purchaseSuccessFragment, boolean z) {
        this.read = purchaseSuccessFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, (Uri) obj);
    }
}
