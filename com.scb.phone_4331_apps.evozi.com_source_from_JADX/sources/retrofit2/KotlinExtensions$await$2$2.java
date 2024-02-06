package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import p040o.HmlVerifyIdentifyActivity;
import p040o.MailingAddressReviewOTPActivity;
import p040o.onGetStartedClick;

public final class KotlinExtensions$await$2$2 implements Callback<T> {
    final /* synthetic */ MailingAddressReviewOTPActivity $continuation;

    KotlinExtensions$await$2$2(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
        this.$continuation = mailingAddressReviewOTPActivity;
    }

    public final void onResponse(Call<T> call, Response<T> response) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) response, "response");
        if (response.isSuccessful()) {
            T body = response.body();
            if (body == null) {
                Object tag = call.request().tag(Invocation.class);
                if (tag == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                onGetStartedClick.IconCompatParcelizer(tag, "call.request().tag(Invocation::class.java)!!");
                Method method = ((Invocation) tag).method();
                StringBuilder sb = new StringBuilder();
                sb.append("Response from ");
                onGetStartedClick.IconCompatParcelizer((Object) method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                onGetStartedClick.IconCompatParcelizer((Object) declaringClass, "method.declaringClass");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                Throwable th = kotlinNullPointerException;
                onGetStartedClick.write((Object) th, "exception");
                this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
                return;
            }
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            this.$continuation.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(body));
            return;
        }
        Throwable httpException = new HttpException(response);
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer3 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
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
