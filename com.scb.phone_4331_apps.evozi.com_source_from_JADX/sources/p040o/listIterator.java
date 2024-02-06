package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.setFeatures;

/* renamed from: o.listIterator */
public final /* synthetic */ class listIterator implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setFeatures MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ listIterator(setFeatures setfeatures) {
        this.MediaBrowserCompat$ItemReceiver = setfeatures;
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        int i = ((ExceptionReporter) singleDataEntity.getData()).read;
        String str = ((ExceptionReporter) singleDataEntity.getData()).IconCompatParcelizer;
        Integer num = ((ExceptionReporter) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((ExceptionReporter) singleDataEntity.getData()).write, (Object) "Y");
        Iterable<onBind> iterable = ((ExceptionReporter) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (onBind onbind : iterable) {
            arrayList.add(new compassEnabled(onbind.MediaMetadataCompat, onbind.MediaSessionCompat$ResultReceiverWrapper, onbind.MediaBrowserCompat$MediaItem, (String) null, (String) null, onbind.IconCompatParcelizer, onbind.write, onbind.read, onbind.MediaBrowserCompat$SearchResultReceiver, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) onbind.RatingCompat, (Object) "Y"), onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) onbind.MediaDescriptionCompat, (Object) "Y"), (C4169camera) null, onbind.MediaBrowserCompat$CustomActionResultReceiver, onbind.MediaBrowserCompat$ItemReceiver, onbind.MediaSessionCompat$QueueItem, 2072));
        }
        return new GoogleMapOptions(i, MediaBrowserCompat$ItemReceiver2, str, num, HmlNTBBusinessURLInformationActivity.write((List) arrayList, new setFeatures.IconCompatParcelizer()));
    }
}
