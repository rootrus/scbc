package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.debitcard.DebitCardRequestInputFragment;

/* renamed from: o.sendMortgageRequestInfo */
public final /* synthetic */ class sendMortgageRequestInfo implements DialogInterface.OnClickListener {
    private final /* synthetic */ DebitCardRequestInputFragment write;

    public /* synthetic */ sendMortgageRequestInfo(DebitCardRequestInputFragment debitCardRequestInputFragment) {
        this.write = debitCardRequestInputFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nativeConfigure nativeconfigure = this.write.presenter;
        nativeExtract nativeextract = nativeExtract.read;
        if (nativeconfigure.RatingCompat != null) {
            nativeextract.IconCompatParcelizer(nativeconfigure.RatingCompat);
        }
    }
}
