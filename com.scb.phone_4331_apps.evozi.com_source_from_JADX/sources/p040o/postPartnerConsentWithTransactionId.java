package p040o;

import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.bond.BondInputFragment;

/* renamed from: o.postPartnerConsentWithTransactionId */
public final /* synthetic */ class postPartnerConsentWithTransactionId implements CustomEditText.write {
    private final /* synthetic */ BondInputFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ postPartnerConsentWithTransactionId(BondInputFragment bondInputFragment) {
        this.MediaBrowserCompat$ItemReceiver = bondInputFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        BondInputFragment bondInputFragment = this.MediaBrowserCompat$ItemReceiver;
        bondInputFragment.mobileNumberInput.setFocusable(true);
        bondInputFragment.mobileNumberInput.setFocusableInTouchMode(true);
        bondInputFragment.mobileNumberInput.requestFocus();
    }
}
