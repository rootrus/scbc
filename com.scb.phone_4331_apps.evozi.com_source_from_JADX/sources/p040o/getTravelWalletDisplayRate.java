package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;

/* renamed from: o.getTravelWalletDisplayRate */
public final /* synthetic */ class getTravelWalletDisplayRate implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashOccupationInfoFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getTravelWalletDisplayRate(EasycashOccupationInfoFragment easycashOccupationInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = easycashOccupationInfoFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EasycashOccupationInfoFragment easycashOccupationInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            easycashOccupationInfoFragment.PlaybackStateCompat$CustomAction();
        }
    }
}
