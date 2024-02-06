package p040o;

import com.thunderhead.android.api.responsetypes.OneAPIError;
import com.thunderhead.android.api.responsetypes.OneSDKError;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.requests.ElementDataRequest;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlNTBApplyLoanEntryFragment */
public final class FragmentBuilder_BindHmlNTBApplyLoanEntryFragment implements FragmentBuilder_BindHmlCompanyNameFragment, FragmentBuilder_BindHmlEditOperatingAccountFragment, FragmentBuilder_BindHmlBusinessOccupationInfoFragment, OnBoardingTutorialActivity_ViewBinding {
    public Boolean IconCompatParcelizer = Boolean.FALSE;
    public FragmentBuilder_BindHmlNTBAccountConsentFragment MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver = false;
    public final FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final UseCaseModule f2544x50fd9e4a;
    public ECouponCommonActivity_ViewBinding MediaDescriptionCompat;
    public ArrayList<FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Integer>> MediaMetadataCompat = new ArrayList<>();
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read MediaSessionCompat$QueueItem;
    private setTextAppearance<String, Keep.read> MediaSessionCompat$ResultReceiverWrapper = new setTextAppearance<>();
    public URI MediaSessionCompat$Token;
    private final FragmentBuilder_BindHmlETBBusinessInformationFragment ParcelableVolumeInfo;
    public final ConfirmRedemptionActivity RatingCompat = new ConfirmRedemptionActivity();
    public final FragmentBuilder_BindRtpEBillPaymentDetailFragment read;
    DeviceInfo write;

    FragmentBuilder_BindHmlNTBApplyLoanEntryFragment(FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment, CreateRecipientGroupActivity createRecipientGroupActivity, UseCaseModule useCaseModule, FragmentBuilder_BindRtpEBillPaymentDetailFragment fragmentBuilder_BindRtpEBillPaymentDetailFragment, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, FragmentBuilder_BindHmlETBOfflineSuccessFragment fragmentBuilder_BindHmlETBOfflineSuccessFragment) {
        this.ParcelableVolumeInfo = fragmentBuilder_BindHmlETBBusinessInformationFragment;
        this.f2544x50fd9e4a = useCaseModule;
        this.read = fragmentBuilder_BindRtpEBillPaymentDetailFragment;
        this.MediaDescriptionCompat = eCouponCommonActivity_ViewBinding;
        this.MediaBrowserCompat$MediaItem = new FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment(this, fragmentBuilder_BindHmlETBOfflineSuccessFragment);
        Iterator<FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Integer>> it = this.MediaMetadataCompat.iterator();
        while (it.hasNext()) {
            FragmentBuilder_BindHowToAddFavouriteTopUpFragment next = it.next();
            FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment = this.MediaBrowserCompat$MediaItem;
            next.MediaBrowserCompat$CustomActionResultReceiver(Integer.valueOf(fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment.read));
            fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment.IconCompatParcelizer.add(next);
        }
        this.MediaSessionCompat$QueueItem = HomeActivity.write(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView(), new FragmentBuilder_BindHelpFragment(this));
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(boolean z, String str, Map<String, String> map, boolean z2, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        if (AlertController$RecycleListView.write(map)) {
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("Set properties:");
            sb.append(map);
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ECouponCommonActivity eCouponCommonActivity = new ECouponCommonActivity(str, map);
            eCouponCommonActivity.MediaBrowserCompat$ItemReceiver = str;
            if (eCouponCommonActivity.read != null && eCouponCommonActivity.read.size() != 0) {
                if (z2 || Boolean.FALSE.equals(this.IconCompatParcelizer)) {
                    this.read.MediaBrowserCompat$CustomActionResultReceiver(z, eCouponCommonActivity);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, "Unable to send properties, saving locally.");
                    return;
                }
                read(z, eCouponCommonActivity, new DeejungInstallmentsConfirmationActivity_ViewBinding(eCouponCommonActivity.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat, this.RatingCompat, new FragmentBuilder_BindGiftingPresentTransferInputFragment(fragmentBuilder_BindHmlNdidInstructionFragment)));
            }
        }
    }

