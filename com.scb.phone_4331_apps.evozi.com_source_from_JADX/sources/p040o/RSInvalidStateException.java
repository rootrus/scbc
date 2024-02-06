package p040o;

import com.google.android.datatransport.runtime.ExecutionModule;
import java.util.concurrent.Executor;

/* renamed from: o.RSInvalidStateException */
public final class RSInvalidStateException implements OPRStatusRewardsLandingActivity_ViewBinding<Executor> {
    static final RSInvalidStateException write = new RSInvalidStateException();

    public final /* synthetic */ Object get() {
        Executor IconCompatParcelizer = ExecutionModule.IconCompatParcelizer();
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
