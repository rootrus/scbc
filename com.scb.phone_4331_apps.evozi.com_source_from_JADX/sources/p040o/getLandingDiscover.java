package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.BaseFragment;

/* renamed from: o.getLandingDiscover */
public final /* synthetic */ class getLandingDiscover implements DialogInterface.OnClickListener {
    private final /* synthetic */ access$2300 IconCompatParcelizer;
    private final /* synthetic */ BaseFragment read;

    public /* synthetic */ getLandingDiscover(BaseFragment baseFragment, access$2300 access_2300) {
        this.read = baseFragment;
        this.IconCompatParcelizer = access_2300;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseFragment baseFragment = this.read;
        access$2300 access_2300 = this.IconCompatParcelizer;
        dialogInterface.dismiss();
        baseFragment.MediaBrowserCompat$CustomActionResultReceiver(access_2300);
    }
}
