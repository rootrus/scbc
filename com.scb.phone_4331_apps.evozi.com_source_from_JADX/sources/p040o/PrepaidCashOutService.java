package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;

/* renamed from: o.PrepaidCashOutService */
public final /* synthetic */ class PrepaidCashOutService implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashOccupationInfoFragment write;

    public /* synthetic */ PrepaidCashOutService(EasycashOccupationInfoFragment easycashOccupationInfoFragment) {
        this.write = easycashOccupationInfoFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EasycashOccupationInfoFragment easycashOccupationInfoFragment = this.write;
        if (z) {
            easycashOccupationInfoFragment.read();
        } else {
            easycashOccupationInfoFragment.MediaMetadataCompat();
        }
    }
}
