package p040o;

import com.thunderhead.android.infrastructure.data.DataSource;
import com.thunderhead.android.infrastructure.data.DataSource$MediaBrowserCompat$CustomActionResultReceiver;
import com.thunderhead.android.infrastructure.features.interactions.allowedinteractions.AllowedInteractionsApi;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.HmlVerifyIdentifyActivity;
import retrofit2.Response;

/* renamed from: o.FragmentBuilder_BindRegistrationSuccessFragment */
public final class FragmentBuilder_BindRegistrationSuccessFragment implements FragmentBuilder_BindPayNowSuccessFragment<FragmentBuilder_BindPurchaseProfileManagementFragment, FragmentBuilder_BindQuantityPointsPlusMoneyFragment> {
    private final AllowedInteractionsApi IconCompatParcelizer;
    private final String write;

    public FragmentBuilder_BindRegistrationSuccessFragment(AllowedInteractionsApi allowedInteractionsApi) {
        onGetStartedClick.write((Object) allowedInteractionsApi, "api");
        this.IconCompatParcelizer = allowedInteractionsApi;
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this.javaClass.simpleName");
        this.write = simpleName;
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(DataSource$MediaBrowserCompat$CustomActionResultReceiver dataSource$MediaBrowserCompat$CustomActionResultReceiver, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        String str;
        String str2;
        String str3;
        String str4;
        String obj;
        String str5;
        List list;
        String str6;
        String str7;
        URI uri;
        FragmentBuilder_BindQuantityPointsPlusMoneyFragment fragmentBuilder_BindQuantityPointsPlusMoneyFragment = (FragmentBuilder_BindQuantityPointsPlusMoneyFragment) dataSource$MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.IconCompatParcelizer;
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver;
        URI uri2 = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.write;
        FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment = null;
        if (uri2 != null) {
            str = uri2.toString();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
            if (fragmentBuilder_BindHmlOperatingBankFragment == null || (uri = fragmentBuilder_BindHmlOperatingBankFragment.write) == null) {
                str2 = null;
            } else {
                str2 = uri.toString();
            }
            CharSequence charSequence2 = str2;
            if (!(charSequence2 == null || GoodToKnowActivity.read(charSequence2))) {
                if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null) {
                    str3 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read;
                } else {
                    str3 = null;
                }
                CharSequence charSequence3 = str3;
                if (!(charSequence3 == null || GoodToKnowActivity.read(charSequence3))) {
                    AllowedInteractionsApi allowedInteractionsApi = this.IconCompatParcelizer;
                    MailingAddressReviewActivity mailingAddressReviewActivity = new MailingAddressReviewActivity(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), 1);
                    MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = mailingAddressReviewActivity;
                    CharSequence charSequence4 = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.read;
                    String str8 = charSequence4 == null || GoodToKnowActivity.read(charSequence4) ? null : fragmentBuilder_BindQuantityPointsPlusMoneyFragment.read;
                    FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment2 = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    String str9 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment2.read;
                    String valueOf = String.valueOf(fragmentBuilder_BindQuantityPointsPlusMoneyFragment.write);
                    FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$ItemReceiver;
                    if (fragmentBuilder_BindRegistrationLandingFragment != null) {
                        str4 = fragmentBuilder_BindRegistrationLandingFragment.IconCompatParcelizer;
                    } else {
                        str4 = null;
                    }
                    Response<FragmentBuilder_BindQuickPromptPayFragment> execute = allowedInteractionsApi.retrieve(str9, valueOf, str8, str4).execute();
                    onGetStartedClick.IconCompatParcelizer((Object) execute, "response");
                    String str10 = "Error";
                    if (execute.isSuccessful() && execute.code() != 304) {
                        String str11 = execute.headers().get("etag");
                        FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment2 = str11 != null ? new FragmentBuilder_BindRegistrationLandingFragment(str11) : null;
                        List<String> list2 = execute.body().MediaBrowserCompat$ItemReceiver;
                        if (list2 != null) {
                            Collection arrayList = new ArrayList();
                            for (String str12 : list2) {
                                FragmentBuilder_BindHmlOutcomeRejectFragment fragmentBuilder_BindHmlOutcomeRejectFragment = str12 != null ? new FragmentBuilder_BindHmlOutcomeRejectFragment(str12) : null;
                                if (fragmentBuilder_BindHmlOutcomeRejectFragment != null) {
                                    arrayList.add(fragmentBuilder_BindHmlOutcomeRejectFragment);
                                }
                            }
                            list = (List) arrayList;
                        } else {
                            list = HmlNationalIdActivity.IconCompatParcelizer;
                        }
                        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = FragmentBuilder_BindLoanFragment.SERVER_SUCCESS;
                        Object[] objArr = new Object[4];
                        objArr[0] = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver.read;
                        URI uri3 = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.write;
                        if (uri3 == null || (str6 = uri3.toString()) == null) {
                            str6 = str10;
                        }
                        objArr[1] = str6;
                        if (!(fragmentBuilder_BindRegistrationLandingFragment2 == null || (str7 = fragmentBuilder_BindRegistrationLandingFragment2.IconCompatParcelizer) == null)) {
                            str10 = str7;
                        }
                        objArr[2] = str10;
                        objArr[3] = list;
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMerchantWalletSelectorFragment, objArr);
                        fragmentBuilder_BindPurchaseProfileManagementFragment = new FragmentBuilder_BindPurchaseProfileManagementFragment(list, fragmentBuilder_BindRegistrationLandingFragment2);
                    } else if (execute.code() == 304) {
                        String str13 = execute.headers().get("etag");
                        FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment3 = str13 != null ? new FragmentBuilder_BindRegistrationLandingFragment(str13) : null;
                        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = FragmentBuilder_BindLoanFragment.SERVER_SUCCESS_CACHE;
                        Object[] objArr2 = new Object[1];
                        if (!(fragmentBuilder_BindRegistrationLandingFragment3 == null || (str5 = fragmentBuilder_BindRegistrationLandingFragment3.IconCompatParcelizer) == null)) {
                            str10 = str5;
                        }
                        objArr2[0] = str10;
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMerchantWalletSelectorFragment2, objArr2);
                        fragmentBuilder_BindPurchaseProfileManagementFragment = new FragmentBuilder_BindPurchaseProfileManagementFragment((List<FragmentBuilder_BindHmlOutcomeRejectFragment>) null, fragmentBuilder_BindRegistrationLandingFragment3);
                    } else {
                        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment3 = FragmentBuilder_BindLoanFragment.SERVER_FAILURE;
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver.read;
                        URI uri4 = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.write;
                        if (!(uri4 == null || (obj = uri4.toString()) == null)) {
                            str10 = obj;
                        }
                        objArr3[1] = str10;
                        objArr3[2] = Integer.valueOf(execute.code());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(fragmentBuilder_BindMerchantWalletSelectorFragment3, objArr3);
                    }
                    if (mailingAddressReviewOTPActivity.IconCompatParcelizer()) {
                        if (fragmentBuilder_BindPurchaseProfileManagementFragment == null) {
                            HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity2 = mailingAddressReviewOTPActivity;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Server Request Failure: ");
                            sb.append(execute.code());
                            sb.append(' ');
                            Object errorBody = execute.errorBody();
                            if (errorBody == null) {
                                errorBody = "";
                            }
                            sb.append(errorBody);
                            Throwable dataSourceException = new DataSource.DataSourceException(sb.toString(), 2);
                            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                            onGetStartedClick.write((Object) dataSourceException, "exception");
                            hmlNTBPromptPayNotFoundActivity2.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(dataSourceException)));
                        } else {
                            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                            mailingAddressReviewOTPActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindPurchaseProfileManagementFragment));
                        }
                    }
                    Object MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                    if (MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
                    }
                    return MediaBrowserCompat$CustomActionResultReceiver;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.write);
        sb2.append("#retrieve");
        MyECouponActivity_ViewBinding.IconCompatParcelizer((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindLoanFragment.INVALID_KEY_FOR_OPERATION, fragmentBuilder_BindQuantityPointsPlusMoneyFragment, sb2.toString());
        return null;
    }
}
