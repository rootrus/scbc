package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.toFormat */
public final /* synthetic */ class toFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ calculateFreeRamInBytes read;

    public /* synthetic */ toFormat(calculateFreeRamInBytes calculatefreeraminbytes) {
        this.read = calculatefreeraminbytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver.read(this.read, (CheckExtractActivity_MembersInjector.ExpandedMenuView) obj);
    }
}
