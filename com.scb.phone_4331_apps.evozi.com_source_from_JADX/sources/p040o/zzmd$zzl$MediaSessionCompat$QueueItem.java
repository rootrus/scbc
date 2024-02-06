package p040o;

import com.scb.phone.deeplink.DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity;
import com.scb.phone.view.activity.deeplink.AccountSummaryDeepLinkActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MediaSessionCompat$QueueItem */
final class zzmd$zzl$MediaSessionCompat$QueueItem extends DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity.write.read {
    private /* synthetic */ zzmd.zzl read;
    private AccountSummaryDeepLinkActivity write;

    private zzmd$zzl$MediaSessionCompat$QueueItem(zzmd.zzl zzl) {
        this.read = zzl;
    }

    /* synthetic */ zzmd$zzl$MediaSessionCompat$QueueItem(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        AccountSummaryDeepLinkActivity accountSummaryDeepLinkActivity = (AccountSummaryDeepLinkActivity) obj;
        if (accountSummaryDeepLinkActivity != null) {
            this.write = accountSummaryDeepLinkActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd.zzl.setHasDecor(this.read);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AccountSummaryDeepLinkActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
