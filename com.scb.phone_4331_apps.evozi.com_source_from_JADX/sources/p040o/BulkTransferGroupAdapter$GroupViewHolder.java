package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BulkTransferGroupAdapter$GroupViewHolder */
public abstract class BulkTransferGroupAdapter$GroupViewHolder extends PrepaidViewPagerAdapter$TransactionItemViewHolder_ViewBinding {
    public BulkTransferGroupAdapter$GroupViewHolder() {
    }

    protected BulkTransferGroupAdapter$GroupViewHolder(GiftingStatusBaseActivity... giftingStatusBaseActivityArr) {
        super(giftingStatusBaseActivityArr);
    }

    /* access modifiers changed from: protected */
    public List<SplashActivity> IconCompatParcelizer(PrepaidTravelConversionLandingActivity_ViewBinding[] prepaidTravelConversionLandingActivity_ViewBindingArr, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        ArrayList arrayList = new ArrayList(prepaidTravelConversionLandingActivity_ViewBindingArr.length);
        for (PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding : prepaidTravelConversionLandingActivity_ViewBindingArr) {
            String read = prepaidTravelConversionLandingActivity_ViewBinding.read();
            String write = prepaidTravelConversionLandingActivity_ViewBinding.write();
            if (read != null && !read.isEmpty()) {
                MerchantWalletViewPagerAdapter$ItemViewHolder merchantWalletViewPagerAdapter$ItemViewHolder = new MerchantWalletViewPagerAdapter$ItemViewHolder(read, write);
                merchantWalletViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(easyAppTermsAndConditionsActivity);
                String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
                if (str != null) {
                    merchantWalletViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver = str.toLowerCase(Locale.ROOT);
                } else {
                    merchantWalletViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver = null;
                }
                AddAccountsActivity[] MediaBrowserCompat$ItemReceiver = prepaidTravelConversionLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
                for (int length = MediaBrowserCompat$ItemReceiver.length - 1; length >= 0; length--) {
                    AddAccountsActivity addAccountsActivity = MediaBrowserCompat$ItemReceiver[length];
                    String lowerCase = addAccountsActivity.IconCompatParcelizer().toLowerCase(Locale.ROOT);
                    merchantWalletViewPagerAdapter$ItemViewHolder.IconCompatParcelizer.put(lowerCase, addAccountsActivity.MediaBrowserCompat$ItemReceiver());
                    JuristicEasyAppTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(lowerCase);
                    if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((ThirdPartyConsentFragment) merchantWalletViewPagerAdapter$ItemViewHolder, addAccountsActivity.MediaBrowserCompat$ItemReceiver());
                    }
                }
                arrayList.add(merchantWalletViewPagerAdapter$ItemViewHolder);
            }
        }
        return arrayList;
    }

    public void write(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        for (JuristicEasyAppTermsAndConditionsActivity MediaBrowserCompat$ItemReceiver : IconCompatParcelizer()) {
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(splashActivity, easyAppTermsAndConditionsActivity);
        }
    }

    public boolean MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        for (JuristicEasyAppTermsAndConditionsActivity IconCompatParcelizer : IconCompatParcelizer()) {
            if (!IconCompatParcelizer.IconCompatParcelizer(splashActivity, easyAppTermsAndConditionsActivity)) {
                return false;
            }
        }
        return true;
    }

    protected static String MediaBrowserCompat$CustomActionResultReceiver(EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        String str = easyAppTermsAndConditionsActivity.write;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return str;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return str.substring(0, lastIndexOf);
    }
}
