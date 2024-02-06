package p040o;

import java.lang.reflect.Type;
import p040o.TaskApiCall;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* renamed from: o.zabr$MediaBrowserCompat$CustomActionResultReceiver */
class zabr$MediaBrowserCompat$CustomActionResultReceiver<R> implements CallAdapter<R, BScanCNotificationDeepLinkActivity<?>> {
    private final CallAdapter<R, BScanCNotificationDeepLinkActivity<?>> IconCompatParcelizer;
    final Retrofit write;

    zabr$MediaBrowserCompat$CustomActionResultReceiver(Retrofit retrofit, CallAdapter<R, BScanCNotificationDeepLinkActivity<?>> callAdapter) {
        this.write = retrofit;
        this.IconCompatParcelizer = callAdapter;
    }

    public final Type responseType() {
        return this.IconCompatParcelizer.responseType();
    }

    public final /* synthetic */ Object adapt(Call call) {
        TaskApiCall.Builder builder = new TaskApiCall.Builder(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(builder, "onSuccess is null");
        ReviewDeviceActivity_ViewBinding reviewDeviceActivity_ViewBinding = new ReviewDeviceActivity_ViewBinding(this.IconCompatParcelizer.adapt(call), builder);
        toVoidTaskThatFailsOnFalse tovoidtaskthatfailsonfalse = new toVoidTaskThatFailsOnFalse(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(tovoidtaskthatfailsonfalse, "resumeFunctionInCaseOfError is null");
        return new HmlAdditionalDocumentActivity(reviewDeviceActivity_ViewBinding, tovoidtaskthatfailsonfalse);
    }
}
