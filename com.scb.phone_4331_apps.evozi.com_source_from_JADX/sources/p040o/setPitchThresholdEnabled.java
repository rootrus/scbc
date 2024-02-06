package p040o;

import p040o.PassportWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.setPitchThresholdEnabled */
public final /* synthetic */ class setPitchThresholdEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setMessageIcons IconCompatParcelizer;

    public /* synthetic */ setPitchThresholdEnabled(setMessageIcons setmessageicons) {
        this.IconCompatParcelizer = setmessageicons;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportWorkflowActivity.C69841) obj).write(this.IconCompatParcelizer.MediaMetadataCompat);
    }
}
