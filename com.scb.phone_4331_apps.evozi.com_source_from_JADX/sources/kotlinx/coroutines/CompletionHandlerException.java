package kotlinx.coroutines;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import p040o.onGetStartedClick;

public final class CompletionHandlerException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompletionHandlerException(String str, Throwable th) {
        super(str, th);
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        onGetStartedClick.write((Object) th, "cause");
    }
}
