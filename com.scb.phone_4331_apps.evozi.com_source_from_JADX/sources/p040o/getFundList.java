package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.BaseFragment;

/* renamed from: o.getFundList */
public final /* synthetic */ class getFundList implements DialogInterface.OnClickListener {
    private final /* synthetic */ access$2300 IconCompatParcelizer;
    private final /* synthetic */ BaseFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getFundList(BaseFragment baseFragment, access$2300 access_2300) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseFragment;
        this.IconCompatParcelizer = access_2300;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseFragment baseFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        access$2300 access_2300 = this.IconCompatParcelizer;
        dialogInterface.dismiss();
        baseFragment.MediaBrowserCompat$CustomActionResultReceiver(access_2300);
    }
}
