package p040o;

import p040o.CheckWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.clearHighlights */
public final /* synthetic */ class clearHighlights implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setCropLineStyle read;

    public /* synthetic */ clearHighlights(setCropLineStyle setcroplinestyle) {
        this.read = setcroplinestyle;
    }

    public final void IconCompatParcelizer(Object obj) {
        setCropLineStyle setcroplinestyle = this.read;
        CheckWorkflowActivity.C64001 r6 = (CheckWorkflowActivity.C64001) obj;
        if (setcroplinestyle.MediaSessionCompat$Token > getICheckDeserializerRtti.ParcelableVolumeInfo(setcroplinestyle.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo).doubleValue()) {
            r6.write("Y");
        } else {
            setcroplinestyle.IconCompatParcelizer("N");
        }
    }
}
