package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerSearchFragment;

/* renamed from: o.postReferralCode */
public final /* synthetic */ class postReferralCode implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashIssuerSearchFragment read;

    public /* synthetic */ postReferralCode(EasycashIssuerSearchFragment easycashIssuerSearchFragment) {
        this.read = easycashIssuerSearchFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EasycashIssuerSearchFragment easycashIssuerSearchFragment = this.read;
        if (String.valueOf(easycashIssuerSearchFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText()).isEmpty()) {
            easycashIssuerSearchFragment.MediaBrowserCompat$CustomActionResultReceiver.dismiss();
            return;
        }
        String valueOf = String.valueOf(easycashIssuerSearchFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText());
        easycashIssuerSearchFragment.MediaBrowserCompat$ItemReceiver(new convertMemInfoToBytes(0, valueOf, valueOf, valueOf, valueOf));
    }
}
