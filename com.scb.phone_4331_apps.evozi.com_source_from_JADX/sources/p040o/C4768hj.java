package p040o;

import com.scb.phone.data.network.service.DeviceService;
import p040o.LocalProjectProvider_MembersInjector;

/* renamed from: o.hj */
public final class C4768hj extends writeUInt64NoTag<LocalProjectProvider_MembersInjector.read> {
    final newOutputStreamSupplier read;
    public final charactersOf write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4768hj(RegularImmutableBiMap regularImmutableBiMap, newOutputStreamSupplier newoutputstreamsupplier, charactersOf charactersof) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) newoutputstreamsupplier, "prepaidActivationLandingDisplayMapper");
        onGetStartedClick.write((Object) charactersof, "controller");
        this.read = newoutputstreamsupplier;
        this.write = charactersof;
    }

    /* renamed from: o.hj$write */
    public static final class write {
        public DeviceService read;

        private write() {
        }

        @HmlPinActivity
        public write(DeviceService deviceService) {
            this.read = deviceService;
        }
    }

    public final void onDestroy() {
        this.write.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void write(C4768hj hjVar) {
        if (hjVar.RatingCompat != null) {
            hjVar.RatingCompat.aj_();
        }
    }
}
