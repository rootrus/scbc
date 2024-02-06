package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;

/* renamed from: o.getNTBContactInfo */
public final /* synthetic */ class getNTBContactInfo implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashContactInformationFragment read;

    public /* synthetic */ getNTBContactInfo(EasycashContactInformationFragment easycashContactInformationFragment) {
        this.read = easycashContactInformationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EasycashContactInformationFragment easycashContactInformationFragment = this.read;
        if (z) {
            easycashContactInformationFragment.PlaybackStateCompat$CustomAction();
        }
    }
}
