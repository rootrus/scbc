package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ccrredemption.product.OPRRewardAdapter;

/* renamed from: o.JustForYouApi */
public final /* synthetic */ class JustForYouApi implements View.OnClickListener {
    private final /* synthetic */ intoSet MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ OPRRewardAdapter read;

    public /* synthetic */ JustForYouApi(OPRRewardAdapter oPRRewardAdapter, intoSet intoset) {
        this.read = oPRRewardAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = intoset;
    }

    public final void onClick(View view) {
        OPRRewardAdapter oPRRewardAdapter = this.read;
        intoSet intoset = this.MediaBrowserCompat$CustomActionResultReceiver;
        getNameSuffix getnamesuffix = oPRRewardAdapter.write;
        if (getnamesuffix != null) {
            getnamesuffix.MediaBrowserCompat$ItemReceiver(intoset);
        }
    }
}
