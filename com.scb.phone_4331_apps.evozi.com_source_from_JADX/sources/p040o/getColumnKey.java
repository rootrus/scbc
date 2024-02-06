package p040o;

import java.util.ArrayList;
import p040o.Synchronized;
import p040o.onCreateQrClick;
import p040o.parseReport;

/* renamed from: o.getColumnKey */
public final /* synthetic */ class getColumnKey implements dump {
    private final /* synthetic */ Synchronized.SynchronizedSortedSetMultimap MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ArrayList write;

    public /* synthetic */ getColumnKey(Synchronized.SynchronizedSortedSetMultimap synchronizedSortedSetMultimap, ArrayList arrayList) {
        this.MediaBrowserCompat$CustomActionResultReceiver = synchronizedSortedSetMultimap;
        this.write = arrayList;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        ArrayList arrayList = this.write;
        onCreateQrClick.read read = (onCreateQrClick.read) obj;
        parseReport.IconCompatParcelizer iconCompatParcelizer = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = read.write;
        iconCompatParcelizer.read = Synchronized.SynchronizedSortedSetMultimap.write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(read.MediaBrowserCompat$CustomActionResultReceiver));
        arrayList.add(new parseReport(iconCompatParcelizer, (byte) 0));
    }
}
