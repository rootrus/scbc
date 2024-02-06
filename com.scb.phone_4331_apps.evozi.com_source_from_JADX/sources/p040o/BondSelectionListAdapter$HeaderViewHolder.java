package p040o;

import com.google.android.gms.common.api.Api;
import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.List;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BondSelectionListAdapter$HeaderViewHolder */
public class BondSelectionListAdapter$HeaderViewHolder implements ThirdPartyConsentActivity {
    private final BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding IconCompatParcelizer;
    private final C9821x9cfbcc54 MediaBrowserCompat$CustomActionResultReceiver;
    private final ManageGroupAdapter$RecipientViewHolder write;

    public final PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return 1;
    }

    public String toString() {
        return FragmentBuilder_BindEasycashReferralSendDfwFragment.DEFAULT_IDENTIFIER;
    }

    public BondSelectionListAdapter$HeaderViewHolder(String[] strArr, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new C9821x9cfbcc54(z, new C9706xbda6364f(), new SubDistrictSearchAdapter$ViewHolder(), new RecipientsReviewAdapter$RecipientsReviewViewHolder(), new C9705xb11267e8(), new BankingAgentAdapter$ItemViewHolder(), new SubDistrictSearchAdapter$ViewHolder_ViewBinding(), new LoanViewPagerAdapter$ItemViewHolder_ViewBinding(), new RecipientsAdapter$RecipientsHolder_ViewBinding(), new RecipientsReviewAdapter$RecipientsReviewViewHolder_ViewBinding());
        this.IconCompatParcelizer = new BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding(z, new SelectRecipientFromFavouriteAdapter$RecipientViewHolder(), new SubDistrictSearchAdapter$ViewHolder(), new BulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder(), new BankingAgentAdapter$ItemViewHolder(), new SubDistrictSearchAdapter$ViewHolder_ViewBinding(), new LoanViewPagerAdapter$ItemViewHolder_ViewBinding());
        GiftingStatusBaseActivity[] giftingStatusBaseActivityArr = new GiftingStatusBaseActivity[5];
        giftingStatusBaseActivityArr[0] = new BankingActionAdapter$CustomViewHolder();
        giftingStatusBaseActivityArr[1] = new SubDistrictSearchAdapter$ViewHolder();
        giftingStatusBaseActivityArr[2] = new SubDistrictSearchAdapter$ViewHolder_ViewBinding();
        giftingStatusBaseActivityArr[3] = new LoanViewPagerAdapter$ItemViewHolder_ViewBinding();
        giftingStatusBaseActivityArr[4] = new BankingActionAdapter$CustomViewHolder_ViewBinding(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        this.write = new ManageGroupAdapter$RecipientViewHolder(giftingStatusBaseActivityArr);
    }

    public BondSelectionListAdapter$HeaderViewHolder() {
        this((String[]) null, false);
    }

    public final List<SplashActivity> MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup;
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        PrepaidTravelConversionLandingActivity_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver2 = prepaidRequestMarketConductActivity.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z = false;
        boolean z2 = false;
        for (PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding : MediaBrowserCompat$CustomActionResultReceiver2) {
            if (prepaidTravelConversionLandingActivity_ViewBinding.IconCompatParcelizer("version") != null) {
                z2 = true;
            }
            if (prepaidTravelConversionLandingActivity_ViewBinding.IconCompatParcelizer("expires") != null) {
                z = true;
            }
        }
        if (!z && z2) {
            return "Set-Cookie2".equals(prepaidRequestMarketConductActivity.IconCompatParcelizer()) ? this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, easyAppTermsAndConditionsActivity) : this.IconCompatParcelizer.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, easyAppTermsAndConditionsActivity);
        }
        C9669x39e729da bulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding = C9669x39e729da.MediaBrowserCompat$ItemReceiver;
        if (prepaidRequestMarketConductActivity instanceof PrepaidRequestLandingActivity) {
            PrepaidRequestLandingActivity prepaidRequestLandingActivity = (PrepaidRequestLandingActivity) prepaidRequestMarketConductActivity;
            depositTransactionAdapter$ChildViewHolder_ViewBinding = prepaidRequestLandingActivity.read();
            radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(prepaidRequestLandingActivity.write(), depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
        } else {
            String MediaBrowserCompat$ItemReceiver = prepaidRequestMarketConductActivity.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver != null) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(MediaBrowserCompat$ItemReceiver.length());
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver);
                radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
            } else {
                throw new MalformedCookieException("Header value is null");
            }
        }
        return this.write.IconCompatParcelizer(new PrepaidTravelConversionLandingActivity_ViewBinding[]{bulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup)}, easyAppTermsAndConditionsActivity);
    }

    public final void write(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        if (splashActivity.RatingCompat() <= 0) {
            this.write.write(splashActivity, easyAppTermsAndConditionsActivity);
        } else if (splashActivity instanceof EDonationConsentActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(splashActivity, easyAppTermsAndConditionsActivity);
        } else {
            this.IconCompatParcelizer.write(splashActivity, easyAppTermsAndConditionsActivity);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        if (splashActivity.RatingCompat() <= 0) {
            return this.write.MediaBrowserCompat$ItemReceiver(splashActivity, easyAppTermsAndConditionsActivity);
        }
        return (splashActivity instanceof EDonationConsentActivity ? this.MediaBrowserCompat$CustomActionResultReceiver : this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(splashActivity, easyAppTermsAndConditionsActivity);
    }

    public final List<PrepaidRequestMarketConductActivity> write(List<SplashActivity> list) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(list, "List of cookies");
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        boolean z = true;
        for (SplashActivity next : list) {
            if (!(next instanceof EDonationConsentActivity)) {
                z = false;
            }
            if (next.RatingCompat() < i) {
                i = next.RatingCompat();
            }
        }
        if (i <= 0) {
            return this.write.write(list);
        }
        return (z ? this.MediaBrowserCompat$CustomActionResultReceiver : this.IconCompatParcelizer).write(list);
    }
}
