package p040o;

import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.ImmutableMultimap;
import p040o.QuickExtractor;

/* renamed from: o.kr */
public class C4912kr extends writeUInt64NoTag<QuickExtractor.C70161> {
    public List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Splitter MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final isIsatapAddress MediaDescriptionCompat;
    public int read;
    public final asList write;

    @HmlPinActivity
    public C4912kr(RegularImmutableBiMap regularImmutableBiMap, asList aslist, Splitter splitter, isIsatapAddress isisatapaddress) {
        super(regularImmutableBiMap);
        this.write = aslist;
        this.MediaBrowserCompat$MediaItem = splitter;
        this.MediaDescriptionCompat = isisatapaddress;
    }

    static /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        return builder instanceof getSignal;
    }

    static ImmutableMultimap MediaBrowserCompat$CustomActionResultReceiver(getSignal getsignal) {
        return new ImmutableMultimap(getsignal.IconCompatParcelizer, "", new ImmutableMultimap.Builder(getsignal.MediaBrowserCompat$MediaItem));
    }

    static ImmutableMultimap.SortedKeyBuilderMultimap IconCompatParcelizer(getSignal getsignal) {
        return new ImmutableMultimap.SortedKeyBuilderMultimap(getsignal.IconCompatParcelizer, "", new ImmutableMultimap.BuilderMultimap(getsignal.MediaBrowserCompat$MediaItem));
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4912kr krVar) {
        if (krVar.RatingCompat != null) {
            krVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(C4912kr krVar) {
        if (krVar.RatingCompat != null) {
            krVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(C4912kr krVar) {
        if (krVar.RatingCompat != null) {
            krVar.RatingCompat.aj_();
        }
    }
}
