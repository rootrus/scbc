package p040o;

import com.scb.phone.p035di.ActivityBuilder_ContributeAddAccountsActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.AddAccountsActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MenuItemWrapperICS$CollapsibleActionViewWrapper */
final class zzmd$zzl$MenuItemWrapperICS$CollapsibleActionViewWrapper extends ActivityBuilder_ContributeAddAccountsActivity.read.write {
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$ItemReceiver;
    private AddAccountsActivity write;

    private zzmd$zzl$MenuItemWrapperICS$CollapsibleActionViewWrapper(zzmd.zzl zzl) {
        this.MediaBrowserCompat$ItemReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MenuItemWrapperICS$CollapsibleActionViewWrapper(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AddAccountsActivity addAccountsActivity = (AddAccountsActivity) obj;
        if (addAccountsActivity != null) {
            this.write = addAccountsActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd.zzl.setVisibility(this.MediaBrowserCompat$ItemReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AddAccountsActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
