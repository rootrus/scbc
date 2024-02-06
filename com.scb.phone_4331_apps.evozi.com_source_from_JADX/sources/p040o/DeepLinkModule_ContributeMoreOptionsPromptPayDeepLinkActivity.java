package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.etb.EtbSetDetailFragment;

/* renamed from: o.DeepLinkModule_ContributeMoreOptionsPromptPayDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeMoreOptionsPromptPayDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EtbSetDetailFragment read;

    public /* synthetic */ DeepLinkModule_ContributeMoreOptionsPromptPayDeepLinkActivity(EtbSetDetailFragment etbSetDetailFragment) {
        this.read = etbSetDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.read(dialogInterface);
    }
}
