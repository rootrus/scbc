package p040o;

import android.widget.RadioGroup;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAcceptDecline;

/* renamed from: o.LimitService */
public final /* synthetic */ class LimitService implements RadioGroup.OnCheckedChangeListener {
    private final /* synthetic */ enablePublishingAndFlushPending MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CustomAcceptDecline read;
    private final /* synthetic */ loginFingerPrint write;

    public /* synthetic */ LimitService(CustomAcceptDecline customAcceptDecline, loginFingerPrint loginfingerprint, enablePublishingAndFlushPending enablepublishingandflushpending) {
        this.read = customAcceptDecline;
        this.write = loginfingerprint;
        this.MediaBrowserCompat$ItemReceiver = enablepublishingandflushpending;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        loginFingerPrint loginfingerprint = this.write;
        enablePublishingAndFlushPending enablepublishingandflushpending = this.MediaBrowserCompat$ItemReceiver;
        if (i == R.id.radio_accept) {
            loginfingerprint.read(enablepublishingandflushpending.write, Boolean.TRUE);
        } else if (i == R.id.radio_decline) {
            loginfingerprint.read(enablepublishingandflushpending.write, Boolean.FALSE);
        }
    }
}
