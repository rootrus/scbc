package retrofit2;

import p040o.HmlVerifyIdentifyActivity;
import p040o.MailingAddressReviewOTPActivity;
import p040o.onGetStartedClick;

public final class KotlinExtensions$await$4$2 implements Callback<T> {
    final /* synthetic */ MailingAddressReviewOTPActivity $continuation;

    KotlinExtensions$await$4$2(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
        this.$continuation = mailingAddressReviewOTPActivity;
    }

    public final void onResponse(Call<T> call, Response<T> response) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) response, "response");
        if (response.isSuccessful()) {
            T body = response.body();
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(body));
            return;
        }
        Throwable httpException = new HttpException(response);
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) httpException, "exception");
        this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(httpException)));
    }

    public final void onFailure(Call<T> call, Throwable th) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) th, "t");
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) th, "exception");
        this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
    }
}
