package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.StandardTable;
import p040o.getTextSize;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRollThreshold */
public final /* synthetic */ class getRollThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ GeoDataApi IconCompatParcelizer;
    private final /* synthetic */ getTextSize.C46725 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getRollThreshold(getTextSize.C46725 r1, GeoDataApi geoDataApi) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.IconCompatParcelizer = geoDataApi;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTextSize.C46725 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        GeoDataApi geoDataApi = this.IconCompatParcelizer;
        getSignatureImageField getsignatureimagefield = (getSignatureImageField) obj;
        StandardTable.ColumnKeyIterator unused = getTextSize.this.read;
        onGetStartedClick.write((Object) geoDataApi, "riskLevel");
        Iterable<addPlace> write = HmlNTBBusinessURLInformationActivity.write(geoDataApi.IconCompatParcelizer, new StandardTable.ColumnKeyIterator.write());
        onGetStartedClick.write((Object) write, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(write instanceof Collection ? ((Collection) write).size() : 10);
        for (addPlace addplace : write) {
            arrayList.add(addplace.MediaBrowserCompat$CustomActionResultReceiver);
        }
        getsignatureimagefield.IconCompatParcelizer((List) arrayList);
    }
}
