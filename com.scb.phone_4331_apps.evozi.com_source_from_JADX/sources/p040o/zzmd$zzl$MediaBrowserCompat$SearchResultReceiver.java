package p040o;

import com.scb.phone.p035di.C2443xc850befc;
import com.scb.phone.view.fragment.profilemanagement.manageaccounts.AccountManagementFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaBrowserCompat$SearchResultReceiver */
final class zzmd$zzl$MediaBrowserCompat$SearchResultReceiver extends C2443xc850befc.write {
    private AccountManagementFragment IconCompatParcelizer;
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$ItemReceiver;

    private zzmd$zzl$MediaBrowserCompat$SearchResultReceiver(zzmd.zzl zzl) {
        this.MediaBrowserCompat$ItemReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MediaBrowserCompat$SearchResultReceiver(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.IconCompatParcelizer != null) {
            return new zzmd.zzl.RatingCompat(this.MediaBrowserCompat$ItemReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AccountManagementFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AccountManagementFragment accountManagementFragment = (AccountManagementFragment) obj;
        if (accountManagementFragment != null) {
            this.IconCompatParcelizer = accountManagementFragment;
            return;
        }
        throw null;
    }
}
