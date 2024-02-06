package p040o;

import p040o.AppMeasurement;
import p040o.onBackImageProcessed;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTaskID */
public final class getTaskID extends writeUInt64NoTag<onBackImageProcessed.read> {
    public final AppMeasurement.Event read;

    /* renamed from: o.getTaskID$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<onBackImageProcessed.read> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public write(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((onBackImageProcessed.read) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getTaskID(RegularImmutableBiMap regularImmutableBiMap, AppMeasurement.Event event) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) event, "privacyNoticeCase");
        this.read = event;
    }
}
