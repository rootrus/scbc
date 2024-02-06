package p040o;

import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* renamed from: o.zabr$MediaBrowserCompat$ItemReceiver */
class zabr$MediaBrowserCompat$ItemReceiver<R> implements CallAdapter<R, DebitCardResetOtpActivity<?>> {
    private final CallAdapter<R, DebitCardResetOtpActivity<?>> MediaBrowserCompat$CustomActionResultReceiver;
    final Retrofit MediaBrowserCompat$ItemReceiver;

    zabr$MediaBrowserCompat$ItemReceiver(Retrofit retrofit, CallAdapter<R, DebitCardResetOtpActivity<?>> callAdapter) {
        this.MediaBrowserCompat$ItemReceiver = retrofit;
        this.MediaBrowserCompat$CustomActionResultReceiver = callAdapter;
    }

    public final Type responseType() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.responseType();
    }

    public final /* synthetic */ Object adapt(Call call) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.adapt(call).doOnNext(new StatusExceptionMapper(this)).onErrorResumeNext(new setResultOrApiException(this));
    }
}
