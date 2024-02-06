package p040o;

import java.nio.charset.Charset;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;

/* renamed from: o.ScanPaymentActivity_ViewBinding */
public final class ScanPaymentActivity_ViewBinding extends CardlessATMCoachMarkActivity_ViewBinding {
    private boolean read;

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return false;
    }

    public final String read() {
        return "basic";
    }

    public ScanPaymentActivity_ViewBinding(Charset charset) {
        super(charset);
        this.read = false;
    }

    public ScanPaymentActivity_ViewBinding() {
        this(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) throws MalformedChallengeException {
        super.MediaBrowserCompat$CustomActionResultReceiver(prepaidRequestMarketConductActivity);
        this.read = true;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read;
    }

    @Deprecated
    public final PrepaidRequestMarketConductActivity IconCompatParcelizer(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity) throws AuthenticationException {
        return read(purchaseReviewActivity, privacyConsentActivity, new RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding());
    }

    public final PrepaidRequestMarketConductActivity read(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws AuthenticationException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(purchaseReviewActivity, "Credentials");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        StringBuilder sb = new StringBuilder();
        sb.append(purchaseReviewActivity.MediaBrowserCompat$ItemReceiver().getName());
        sb.append(":");
        sb.append(purchaseReviewActivity.write() == null ? "null" : purchaseReviewActivity.write());
        new SetupQuickTopUpActivity(0);
        byte[] IconCompatParcelizer = SetupQuickTopUpActivity.IconCompatParcelizer(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity)));
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(32);
        if (write()) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("Proxy-Authorization");
        } else {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("Authorization");
        }
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(": Basic ");
        depositTransactionAdapter$ChildViewHolder_ViewBinding.write(IconCompatParcelizer, 0, IconCompatParcelizer.length);
        return new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BASIC [complete=");
        sb.append(this.read);
        sb.append("]");
        return sb.toString();
    }
}
