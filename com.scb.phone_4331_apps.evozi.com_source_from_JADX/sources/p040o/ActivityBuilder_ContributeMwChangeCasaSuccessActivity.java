package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.purchase.PurchaseReviewActivity;
import com.scb.phone.view.fragment.purchase.PurchaseCreditCardInputFragment;

/* renamed from: o.ActivityBuilder_ContributeMwChangeCasaSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwChangeCasaSuccessActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ PurchaseCreditCardInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeMwChangeCasaSuccessActivity(PurchaseCreditCardInputFragment purchaseCreditCardInputFragment, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$CustomActionResultReceiver = purchaseCreditCardInputFragment;
        this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PurchaseCreditCardInputFragment purchaseCreditCardInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        PurchaseReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(purchaseCreditCardInputFragment.getContext(), this.MediaBrowserCompat$ItemReceiver, "creditcard");
    }
}
