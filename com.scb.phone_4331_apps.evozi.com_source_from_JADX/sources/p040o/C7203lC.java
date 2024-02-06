package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.debitcard.DebitCardRequestTermsConditionsActivity;

/* renamed from: o.lC */
public final /* synthetic */ class C7203lC implements DialogInterface.OnClickListener {
    private final /* synthetic */ DebitCardRequestTermsConditionsActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7203lC(DebitCardRequestTermsConditionsActivity debitCardRequestTermsConditionsActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestTermsConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nativeGetVersion nativegetversion = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        nativeGetHeight nativegetheight = nativeGetHeight.IconCompatParcelizer;
        if (nativegetversion.RatingCompat != null) {
            nativegetheight.IconCompatParcelizer(nativegetversion.RatingCompat);
        }
    }
}
