package p040o;

import p040o.PassportWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.isStabilityThresholdEnabled */
public final /* synthetic */ class isStabilityThresholdEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;

    public /* synthetic */ isStabilityThresholdEnabled(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportWorkflowActivity.C69841) obj).write(this.IconCompatParcelizer);
    }
}
