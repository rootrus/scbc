package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.debitcard.DebitCardRequestInputFragment;

/* renamed from: o.getCarCollateralDetail */
public final /* synthetic */ class getCarCollateralDetail implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ DebitCardRequestInputFragment IconCompatParcelizer;

    public /* synthetic */ getCarCollateralDetail(DebitCardRequestInputFragment debitCardRequestInputFragment) {
        this.IconCompatParcelizer = debitCardRequestInputFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        nativeConfigure nativeconfigure = this.IconCompatParcelizer.presenter;
        nativeIsEqualTo nativeisequalto = new nativeIsEqualTo(nativeconfigure, z);
        if (nativeconfigure.RatingCompat != null) {
            nativeisequalto.IconCompatParcelizer(nativeconfigure.RatingCompat);
        }
    }
}
