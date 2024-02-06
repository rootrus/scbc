package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LinkedListMultimap;
import p040o.Sets;

/* renamed from: o.LinkedListMultimap$4$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3585x9589b984 extends CheckEligibilityActivity implements FundFactSheetActivity<GeofenceStatusCodes, didPreviousInitializationFail> {
    private /* synthetic */ LinkedListMultimap.C35754.C35761 MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3585x9589b984(LinkedListMultimap.C35754.C35761 r1) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list;
        GeofenceStatusCodes geofenceStatusCodes = (GeofenceStatusCodes) obj;
        onGetStartedClick.write((Object) geofenceStatusCodes, "it");
        Sets.PowerSet.C37751 r0 = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        onGetStartedClick.write((Object) geofenceStatusCodes, "portfolioSummary");
        List<setNotificationResponsiveness> list2 = geofenceStatusCodes.write;
        if (list2 != null) {
            Iterable iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object next : iterable) {
                if (i2 >= 0) {
                    arrayList.add(r0.read.IconCompatParcelizer(i2, (setNotificationResponsiveness) next));
                    i2++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            Collection arrayList2 = new ArrayList();
            for (Object next2 : (List) arrayList) {
                Collection collection = ((CrashlyticsCore) next2).read;
                if (!(collection == null || collection.isEmpty())) {
                    arrayList2.add(next2);
                }
            }
            list = (List) arrayList2;
        } else {
            list = null;
        }
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new didPreviousInitializationFail(list);
    }
}
