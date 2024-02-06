package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.Geofence;
import p040o.SignedBytes;

/* renamed from: o.RegularImmutableSet */
public class RegularImmutableSet extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public RegularImmutableSet(Resources resources, SharedPreferences sharedPreferences, String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public static /* synthetic */ CrashlyticsReport.FilesPayload.Builder MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableSet regularImmutableSet, boolean z, List list, int i, int i2, int i3) {
        List list2;
        if ((i3 & 4) != 0) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_promotion_interest_rate_title;
        }
        if ((i3 & 8) != 0) {
            i2 = Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_promotion_remark;
        }
        String string = regularImmutableSet.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        if (list != null) {
            Iterable<ActivityTransitionRequest> iterable = list;
            int i4 = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i4 = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i4);
            for (ActivityTransitionRequest activityTransitionRequest : iterable) {
                onGetStartedClick.write((Object) activityTransitionRequest, "entity");
                arrayList.add(new getIdentifierUtf8Bytes(activityTransitionRequest.MediaBrowserCompat$CustomActionResultReceiver, activityTransitionRequest.write));
            }
            list2 = (List) arrayList;
        } else {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new CrashlyticsReport.FilesPayload.Builder(z, string, list2, regularImmutableSet.MediaBrowserCompat$CustomActionResultReceiver.getString(i2));
    }

    /* access modifiers changed from: protected */
    public final CrashlyticsController.ReportUploaderFilesProvider IconCompatParcelizer(FusedLocationProviderClient fusedLocationProviderClient) {
        onGetStartedClick.write((Object) fusedLocationProviderClient, "entity");
        boolean z = fusedLocationProviderClient.write;
        String str = fusedLocationProviderClient.MediaBrowserCompat$CustomActionResultReceiver;
        List<Geofence.Builder> list = fusedLocationProviderClient.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) list, "entity");
        List arrayList = new ArrayList();
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_loandetails_principal_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_l…ndetails_principal_title)");
        String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_loandetails_interest_title);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_l…andetails_interest_title)");
        arrayList.add(new withSessionEndFields(string, string2));
        Iterable<Geofence.Builder> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (Geofence.Builder MediaBrowserCompat$CustomActionResultReceiver : iterable) {
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver));
        }
        arrayList.addAll((List) arrayList2);
        return new CrashlyticsController.ReportUploaderFilesProvider(z, str, arrayList);
    }

    private static CrashlyticsReport.CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver(Geofence.Builder builder) {
        onGetStartedClick.write((Object) builder, "entity");
        String str = builder.read;
        Iterable<ActivityTransitionRequest> iterable = builder.write;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (ActivityTransitionRequest activityTransitionRequest : iterable) {
            arrayList.add(new CrashlyticsReport.CustomAttribute.Builder.read(activityTransitionRequest.write, activityTransitionRequest.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return new CrashlyticsReport.CustomAttribute.Builder(str, (List) arrayList);
    }
}
