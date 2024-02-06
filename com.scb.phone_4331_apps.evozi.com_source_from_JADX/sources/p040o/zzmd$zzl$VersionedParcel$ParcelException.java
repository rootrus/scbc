package p040o;

import com.scb.phone.p035di.C2170x14cd5679;
import com.scb.phone.view.activity.hml.HmlNTBManageEmailVerificationActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$VersionedParcel$ParcelException */
final class zzmd$zzl$VersionedParcel$ParcelException extends C2170x14cd5679 {
    private HmlNTBManageEmailVerificationActivity read;
    private /* synthetic */ zzmd.zzl write;

    private zzmd$zzl$VersionedParcel$ParcelException(zzmd.zzl zzl) {
        this.write = zzl;
    }

    /* synthetic */ zzmd$zzl$VersionedParcel$ParcelException(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        HmlNTBManageEmailVerificationActivity hmlNTBManageEmailVerificationActivity = (HmlNTBManageEmailVerificationActivity) obj;
        if (hmlNTBManageEmailVerificationActivity != null) {
            this.read = hmlNTBManageEmailVerificationActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.read != null) {
            return new zzmd.zzl.notifyDataSetChanged(this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(HmlNTBManageEmailVerificationActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
