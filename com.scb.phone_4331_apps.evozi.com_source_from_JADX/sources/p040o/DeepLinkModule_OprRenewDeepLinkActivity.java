package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.hml.HmlBasePersonalInfoFragment;

/* renamed from: o.DeepLinkModule_OprRenewDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_OprRenewDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ HmlBasePersonalInfoFragment IconCompatParcelizer;

    public /* synthetic */ DeepLinkModule_OprRenewDeepLinkActivity(HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment) {
        this.IconCompatParcelizer = hmlBasePersonalInfoFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getPageID getpageid = this.IconCompatParcelizer.IconCompatParcelizer;
        setForceMatch setforcematch = setForceMatch.MediaBrowserCompat$CustomActionResultReceiver;
        if (getpageid.RatingCompat != null) {
            setforcematch.IconCompatParcelizer(getpageid.RatingCompat);
        }
    }
}
