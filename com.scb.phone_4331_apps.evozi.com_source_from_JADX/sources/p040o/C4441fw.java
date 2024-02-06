package p040o;

import java.util.ArrayList;
import p040o.AppMeasurement;
import p040o.ImmutableBiMap;
import p040o.MapConstraints;
import p040o.access$2300;

/* renamed from: o.fw */
public class C4441fw extends C4443fz<getCompressedFrontImageSize$MediaBrowserCompat$ItemReceiver> {
    @HmlPinActivity
    public C4441fw(RegularImmutableBiMap regularImmutableBiMap, MapConstraints.ConstrainedMultimap.C36372 r2, AppMeasurement.OnEventListener onEventListener) {
        super(regularImmutableBiMap, r2, onEventListener);
    }

    public final void IconCompatParcelizer(String str, int i) {
        smear read = smear.read();
        read.write = String.valueOf(i);
        read.MediaBrowserCompat$CustomActionResultReceiver = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(read);
        ImmutableBiMap.EmptyBiMap read2 = ImmutableBiMap.EmptyBiMap.read();
        read2.MediaBrowserCompat$ItemReceiver = arrayList;
        this.read.read(read2);
        this.read.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
    }

    /* renamed from: o.fw$IconCompatParcelizer */
    final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(C4441fw fwVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4441fw.this.MediaBrowserCompat$ItemReceiver(C4441fw.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4441fw fwVar = C4441fw.this;
            C9945fx fxVar = C9945fx.write;
            if (fwVar.RatingCompat != null) {
                fxVar.IconCompatParcelizer(fwVar.RatingCompat);
            }
        }
    }
}
