package p040o;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.RemittanceCoachmarkActivity */
public final class RemittanceCoachmarkActivity {
    private PrepaidResetOtpActivity IconCompatParcelizer;
    private AccountTargetAdapter$AccountViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private Charset MediaBrowserCompat$ItemReceiver;
    private ReviewAccountsActivity MediaBrowserCompat$SearchResultReceiver;
    private List<AddAccountsActivity> MediaMetadataCompat;
    private String RatingCompat;
    public URI read;
    private gotoFindUs write;

    private RemittanceCoachmarkActivity(byte b) {
        this.MediaBrowserCompat$ItemReceiver = PrepaidRequestProductCatalogActivity.write;
        this.RatingCompat = null;
    }

    public RemittanceCoachmarkActivity() {
        this((byte) 0);
    }

    public final RemittanceCoachmarkActivity IconCompatParcelizer(PrivacyConsentActivity privacyConsentActivity) {
        if (privacyConsentActivity == null) {
            return this;
        }
        this.RatingCompat = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$SearchResultReceiver = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new AccountTargetAdapter$AccountViewHolder_ViewBinding();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.clear();
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        PrepaidRequestMarketConductActivity[] aV_ = privacyConsentActivity.aV_();
        accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.clear();
        if (aV_ != null) {
            Collections.addAll(accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver, aV_);
        }
        this.MediaMetadataCompat = null;
        this.IconCompatParcelizer = null;
        if (privacyConsentActivity instanceof PrepaidResetPinSuccessActivity_ViewBinding) {
            PrepaidResetOtpActivity IconCompatParcelizer2 = ((PrepaidResetPinSuccessActivity_ViewBinding) privacyConsentActivity).IconCompatParcelizer();
            FavouriteSelectedActivity write2 = FavouriteSelectedActivity.write(IconCompatParcelizer2);
            if (write2 == null || !write2.MediaBrowserCompat$ItemReceiver.equals(FavouriteSelectedActivity.write.MediaBrowserCompat$ItemReceiver)) {
                this.IconCompatParcelizer = IconCompatParcelizer2;
            } else {
                try {
                    List<AddAccountsActivity> read2 = RemittanceSenderAddressReviewActivity.read(IconCompatParcelizer2);
                    if (!read2.isEmpty()) {
                        this.MediaMetadataCompat = read2;
                    }
                } catch (IOException unused) {
                }
            }
        }
        if (privacyConsentActivity instanceof RemittanceCoachmarkActivity_ViewBinding) {
            this.read = ((RemittanceCoachmarkActivity_ViewBinding) privacyConsentActivity).MediaDescriptionCompat();
        } else {
            this.read = URI.create(privacyConsentActivity.MediaBrowserCompat$MediaItem().read());
        }
        if (privacyConsentActivity instanceof RegistrationTermsAndConsActivity) {
            this.write = ((RegistrationTermsAndConsActivity) privacyConsentActivity).read();
        } else {
            this.write = null;
        }
        return this;
    }

    public final RemittanceCoachmarkActivity_ViewBinding MediaBrowserCompat$ItemReceiver() {
        PreregistrationLandingActivity preregistrationLandingActivity;
        URI uri = this.read;
        if (uri == null) {
            uri = URI.create("/");
        }
        PrepaidResetOtpActivity prepaidResetOtpActivity = this.IconCompatParcelizer;
        List<AddAccountsActivity> list = this.MediaMetadataCompat;
        if (list != null && !list.isEmpty()) {
            if (prepaidResetOtpActivity != null || (!"POST".equalsIgnoreCase(this.RatingCompat) && !"PUT".equalsIgnoreCase(this.RatingCompat))) {
                try {
                    RemittanceSuccessActivity remittanceSuccessActivity = new RemittanceSuccessActivity(uri);
                    remittanceSuccessActivity.write = this.MediaBrowserCompat$ItemReceiver;
                    List<AddAccountsActivity> list2 = this.MediaMetadataCompat;
                    if (remittanceSuccessActivity.MediaSessionCompat$Token == null) {
                        remittanceSuccessActivity.MediaSessionCompat$Token = new ArrayList();
                    }
                    remittanceSuccessActivity.MediaSessionCompat$Token.addAll(list2);
                    remittanceSuccessActivity.IconCompatParcelizer = null;
                    remittanceSuccessActivity.MediaMetadataCompat = null;
                    uri = new URI(remittanceSuccessActivity.read());
                } catch (URISyntaxException unused) {
                }
            } else {
                List<AddAccountsActivity> list3 = this.MediaMetadataCompat;
                Charset charset = this.MediaBrowserCompat$ItemReceiver;
                if (charset == null) {
                    charset = CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                }
                prepaidResetOtpActivity = new RegistrationNoDataActivity_ViewBinding(list3, charset);
            }
        }
        if (prepaidResetOtpActivity == null) {
            preregistrationLandingActivity = new C9809xcdbe4105(this.RatingCompat);
        } else {
            read read2 = new read(this.RatingCompat);
            read2.write = prepaidResetOtpActivity;
            preregistrationLandingActivity = read2;
        }
        preregistrationLandingActivity.read = this.MediaBrowserCompat$SearchResultReceiver;
        preregistrationLandingActivity.MediaBrowserCompat$ItemReceiver = uri;
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountTargetAdapter$AccountViewHolder_ViewBinding != null) {
            List<PrepaidRequestMarketConductActivity> list4 = accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            preregistrationLandingActivity.IconCompatParcelizer((PrepaidRequestMarketConductActivity[]) list4.toArray(new PrepaidRequestMarketConductActivity[list4.size()]));
        }
        preregistrationLandingActivity.IconCompatParcelizer = this.write;
        return preregistrationLandingActivity;
    }

    /* renamed from: o.RemittanceCoachmarkActivity$read */
    static class read extends PreregistrationInformationActivity {
        private final String MediaBrowserCompat$SearchResultReceiver;

        read(String str) {
            this.MediaBrowserCompat$SearchResultReceiver = str;
        }

        public final String aW_() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RequestBuilder [method=");
        sb.append(this.RatingCompat);
        sb.append(", charset=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", version=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", uri=");
        sb.append(this.read);
        sb.append(", headerGroup=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", entity=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", parameters=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", config=");
        sb.append(this.write);
        sb.append("]");
        return sb.toString();
    }
}
