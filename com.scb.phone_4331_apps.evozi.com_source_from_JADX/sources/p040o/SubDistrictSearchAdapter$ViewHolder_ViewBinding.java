package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.SubDistrictSearchAdapter$ViewHolder_ViewBinding */
public final class SubDistrictSearchAdapter$ViewHolder_ViewBinding extends MerchantWalletViewPagerAdapter$ItemViewHolder_ViewBinding implements GiftingStatusBaseActivity {
    public final String read() {
        return "secure";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        thirdPartyConsentFragment.MediaBrowserCompat$SearchResultReceiver();
    }

    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        return !splashActivity.MediaMetadataCompat() || easyAppTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver;
    }
}
