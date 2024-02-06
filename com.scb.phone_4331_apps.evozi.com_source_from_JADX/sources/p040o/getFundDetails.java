package p040o;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.getFundDetails */
public final /* synthetic */ class getFundDetails implements View.OnClickListener {
    private final /* synthetic */ getUserId IconCompatParcelizer;
    private final /* synthetic */ PurchaseSuccessFragment write;

    public /* synthetic */ getFundDetails(PurchaseSuccessFragment purchaseSuccessFragment, getUserId getuserid) {
        this.write = purchaseSuccessFragment;
        this.IconCompatParcelizer = getuserid;
    }

    public final void onClick(View view) {
        PurchaseSuccessFragment purchaseSuccessFragment = this.write;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.IconCompatParcelizer.write));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            PurchaseSuccessFragment.write(purchaseSuccessFragment, intent);
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}
