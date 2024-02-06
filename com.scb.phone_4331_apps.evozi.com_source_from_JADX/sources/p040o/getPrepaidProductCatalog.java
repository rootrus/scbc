package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.creditpower.EasycashCreditPowerInformationFragment;
import p040o.addAnalysisProgressEventListener;

/* renamed from: o.getPrepaidProductCatalog */
public final /* synthetic */ class getPrepaidProductCatalog implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashCreditPowerInformationFragment read;

    public /* synthetic */ getPrepaidProductCatalog(EasycashCreditPowerInformationFragment easycashCreditPowerInformationFragment) {
        this.read = easycashCreditPowerInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        addAnalysisProgressEventListener addanalysisprogresseventlistener = this.read.presenter;
        if (addanalysisprogresseventlistener.RatingCompat != null) {
            addanalysisprogresseventlistener.RatingCompat.AlertController$RecycleListView();
        }
        addanalysisprogresseventlistener.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(addanalysisprogresseventlistener.IconCompatParcelizer);
        addanalysisprogresseventlistener.MediaMetadataCompat.IconCompatParcelizer(new addAnalysisProgressEventListener.write(addanalysisprogresseventlistener, (byte) 0));
    }
}
