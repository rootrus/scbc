package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.drawGlyph;

/* renamed from: o.ModuleDescriptor */
public final /* synthetic */ class ModuleDescriptor implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ ModuleDescriptor IconCompatParcelizer = new ModuleDescriptor();

    private /* synthetic */ ModuleDescriptor() {
    }

    public final Object write(Object obj) {
        Iterable<getStartProgress> iterable = ((drawGlyph) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getStartProgress getstartprogress : iterable) {
            int parseInt = Integer.parseInt(getstartprogress.MediaBrowserCompat$MediaItem);
            String str = getstartprogress.read;
            if (str == null) {
                str = "";
            }
            arrayList.add(new setTypeFilter(parseInt, str, getstartprogress.MediaBrowserCompat$ItemReceiver, getstartprogress.MediaBrowserCompat$CustomActionResultReceiver, getstartprogress.IconCompatParcelizer, getstartprogress.write));
        }
        return new getPlaceById(HmlNTBBusinessURLInformationActivity.write((List) arrayList, new drawGlyph.read()));
    }
}
