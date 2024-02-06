package p040o;

import java.util.ArrayList;
import p040o.AppMeasurement;
import p040o.MapConstraints;
import p040o.access$2300;

/* renamed from: o.fq */
public class C4436fq extends C4433fn<getBottomRightCornerHeight$MediaBrowserCompat$ItemReceiver> {
    @HmlPinActivity
    public C4436fq(RegularImmutableBiMap regularImmutableBiMap, MapConstraints.ConstrainedMultimap.C36372 r2, AppMeasurement.Param param) {
        super(regularImmutableBiMap, r2, param);
    }

    public final void write(String str, int i) {
        HashMultiset MediaBrowserCompat$ItemReceiver = HashMultiset.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = String.valueOf(i);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(MediaBrowserCompat$ItemReceiver);
        ImmutableAsList read = ImmutableAsList.read();
        read.MediaBrowserCompat$ItemReceiver = arrayList;
        this.read.write(read);
        this.read.IconCompatParcelizer(new write(this, (byte) 0));
    }

    /* renamed from: o.fq$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        /* synthetic */ write(C4436fq fqVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4436fq.this.MediaBrowserCompat$ItemReceiver(C4436fq.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4436fq fqVar = C4436fq.this;
            C9938fh fhVar = C9938fh.read;
            if (fqVar.RatingCompat != null) {
                fhVar.IconCompatParcelizer(fqVar.RatingCompat);
            }
        }
    }
}
