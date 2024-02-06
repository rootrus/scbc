package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.validateWithImage;
import p040o.writeUInt64NoTag;

/* renamed from: o.ConsecutiveFramesStable */
public final /* synthetic */ class ConsecutiveFramesStable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ validateWithImage.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ isInfoWindowShown MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ConsecutiveFramesStable(validateWithImage.read read, isInfoWindowShown isinfowindowshown) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.MediaBrowserCompat$ItemReceiver = isinfowindowshown;
    }

    public final void IconCompatParcelizer(Object obj) {
        validateWithImage.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        isInfoWindowShown isinfowindowshown = this.MediaBrowserCompat$ItemReceiver;
        immediateCheckedFuture read2 = validateWithImage.this.IconCompatParcelizer;
        unmodifiableSortedSetMultimap unused = validateWithImage.this.MediaDescriptionCompat;
        onGetStartedClick.write((Object) isinfowindowshown, "domain");
        String str = isinfowindowshown.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "domain.email");
        OffsetDateTime offsetDateTime = isinfowindowshown.write;
        onGetStartedClick.IconCompatParcelizer((Object) offsetDateTime, "domain.startDate");
        OffsetDateTime offsetDateTime2 = isinfowindowshown.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) offsetDateTime2, "domain.endDate");
        ((CheckCaptureModule_GetLookAndFeelParametersFactory.write) obj).IconCompatParcelizer(read2, new MissingNativeComponent(str, offsetDateTime, offsetDateTime2));
    }
}
