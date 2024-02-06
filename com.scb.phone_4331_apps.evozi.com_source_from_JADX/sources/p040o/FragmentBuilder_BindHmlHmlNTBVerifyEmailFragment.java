package p040o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.thunderhead.android.api.responsetypes.OneSDKError;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.DeejungTransferMinFullOtpActivity;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindOthersTabFragment;
import p040o.FragmentBuilder_BindPreregistrationInfoFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onScanClick;

/* renamed from: o.FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment */
public final class FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment extends FragmentBuilder_BindHmlExternalInstructionFragment {
    private static final Object MediaBrowserCompat$ItemReceiver = new Object();
    private static HashSet<URI> MediaMetadataCompat = new HashSet<>();
    private static FragmentBuilder_BindHmlBusinessInformationFragment read;
    private static HashSet<URI> write = new HashSet<>();
    final FragmentBuilder_BindHmlNTBBusinessURLInfoFragment IconCompatParcelizer = new FragmentBuilder_BindHmlNTBBusinessURLInfoFragment();
    IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment() {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();
            CreateRecipientGroupActivity ExpandedMenuView = FragmentBuilder_BindHmlIssuerLandingFragment.ExpandedMenuView();
            if (ExpandedMenuView != null) {
                ExpandedMenuView.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindGiftSelectionEmptyStateFragment.IconCompatParcelizer);
            }
            BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_one_view_tag_key;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    static /* synthetic */ void read(Boolean bool) {
        String str = Boolean.TRUE.equals(bool) ? "true" : "false";
        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("Successfully loaded shared preferences: ");
        sb.append(str);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlNTBSummaryFragment fragmentBuilder_BindHmlNTBSummaryFragment, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        BaseRequest baseRequest;
        if (FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver())) {
            MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindManageEmailVerificationFragment.ERROR_WONT_SEND_REQUEST_IN_ADMIN_MODE);
        } else if (fragmentBuilder_BindHmlNTBSummaryFragment != null) {
            if (fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver != null) {
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("Set interaction: ");
                sb.append(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver.write);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            }
            FragmentBuilder_BindHmlNTBApplyLoanEntryFragment tabContainer = FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
            if (Boolean.FALSE.equals(Boolean.valueOf(FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver())))) {
                if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                    fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError("Thunderhead SDK has not been initialized yet"));
                }
                if (tabContainer != null) {
                    URI write3 = AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver, (FragmentBuilder_BindHmlNdidInstructionFragment) null);
                    if (write3 != null) {
                        baseRequest = new BaseRequest(write3.toString());
                    } else {
                        baseRequest = new BaseRequest(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver.write.getPath());
                    }
                    if (!tabContainer.write.hasData()) {
                        tabContainer.write = AlertController$RecycleListView.MediaBrowserCompat$MediaItem(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
                    }
                    baseRequest.setDeviceInfo(tabContainer.write);
                    if (fragmentBuilder_BindHmlNTBSummaryFragment.write != null) {
                        ECouponCommonActivity eCouponCommonActivity = new ECouponCommonActivity((String) null, fragmentBuilder_BindHmlNTBSummaryFragment.write);
                        if (!(eCouponCommonActivity.read == null || eCouponCommonActivity.read.size() == 0)) {
                            baseRequest.setProperties(eCouponCommonActivity.MediaBrowserCompat$CustomActionResultReceiver(new PropertiesRequest(eCouponCommonActivity.IconCompatParcelizer).getProperties()));
                        }
                    }
                    tabContainer.read.MediaBrowserCompat$ItemReceiver(false, baseRequest);
                    return;
                }
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER);
                if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                    fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER));
                    return;
                }
                return;
            }
            URI write4 = AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindHmlNdidInstructionFragment);
            if (write4 != null) {
                if (tabContainer == null) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER);
                    if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                        fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER));
                    }
                } else if (AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBSummaryFragment.write)) {
                    String obj = write4.toString();
                    Map<String, String> map = fragmentBuilder_BindHmlNTBSummaryFragment.write;
                    BaseRequest baseRequest2 = new BaseRequest(obj);
                    if (map != null) {
                        ECouponCommonActivity eCouponCommonActivity2 = new ECouponCommonActivity((String) null, map);
                        if (!(eCouponCommonActivity2.read == null || eCouponCommonActivity2.read.size() == 0)) {
                            baseRequest2.setProperties(eCouponCommonActivity2.MediaBrowserCompat$CustomActionResultReceiver(new PropertiesRequest(eCouponCommonActivity2.IconCompatParcelizer).getProperties()));
                        }
                    }
                    tabContainer.IconCompatParcelizer(true, obj, baseRequest2, fragmentBuilder_BindHmlNdidInstructionFragment);
                } else {
                    String obj2 = write4.toString();
                    tabContainer.IconCompatParcelizer(true, obj2, new BaseRequest(obj2), fragmentBuilder_BindHmlNdidInstructionFragment);
                }
            } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI));
            }
        } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
            fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INTERACTION_REQUEST_IS_NULL));
        }
    }

    public static void write(URI uri) {
        try {
            if (!FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver())) {
                if (uri != null) {
                    if (!uri.toString().isEmpty()) {
                        String scheme = uri.getScheme();
                        HashMap hashMap = new HashMap();
                        if (!"http".equalsIgnoreCase(scheme)) {
                            if (!"https".equalsIgnoreCase(scheme)) {
                                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationFragment.SEND_OUTBOUND_INVALID_URI_SCHEME);
                                return;
                            }
                        }
                        read(hashMap, "one-url", uri.toString());
                        read(hashMap, "one-path", uri.getPath());
                        read(hashMap, "one-host", uri.getHost());
                        Uri parse = Uri.parse(uri.toString());
                        for (String next : parse.getQueryParameterNames()) {
                            read(hashMap, next, parse.getQueryParameter(next));
                        }
                        C1192xa602430c fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver = new C1192xa602430c();
                        fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBSuccessFragment(URI.create("/one-click"));
                        C1192xa602430c fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver2 = fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver;
                        fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = hashMap;
                        new FragmentBuilder_BindGiftRecipientFromFavouriteFragment(new FragmentBuilder_BindHmlNTBSummaryFragment(fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0)).read((FragmentBuilder_BindHmlNdidInstructionFragment) null);
                        return;
                    }
                }
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationFragment.SEND_OUTBOUND_INVALID_URI);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public static FragmentBuilder_BindHmlNdidSelectIdpFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNTBSummaryFragment fragmentBuilder_BindHmlNTBSummaryFragment) {
        return new FragmentBuilder_BindGiftRecipientBaseFragment(fragmentBuilder_BindHmlNTBSummaryFragment);
    }

    static /* synthetic */ void read(FragmentBuilder_BindHmlNTBSummaryFragment fragmentBuilder_BindHmlNTBSummaryFragment, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        if (FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver())) {
            MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindManageEmailVerificationFragment.ERROR_WONT_SEND_REQUEST_IN_ADMIN_MODE);
            if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_WONT_SEND_REQUEST_IN_ADMIN_MODE));
            }
        } else if (fragmentBuilder_BindHmlNTBSummaryFragment == null || fragmentBuilder_BindHmlNTBSummaryFragment.write == null || fragmentBuilder_BindHmlNTBSummaryFragment.write.isEmpty()) {
            if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INTERACTION_REQUEST_IS_NULL));
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INTERACTION_REQUEST_IS_NULL);
        } else {
            FragmentBuilder_BindHmlNTBApplyLoanEntryFragment tabContainer = FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
            OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
            Boolean valueOf = Boolean.valueOf(FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
            boolean MediaBrowserCompat$CustomActionResultReceiver2 = EasycashBusinessAndMaritalInfoCaseModule.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
            if (Boolean.FALSE.equals(valueOf) && fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError("Thunderhead SDK has not been initialized yet"));
            }
            if (!Boolean.FALSE.equals(valueOf) && !(!MediaBrowserCompat$CustomActionResultReceiver2)) {
                URI write2 = AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver, (FragmentBuilder_BindHmlNdidInstructionFragment) null);
                if (write2 == null) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI);
                    if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                        fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI));
                    }
                } else if (tabContainer != null) {
                    tabContainer.IconCompatParcelizer(true, write2.toString(), fragmentBuilder_BindHmlNTBSummaryFragment.write, false, fragmentBuilder_BindHmlNdidInstructionFragment);
                } else {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER);
                    if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                        fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER));
                    }
                }
            } else if (tabContainer == null) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER);
                if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                    fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER));
                }
            } else if (AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver, (FragmentBuilder_BindHmlNdidInstructionFragment) null) == null && fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver.toString().isEmpty()) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI);
                if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                    fragmentBuilder_BindHmlNdidInstructionFragment.read(AlertController$RecycleListView.write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI));
                }
            } else if (fragmentBuilder_BindHmlNTBSummaryFragment.write != null) {
                tabContainer.read.MediaBrowserCompat$CustomActionResultReceiver(false, new ECouponCommonActivity(fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver.write.toString(), fragmentBuilder_BindHmlNTBSummaryFragment.write));
            }
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment) {
        FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment;
        if (fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment == null) {
            try {
                fragmentBuilder_BindSelectPurposeFragment = new FragmentBuilder_BindSelectPurposeFragment();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return;
            }
        } else {
            fragmentBuilder_BindSelectPurposeFragment = new FragmentBuilder_BindSelectPurposeFragment(fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.IconCompatParcelizer, fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read);
        }
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new C1193x41a50793(fragmentBuilder_BindSelectPurposeFragment));
    }

    public static Uri MediaBrowserCompat$CustomActionResultReceiver(Uri uri) {
        try {
            return FragmentBuilder_BindHmlIssuerLandingFragment.setHasDecor().MediaBrowserCompat$CustomActionResultReceiver(uri);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return uri;
        }
    }

    public static Set<URI> MediaBrowserCompat$CustomActionResultReceiver() {
        HashSet hashSet;
        synchronized (MediaBrowserCompat$ItemReceiver) {
            hashSet = new HashSet(MediaMetadataCompat);
        }
        return hashSet;
    }

    public static Set<URI> write() {
        HashSet hashSet;
        synchronized (MediaBrowserCompat$ItemReceiver) {
            hashSet = new HashSet(write);
        }
        return hashSet;
    }

    public static void write(FragmentBuilder_BindHmlNTBOccupationInfoFragment fragmentBuilder_BindHmlNTBOccupationInfoFragment) {
        FragmentBuilder_BindHmlOutcomeCounterOfferFragment fragmentBuilder_BindHmlOutcomeCounterOfferFragment;
        if (fragmentBuilder_BindHmlNTBOccupationInfoFragment == null) {
            try {
                fragmentBuilder_BindHmlOutcomeCounterOfferFragment = new FragmentBuilder_BindHmlOutcomeCounterOfferFragment();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return;
            }
        } else {
            fragmentBuilder_BindHmlOutcomeCounterOfferFragment = new FragmentBuilder_BindHmlOutcomeCounterOfferFragment(fragmentBuilder_BindHmlNTBOccupationInfoFragment.MediaBrowserCompat$ItemReceiver);
        }
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindPreregistrationInfoFragment.IconCompatParcelizer(fragmentBuilder_BindHmlOutcomeCounterOfferFragment));
    }

    public static void write(FragmentBuilder_BindHmlNTBManageEmailVerificationFragment fragmentBuilder_BindHmlNTBManageEmailVerificationFragment) {
        FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment;
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        FragmentBuilder_BindHmlNTBAccountConsentFragment fragmentBuilder_BindHmlNTBAccountConsentFragment;
        FragmentBuilder_BindHmlNtbCalculatorFragment fragmentBuilder_BindHmlNtbCalculatorFragment;
        FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment fragmentBuilder_BindHmlNdidSelectIdpSuccessFragment;
        if (fragmentBuilder_BindHmlNTBManageEmailVerificationFragment == null) {
            try {
                fragmentBuilder_BindHmlNoDepositAccountFragment = new FragmentBuilder_BindHmlNoDepositAccountFragment();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return;
            }
        } else {
            FragmentBuilder_BindHmlNtbOutcomePendingFragment fragmentBuilder_BindHmlNtbOutcomePendingFragment = null;
            if (fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$CustomActionResultReceiver != null) {
                fragmentBuilder_BindHmlNtbOutcomeRejectFragment = new FragmentBuilder_BindHmlNtbOutcomeRejectFragment(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                fragmentBuilder_BindHmlNtbOutcomeRejectFragment = null;
            }
            URI uri = fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment, "$this$getHostWithHttpsScheme");
            URI uri2 = fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$ItemReceiver;
            if (uri2 != null) {
                CharSequence scheme = uri2.getScheme();
                boolean z = false;
                if (scheme == null || scheme.length() == 0) {
                    String path = uri2.getPath();
                    onGetStartedClick.IconCompatParcelizer((Object) path, "uri.path");
                    if (path.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("https://");
                        sb.append(uri2);
                        uri2 = URI.create(sb.toString());
                    }
                }
            } else {
                uri2 = null;
            }
            FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = uri2 != null ? new FragmentBuilder_BindHmlOperatingBankFragment(uri2) : null;
            if (fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.read != null) {
                fragmentBuilder_BindHmlNTBAccountConsentFragment = fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.read;
            } else {
                fragmentBuilder_BindHmlNTBAccountConsentFragment = FragmentBuilder_BindHmlNTBAccountConsentFragment.USER_MODE;
            }
            FragmentBuilder_BindHmlNTBAccountConsentFragment fragmentBuilder_BindHmlNTBAccountConsentFragment2 = fragmentBuilder_BindHmlNTBAccountConsentFragment;
            if (fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.write != null) {
                fragmentBuilder_BindHmlNtbCalculatorFragment = new FragmentBuilder_BindHmlNtbCalculatorFragment(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.write);
            } else {
                fragmentBuilder_BindHmlNtbCalculatorFragment = null;
            }
            if (fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.IconCompatParcelizer != null) {
                fragmentBuilder_BindHmlNdidSelectIdpSuccessFragment = new FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.IconCompatParcelizer);
            } else {
                fragmentBuilder_BindHmlNdidSelectIdpSuccessFragment = null;
            }
            if (fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaDescriptionCompat != null) {
                fragmentBuilder_BindHmlNtbOutcomePendingFragment = new FragmentBuilder_BindHmlNtbOutcomePendingFragment(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaDescriptionCompat);
            }
            fragmentBuilder_BindHmlNoDepositAccountFragment = new FragmentBuilder_BindHmlNoDepositAccountFragment(fragmentBuilder_BindHmlNtbOutcomeRejectFragment, uri, fragmentBuilder_BindHmlOperatingBankFragment, fragmentBuilder_BindHmlNTBAccountConsentFragment2, new FragmentBuilder_BindHmlOccupationInfoFragment(""), fragmentBuilder_BindHmlNtbCalculatorFragment, fragmentBuilder_BindHmlNdidSelectIdpSuccessFragment, fragmentBuilder_BindHmlNtbOutcomePendingFragment);
        }
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindOthersTabFragment.write(fragmentBuilder_BindHmlNoDepositAccountFragment));
    }

    /* access modifiers changed from: private */
    public static FragmentBuilder_BindHmlBusinessInformationFragment MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindHmlBusinessInformationFragment fragmentBuilder_BindHmlBusinessInformationFragment;
        synchronized (FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.class) {
            if (read == null) {
                read = new FragmentBuilder_BindHmlBusinessInformationFragment();
            }
            fragmentBuilder_BindHmlBusinessInformationFragment = read;
        }
        return fragmentBuilder_BindHmlBusinessInformationFragment;
    }

    /* renamed from: o.FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment$IconCompatParcelizer */
    public class IconCompatParcelizer implements Application.ActivityLifecycleCallbacks, FragmentBuilder_BindHmlETBBusinessInformationFragment {
        FragmentBuilder_BindHmlETBBusinessInformationFragment IconCompatParcelizer;
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindHmlBaseOutcomeFragment MediaBrowserCompat$ItemReceiver;
        private FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment MediaBrowserCompat$MediaItem;
        private FragmentBuilder_BindJuristicOnboardingLandingFragment.read MediaBrowserCompat$SearchResultReceiver;
        private FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaDescriptionCompat;
        private setTextAppearance<Activity, FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment> read;
        private setTextAppearance<Activity, FragmentBuilder_BindHmlETBBusinessInformationFragment> write;

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        IconCompatParcelizer() {
            if (FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver == null) {
                FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment();
            }
            this.MediaBrowserCompat$MediaItem = FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlBaseOutcomeFragment();
            this.write = new setTextAppearance<>();
            this.MediaDescriptionCompat = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
            this.read = new setTextAppearance<>();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intent intent;
            Uri data;
            this.MediaBrowserCompat$SearchResultReceiver = HomeActivity.write(this.MediaDescriptionCompat, new FragmentBuilder_BindGiftRecipientFromOthersFragment(this));
            if (!FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$ItemReceiver().write && bundle == null && (intent = activity.getIntent()) != null && (data = intent.getData()) != null) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                HashMap hashMap = new HashMap();
                for (String next : queryParameterNames) {
                    List<String> queryParameters = data.getQueryParameters(next);
                    if (queryParameters.size() > 0) {
                        hashMap.put(next, queryParameters.get(0));
                    }
                }
                C1192xa602430c fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver = new C1192xa602430c();
                fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = hashMap;
                FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindHmlNTBSummaryFragment(fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0)).read((FragmentBuilder_BindHmlNdidInstructionFragment) null);
            }
            this.write.put(activity, new FragmentBuilder_BindHmlIssuerInputFragment(FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer()));
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(new onScanClick.write("one_session_params"));
        }

        public final void onActivityStarted(Activity activity) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver++;
            ((FragmentBuilder_BindHmlETBSuccessFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setCheckable()).read(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.IconCompatParcelizer = this.write.get(activity);
            ((FragmentBuilder_BindHmlETBSuccessFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setCheckable()).MediaBrowserCompat$ItemReceiver(activity);
            FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment = this.MediaBrowserCompat$MediaItem;
            if (!FragmentBuilder_BindGiftingMoneyTransferInputFragment.read(activity)) {
                fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.write = new WeakReference<>(activity);
                for (int i = 0; i < fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.read.size(); i++) {
                    fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.read.get(i).MediaBrowserCompat$CustomActionResultReceiver(activity);
                }
            }
            if (!FragmentBuilder_BindGiftingMoneyTransferInputFragment.read(activity) && !this.MediaBrowserCompat$CustomActionResultReceiver && !FragmentBuilder_BindMyECouponFragment.MediaBrowserCompat$ItemReceiver.contains(activity.getClass())) {
                FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment = this.read.get(activity);
                if (fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment == null) {
                    fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment = new FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment(activity, this.IconCompatParcelizer);
                    this.read.put(activity, fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment);
                }
                new Handler().postDelayed(new FragmentBuilder_BindFundPurchaseReviewFragment(fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment), 300);
            }
            if (DeejungTransferMinFullOtpActivity.read == null) {
                DeejungTransferMinFullOtpActivity.read = new DeejungTransferMinFullOtpActivity();
            }
            DeejungTransferMinFullOtpActivity deejungTransferMinFullOtpActivity = DeejungTransferMinFullOtpActivity.read;
            DeejungTransferMinFullOtpActivity.write write2 = deejungTransferMinFullOtpActivity.IconCompatParcelizer;
            if (write2 != null && activity != null) {
                deejungTransferMinFullOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(activity, write2.write, deejungTransferMinFullOtpActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, deejungTransferMinFullOtpActivity.IconCompatParcelizer.IconCompatParcelizer);
                deejungTransferMinFullOtpActivity.IconCompatParcelizer = null;
            }
        }

        public final void onActivityPaused(Activity activity) {
            ((FragmentBuilder_BindHmlETBSuccessFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setCheckable()).write(activity);
        }

        public final void onActivityStopped(Activity activity) {
            FragmentBuilder_BindHmlBaseOutcomeFragment fragmentBuilder_BindHmlBaseOutcomeFragment = this.MediaBrowserCompat$ItemReceiver;
            fragmentBuilder_BindHmlBaseOutcomeFragment.MediaBrowserCompat$ItemReceiver--;
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.write.get(activity);
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment != null) {
                fragmentBuilder_BindHmlETBBusinessInformationFragment.write();
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            FragmentBuilder_BindHmlETBBusinessInformationFragment remove = this.write.remove(activity);
            if (!(remove instanceof OnBoardingTutorialActivity_ViewBinding)) {
                remove = null;
            }
            OnBoardingTutorialActivity_ViewBinding onBoardingTutorialActivity_ViewBinding = (OnBoardingTutorialActivity_ViewBinding) remove;
            if (onBoardingTutorialActivity_ViewBinding != null) {
                onBoardingTutorialActivity_ViewBinding.disconnect();
            }
            FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment = this.read.get(activity);
            if (fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment != null) {
                fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.disconnect();
            }
            this.read.remove(activity);
            FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (read2 != null) {
                read2.read();
            }
        }

        public final void IconCompatParcelizer(String str, View view) {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment != null) {
                fragmentBuilder_BindHmlETBBusinessInformationFragment.IconCompatParcelizer(str, view);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(String str, View view) {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment != null) {
                fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$ItemReceiver(str, view);
            }
        }

        public final void write() {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment != null) {
                fragmentBuilder_BindHmlETBBusinessInformationFragment.write();
            }
        }

        public final Set<String> MediaBrowserCompat$CustomActionResultReceiver() {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment == null) {
                return Collections.emptySet();
            }
            return fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final List<View> MediaBrowserCompat$ItemReceiver() {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment == null) {
                return Collections.emptyList();
            }
            return fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$ItemReceiver();
        }

        public final void write(String str, BaseResponse baseResponse) {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment != null) {
                fragmentBuilder_BindHmlETBBusinessInformationFragment.write(str, baseResponse);
            }
        }

        public final BaseResponse MediaBrowserCompat$CustomActionResultReceiver(String str) {
            FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlETBBusinessInformationFragment == null) {
                return null;
            }
            return fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$CustomActionResultReceiver(str);
        }
    }

    private static void read(Map<String, String> map, String str, String str2) {
        if (!(str2 == null || str2.trim().length() == 0)) {
            map.put(str, str2);
        }
    }
}
