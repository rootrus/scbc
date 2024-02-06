package p040o;

import com.scb.phone.p035di.C2445x36069fdd;
import com.scb.phone.view.fragment.profilemanagement.manageaccounts.AccountManagementSuccessFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaSessionCompat$Token */
final class zzmd$zzl$MediaSessionCompat$Token extends C2445x36069fdd {
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$ItemReceiver;
    private AccountManagementSuccessFragment write;

    private zzmd$zzl$MediaSessionCompat$Token(zzmd.zzl zzl) {
        this.MediaBrowserCompat$ItemReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MediaSessionCompat$Token(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd$zzl$MediaSessionCompat$ResultReceiverWrapper(this.MediaBrowserCompat$ItemReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AccountManagementSuccessFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AccountManagementSuccessFragment accountManagementSuccessFragment = (AccountManagementSuccessFragment) obj;
        if (accountManagementSuccessFragment != null) {
            this.write = accountManagementSuccessFragment;
            return;
        }
        throw null;
    }
}
