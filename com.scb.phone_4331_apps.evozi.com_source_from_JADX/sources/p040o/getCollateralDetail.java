package p040o;

import android.view.View;
import com.scb.phone.view.fragment.debitcard.DebitCardRequestInputFragment;

/* renamed from: o.getCollateralDetail */
public final /* synthetic */ class getCollateralDetail implements View.OnClickListener {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ DebitCardRequestInputFragment write;

    public /* synthetic */ getCollateralDetail(DebitCardRequestInputFragment debitCardRequestInputFragment, String str) {
        this.write = debitCardRequestInputFragment;
        this.IconCompatParcelizer = str;
    }

    public final void onClick(View view) {
        DebitCardRequestInputFragment debitCardRequestInputFragment = this.write;
        String str = this.IconCompatParcelizer;
        nativeConfigure nativeconfigure = debitCardRequestInputFragment.presenter;
        addField addfield = new addField(str);
        if (nativeconfigure.RatingCompat != null) {
            addfield.IconCompatParcelizer(nativeconfigure.RatingCompat);
        }
    }
}
