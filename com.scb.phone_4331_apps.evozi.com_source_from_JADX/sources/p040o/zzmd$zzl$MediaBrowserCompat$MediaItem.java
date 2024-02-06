package p040o;

import com.scb.phone.p035di.C2022x8f4b282f;
import com.scb.phone.view.activity.profilemanagement.manageaccounts.AccountManagementSuccessActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaBrowserCompat$MediaItem */
final class zzmd$zzl$MediaBrowserCompat$MediaItem extends C2022x8f4b282f.IconCompatParcelizer {
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$ItemReceiver;
    private AccountManagementSuccessActivity write;

    private zzmd$zzl$MediaBrowserCompat$MediaItem(zzmd.zzl zzl) {
        this.MediaBrowserCompat$ItemReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MediaBrowserCompat$MediaItem(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AccountManagementSuccessActivity accountManagementSuccessActivity = (AccountManagementSuccessActivity) obj;
        if (accountManagementSuccessActivity != null) {
            this.write = accountManagementSuccessActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd.zzl.MediaDescriptionCompat(this.MediaBrowserCompat$ItemReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AccountManagementSuccessActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
