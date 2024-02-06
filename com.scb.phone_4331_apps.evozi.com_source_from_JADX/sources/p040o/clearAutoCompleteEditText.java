package p040o;

import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: o.clearAutoCompleteEditText */
public final class clearAutoCompleteEditText<U, T extends U> extends BaseNtbInstructionActivity_ViewBinding<T> implements Runnable {
    public final long MediaBrowserCompat$ItemReceiver = 5000;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public clearAutoCompleteEditText(long j, HmlNTBPromptPayNotFoundActivity<? super U> hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity.getContext(), hmlNTBPromptPayNotFoundActivity);
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "uCont");
    }

    public final void run() {
        long j = this.MediaBrowserCompat$ItemReceiver;
        clickManagePin clickmanagepin = this;
        onGetStartedClick.write((Object) clickmanagepin, "coroutine");
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out waiting for ");
        sb.append(j);
        sb.append(" ms");
        MediaBrowserCompat$ItemReceiver((Throwable) new TimeoutCancellationException(sb.toString(), clickmanagepin));
    }

    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.IconCompatParcelizer());
        sb.append("(timeMillis=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(')');
        return sb.toString();
    }
}
