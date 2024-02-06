package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.SelectRecipientFromFavouriteAdapter$RecipientViewHolder */
public final class SelectRecipientFromFavouriteAdapter$RecipientViewHolder extends MerchantWalletViewPagerAdapter$ItemViewHolder_ViewBinding implements GiftingStatusBaseActivity {
    public final String read() {
        return "version";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        } else if (!str.trim().isEmpty()) {
            try {
                thirdPartyConsentFragment.write(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid version: ");
                sb.append(e.getMessage());
                throw new MalformedCookieException(sb.toString());
            }
        } else {
            throw new MalformedCookieException("Blank value for version attribute");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        if (splashActivity.RatingCompat() < 0) {
            throw new CookieRestrictionViolationException("Cookie version may not be negative");
        }
    }
}
