package p040o;

import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver */
public final class HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver extends HmlDocumentSubmissionTutorialsActivity {
    private /* synthetic */ BaseDiscoverFundFilterActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ Object read;
    private int write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver(HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity, HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity, Object obj) {
        super(hmlNTBPromptPayNotFoundActivity, hmlPromptPayVerificationActivity);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverFundFilterActivity;
        this.read = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        if (i == 0) {
            this.write = 1;
            if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
                HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = this;
                BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (baseDiscoverFundFilterActivity != null) {
                    return ((BaseDiscoverFundFilterActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(baseDiscoverFundFilterActivity, 2)).MediaBrowserCompat$CustomActionResultReceiver(this.read, hmlNTBPromptPayNotFoundActivity);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        } else if (i == 1) {
            this.write = 2;
            if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
                return obj;
            }
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
