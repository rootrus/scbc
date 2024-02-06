package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.activity.cardmanagement.ExportCardStatementActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.UnmodifiableIterator */
public final class UnmodifiableIterator extends constrainedListMultimap {
    private final String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public UnmodifiableIterator(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) str, "lang");
        this.read = str;
    }

    public final List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> read(List<ExportCardStatementActivity.write> list) {
        String str;
        String str2;
        Iterable<ExportCardStatementActivity.write> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (ExportCardStatementActivity.write write : iterable) {
            String str3 = this.read;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase();
                onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) lowerCase, (Object) "th")) {
                    str2 = write.read;
                    str = write.MediaBrowserCompat$SearchResultReceiver;
                } else {
                    str2 = write.MediaBrowserCompat$ItemReceiver;
                    str = write.RatingCompat;
                }
                arrayList.add(new AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder(write.MediaDescriptionCompat, write.write, write.MediaMetadataCompat, write.read, write.MediaBrowserCompat$ItemReceiver, str2, write.MediaBrowserCompat$SearchResultReceiver, write.RatingCompat, str, write.MediaBrowserCompat$CustomActionResultReceiver, write.IconCompatParcelizer));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return (List) arrayList;
    }
}
