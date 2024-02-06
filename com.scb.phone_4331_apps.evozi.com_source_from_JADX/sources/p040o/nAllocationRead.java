package p040o;

import com.google.android.datatransport.runtime.time.TimeModule;

/* renamed from: o.nAllocationRead */
public final class nAllocationRead implements OPRStatusRewardsLandingActivity_ViewBinding<CreditCardCaptureModule_GetIParametersFactory> {
    public static final nAllocationRead IconCompatParcelizer = new nAllocationRead();

    public final /* synthetic */ Object get() {
        CreditCardCaptureModule_GetIParametersFactory read = TimeModule.read();
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
