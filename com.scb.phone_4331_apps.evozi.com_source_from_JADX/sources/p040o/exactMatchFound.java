package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AccountTransferClient;
import p040o.SortedLists;

/* renamed from: o.exactMatchFound */
public final class exactMatchFound extends constrainedListMultimap {
    private final SortedLists.Relation MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public exactMatchFound(Resources resources, SharedPreferences sharedPreferences, SortedLists.Relation relation, SortedLists.Relation.C37961 r5) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) relation, "questionDisplayMapper");
        onGetStartedClick.write((Object) r5, "summaryDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = relation;
    }

    /* renamed from: o.exactMatchFound$read */
    public static final class read implements findFragmentByWho {
        private final /* synthetic */ AccountTransferClient.zzc read;

        private read() {
        }

        public /* synthetic */ read(AccountTransferClient.zzc zzc) {
            this.read = zzc;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return this.read.MediaBrowserCompat$CustomActionResultReceiver((findImageAssetForFileName) obj);
        }
    }

    public final populateExecutionData IconCompatParcelizer(extractLocationAvailability extractlocationavailability) {
        onGetStartedClick.write((Object) extractlocationavailability, "investmentRiskAssessment");
        boolean z = extractlocationavailability.write == 1;
        Collection arrayList = new ArrayList();
        for (Object next : extractlocationavailability.IconCompatParcelizer) {
            LocationListener locationListener = (LocationListener) next;
            if (1 == locationListener.IconCompatParcelizer || locationListener.read) {
                arrayList.add(next);
            }
        }
        Iterable<LocationListener> iterable = (List) arrayList;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(((Collection) iterable).size());
        for (LocationListener MediaBrowserCompat$ItemReceiver2 : iterable) {
            arrayList2.add(SortedLists.Relation.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, z));
        }
        List list = (List) arrayList2;
        Iterable<LocationRequest> iterable2 = extractlocationavailability.MediaBrowserCompat$ItemReceiver;
        int i = 10;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        if (iterable2 instanceof Collection) {
            i = ((Collection) iterable2).size();
        }
        Collection arrayList3 = new ArrayList(i);
        for (LocationRequest locationRequest : iterable2) {
            onGetStartedClick.write((Object) locationRequest, "investmentRiskAssessmentQuestionSummary");
            arrayList3.add(new populateEventApplicationData(locationRequest.read, locationRequest.IconCompatParcelizer, locationRequest.write));
        }
        return new populateExecutionData(list, (List) arrayList3);
    }
}
