package p040o;

import org.apache.http.auth.AuthenticationException;

/* renamed from: o.RegistrationCardDetailActivity */
public interface RegistrationCardDetailActivity extends ManagePromptpayLandingActivity {
    PrepaidRequestMarketConductActivity read(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws AuthenticationException;
}