    public final void write(String str, setTextAppearance<String, String> settextappearance) {
        StringBuilder sb = new StringBuilder();
        sb.append("Send capture points bundle: Interaction: ");
        sb.append(str);
        sb.append(", elements:");
        sb.append(settextappearance.toString());
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, sb.toString());
        BaseRequest baseRequest = new BaseRequest(str);
        if (!baseRequest.getUri().matches(".+://\\S+")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.MediaSessionCompat$Token);
            sb2.append(baseRequest.getUri());
            baseRequest.setUri(sb2.toString());
        }
        baseRequest.setProperties(settextappearance);
        AmortizationActivity_ViewBinding amortizationActivity_ViewBinding = new AmortizationActivity_ViewBinding(str, this.MediaDescriptionCompat, this.RatingCompat);
        if (Boolean.FALSE.equals(this.IconCompatParcelizer)) {
            this.read.MediaBrowserCompat$ItemReceiver(false, baseRequest);
        } else {
            this.MediaDescriptionCompat.read(new C6437x1b3a90a2(this.MediaBrowserCompat$SearchResultReceiver, baseRequest, amortizationActivity_ViewBinding, 9));
        }
    }

    public final void IconCompatParcelizer(String str, String str2) {
        BaseResponse MediaBrowserCompat$CustomActionResultReceiver2;
        FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = this.ParcelableVolumeInfo;
        if (fragmentBuilder_BindHmlETBBusinessInformationFragment != null && (MediaBrowserCompat$CustomActionResultReceiver2 = fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$CustomActionResultReceiver(str)) != null) {
            boolean z = true;
            if ((MediaBrowserCompat$CustomActionResultReceiver2 == null || MediaBrowserCompat$CustomActionResultReceiver2.getCaptures() == null || MediaBrowserCompat$CustomActionResultReceiver2.getCaptures().length == 0) ? false : true) {
                Captures[] captures = MediaBrowserCompat$CustomActionResultReceiver2.getCaptures();
                int i = 0;
                while (i < captures.length) {
                    if (captures[i].getId() == null || captures[i].getId().isEmpty() || !captures[i].getId().equals(str2)) {
                        i++;
                    } else {
                        String path = captures[i].getPath();
                        if (str != null) {
                            if (path == null || path.trim().isEmpty()) {
                                MyECouponActivity_ViewBinding.write("Element path is null or empty");
                                z = false;
                            }
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Set tracking point: Interaction: ");
                                sb.append(str);
                                sb.append(", element path:");
                                sb.append(path);
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, sb.toString());
                                ElementDataRequest elementDataRequest = new ElementDataRequest(str, str);
                                AmortizationActivity_ViewBinding amortizationActivity_ViewBinding = new AmortizationActivity_ViewBinding(str, this.MediaDescriptionCompat, this.RatingCompat);
                                elementDataRequest.setPathForMatching(path);
                                elementDataRequest.setValue("".toString());
                                if (Boolean.TRUE.equals(this.IconCompatParcelizer)) {
                                    if (!elementDataRequest.getUri().matches(".+://\\S+")) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(this.MediaSessionCompat$Token);
                                        sb2.append(elementDataRequest.getUri());
                                        elementDataRequest.setUri(sb2.toString());
                                    }
                                    this.MediaDescriptionCompat.read(new C6437x1b3a90a2(this.MediaBrowserCompat$SearchResultReceiver, elementDataRequest, amortizationActivity_ViewBinding, 4));
                                    return;
                                }
                                this.read.MediaBrowserCompat$ItemReceiver(false, elementDataRequest);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        DeviceInfo deviceInfo;
        CardActivationActivity cardActivationActivity;
        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("Set interaction: ");
        sb.append(str);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
        BaseRequest baseRequest = new BaseRequest(str);
        if (!this.write.hasData()) {
            deviceInfo = AlertController$RecycleListView.MediaBrowserCompat$MediaItem(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
        } else {
            deviceInfo = new DeviceInfo(this.write);
        }
        baseRequest.setDeviceInfo(deviceInfo);
        if (!this.f2544x50fd9e4a.read() || !Boolean.TRUE.equals(this.IconCompatParcelizer)) {
            this.read.MediaBrowserCompat$ItemReceiver(false, baseRequest);
            return;
        }
        if (!baseRequest.getUri().matches(".+://\\S+")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.MediaSessionCompat$Token);
            sb2.append(baseRequest.getUri());
            baseRequest.setUri(sb2.toString());
        }
        if (this.MediaSessionCompat$ResultReceiverWrapper.get(str) == null) {
            cardActivationActivity = new CardActivationActivity(str, this.MediaDescriptionCompat, this.RatingCompat, this.MediaBrowserCompat$MediaItem, this.ParcelableVolumeInfo, this.MediaSessionCompat$Token.toString());
        } else {
            cardActivationActivity = new DeejungInstallmentsReviewActivity(str, this.MediaDescriptionCompat, this.RatingCompat, this.MediaBrowserCompat$MediaItem, this.ParcelableVolumeInfo, this.MediaSessionCompat$Token.toString(), this.MediaSessionCompat$ResultReceiverWrapper.get(str));
        }
        this.MediaDescriptionCompat.read(new C6437x1b3a90a2(this.MediaBrowserCompat$SearchResultReceiver, baseRequest, cardActivationActivity, 8));
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        boolean z = true;
        if (!Boolean.FALSE.equals(this.IconCompatParcelizer) && this.f2544x50fd9e4a.read()) {
            z = false;
        } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null && Boolean.FALSE.equals(this.IconCompatParcelizer)) {
            fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError("Thunderhead SDK has not been initialized yet."));
        } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null && !this.f2544x50fd9e4a.read()) {
            FragmentBuilder_BindManagePromptpayLandingFragment fragmentBuilder_BindManagePromptpayLandingFragment = FragmentBuilder_BindManagePromptpayLandingFragment.NO_INTERNET;
            fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneAPIError("The internet is not available."));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_RESP_CODE_", str);
        IconCompatParcelizer(false, str2, hashMap, z, fragmentBuilder_BindHmlNdidInstructionFragment);
    }

    public final void read(boolean z, ECouponCommonActivity eCouponCommonActivity, NetworkOperationCallback networkOperationCallback) {
        int i;
        PropertiesRequest propertiesRequest = new PropertiesRequest(eCouponCommonActivity.IconCompatParcelizer);
        if (!propertiesRequest.getUri().matches(".+://\\S+")) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaSessionCompat$Token);
            sb.append(propertiesRequest.getUri());
            propertiesRequest.setUri(sb.toString());
        }
        propertiesRequest.setProperties(eCouponCommonActivity.MediaBrowserCompat$CustomActionResultReceiver(propertiesRequest.getProperties()));
        propertiesRequest.setTimestamp(eCouponCommonActivity.write);
        if (z) {
            i = eCouponCommonActivity.MediaBrowserCompat$ItemReceiver.equals("") ? 18 : 19;
        } else {
            i = eCouponCommonActivity.MediaBrowserCompat$ItemReceiver.equals("") ? 1 : 6;
        }
        this.MediaDescriptionCompat.read(new C6437x1b3a90a2(this.MediaBrowserCompat$SearchResultReceiver, propertiesRequest, networkOperationCallback, i));
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(boolean z, String str, BaseRequest baseRequest, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        if (!Boolean.TRUE.equals(Boolean.valueOf(this.MediaBrowserCompat$ItemReceiver))) {
            if (!this.write.hasData()) {
                this.write = AlertController$RecycleListView.MediaBrowserCompat$MediaItem(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
            }
            baseRequest.setDeviceInfo(this.write);
            if (this.f2544x50fd9e4a.read()) {
                if (!baseRequest.getUri().matches(".+://\\S+")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.MediaSessionCompat$Token);
                    sb.append(baseRequest.getUri());
                    baseRequest.setUri(sb.toString());
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Send track interaction request. Body:");
                sb2.append(baseRequest.toString());
                sb2.append(";");
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                this.MediaDescriptionCompat.read(new C6437x1b3a90a2(this.MediaBrowserCompat$SearchResultReceiver, baseRequest, new onAccountsClick(new FragmentBuilder_BindGroupBillerFragment(fragmentBuilder_BindHmlNdidInstructionFragment), str, this.MediaDescriptionCompat, this.RatingCompat), 16));
                return;
            }
            if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError("No internet connection."));
            }
            this.read.MediaBrowserCompat$ItemReceiver(true, baseRequest);
        } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
            Integer num = C6557x2438d01c.write;
            fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError("Optout enabled."));
        }
    }

    public final void disconnect() {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.MediaSessionCompat$QueueItem;
        if (read2 != null) {
            read2.read();
        }
    }
}
