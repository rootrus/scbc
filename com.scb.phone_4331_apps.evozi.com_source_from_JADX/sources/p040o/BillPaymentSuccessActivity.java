package p040o;

import org.apache.http.auth.AuthenticationException;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

/* renamed from: o.BillPaymentSuccessActivity */
public final class BillPaymentSuccessActivity extends SuccessActivity {
    public final String IconCompatParcelizer() {
        return null;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public final String read() {
        return "Kerberos";
    }

    public BillPaymentSuccessActivity(boolean z, boolean z2) {
        super(z, z2);
    }

    public BillPaymentSuccessActivity() {
    }

    public final PrepaidRequestMarketConductActivity read(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws AuthenticationException {
        return super.read(purchaseReviewActivity, privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, String str) throws GSSException {
        return super.MediaBrowserCompat$CustomActionResultReceiver(bArr, str);
    }

    /* access modifiers changed from: protected */
    public final byte[] IconCompatParcelizer(byte[] bArr, String str, PurchaseReviewActivity purchaseReviewActivity) throws GSSException {
        return MediaBrowserCompat$CustomActionResultReceiver(bArr, new Oid("1.2.840.113554.1.2.2"), str, purchaseReviewActivity);
    }
}
