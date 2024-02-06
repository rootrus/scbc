package p040o;

import com.scb.phone.p035di.ActivityBuilder_ContributeAccountManagementActivity;
import com.scb.phone.view.activity.profilemanagement.manageaccounts.AccountManagementActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaBrowserCompat$CustomActionResultReceiver */
final class zzmd$zzl$MediaBrowserCompat$CustomActionResultReceiver extends ActivityBuilder_ContributeAccountManagementActivity.IconCompatParcelizer.C10614IconCompatParcelizer {
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$ItemReceiver;
    private AccountManagementActivity read;

    private zzmd$zzl$MediaBrowserCompat$CustomActionResultReceiver(zzmd.zzl zzl) {
        this.MediaBrowserCompat$ItemReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MediaBrowserCompat$CustomActionResultReceiver(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AccountManagementActivity accountManagementActivity = (AccountManagementActivity) obj;
        if (accountManagementActivity != null) {
            this.read = accountManagementActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.read != null) {
            return new zzmd.zzl.MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AccountManagementActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
