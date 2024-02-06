package p040o;

import p040o.AppMeasurementSdk;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRawData */
public final class getRawData extends writeUInt64NoTag<C1347xfa428d71> {
    public final AppMeasurementSdk.OnEventListener read;

    /* renamed from: o.getRawData$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C1347xfa428d71> {
        public static final read read = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1347xfa428d71) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getRawData(AppMeasurementSdk.OnEventListener onEventListener, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) onEventListener, "transferCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = onEventListener;
    }
}
