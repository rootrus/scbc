package p040o;

import com.scb.phone.p035di.C2665xe359ac24;
import com.scb.phone.view.fragment.landingpage.GroupBillerFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$002 */
final class zzmd$zzl$access$002 extends C2665xe359ac24 {
    private /* synthetic */ zzmd.zzl IconCompatParcelizer;
    private GroupBillerFragment MediaBrowserCompat$ItemReceiver;

    private zzmd$zzl$access$002(zzmd.zzl zzl) {
        this.IconCompatParcelizer = zzl;
    }

    /* synthetic */ zzmd$zzl$access$002(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        GroupBillerFragment groupBillerFragment = (GroupBillerFragment) obj;
        if (groupBillerFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = groupBillerFragment;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            return new zzmd.zzl.ScriptGroup(this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(GroupBillerFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
