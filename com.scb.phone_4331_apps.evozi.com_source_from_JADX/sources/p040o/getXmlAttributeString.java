package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzxc;

/* renamed from: o.getXmlAttributeString */
public final /* synthetic */ class getXmlAttributeString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlCommonCustomDialog.IconCompatParcelizer read;

    public /* synthetic */ getXmlAttributeString(HmlCommonCustomDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        pathSegmentsToString pathsegmentstostring = (pathSegmentsToString) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) pathsegmentstostring, "bondAccountSummaryEntity");
        zzxc.zzd.read read2 = new zzxc.zzd.read();
        Iterable<delimiterOffset> iterable = pathsegmentstostring.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (delimiterOffset delimiteroffset : iterable) {
            zzxd$MediaBrowserCompat$CustomActionResultReceiver zzxd_mediabrowsercompat_customactionresultreceiver = new zzxd$MediaBrowserCompat$CustomActionResultReceiver();
            zzxd_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = Integer.parseInt(delimiteroffset.MediaBrowserCompat$CustomActionResultReceiver);
            zzxd_mediabrowsercompat_customactionresultreceiver.write = delimiteroffset.write;
            zzxd_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = delimiteroffset.MediaBrowserCompat$ItemReceiver;
            zzxd zzxd = new zzxd(zzxd_mediabrowsercompat_customactionresultreceiver, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) zzxd, "BondAccountSummaryItem.c…\n                .build()");
            arrayList.add(zzxd);
        }
        read2.MediaBrowserCompat$ItemReceiver = (List) arrayList;
        read2.write = pathsegmentstostring.write;
        read2.IconCompatParcelizer = pathsegmentstostring.IconCompatParcelizer;
        zzxc.zzd zzd = new zzxc.zzd(read2, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) zzd, "BondAccountSummary.creat…                 .build()");
        return zzd;
    }
}
