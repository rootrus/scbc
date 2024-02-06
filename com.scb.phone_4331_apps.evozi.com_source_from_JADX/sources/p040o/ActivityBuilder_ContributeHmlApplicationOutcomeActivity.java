package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.ntb.EkycRouterDialogFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlApplicationOutcomeActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlApplicationOutcomeActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EkycRouterDialogFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeHmlApplicationOutcomeActivity(EkycRouterDialogFragment ekycRouterDialogFragment) {
        this.IconCompatParcelizer = ekycRouterDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4176cd cdVar = this.IconCompatParcelizer.ekycRouterPresenter;
        C4072bL bLVar = C4072bL.read;
        if (cdVar.RatingCompat != null) {
            bLVar.IconCompatParcelizer(cdVar.RatingCompat);
        }
    }
}
