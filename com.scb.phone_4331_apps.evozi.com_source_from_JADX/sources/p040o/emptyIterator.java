package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AnalyticsConnector;
import p040o.Iterables;
import p040o.Maps;

/* renamed from: o.emptyIterator */
public final class emptyIterator extends Iterables.C35339 {
    final Maps.EntryTransformer MediaBrowserCompat$CustomActionResultReceiver;
    public final getNeedClientAuth read;
    public final getPort write;

    /* renamed from: o.emptyIterator$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends interceptEvent>, List<? extends AnalyticsConnector.AnalyticsConnectorHandle>> {
        private /* synthetic */ emptyIterator read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(emptyIterator emptyiterator) {
            super(1);
            this.read = emptyiterator;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            onGetStartedClick.write((Object) list, "model");
            Iterable<interceptEvent> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (interceptEvent MediaBrowserCompat$ItemReceiver : iterable) {
                arrayList.add(Maps.EntryTransformer.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            }
            return (List) arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public emptyIterator(getNeedClientAuth getneedclientauth, getPort getport, Maps.EntryTransformer entryTransformer) {
        super((byte) 0);
        onGetStartedClick.write((Object) getneedclientauth, "inquiryAvailableCyclesCase");
        onGetStartedClick.write((Object) getport, "exportCardStatementCase");
        onGetStartedClick.write((Object) entryTransformer, "availableCycleItemDisplayMapper");
        this.read = getneedclientauth;
        this.write = getport;
        this.MediaBrowserCompat$CustomActionResultReceiver = entryTransformer;
    }
}
