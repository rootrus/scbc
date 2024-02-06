package p040o;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FragmentBuilder_BindDiscoverTopFundListFragment */
public final /* synthetic */ class FragmentBuilder_BindDiscoverTopFundListFragment implements Callable {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ Context MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int MediaDescriptionCompat;
    private final /* synthetic */ boolean RatingCompat;
    private final /* synthetic */ boolean read;
    private final /* synthetic */ setCrashlyticsOriginEventListener write;

    public /* synthetic */ FragmentBuilder_BindDiscoverTopFundListFragment(setCrashlyticsOriginEventListener setcrashlyticsorigineventlistener, boolean z, List list, Context context, boolean z2, int i, boolean z3) {
        this.write = setcrashlyticsorigineventlistener;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = z2;
        this.MediaDescriptionCompat = i;
        this.RatingCompat = z3;
    }

    public final Object call() {
        return AlertController$RecycleListView.read.read(this.write, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.MediaDescriptionCompat, this.RatingCompat);
    }
}
