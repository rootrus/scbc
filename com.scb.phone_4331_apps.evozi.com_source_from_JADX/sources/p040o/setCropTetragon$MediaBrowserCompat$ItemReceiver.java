package p040o;

import p040o.CheckWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCropTetragon$MediaBrowserCompat$ItemReceiver */
public final class setCropTetragon$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckWorkflowActivity.write> {
    private /* synthetic */ MetaDataStore IconCompatParcelizer;

    public setCropTetragon$MediaBrowserCompat$ItemReceiver(MetaDataStore metaDataStore) {
        this.IconCompatParcelizer = metaDataStore;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CrashlyticsFileMarker crashlyticsFileMarker;
        CheckWorkflowActivity.write write = (CheckWorkflowActivity.write) obj;
        String str = this.IconCompatParcelizer.read;
        onGetStartedClick.IconCompatParcelizer((Object) str, "redeemVerificationDisplay.transactionDate");
        write.read(str);
        isBuildIdValid isbuildidvalid = this.IconCompatParcelizer.IconCompatParcelizer;
        if (isbuildidvalid == null || (crashlyticsFileMarker = isbuildidvalid.setHasDecor) == null) {
            write.IconCompatParcelizer();
            return;
        }
        write.MediaBrowserCompat$CustomActionResultReceiver();
        write.MediaBrowserCompat$CustomActionResultReceiver(crashlyticsFileMarker);
    }
}
