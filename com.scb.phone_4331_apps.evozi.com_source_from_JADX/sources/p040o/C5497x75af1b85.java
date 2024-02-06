package p040o;

import com.scb.phone.p035di.C2447x1ad82e3d;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C5497x75af1b85 extends C2447x1ad82e3d {
    private /* synthetic */ zzmd.zzl read;
    private AccountSourceSelectFragment write;

    private C5497x75af1b85(zzmd.zzl zzl) {
        this.read = zzl;
    }

    /* synthetic */ C5497x75af1b85(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd.zzl.ParcelableVolumeInfo(this.read);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AccountSourceSelectFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) obj;
        if (accountSourceSelectFragment != null) {
            this.write = accountSourceSelectFragment;
            return;
        }
        throw null;
    }
}
