package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import p040o.Image;

/* renamed from: o.getOperatingAccount */
public final /* synthetic */ class getOperatingAccount implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashContactInformationFragment read;

    public /* synthetic */ getOperatingAccount(EasycashContactInformationFragment easycashContactInformationFragment) {
        this.read = easycashContactInformationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EasycashContactInformationFragment easycashContactInformationFragment = this.read;
        boolean z2 = false;
        if (z) {
            easycashContactInformationFragment.MediaBrowserCompat$ItemReceiver(false);
            return;
        }
        Image.C34591 r3 = easycashContactInformationFragment.presenter;
        setRectTop setrecttop = new setRectTop(r3);
        if (r3.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            setrecttop.IconCompatParcelizer(r3.RatingCompat);
        }
    }
}
