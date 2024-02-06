package p040o;

import java.util.List;
import p040o.AppMeasurementSdk;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.onRetakeButtonClick */
public final class onRetakeButtonClick extends writeUInt64NoTag<getTopLeftCornerWidth.IconCompatParcelizer> {
    public final AppMeasurementSdk.OnEventListener IconCompatParcelizer;
    public onInfoWindowLongClick read;

    /* renamed from: o.onRetakeButtonClick$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.IconCompatParcelizer> {
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(int i) {
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.IconCompatParcelizer) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public onRetakeButtonClick(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) onEventListener, "transferCase");
        this.IconCompatParcelizer = onEventListener;
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "language");
        this.IconCompatParcelizer.read.IconCompatParcelizer();
        AppMeasurementSdk.OnEventListener onEventListener = this.IconCompatParcelizer;
        onEventListener.read(onEventListener.write(str), new read(this), new onRetakeButtonClick$MediaBrowserCompat$ItemReceiver(this));
    }

    /* renamed from: o.onRetakeButtonClick$read */
    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<List<StreetViewPanoramaFragment>> {
        private /* synthetic */ onRetakeButtonClick MediaBrowserCompat$CustomActionResultReceiver;

        read(onRetakeButtonClick onretakebuttonclick) {
            this.MediaBrowserCompat$CustomActionResultReceiver = onretakebuttonclick;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            onRetakeButtonClick onretakebuttonclick = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C51003.read;
            if (onretakebuttonclick.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(onretakebuttonclick.RatingCompat);
            }
        }
    }
}
