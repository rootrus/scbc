package p040o;

import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_BindPrepaidTravelDetailTabFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6662xb4309809 implements NetworkOperationCallback<Object> {
    private /* synthetic */ MailingAddressReviewOTPActivity read;

    C6662xb4309809(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
        this.read = mailingAddressReviewOTPActivity;
    }

    public final void onSuccess(Object obj) {
        if (this.read.IconCompatParcelizer()) {
            try {
                CreateRecipientGroupActivity ExpandedMenuView = FragmentBuilder_BindHmlIssuerLandingFragment.ExpandedMenuView();
                if (ExpandedMenuView != null) {
                    ExpandedMenuView.MediaBrowserCompat$CustomActionResultReceiver();
                }
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.read.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(hmlVerifyPhoneValidateOtpActivity));
            } catch (Exception e) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                Throwable th = e;
                onGetStartedClick.write((Object) th, "exception");
                this.read.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
            }
        }
    }

    public final void onFailure(NetworkOperationError networkOperationError) {
        Throwable th;
        if (this.read.IconCompatParcelizer()) {
            if (networkOperationError == null || (th = networkOperationError.getException()) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Clear User Profile Error: ");
                sb.append(networkOperationError != null ? networkOperationError.getMessage() : null);
                th = new Exception(sb.toString());
            }
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            this.read.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
        }
    }
}
