package okhttp3.internal.cache;

import java.io.IOException;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.PartnerLoginActivity;
import p040o.PinChangeActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public class FaultHidingSink extends PartnerLoginActivity {
    private boolean hasErrors;
    private final FundFactSheetActivity<IOException, HmlVerifyPhoneValidateOtpActivity> onException;

    public final FundFactSheetActivity<IOException, HmlVerifyPhoneValidateOtpActivity> getOnException() {
        return this.onException;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(PinChangeActivity pinChangeActivity, FundFactSheetActivity<? super IOException, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        super(pinChangeActivity);
        onGetStartedClick.write((Object) pinChangeActivity, "delegate");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onException");
        this.onException = fundFactSheetActivity;
    }

    public void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
        if (this.hasErrors) {
            sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(j);
            return;
        }
        try {
            super.write(sCBUniversalWebViewActivity, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }
}
