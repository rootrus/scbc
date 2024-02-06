package p040o;

import com.thunderhead.android.api.responsetypes.OneAPIError;
import com.thunderhead.android.api.responsetypes.OneSDKError;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_BindHmlNTBPersonalInfoFragment */
public final class FragmentBuilder_BindHmlNTBPersonalInfoFragment implements FragmentBuilder_BindHmlNdidInstructionFragment {
    private /* synthetic */ MailingAddressReviewOTPActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ boolean write;

    public FragmentBuilder_BindHmlNTBPersonalInfoFragment(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewOTPActivity;
        this.write = z;
    }

    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlNtbOutcomeApproveFragment fragmentBuilder_BindHmlNtbOutcomeApproveFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlNtbOutcomeApproveFragment, "response");
        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindHmlNtbOutcomeApproveFragment));
        }
    }

    public final void read(OneSDKError oneSDKError) {
        onGetStartedClick.write((Object) oneSDKError, "error");
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
            return;
        }
        if (this.write) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            Throwable th = oneSDKError;
            onGetStartedClick.write((Object) th, "exception");
            this.MediaBrowserCompat$CustomActionResultReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
            return;
        }
        MyECouponActivity_ViewBinding.read(oneSDKError, FragmentBuilder_BindManageNotificationFragment.SEND_PROPERTIES_IGNORED_SDK_ERROR);
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver((Object) null));
    }

    public final void read(OneAPIError oneAPIError) {
        onGetStartedClick.write((Object) oneAPIError, "error");
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
            return;
        }
        if (this.write) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            Throwable th = oneAPIError;
            onGetStartedClick.write((Object) th, "exception");
            this.MediaBrowserCompat$CustomActionResultReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
            return;
        }
        MyECouponActivity_ViewBinding.read(oneAPIError, FragmentBuilder_BindManageNotificationFragment.SEND_PROPERTIES_IGNORED_API_ERROR);
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver((Object) null));
    }
}
