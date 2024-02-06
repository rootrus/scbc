package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.etb.EtbPersonalInformationFragment;

/* renamed from: o.DeepLinkModule_ContributeJuristicStartingPinDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeJuristicStartingPinDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EtbPersonalInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ DeepLinkModule_ContributeJuristicStartingPinDeepLinkActivity(EtbPersonalInformationFragment etbPersonalInformationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = etbPersonalInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EtbPersonalInformationFragment etbPersonalInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        dialogInterface.dismiss();
        etbPersonalInformationFragment.mo15340x50fd9e4a(false);
    }
}
