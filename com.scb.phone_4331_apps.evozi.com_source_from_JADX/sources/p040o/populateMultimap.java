package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.zzcz;

/* renamed from: o.populateMultimap */
public final class populateMultimap extends RegularImmutableSet {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public populateMultimap(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public final recordFatalFirebaseEvent MediaBrowserCompat$ItemReceiver(zzcz.zzg zzg) {
        CrashlyticsController.ReportUploaderFilesProvider reportUploaderFilesProvider;
        List list;
        zzcz.zzg zzg2 = zzg;
        onGetStartedClick.write((Object) zzg2, "model");
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_result_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…hml_landing_result_title)");
        StringBuilder sb = new StringBuilder();
        sb.append(zzg2.MediaBrowserCompat$ItemReceiver);
        sb.append(" ");
        sb.append(zzg2.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        String obj = sb.toString();
        String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_result_content, new Object[]{write(Double.valueOf(zzg2.MediaBrowserCompat$CustomActionResultReceiver))});
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(\n   …st)\n                    )");
        String write = write(zzg2.IconCompatParcelizer.read);
        onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(model.installment.minAmount)");
        FusedLocationProviderClient fusedLocationProviderClient = zzg2.MediaBrowserCompat$MediaItem;
        if (fusedLocationProviderClient != null) {
            reportUploaderFilesProvider = IconCompatParcelizer(fusedLocationProviderClient);
        } else {
            reportUploaderFilesProvider = null;
        }
        List<Geofence> list2 = zzg2.MediaBrowserCompat$SearchResultReceiver;
        if (list2 != null) {
            Iterable<Geofence> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (Geofence geofence : iterable) {
                arrayList.add(new CrashlyticsReport.Session(geofence.write, geofence.MediaBrowserCompat$CustomActionResultReceiver, RegularImmutableSet.MediaBrowserCompat$CustomActionResultReceiver(this, false, geofence.read, Iterables$3$MediaBrowserCompat$MediaItem.hml_landing_loandetails_interest_title, 0, 8)));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return new recordFatalFirebaseEvent(string, obj, string2, write, reportUploaderFilesProvider, list);
    }

    public final String MediaBrowserCompat$ItemReceiver(double d) {
        return constrainedListMultimap.write(Double.valueOf(d)).replaceAll("\\.0*$", "");
    }
}
