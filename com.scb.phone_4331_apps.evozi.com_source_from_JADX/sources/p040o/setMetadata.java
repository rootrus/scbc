package p040o;

import android.content.Context;
import android.os.SystemClock;
import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.setMetadata */
public final /* synthetic */ class setMetadata implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ EmailOtpPresenter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Context write;

    public /* synthetic */ setMetadata(EmailOtpPresenter emailOtpPresenter, Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = emailOtpPresenter;
        this.write = context;
    }

    public final void IconCompatParcelizer(Object obj) {
        EmailOtpPresenter emailOtpPresenter = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getUsable.IconCompatParcelizer) obj).IconCompatParcelizer(String.format(this.write.getString(Iterables$3$MediaBrowserCompat$MediaItem.opt_delay), new Object[]{String.valueOf((60000 - (SystemClock.elapsedRealtime() - emailOtpPresenter.MediaBrowserCompat$MediaItem)) / 1000)}));
    }
}
