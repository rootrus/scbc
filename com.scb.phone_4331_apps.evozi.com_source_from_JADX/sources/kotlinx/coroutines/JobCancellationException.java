package kotlinx.coroutines;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.util.concurrent.CancellationException;
import p040o.MwChangeCasaSuccessActivity;
import p040o.clickManagePin;
import p040o.onClickReview;
import p040o.onGetStartedClick;

public final class JobCancellationException extends CancellationException implements onClickReview<JobCancellationException> {
    private clickManagePin MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobCancellationException(String str, Throwable th, clickManagePin clickmanagepin) {
        super(str);
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        onGetStartedClick.write((Object) clickmanagepin, "job");
        this.MediaBrowserCompat$ItemReceiver = clickmanagepin;
        if (th != null) {
            initCause(th);
        }
    }

    public final Throwable fillInStackTrace() {
        if (!MwChangeCasaSuccessActivity.MediaBrowserCompat$ItemReceiver()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        onGetStartedClick.IconCompatParcelizer((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) jobCancellationException.getMessage(), (Object) getMessage()) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) jobCancellationException.MediaBrowserCompat$ItemReceiver, (Object) this.MediaBrowserCompat$ItemReceiver) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) jobCancellationException.getCause(), (Object) getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String message = getMessage();
        if (message == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        int hashCode = message.hashCode();
        int hashCode2 = this.MediaBrowserCompat$ItemReceiver.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }

    public final /* synthetic */ Throwable read() {
        JobCancellationException jobCancellationException;
        if (MwChangeCasaSuccessActivity.MediaBrowserCompat$ItemReceiver()) {
            String message = getMessage();
            if (message == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            jobCancellationException = new JobCancellationException(message, this, this.MediaBrowserCompat$ItemReceiver);
        } else {
            jobCancellationException = null;
        }
        return jobCancellationException;
    }
}
