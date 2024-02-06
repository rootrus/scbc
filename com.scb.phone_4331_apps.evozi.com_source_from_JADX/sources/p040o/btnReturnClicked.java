package p040o;

import java.util.Locale;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;

/* renamed from: o.btnReturnClicked */
public abstract class btnReturnClicked implements RegistrationCardDetailActivity {
    protected RegistrationCountrySearchActivity MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, int i, int i2) throws MalformedChallengeException;

    public void MediaBrowserCompat$CustomActionResultReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) throws MalformedChallengeException {
        int i;
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        String IconCompatParcelizer = prepaidRequestMarketConductActivity.IconCompatParcelizer();
        if (IconCompatParcelizer.equalsIgnoreCase("WWW-Authenticate")) {
            this.MediaBrowserCompat$ItemReceiver = RegistrationCountrySearchActivity.TARGET;
        } else if (IconCompatParcelizer.equalsIgnoreCase("Proxy-Authenticate")) {
            this.MediaBrowserCompat$ItemReceiver = RegistrationCountrySearchActivity.PROXY;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header name: ");
            sb.append(IconCompatParcelizer);
            throw new MalformedChallengeException(sb.toString());
        }
        if (prepaidRequestMarketConductActivity instanceof PrepaidRequestLandingActivity) {
            PrepaidRequestLandingActivity prepaidRequestLandingActivity = (PrepaidRequestLandingActivity) prepaidRequestMarketConductActivity;
            depositTransactionAdapter$ChildViewHolder_ViewBinding = prepaidRequestLandingActivity.read();
            i = prepaidRequestLandingActivity.write();
        } else {
            String MediaBrowserCompat$ItemReceiver2 = prepaidRequestMarketConductActivity.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(MediaBrowserCompat$ItemReceiver2.length());
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver2);
                i = 0;
            } else {
                throw new MalformedChallengeException("Header value is null");
            }
        }
        while (i < depositTransactionAdapter$ChildViewHolder_ViewBinding.length() && CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < depositTransactionAdapter$ChildViewHolder_ViewBinding.length() && !CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i2))) {
            i2++;
        }
        String MediaBrowserCompat$CustomActionResultReceiver = depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
        if (MediaBrowserCompat$CustomActionResultReceiver.equalsIgnoreCase(read())) {
            MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, i2, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid scheme identifier: ");
        sb2.append(MediaBrowserCompat$CustomActionResultReceiver);
        throw new MalformedChallengeException(sb2.toString());
    }

    public PrepaidRequestMarketConductActivity read(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws AuthenticationException {
        return IconCompatParcelizer(purchaseReviewActivity, privacyConsentActivity);
    }

    public final boolean write() {
        RegistrationCountrySearchActivity registrationCountrySearchActivity = this.MediaBrowserCompat$ItemReceiver;
        return registrationCountrySearchActivity != null && registrationCountrySearchActivity == RegistrationCountrySearchActivity.PROXY;
    }

    public String toString() {
        return read().toUpperCase(Locale.ROOT);
    }
}
