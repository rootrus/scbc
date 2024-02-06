package p040o;

import com.scb.phone.view.activity.registration.C5708x2064d349;
import p040o.ImmutableSetMultimap;

/* renamed from: o.putInBothMaps */
public final /* synthetic */ class putInBothMaps implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ delegate MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ImmutableSetMultimap.SortedKeyBuilderMultimap read;

    public /* synthetic */ putInBothMaps(delegate delegate, ImmutableSetMultimap.SortedKeyBuilderMultimap sortedKeyBuilderMultimap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = delegate;
        this.read = sortedKeyBuilderMultimap;
    }

    public final Object write(Object obj) {
        delegate delegate = this.MediaBrowserCompat$CustomActionResultReceiver;
        ImmutableSetMultimap.SortedKeyBuilderMultimap sortedKeyBuilderMultimap = this.read;
        C5708x2064d349 registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver = (C5708x2064d349) obj;
        sortedKeyBuilderMultimap.IconCompatParcelizer.write = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        sortedKeyBuilderMultimap.write = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.write;
        String str = delegate.write;
        onGetStartedClick.write((Object) str, "<set-?>");
        sortedKeyBuilderMultimap.MediaBrowserCompat$CustomActionResultReceiver = str;
        return sortedKeyBuilderMultimap;
    }
}
