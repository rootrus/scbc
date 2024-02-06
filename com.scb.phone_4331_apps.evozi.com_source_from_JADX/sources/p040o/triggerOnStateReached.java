package p040o;

import p040o.C7126xb23daf18;
import p040o.setTvRemark;
import p040o.withRegisteredFid;

/* renamed from: o.triggerOnStateReached */
public final /* synthetic */ class triggerOnStateReached implements C7126xb23daf18.read {
    private final /* synthetic */ setTvRemark.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ withRegisteredFid.read read;

    public /* synthetic */ triggerOnStateReached(withRegisteredFid.read read2, setTvRemark.read read3) {
        this.read = read2;
        this.MediaBrowserCompat$ItemReceiver = read3;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        withRegisteredFid.read read2 = this.read;
        setTvRemark.read read3 = this.MediaBrowserCompat$ItemReceiver;
        withRegisteredFid withregisteredfid = withRegisteredFid.this;
        registerFidWithServer registerfidwithserver = new registerFidWithServer(read2, read3);
        if (withregisteredfid.RatingCompat != null) {
            registerfidwithserver.IconCompatParcelizer(withregisteredfid.RatingCompat);
        }
    }
}
