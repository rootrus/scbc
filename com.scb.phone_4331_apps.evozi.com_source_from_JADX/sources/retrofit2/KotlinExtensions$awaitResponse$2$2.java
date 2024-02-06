package retrofit2;

import p040o.HmlVerifyIdentifyActivity;
import p040o.MailingAddressReviewOTPActivity;
import p040o.onGetStartedClick;

public final class KotlinExtensions$awaitResponse$2$2 implements Callback<T> {
    final /* synthetic */ MailingAddressReviewOTPActivity $continuation;

    KotlinExtensions$awaitResponse$2$2(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
        this.$continuation = mailingAddressReviewOTPActivity;
    }

    public final void onResponse(Call<T> call, Response<T> response) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) response, "response");
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(response));
    }

    public final void onFailure(Call<T> call, Throwable th) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) th, "t");
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) th, "exception");
        this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
    }
}
