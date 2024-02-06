package p040o;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;

/* renamed from: o.TransferGiftingInputActivity_ViewBinding */
public final class TransferGiftingInputActivity_ViewBinding implements RegistrationSuccessActivity {
    private final String[] IconCompatParcelizer;
    private final PrepaidTravelCoachMarkActivity_ViewBinding write;

    static {
        new TransferGiftingInputActivity_ViewBinding();
    }

    public TransferGiftingInputActivity_ViewBinding() {
        this(new String[]{"GET", "HEAD"});
    }

    private TransferGiftingInputActivity_ViewBinding(String[] strArr) {
        this.write = PrepaidOtpActivity.write((Class) getClass());
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.IconCompatParcelizer = strArr2;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(PrivacyConsentActivity privacyConsentActivity, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) throws ProtocolException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        int MediaBrowserCompat$CustomActionResultReceiver = scbPrivacyPolicyActivity.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver();
        String MediaBrowserCompat$ItemReceiver = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver();
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver2 = scbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver("location");
        if (MediaBrowserCompat$CustomActionResultReceiver != 307) {
            switch (MediaBrowserCompat$CustomActionResultReceiver) {
                case 301:
                    break;
                case 302:
                    if (!(Arrays.binarySearch(this.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver) >= 0) || MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                        return false;
                    }
                    return true;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        if (Arrays.binarySearch(this.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver) >= 0) {
            return true;
        }
        return false;
    }

    private URI IconCompatParcelizer(PrivacyConsentActivity privacyConsentActivity, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws ProtocolException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver = scbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver("location");
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            String MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            if (this.write.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.write;
                StringBuilder sb = new StringBuilder();
                sb.append("Redirect requested to location '");
                sb.append(MediaBrowserCompat$ItemReceiver);
                sb.append("'");
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            Class<gotoFindUs> cls = gotoFindUs.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.request-config");
            PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = null;
            gotoFindUs cast = MediaBrowserCompat$ItemReceiver2 == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver2);
            if (cast == null) {
                cast = gotoFindUs.IconCompatParcelizer;
            }
            URI MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
            try {
                if (cast.MediaBrowserCompat$SearchResultReceiver) {
                    MediaBrowserCompat$ItemReceiver3 = RemittanceSenderAddressActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver3);
                }
                if (!MediaBrowserCompat$ItemReceiver3.isAbsolute()) {
                    if (cast.MediaSessionCompat$ResultReceiverWrapper) {
                        Class<PrivacyManagementLandingViewHolder> cls2 = PrivacyManagementLandingViewHolder.class;
                        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls2, "Attribute class");
                        Object MediaBrowserCompat$ItemReceiver4 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.target_host");
                        if (MediaBrowserCompat$ItemReceiver4 != null) {
                            privacyManagementLandingViewHolder = cls2.cast(MediaBrowserCompat$ItemReceiver4);
                        }
                        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder2 = privacyManagementLandingViewHolder;
                        DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(privacyManagementLandingViewHolder2, "Target host");
                        MediaBrowserCompat$ItemReceiver3 = RemittanceSenderAddressActivity.read(RemittanceSenderAddressActivity.write(new URI(privacyConsentActivity.MediaBrowserCompat$MediaItem().read()), privacyManagementLandingViewHolder2, cast.MediaBrowserCompat$SearchResultReceiver ? RemittanceSenderAddressActivity.MediaBrowserCompat$ItemReceiver : RemittanceSenderAddressActivity.MediaBrowserCompat$CustomActionResultReceiver), MediaBrowserCompat$ItemReceiver3);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Relative redirect location '");
                        sb2.append(MediaBrowserCompat$ItemReceiver3);
                        sb2.append("' not allowed");
                        throw new ProtocolException(sb2.toString());
                    }
                }
                BaseHighlightAdapter$BannerViewHolder_ViewBinding baseHighlightAdapter$BannerViewHolder_ViewBinding = (BaseHighlightAdapter$BannerViewHolder_ViewBinding) remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.protocol.redirect-locations");
                if (baseHighlightAdapter$BannerViewHolder_ViewBinding == null) {
                    baseHighlightAdapter$BannerViewHolder_ViewBinding = new BaseHighlightAdapter$BannerViewHolder_ViewBinding();
                    creditCardBilledDetailAdapter$ParentViewHolder.write("http.protocol.redirect-locations", baseHighlightAdapter$BannerViewHolder_ViewBinding);
                }
                if (cast.MediaBrowserCompat$ItemReceiver || !baseHighlightAdapter$BannerViewHolder_ViewBinding.write.contains(MediaBrowserCompat$ItemReceiver3)) {
                    baseHighlightAdapter$BannerViewHolder_ViewBinding.write.add(MediaBrowserCompat$ItemReceiver3);
                    baseHighlightAdapter$BannerViewHolder_ViewBinding.read.add(MediaBrowserCompat$ItemReceiver3);
                    return MediaBrowserCompat$ItemReceiver3;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Circular redirect to '");
                sb3.append(MediaBrowserCompat$ItemReceiver3);
                sb3.append("'");
                throw new CircularRedirectException(sb3.toString());
            } catch (URISyntaxException e) {
                throw new ProtocolException(e.getMessage(), e);
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Received redirect response ");
            sb4.append(scbPrivacyPolicyActivity.IconCompatParcelizer());
            sb4.append(" but no location header");
            throw new ProtocolException(sb4.toString());
        }
    }

    private static URI MediaBrowserCompat$ItemReceiver(String str) throws ProtocolException {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid redirect URI: ");
            sb.append(str);
            throw new ProtocolException(sb.toString(), e);
        }
    }

    public final RemittanceCoachmarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws ProtocolException {
        URI IconCompatParcelizer2 = IconCompatParcelizer(privacyConsentActivity, scbPrivacyPolicyActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        String MediaBrowserCompat$ItemReceiver = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver.equalsIgnoreCase("HEAD")) {
            return new PreregistrationPinActivity(IconCompatParcelizer2);
        }
        if (MediaBrowserCompat$ItemReceiver.equalsIgnoreCase("GET")) {
            return new PreregistrationOtpActivity(IconCompatParcelizer2);
        }
        if (scbPrivacyPolicyActivity.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver() != 307) {
            return new PreregistrationOtpActivity(IconCompatParcelizer2);
        }
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        RemittanceCoachmarkActivity IconCompatParcelizer3 = new RemittanceCoachmarkActivity().IconCompatParcelizer(privacyConsentActivity);
        IconCompatParcelizer3.read = IconCompatParcelizer2;
        return IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver();
    }
}
