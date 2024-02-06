package p040o;

import p040o.CheckWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.ay */
public final /* synthetic */ class C4052ay implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setCropLineStyle MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4052ay(setCropLineStyle setcroplinestyle) {
        this.MediaBrowserCompat$ItemReceiver = setcroplinestyle;
    }

    public final void IconCompatParcelizer(Object obj) {
        setCropLineStyle setcroplinestyle = this.MediaBrowserCompat$ItemReceiver;
        ((CheckWorkflowActivity.C64001) obj).write(setcroplinestyle.ParcelableVolumeInfo, setcroplinestyle.MediaBrowserCompat$ItemReceiver);
    }
}
