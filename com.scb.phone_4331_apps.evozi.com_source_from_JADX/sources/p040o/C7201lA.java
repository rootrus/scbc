package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.debitcard.DebitCardRequestTermsConditionsActivity;

/* renamed from: o.lA */
public final /* synthetic */ class C7201lA implements DialogInterface.OnClickListener {
    private final /* synthetic */ DebitCardRequestTermsConditionsActivity read;

    public /* synthetic */ C7201lA(DebitCardRequestTermsConditionsActivity debitCardRequestTermsConditionsActivity) {
        this.read = debitCardRequestTermsConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nativeGetVersion nativegetversion = this.read.presenter;
        nativeSetLabel nativesetlabel = nativeSetLabel.read;
        if (nativegetversion.RatingCompat != null) {
            nativesetlabel.IconCompatParcelizer(nativegetversion.RatingCompat);
        }
    }
}
