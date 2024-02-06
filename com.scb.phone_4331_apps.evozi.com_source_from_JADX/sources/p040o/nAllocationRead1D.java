package p040o;

import com.google.android.datatransport.runtime.time.TimeModule;

/* renamed from: o.nAllocationRead1D */
public final class nAllocationRead1D implements OPRStatusRewardsLandingActivity_ViewBinding<CreditCardCaptureModule_GetIParametersFactory> {
    public static final nAllocationRead1D IconCompatParcelizer = new nAllocationRead1D();

    public final /* synthetic */ Object get() {
        CreditCardCaptureModule_GetIParametersFactory write = TimeModule.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
