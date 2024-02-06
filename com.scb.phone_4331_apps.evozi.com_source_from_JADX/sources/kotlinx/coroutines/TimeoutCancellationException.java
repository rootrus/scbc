package kotlinx.coroutines;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.util.concurrent.CancellationException;
import p040o.clickManagePin;
import p040o.onClickReview;
import p040o.onGetStartedClick;

public final class TimeoutCancellationException extends CancellationException implements onClickReview<TimeoutCancellationException> {
    public final clickManagePin IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeoutCancellationException(String str, clickManagePin clickmanagepin) {
        super(str);
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        this.IconCompatParcelizer = clickmanagepin;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeoutCancellationException(String str) {
        this(str, (clickManagePin) null);
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
    }

    public final /* synthetic */ Throwable read() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.IconCompatParcelizer);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
