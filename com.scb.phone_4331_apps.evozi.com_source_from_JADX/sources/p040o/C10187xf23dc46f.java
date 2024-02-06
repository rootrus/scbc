package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zzlu$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C10187xf23dc46f<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final C10187xf23dc46f write = new C10187xf23dc46f();

    C10187xf23dc46f() {
    }

    public final /* synthetic */ Object write(Object obj) {
        List<getScrollGesturesEnabledDuringRotateOrZoom> list;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        setRotationEnabled setrotationenabled = (setRotationEnabled) data;
        onGetStartedClick.write((Object) setrotationenabled, "$this$toDomain");
        tiltGesturesEnabled tiltgesturesenabled = new tiltGesturesEnabled(setrotationenabled.RatingCompat, setrotationenabled.MediaBrowserCompat$MediaItem);
        setEntryLabelColor setentrylabelcolor = setrotationenabled.IconCompatParcelizer;
        onGetStartedClick.write((Object) setentrylabelcolor, "$this$toDomain");
        getLiteMode getlitemode = new getLiteMode(setentrylabelcolor.IconCompatParcelizer, setentrylabelcolor.read);
        onGetStartedClick.write((Object) getlitemode, "<set-?>");
        tiltgesturesenabled.MediaBrowserCompat$CustomActionResultReceiver = getlitemode;
        getRotateGesturesEnabled read = AlertController$RecycleListView.read(setrotationenabled.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.write((Object) read, "<set-?>");
        tiltgesturesenabled.IconCompatParcelizer = read;
        scrollGesturesEnabledDuringRotateOrZoom IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(setrotationenabled.MediaBrowserCompat$SearchResultReceiver);
        onGetStartedClick.write((Object) IconCompatParcelizer, "<set-?>");
        tiltgesturesenabled.MediaMetadataCompat = IconCompatParcelizer;
        setHoleColor setholecolor = setrotationenabled.MediaMetadataCompat;
        onGetStartedClick.write((Object) setholecolor, "$this$toDomain");
        tiltgesturesenabled.MediaDescriptionCompat = new latLngBoundsForCameraTarget(setholecolor.write, setholecolor.read);
        List<setDrawSlicesUnderHole> list2 = setrotationenabled.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            Iterable<setDrawSlicesUnderHole> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (setDrawSlicesUnderHole setdrawslicesunderhole : iterable) {
                onGetStartedClick.write((Object) setdrawslicesunderhole, "$this$toDomain");
                arrayList.add(new getScrollGesturesEnabledDuringRotateOrZoom(setdrawslicesunderhole.MediaBrowserCompat$ItemReceiver));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        tiltgesturesenabled.read = list;
        setDrawSliceText setdrawslicetext = setrotationenabled.write;
        onGetStartedClick.write((Object) setdrawslicetext, "$this$toDomain");
        tiltgesturesenabled.MediaBrowserCompat$ItemReceiver = new getUseViewLifecycleInFragment(setdrawslicetext.write, setdrawslicetext.MediaBrowserCompat$ItemReceiver);
        tiltgesturesenabled.write = setrotationenabled.read;
        tiltgesturesenabled.MediaBrowserCompat$SearchResultReceiver = setrotationenabled.MediaDescriptionCompat;
        return tiltgesturesenabled;
    }
}
