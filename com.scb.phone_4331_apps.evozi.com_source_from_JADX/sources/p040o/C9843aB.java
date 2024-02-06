package p040o;

import p040o.CheckParameters;
import p040o.StandardTable;
import p040o.writeUInt64NoTag;

/* renamed from: o.aB */
public final /* synthetic */ class C9843aB implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCropLineColor$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ getTypeFilter read;

    public /* synthetic */ C9843aB(getCropLineColor$MediaBrowserCompat$ItemReceiver getcroplinecolor_mediabrowsercompat_itemreceiver, getTypeFilter gettypefilter) {
        this.IconCompatParcelizer = getcroplinecolor_mediabrowsercompat_itemreceiver;
        this.read = gettypefilter;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i;
        getCropLineColor$MediaBrowserCompat$ItemReceiver getcroplinecolor_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        getTypeFilter gettypefilter = this.read;
        CheckParameters.write write = (CheckParameters.write) obj;
        StandardTable.CellSet read2 = getcroplinecolor_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$ItemReceiver;
        isBuildIdValid isbuildidvalid = getcroplinecolor_mediabrowsercompat_itemreceiver.write.write.IconCompatParcelizer;
        String IconCompatParcelizer2 = getcroplinecolor_mediabrowsercompat_itemreceiver.write.IconCompatParcelizer;
        checkForPreviousCrash write2 = checkForPreviousCrash.write();
        write2.IconCompatParcelizer = isbuildidvalid;
        write2.read = read2.IconCompatParcelizer("dd MMM yyyy - HH:mm", gettypefilter.read);
        write2.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver.getString("Y".equals(IconCompatParcelizer2) ? Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark_post : Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark_no_post);
        if (isbuildidvalid.setHasDecor == null) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.redeem_success;
        } else {
            i = Iterables$3$MediaBrowserCompat$MediaItem.redeem_success_scheduled;
        }
        write2.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        write.IconCompatParcelizer(write2);
    }
}
