package p040o;

import com.google.gson.Gson;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import java.net.URI;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindRiskReviewFragment */
public final class FragmentBuilder_BindRiskReviewFragment implements FragmentBuilder_BindRtpEBillPaymentDetailFragment {
    Boolean IconCompatParcelizer = Boolean.FALSE;
    FundFactSheetActivity<FragmentBuilder_BindHomeAddressFragment, Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    final Set<Long> MediaBrowserCompat$SearchResultReceiver = Collections.synchronizedSet(new HashSet());
    private ECouponCommonActivity_ViewBinding RatingCompat;
    final FragmentBuilder_BindSCBSLandingFragment read;
    final Gson write = FragmentBuilder_BindHmlIssuerLandingFragment.PlaybackStateCompat$CustomAction();

    public FragmentBuilder_BindRiskReviewFragment(FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.read = fragmentBuilder_BindSCBSLandingFragment;
        this.RatingCompat = eCouponCommonActivity_ViewBinding;
        HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new FragmentBuilder_BindRequirePromptPayFragment(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        synchronized (this) {
            try {
                if (Boolean.TRUE.equals(this.IconCompatParcelizer)) {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, C6557x2438d01c.MediaBrowserCompat$ItemReceiver("OfflineInteractionsTracker", "processSavedInteractions"));
                    return;
                } else if (!(!this.RatingCompat.MediaMetadataCompat.isEmpty())) {
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
                        FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$SearchResultReceiver2 = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$SearchResultReceiver(MediaBrowserCompat$ItemReceiver2);
                        if (MediaBrowserCompat$SearchResultReceiver2 == null) {
                            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_UNABLE_TO_FIND_SITEKEY);
                        }
                        FragmentBuilder_BindHmlOperatingBankFragment MediaBrowserCompat$MediaItem = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver2);
                        if (MediaBrowserCompat$MediaItem == null) {
                            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_UNABLE_TO_FIND_HOST);
                        }
                        FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment = this.read;
                        FragmentBuilder_BindReviewInfoFragment fragmentBuilder_BindReviewInfoFragment = new FragmentBuilder_BindReviewInfoFragment(this);
                        FragmentBuilder_BindRequireRequestToPayFragment fragmentBuilder_BindRequireRequestToPayFragment = FragmentBuilder_BindRequireRequestToPayFragment.read;
                        onGetStartedClick.write((Object) fragmentBuilder_BindSCBSLandingFragment, "$this$forEach");
                        onGetStartedClick.write((Object) fragmentBuilder_BindReviewInfoFragment, "predicate");
                        onGetStartedClick.write((Object) fragmentBuilder_BindRequireRequestToPayFragment, "callback");
                        AlertController$RecycleListView.read(AlertController$RecycleListView.write((HmlPromptPayVerificationActivity) FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$CustomActionResultReceiver()), (HmlPromptPayVerificationActivity) null, new C6749xc7bc3683(fragmentBuilder_BindSCBSLandingFragment, MediaBrowserCompat$SearchResultReceiver2, MediaBrowserCompat$MediaItem, fragmentBuilder_BindReviewInfoFragment, fragmentBuilder_BindRequireRequestToPayFragment, (HmlNTBPromptPayNotFoundActivity) null), 3);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, ECouponCommonActivity eCouponCommonActivity) {
        String str;
        if (Boolean.TRUE.equals(this.IconCompatParcelizer)) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, C6557x2438d01c.MediaBrowserCompat$ItemReceiver("OfflineInteractionsTracker", "savePropertyToDB"));
            return;
        }
        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append("Save properties request to OfflineDB. Body:");
        sb.append(eCouponCommonActivity.toString());
        sb.append(";");
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
        if (eCouponCommonActivity.IconCompatParcelizer != null) {
            str = eCouponCommonActivity.IconCompatParcelizer;
        } else {
            str = "";
        }
        if (z || !this.MediaBrowserCompat$ItemReceiver || (!str.isEmpty() && this.MediaBrowserCompat$CustomActionResultReceiver.invoke(new FragmentBuilder_BindHomeAddressFragment(URI.create(str))).booleanValue())) {
            C6746xde52ab60 read2 = read();
            C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = read2;
            String json = FragmentBuilder_BindHmlIssuerLandingFragment.PlaybackStateCompat$CustomAction().toJson((Object) eCouponCommonActivity);
            onGetStartedClick.IconCompatParcelizer((Object) json, "OneInternalProvider.getG…toJson(propertiesManager)");
            read2.IconCompatParcelizer = json;
            if (z) {
                FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment = FragmentBuilder_BindRiskSelectionFragment.PROGRAMATIC_PROPERTY;
                onGetStartedClick.write((Object) fragmentBuilder_BindRiskSelectionFragment, "requestType");
                fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.read = fragmentBuilder_BindRiskSelectionFragment;
            } else {
                FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment2 = FragmentBuilder_BindRiskSelectionFragment.PROPERTY;
                onGetStartedClick.write((Object) fragmentBuilder_BindRiskSelectionFragment2, "requestType");
                fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.read = fragmentBuilder_BindRiskSelectionFragment2;
            }
            FragmentBuilder_BindRiskSummaryFragment.IconCompatParcelizer(this.read, fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.write(), new FragmentBuilder_BindReviewInformationFragment(str));
            return;
        }
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLoanFragment.DENIED_OFFLINE_PROPERTIES_DATABASE, str);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, BaseRequest baseRequest) {
        synchronized (this) {
            if (Boolean.TRUE.equals(this.IconCompatParcelizer)) {
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, C6557x2438d01c.MediaBrowserCompat$ItemReceiver("OfflineInteractionsTracker", "saveRequestToDB"));
            } else if (baseRequest == null) {
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, C6557x2438d01c.MediaBrowserCompat$ItemReceiver("OfflineInteractionsTracker", "baseRequest is null"));
            } else {
                String uri = baseRequest.getUri() != null ? baseRequest.getUri() : "";
                if (!z) {
                    if (this.MediaBrowserCompat$ItemReceiver && (uri.isEmpty() || !this.MediaBrowserCompat$CustomActionResultReceiver.invoke(new FragmentBuilder_BindHomeAddressFragment(URI.create(uri))).booleanValue())) {
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLoanFragment.DENIED_OFFLINE_INTERACTION_DATABASE, uri);
                        return;
                    }
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append("Save track interaction request to OfflineDB. Body:");
                sb.append(baseRequest.toString());
                sb.append(";");
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                if (baseRequest.getTimestamp() == null) {
                    baseRequest.setTimestamp(System.currentTimeMillis());
                }
                C6746xde52ab60 read2 = read();
                C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = read2;
                if (baseRequest != null) {
                    String json = FragmentBuilder_BindHmlIssuerLandingFragment.PlaybackStateCompat$CustomAction().toJson((Object) baseRequest);
                    onGetStartedClick.IconCompatParcelizer((Object) json, "OneInternalProvider.getGson().toJson(baseRequest)");
                    read2.IconCompatParcelizer = json;
                }
                if (z) {
                    FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment = FragmentBuilder_BindRiskSelectionFragment.PROGRAMATIC_INTERACTION;
                    onGetStartedClick.write((Object) fragmentBuilder_BindRiskSelectionFragment, "requestType");
                    fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.read = fragmentBuilder_BindRiskSelectionFragment;
                } else {
                    FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment2 = FragmentBuilder_BindRiskSelectionFragment.INTERACTION;
                    onGetStartedClick.write((Object) fragmentBuilder_BindRiskSelectionFragment2, "requestType");
                    fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.read = fragmentBuilder_BindRiskSelectionFragment2;
                }
                FragmentBuilder_BindRiskSummaryFragment.IconCompatParcelizer(this.read, fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.write(), new FragmentBuilder_BindReviewFragment(uri));
            }
        }
    }

    public final void write(long j) {
        synchronized (this) {
            if (j != -1) {
                if (!Boolean.TRUE.equals(this.IconCompatParcelizer)) {
                    FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment = this.read;
                    FragmentBuilder_BindReviewAccountsFragment fragmentBuilder_BindReviewAccountsFragment = new FragmentBuilder_BindReviewAccountsFragment(j);
                    onGetStartedClick.write((Object) fragmentBuilder_BindSCBSLandingFragment, "$this$deleteRequest");
                    onGetStartedClick.write((Object) fragmentBuilder_BindReviewAccountsFragment, "callback");
                    AlertController$RecycleListView.read(AlertController$RecycleListView.write((HmlPromptPayVerificationActivity) FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$CustomActionResultReceiver()), (HmlPromptPayVerificationActivity) null, new C6750x458b4692(fragmentBuilder_BindSCBSLandingFragment, j, fragmentBuilder_BindReviewAccountsFragment, (HmlNTBPromptPayNotFoundActivity) null), 3);
                    return;
                }
            }
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, C6557x2438d01c.MediaBrowserCompat$ItemReceiver("OfflineInteractionsTracker", "Bad id removing offline request or optOut active"));
        }
    }

    /* access modifiers changed from: package-private */
    public final BaseRequest MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment) {
        try {
            BaseRequest baseRequest = (BaseRequest) this.write.fromJson(fragmentBuilder_BindReviewRedemptionFragment.read, BaseRequest.class);
            String uri = baseRequest.getUri();
            URI create = URI.create(uri);
            String scheme = create.getScheme();
            boolean z = false;
            boolean z2 = scheme != null && !scheme.isEmpty();
            String host = create.getHost();
            if (host != null && !host.isEmpty()) {
                z = true;
            }
            if (z || z2) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageRecipientGroupFragment.OFFLINE_REQUEST_TOUCHPOINT_CONFLICT);
                uri = create.getPath();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$SearchResultReceiver);
            sb.append(uri);
            baseRequest.setUri(sb.toString());
            return baseRequest;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindManageRecipientGroupFragment.ERROR_CONVERTING_ENTITY);
            return null;
        }
    }

    private static C6746xde52ab60 read() {
        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
        String IconCompatParcelizer2 = FragmentBuilder_BindOnboardingInputAddressFragment.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
        String MediaDescriptionCompat = FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat(MediaBrowserCompat$ItemReceiver2);
        URI RatingCompat2 = FragmentBuilder_BindOnboardingInputAddressFragment.RatingCompat(MediaBrowserCompat$ItemReceiver2);
        C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = new C6746xde52ab60();
        boolean z = false;
        if (IconCompatParcelizer2 != null && !IconCompatParcelizer2.isEmpty()) {
            C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver2 = fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver;
            CharSequence charSequence = IconCompatParcelizer2;
            if (!(charSequence == null || charSequence.length() == 0)) {
                fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver2.write = IconCompatParcelizer2;
            }
        }
        if (MediaDescriptionCompat != null && !MediaDescriptionCompat.isEmpty()) {
            C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver3 = fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver;
            CharSequence charSequence2 = MediaDescriptionCompat;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            }
            if (!z) {
                fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$CustomActionResultReceiver = MediaDescriptionCompat;
            }
        }
        if (!(RatingCompat2 == null || RatingCompat2 == null)) {
            String obj = RatingCompat2.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "it.toString()");
            fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = obj;
        }
        return fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(long j) {
        this.MediaBrowserCompat$SearchResultReceiver.remove(Long.valueOf(j));
    }
}
