package p040o;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_BindETBCheckIdentityFragment */
public final class FragmentBuilder_BindETBCheckIdentityFragment {

    /* renamed from: o.FragmentBuilder_BindETBCheckIdentityFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<C1190x3ac82dc9, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ FragmentBuilder_BindETBCheckIdentityFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(FragmentBuilder_BindETBCheckIdentityFragment fragmentBuilder_BindETBCheckIdentityFragment) {
            super(1);
            this.read = fragmentBuilder_BindETBCheckIdentityFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C1190x3ac82dc9 fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver = (C1190x3ac82dc9) obj;
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver, "$receiver");
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.write = "ONE-RV1MVXZ97G-2757";
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = new URI("android://easyApp");
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = "713066281";
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = "5d73281e-9a7e-41e3-af80-f2b8c9cb5526";
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = "3a680b2d-5710-49f4-8284-e9a9866614ef";
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.read = new URI("https://ap1.thunderhead.com");
            fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = FragmentBuilder_BindHmlNTBAccountConsentFragment.USER_MODE;
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FragmentBuilder_BindETBCheckIdentityFragment$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read, HmlVerifyPhoneValidateOtpActivity> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read read = (FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read) obj;
            onGetStartedClick.write((Object) read, "$receiver");
            read.read = true;
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "rmid");
        HashMap hashMap = new HashMap();
        hashMap.put("RMID", str);
        AlertController$RecycleListView.read(MwLandingActivity.read, (HmlPromptPayVerificationActivity) null, new write(hashMap, (HmlNTBPromptPayNotFoundActivity) null), 3);
    }

    /* renamed from: o.FragmentBuilder_BindETBCheckIdentityFragment$write */
    static final class write extends InsurancePortfolioActivity_ViewBinding implements BaseDiscoverFundFilterActivity<MwCasaOtpActivity, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object> {
        final /* synthetic */ HashMap MediaBrowserCompat$ItemReceiver;
        private int read;
        private MwCasaOtpActivity write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HashMap hashMap, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(2, hmlNTBPromptPayNotFoundActivity);
            this.MediaBrowserCompat$ItemReceiver = hashMap;
        }

        public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            return ((write) create(obj, (HmlNTBPromptPayNotFoundActivity) obj2)).invokeSuspend(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
        }

        public final HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(Object obj, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
            write write2 = new write(this.MediaBrowserCompat$ItemReceiver, hmlNTBPromptPayNotFoundActivity);
            write2.write = (MwCasaOtpActivity) obj;
            return write2;
        }

        public final Object invokeSuspend(Object obj) {
            HmlPromptPayVerificationActivity_ViewBinding hmlPromptPayVerificationActivity_ViewBinding = HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof HmlVerifyIdentifyActivity.write) {
                    throw ((HmlVerifyIdentifyActivity.write) obj).read;
                }
            } else if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
                this.read = 1;
                if (AlertController$RecycleListView.read.read(false, (FundFactSheetActivity<? super C1192xa602430c, HmlVerifyPhoneValidateOtpActivity>) new FundFactSheetActivity<C1192xa602430c, HmlVerifyPhoneValidateOtpActivity>(this) {
                    private /* synthetic */ write write;

                    {
                        this.write = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        C1192xa602430c fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver = (C1192xa602430c) obj;
                        onGetStartedClick.write((Object) fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver, "$receiver");
                        Map<String, String> map = this.write.MediaBrowserCompat$ItemReceiver;
                        onGetStartedClick.write((Object) map, "<set-?>");
                        fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = map;
                        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                }, (HmlNTBPromptPayNotFoundActivity<? super FragmentBuilder_BindHmlNtbOutcomeApproveFragment>) this) == hmlPromptPayVerificationActivity_ViewBinding) {
                    return hmlPromptPayVerificationActivity_ViewBinding;
                }
            } else {
                throw ((HmlVerifyIdentifyActivity.write) obj).read;
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
