package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.etb.EtbSetDetailFragment;

/* renamed from: o.DeepLinkModule_ContributeJustForYouEntryPointDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeJustForYouEntryPointDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EtbSetDetailFragment write;

    public /* synthetic */ DeepLinkModule_ContributeJustForYouEntryPointDeepLinkActivity(EtbSetDetailFragment etbSetDetailFragment) {
        this.write = etbSetDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.MediaBrowserCompat$CustomActionResultReceiver(dialogInterface);
    }
}
