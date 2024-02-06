package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.forStringMap */
public final /* synthetic */ class forStringMap implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 read;

    public /* synthetic */ forStringMap(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.read = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        List<getCopies> list;
        List list2;
        List<getTransform> list3;
        List<getInitialPoint> list4;
        String str;
        String str2;
        getSavedDefaultGoogleSignInOptions getsaveddefaultgooglesigninoptions = this.read.MediaBrowserCompat$ItemReceiver;
        forValue forvalue = (forValue) ((SingleDataEntity) obj).getData();
        String str3 = forvalue != null ? forvalue.read : null;
        if (forvalue != null) {
            list = forvalue.IconCompatParcelizer;
        } else {
            list = null;
        }
        if (list != null) {
            Iterable<getCopies> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getCopies getcopies : iterable) {
                String str4 = getcopies != null ? getcopies.IconCompatParcelizer : null;
                String str5 = getcopies != null ? getcopies.read : null;
                String str6 = getcopies != null ? getcopies.MediaBrowserCompat$CustomActionResultReceiver : null;
                String str7 = getcopies != null ? getcopies.write : null;
                if (getcopies != null) {
                    str2 = getcopies.MediaBrowserCompat$ItemReceiver;
                } else {
                    str2 = null;
                }
                arrayList.add(new getMaxWaitTime(str4, str5, str6, str7, str2));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        if (forvalue != null) {
            list3 = forvalue.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            list3 = null;
        }
        List<getNumUpdates> write = getSavedDefaultGoogleSignInOptions.write(list3);
        OffsetDateTime write2 = AlertController$RecycleListView.write(forvalue != null ? forvalue.RatingCompat : null, (OffsetDateTime) null);
        if (forvalue != null) {
            list4 = forvalue.write;
        } else {
            list4 = null;
        }
        List<setNumUpdates> MediaBrowserCompat$CustomActionResultReceiver = getsaveddefaultgooglesigninoptions.MediaBrowserCompat$CustomActionResultReceiver(list4);
        if (forvalue != null) {
            str = forvalue.MediaBrowserCompat$ItemReceiver;
        } else {
            str = null;
        }
        return new getSettingsClient(str3, list2, write, write2, MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindSummaryFragment.write(str, (OffsetDateTime) null));
    }
}
