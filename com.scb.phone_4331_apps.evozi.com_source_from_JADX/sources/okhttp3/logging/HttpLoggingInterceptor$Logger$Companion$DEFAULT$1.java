package okhttp3.logging;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.HttpLoggingInterceptor;
import p040o.onGetStartedClick;

public final class HttpLoggingInterceptor$Logger$Companion$DEFAULT$1 implements HttpLoggingInterceptor.Logger {
    HttpLoggingInterceptor$Logger$Companion$DEFAULT$1() {
    }

    public final void log(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        Platform.Companion.get().log(4, str, (Throwable) null);
    }
}
