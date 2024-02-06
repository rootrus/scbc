package p040o;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.RemittanceReviewActivity */
public final class RemittanceReviewActivity implements ScbPrivacyPolicyActivity_ViewBinding {
    private final PrepaidTravelCoachMarkActivity_ViewBinding write = PrepaidOtpActivity.write((Class) getClass());

    public final void IconCompatParcelizer(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        Class<ThirdPartyConsentActivity> cls = ThirdPartyConsentActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.cookie-spec");
        EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity = null;
        ThirdPartyConsentActivity cast = MediaBrowserCompat$ItemReceiver == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver);
        if (cast == null) {
            this.write.write("Cookie spec not specified in HTTP context");
            return;
        }
        Class<RegistrationLivenessCheckActivity> cls2 = RegistrationLivenessCheckActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls2, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.cookie-store");
        RegistrationLivenessCheckActivity cast2 = MediaBrowserCompat$ItemReceiver2 == null ? null : cls2.cast(MediaBrowserCompat$ItemReceiver2);
        if (cast2 == null) {
            this.write.write("Cookie store not specified in HTTP context");
            return;
        }
        Class<EasyAppTermsAndConditionsActivity> cls3 = EasyAppTermsAndConditionsActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls3, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver3 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.cookie-origin");
        if (MediaBrowserCompat$ItemReceiver3 != null) {
            easyAppTermsAndConditionsActivity = cls3.cast(MediaBrowserCompat$ItemReceiver3);
        }
        EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity2 = easyAppTermsAndConditionsActivity;
        if (easyAppTermsAndConditionsActivity2 == null) {
            this.write.write("Cookie origin not specified in HTTP context");
            return;
        }
        write(scbPrivacyPolicyActivity.write("Set-Cookie"), cast, easyAppTermsAndConditionsActivity2, cast2);
        if (cast.MediaBrowserCompat$ItemReceiver() > 0) {
            write(scbPrivacyPolicyActivity.write("Set-Cookie2"), cast, easyAppTermsAndConditionsActivity2, cast2);
        }
    }

    private void write(PrepaidResetPinSuccessActivity prepaidResetPinSuccessActivity, ThirdPartyConsentActivity thirdPartyConsentActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity, RegistrationLivenessCheckActivity registrationLivenessCheckActivity) {
        while (prepaidResetPinSuccessActivity.hasNext()) {
            PrepaidRequestMarketConductActivity MediaBrowserCompat$ItemReceiver = prepaidResetPinSuccessActivity.MediaBrowserCompat$ItemReceiver();
            try {
                for (SplashActivity next : thirdPartyConsentActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, easyAppTermsAndConditionsActivity)) {
                    try {
                        thirdPartyConsentActivity.write(next, easyAppTermsAndConditionsActivity);
                        registrationLivenessCheckActivity.MediaBrowserCompat$ItemReceiver(next);
                        if (this.write.IconCompatParcelizer()) {
                            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.write;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cookie accepted [");
                            sb.append(MediaBrowserCompat$ItemReceiver(next));
                            sb.append("]");
                            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
                        }
                    } catch (MalformedCookieException e) {
                        if (this.write.MediaBrowserCompat$CustomActionResultReceiver()) {
                            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.write;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cookie rejected [");
                            sb2.append(MediaBrowserCompat$ItemReceiver(next));
                            sb2.append("] ");
                            sb2.append(e.getMessage());
                            prepaidTravelCoachMarkActivity_ViewBinding2.IconCompatParcelizer(sb2.toString());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (this.write.MediaBrowserCompat$CustomActionResultReceiver()) {
                    PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding3 = this.write;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid cookie header: \"");
                    sb3.append(MediaBrowserCompat$ItemReceiver);
                    sb3.append("\". ");
                    sb3.append(e2.getMessage());
                    prepaidTravelCoachMarkActivity_ViewBinding3.IconCompatParcelizer(sb3.toString());
                }
            }
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity) {
        StringBuilder sb = new StringBuilder();
        sb.append(splashActivity.MediaBrowserCompat$ItemReceiver());
        sb.append("=\"");
        String MediaDescriptionCompat = splashActivity.MediaDescriptionCompat();
        if (MediaDescriptionCompat != null) {
            if (MediaDescriptionCompat.length() > 100) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(MediaDescriptionCompat.substring(0, 100));
                sb2.append("...");
                MediaDescriptionCompat = sb2.toString();
            }
            sb.append(MediaDescriptionCompat);
        }
        sb.append("\"");
        sb.append(", version:");
        sb.append(Integer.toString(splashActivity.RatingCompat()));
        sb.append(", domain:");
        sb.append(splashActivity.MediaBrowserCompat$CustomActionResultReceiver());
        sb.append(", path:");
        sb.append(splashActivity.IconCompatParcelizer());
        sb.append(", expiry:");
        sb.append(splashActivity.write());
        return sb.toString();
    }
}
