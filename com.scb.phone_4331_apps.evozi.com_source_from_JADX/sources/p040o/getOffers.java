package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;

/* renamed from: o.getOffers */
public final /* synthetic */ class getOffers implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashContactInformationFragment write;

    public /* synthetic */ getOffers(EasycashContactInformationFragment easycashContactInformationFragment) {
        this.write = easycashContactInformationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        this.write.MediaDescriptionCompat(z);
    }
}
