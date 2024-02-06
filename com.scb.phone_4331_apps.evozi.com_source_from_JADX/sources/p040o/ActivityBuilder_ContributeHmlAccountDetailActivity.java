package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.ntb.EkycRouterDialogFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlAccountDetailActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlAccountDetailActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EkycRouterDialogFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlAccountDetailActivity(EkycRouterDialogFragment ekycRouterDialogFragment) {
        this.MediaBrowserCompat$ItemReceiver = ekycRouterDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4176cd cdVar = this.MediaBrowserCompat$ItemReceiver.ekycRouterPresenter;
        getOnDeviceExtractionServer getondeviceextractionserver = new getOnDeviceExtractionServer(cdVar);
        if (cdVar.RatingCompat != null) {
            getondeviceextractionserver.IconCompatParcelizer(cdVar.RatingCompat);
        }
    }
}
