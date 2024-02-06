package p040o;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpException;

/* renamed from: o.RemittanceAddFavouriteInputActivity */
public final class RemittanceAddFavouriteInputActivity implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = PrepaidOtpActivity.write((Class) getClass());

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        URI uri;
        boolean z;
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver2;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        if (!privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver().equalsIgnoreCase("CONNECT")) {
            RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
            Class<RegistrationLivenessCheckActivity> cls = RegistrationLivenessCheckActivity.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.cookie-store");
            String str = null;
            RegistrationLivenessCheckActivity cast = MediaBrowserCompat$ItemReceiver == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver);
            if (cast == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write("Cookie store not specified in HTTP context");
                return;
            }
            Class<FacebookConsentDeepLinkActivity> cls2 = FacebookConsentDeepLinkActivity.class;
            Class<RequestToPayActivity> cls3 = RequestToPayActivity.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls3, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.cookiespec-registry");
            RequestToPayActivity cast2 = MediaBrowserCompat$ItemReceiver2 == null ? null : cls3.cast(MediaBrowserCompat$ItemReceiver2);
            if (cast2 == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write("CookieSpec registry not specified in HTTP context");
                return;
            }
            Class<PrivacyManagementLandingViewHolder> cls4 = PrivacyManagementLandingViewHolder.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls4, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver3 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.target_host");
            PrivacyManagementLandingViewHolder cast3 = MediaBrowserCompat$ItemReceiver3 == null ? null : cls4.cast(MediaBrowserCompat$ItemReceiver3);
            if (cast3 == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write("Target host not set in the context");
                return;
            }
            Class<GiftOpenSharingMomentActivity_ViewBinding> cls5 = GiftOpenSharingMomentActivity_ViewBinding.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls5, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver4 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.route");
            previewButton cast4 = MediaBrowserCompat$ItemReceiver4 == null ? null : cls5.cast(MediaBrowserCompat$ItemReceiver4);
            if (cast4 == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write("Connection route not set in the context");
                return;
            }
            Class<gotoFindUs> cls6 = gotoFindUs.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls6, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver5 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.request-config");
            gotoFindUs cast5 = MediaBrowserCompat$ItemReceiver5 == null ? null : cls6.cast(MediaBrowserCompat$ItemReceiver5);
            if (cast5 == null) {
                cast5 = gotoFindUs.IconCompatParcelizer;
            }
            String str2 = cast5.RatingCompat;
            if (str2 == null) {
                str2 = FragmentBuilder_BindEasycashReferralSendDfwFragment.DEFAULT_IDENTIFIER;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("CookieSpec selected: ");
                sb.append(str2);
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            if (privacyConsentActivity instanceof RemittanceCoachmarkActivity_ViewBinding) {
                uri = ((RemittanceCoachmarkActivity_ViewBinding) privacyConsentActivity).MediaDescriptionCompat();
            } else {
                try {
                    uri = new URI(privacyConsentActivity.MediaBrowserCompat$MediaItem().read());
                } catch (URISyntaxException unused) {
                    uri = null;
                }
            }
            if (uri != null) {
                str = uri.getPath();
            }
            String str3 = cast3.write;
            int i = cast3.MediaBrowserCompat$CustomActionResultReceiver;
            if (i < 0) {
                i = cast4.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$CustomActionResultReceiver;
            }
            boolean z2 = false;
            if (i < 0) {
                i = 0;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "/";
            }
            EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity = new EasyAppTermsAndConditionsActivity(str3, i, str, cast4.MediaDescriptionCompat());
            ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver3 = ((FacebookConsentDeepLinkActivity) cast2.read(str2)).MediaBrowserCompat$CustomActionResultReceiver(remittanceAddFavouriteRecipientDetailActivity);
            List<SplashActivity> MediaBrowserCompat$ItemReceiver6 = cast.MediaBrowserCompat$ItemReceiver();
            ArrayList arrayList = new ArrayList();
            Date date = new Date();
            for (SplashActivity next : MediaBrowserCompat$ItemReceiver6) {
                if (next.MediaBrowserCompat$ItemReceiver(date)) {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                        PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cookie ");
                        sb2.append(next);
                        sb2.append(" expired");
                        prepaidTravelCoachMarkActivity_ViewBinding2.write(sb2.toString());
                    }
                    z2 = true;
                } else if (MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver(next, easyAppTermsAndConditionsActivity)) {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                        PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Cookie ");
                        sb3.append(next);
                        sb3.append(" match ");
                        sb3.append(easyAppTermsAndConditionsActivity);
                        prepaidTravelCoachMarkActivity_ViewBinding3.write(sb3.toString());
                    }
                    arrayList.add(next);
                }
            }
            if (z2) {
                cast.write(date);
            }
            if (!arrayList.isEmpty()) {
                for (PrepaidRequestMarketConductActivity MediaBrowserCompat$ItemReceiver7 : MediaBrowserCompat$CustomActionResultReceiver3.write(arrayList)) {
                    privacyConsentActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver7);
                }
            }
            if (MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver() > 0 && (MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver()) != null) {
                privacyConsentActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
            }
            creditCardBilledDetailAdapter$ParentViewHolder.write("http.cookie-spec", MediaBrowserCompat$CustomActionResultReceiver3);
            creditCardBilledDetailAdapter$ParentViewHolder.write("http.cookie-origin", easyAppTermsAndConditionsActivity);
        }
    }
}
