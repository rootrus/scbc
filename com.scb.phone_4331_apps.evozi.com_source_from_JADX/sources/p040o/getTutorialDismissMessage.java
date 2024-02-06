package p040o;

import p040o.CrashlyticsCore;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTutorialDismissMessage */
public final /* synthetic */ class getTutorialDismissMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsCore.C32494 IconCompatParcelizer;

    public /* synthetic */ getTutorialDismissMessage(CrashlyticsCore.C32494 r1) {
        this.IconCompatParcelizer = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        setGuidanceFrameColor.write(this.IconCompatParcelizer, (getImageWidth) obj);
    }
}
