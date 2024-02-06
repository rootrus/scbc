package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.RegistrationMethods;

/* renamed from: o.AppStatsDataStore$b$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3033xccb9cca4 implements findFragmentByWho {
    private final /* synthetic */ RegistrationMethods.Builder MediaBrowserCompat$CustomActionResultReceiver;

    private C3033xccb9cca4() {
    }

    public /* synthetic */ C3033xccb9cca4(RegistrationMethods.Builder builder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = builder;
    }

    public final Object IconCompatParcelizer(Object obj) {
        setScrollGesturesEnabled setscrollgesturesenabled;
        setExceptionParser setexceptionparser = (setExceptionParser) obj;
        if (setexceptionparser.MediaMetadataCompat != null) {
            setscrollgesturesenabled = new setScrollGesturesEnabled(setexceptionparser.MediaMetadataCompat.write, setexceptionparser.MediaMetadataCompat.IconCompatParcelizer);
        } else {
            setscrollgesturesenabled = null;
        }
        return new setMyLocationButtonEnabled(setexceptionparser.MediaBrowserCompat$MediaItem, setexceptionparser.MediaBrowserCompat$SearchResultReceiver.doubleValue(), setexceptionparser.MediaBrowserCompat$ItemReceiver.doubleValue(), setexceptionparser.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), setexceptionparser.IconCompatParcelizer.doubleValue(), setexceptionparser.MediaDescriptionCompat.doubleValue(), FragmentBuilder_BindSummaryFragment.write(setexceptionparser.write, (OffsetDateTime) null), FragmentBuilder_BindSummaryFragment.write(setexceptionparser.read, (OffsetDateTime) null), setscrollgesturesenabled);
    }
}
