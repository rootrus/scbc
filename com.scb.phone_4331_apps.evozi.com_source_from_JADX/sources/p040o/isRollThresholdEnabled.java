package p040o;

import java.util.List;
import p040o.PassportWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.isRollThresholdEnabled */
public final /* synthetic */ class isRollThresholdEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setMessageIcons$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isRollThresholdEnabled(setMessageIcons$MediaBrowserCompat$CustomActionResultReceiver setmessageicons_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = setmessageicons_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportWorkflowActivity.C69841) obj).write((List<String>) this.MediaBrowserCompat$ItemReceiver.read.ParcelableVolumeInfo);
    }
}
