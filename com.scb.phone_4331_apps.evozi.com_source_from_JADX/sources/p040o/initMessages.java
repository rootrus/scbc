package p040o;

import p040o.LinkedListMultimap;
import p040o.writeUInt32;
import p040o.writeUInt64NoTag;

/* renamed from: o.initMessages */
public final class initMessages extends writeUInt32<C7135hI> {
    public final LinkedListMultimap.DistinctKeyIterator write;

    /* renamed from: o.initMessages$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7135hI> {
        private /* synthetic */ String IconCompatParcelizer;

        IconCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7135hI) obj).write(this.IconCompatParcelizer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public initMessages(LinkedListMultimap.DistinctKeyIterator distinctKeyIterator, RegularImmutableBiMap regularImmutableBiMap, performActionWithResponse performactionwithresponse, FileBackedOutputStream fileBackedOutputStream) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        onGetStartedClick.write((Object) distinctKeyIterator, "juristicResetPinController");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = distinctKeyIterator;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.write.IconCompatParcelizer();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(initMessages initmessages) {
        if (initmessages.RatingCompat != null) {
            initmessages.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(str);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final boolean read() {
        return this.read == writeUInt32.read.NEW;
    }
}
