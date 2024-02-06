package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;

/* renamed from: o.InvestmentDetailsActivity */
public final class InvestmentDetailsActivity extends Error {
    public InvestmentDetailsActivity() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvestmentDetailsActivity(String str, Throwable th) {
        super(str, th);
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        onGetStartedClick.write((Object) th, "cause");
    }
}
