package p040o;

import com.scb.phone.p035di.C2021x4eb415f;
import com.scb.phone.view.activity.partner.AbstractPartnerLoginActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaBrowserCompat$ItemReceiver */
final class zzmd$zzl$MediaBrowserCompat$ItemReceiver extends C2021x4eb415f.read {
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$CustomActionResultReceiver;
    private AbstractPartnerLoginActivity read;

    private zzmd$zzl$MediaBrowserCompat$ItemReceiver(zzmd.zzl zzl) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MediaBrowserCompat$ItemReceiver(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AbstractPartnerLoginActivity abstractPartnerLoginActivity = (AbstractPartnerLoginActivity) obj;
        if (abstractPartnerLoginActivity != null) {
            this.read = abstractPartnerLoginActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.read != null) {
            return new zzmd.zzl.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractPartnerLoginActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
