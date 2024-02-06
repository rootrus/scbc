package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.RegistrationMethods;

/* renamed from: o.withHolder */
public final class withHolder extends FragmentBuilder_BindSummaryFragment {
    private final RegistrationMethods.Builder write;

    @HmlPinActivity
    public withHolder(RegistrationMethods.Builder builder) {
        onGetStartedClick.write((Object) builder, "fixedTransferVerificationEntityMapper");
        this.write = builder;
    }

    public final zoomByWithFocus read(ExceptionParser exceptionParser) {
        List list;
        List<Utils> list2;
        onGetStartedClick.write((Object) exceptionParser, "entity");
        zoomByWithFocus zoombywithfocus = new zoomByWithFocus();
        String str = exceptionParser.MediaSessionCompat$ResultReceiverWrapper;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        zoombywithfocus.RatingCompat = str;
        zoombywithfocus.MediaBrowserCompat$MediaItem = FragmentBuilder_BindSummaryFragment.write(exceptionParser.f2707x50fd9e4a, OffsetDateTime.now());
        zoombywithfocus.write = exceptionParser.MediaBrowserCompat$SearchResultReceiver;
        String str3 = exceptionParser.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            str2 = str3;
        }
        zoombywithfocus.MediaBrowserCompat$CustomActionResultReceiver = str2;
        zoombywithfocus.read = exceptionParser.read;
        zoombywithfocus.MediaMetadataCompat = exceptionParser.MediaBrowserCompat$MediaItem;
        zoombywithfocus.MediaDescriptionCompat = exceptionParser.ParcelableVolumeInfo;
        zoombywithfocus.MediaBrowserCompat$SearchResultReceiver = exceptionParser.MediaDescriptionCompat;
        uncaughtException uncaughtexception = exceptionParser.write;
        if (uncaughtexception != null) {
            new setRotateGesturesEnabled(uncaughtexception.MediaBrowserCompat$CustomActionResultReceiver, uncaughtexception.write, uncaughtexception.MediaBrowserCompat$ItemReceiver);
        }
        uncaughtException uncaughtexception2 = exceptionParser.IconCompatParcelizer;
        if (uncaughtexception2 != null) {
            new setRotateGesturesEnabled(uncaughtexception2.MediaBrowserCompat$CustomActionResultReceiver, uncaughtexception2.write, uncaughtexception2.MediaBrowserCompat$ItemReceiver);
        }
        zoombywithfocus.IconCompatParcelizer = this.write.write(exceptionParser.MediaMetadataCompat);
        addPoints addpoints = exceptionParser.MediaBrowserCompat$ItemReceiver;
        if (addpoints == null || (list2 = addpoints.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            Iterable<Utils> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (Utils utils : iterable) {
                String str4 = null;
                String str5 = utils != null ? utils.IconCompatParcelizer : null;
                String str6 = utils != null ? utils.MediaBrowserCompat$ItemReceiver : null;
                String str7 = utils != null ? utils.read : null;
                String str8 = utils != null ? utils.RatingCompat : null;
                String str9 = utils != null ? utils.write : null;
                if (utils != null) {
                    str4 = utils.MediaBrowserCompat$CustomActionResultReceiver;
                }
                arrayList.add(new setOnIndoorStateChangeListener(str5, str6, str7, str8, str9, str4));
            }
            list = (List) arrayList;
        }
        zoombywithfocus.MediaBrowserCompat$ItemReceiver = new setOnCameraMoveStartedListener(list);
        return zoombywithfocus;
    }
}
