package p040o;

import com.scb.phone.p035di.C1939x359c1032;
import com.scb.phone.view.activity.landingpage.GroupFavoriteActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$102 */
final class zzmd$zzl$access$102 extends C1939x359c1032 {
    private GroupFavoriteActivity MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ zzmd.zzl write;

    private zzmd$zzl$access$102(zzmd.zzl zzl) {
        this.write = zzl;
    }

    /* synthetic */ zzmd$zzl$access$102(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        GroupFavoriteActivity groupFavoriteActivity = (GroupFavoriteActivity) obj;
        if (groupFavoriteActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = groupFavoriteActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            return new zzmd.zzl.execute(this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(GroupFavoriteActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
