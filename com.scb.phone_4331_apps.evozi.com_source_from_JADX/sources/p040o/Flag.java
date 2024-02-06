package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Layer;
import p040o.getPlaceId;
import p040o.getTimeRemapping;

/* renamed from: o.Flag */
public final /* synthetic */ class Flag implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ Flag MediaBrowserCompat$ItemReceiver = new Flag();

    private /* synthetic */ Flag() {
    }

    /* renamed from: o.Flag$StringFlag */
    public final /* synthetic */ class StringFlag implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ FragmentBuilder_BindSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ StringFlag(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSummaryFragment;
        }

        public final Object write(Object obj) {
            setFlexLines setflexlines = (setFlexLines) ((SingleDataEntity) obj).getData();
            onGetStartedClick.write((Object) setflexlines, "identityValidationEntity");
            return DebitCardResetOtpActivity.just(new toScreenLocation(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setflexlines.IconCompatParcelizer, (Object) DiskLruCache.VERSION_1)));
        }
    }

    /* renamed from: o.Flag$BooleanFlag */
    public final /* synthetic */ class BooleanFlag implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ BooleanFlag write = new BooleanFlag();

        private /* synthetic */ BooleanFlag() {
        }

        public final Object write(Object obj) {
            return DebitCardResetOtpActivity.just(Boolean.TRUE);
        }
    }

    /* renamed from: o.Flag$LongFlag */
    public final /* synthetic */ class LongFlag implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ LongFlag IconCompatParcelizer = new LongFlag();

        private /* synthetic */ LongFlag() {
        }

        public final Object write(Object obj) {
            Layer.MatteType matteType = (Layer.MatteType) ((SingleDataEntity) obj).getData();
            return new setCountry(matteType.MediaBrowserCompat$ItemReceiver, matteType.MediaBrowserCompat$CustomActionResultReceiver, matteType.IconCompatParcelizer, matteType.read, matteType.write, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) matteType.MediaBrowserCompat$MediaItem, (Object) DiskLruCache.VERSION_1));
        }
    }

    /* renamed from: o.Flag$IntegerFlag */
    public final /* synthetic */ class IntegerFlag implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ IntegerFlag read = new IntegerFlag();

        private /* synthetic */ IntegerFlag() {
        }

        public final Object write(Object obj) {
            Iterable<getTextLineWidthForGlyphs> iterable = ((getContentsForCharacter) ((SingleDataEntity) obj).getData()).write;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (getTextLineWidthForGlyphs gettextlinewidthforglyphs : iterable) {
                arrayList.add(new addPlace(Integer.parseInt(gettextlinewidthforglyphs.read), gettextlinewidthforglyphs.MediaBrowserCompat$CustomActionResultReceiver, gettextlinewidthforglyphs.IconCompatParcelizer));
            }
            return new GeoDataApi((List) arrayList);
        }
    }

    public final Object write(Object obj) {
        Iterable<getTimeRemapping.read> iterable = ((getTimeRemapping) ((SingleDataEntity) obj).getData()).IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getTimeRemapping.read read : iterable) {
            arrayList.add(new getPlaceId.IconCompatParcelizer(read.MediaBrowserCompat$CustomActionResultReceiver, read.MediaBrowserCompat$ItemReceiver));
        }
        return new getPlaceId((List) arrayList);
    }
}
