package p040o;

import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.HmlPromptpayEnterCodeActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6895x4e0c044 extends FundActionsSearchActivity {
    private int IconCompatParcelizer;
    private /* synthetic */ BaseDiscoverFundFilterActivity read;
    private /* synthetic */ Object write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6895x4e0c044(HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity, Object obj) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.read = baseDiscoverFundFilterActivity;
        this.write = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            this.IconCompatParcelizer = 1;
            if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
                HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = this;
                BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity = this.read;
                if (baseDiscoverFundFilterActivity != null) {
                    return ((BaseDiscoverFundFilterActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(baseDiscoverFundFilterActivity, 2)).MediaBrowserCompat$CustomActionResultReceiver(this.write, hmlNTBPromptPayNotFoundActivity);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        } else if (i == 1) {
            this.IconCompatParcelizer = 2;
            if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
                return obj;
            }
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
