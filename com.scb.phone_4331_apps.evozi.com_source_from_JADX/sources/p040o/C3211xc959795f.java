package p040o;

import java.util.List;
import p040o.ConstructorConstructor;
import p040o.StreetViewPanorama;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.ConstructorConstructor$6$MediaBrowserCompat$CustomActionResultReceiver */
final class C3211xc959795f extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
    final /* synthetic */ ConstructorConstructor.C32066 write;

    private C3211xc959795f(ConstructorConstructor.C32066 r1) {
        this.write = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        boolean z = true;
        if ((this.write.RatingCompat != null) && list != null) {
            ConstructorConstructor.C32066.MediaDescriptionCompat(this.write);
            int unused = this.write.IconCompatParcelizer = list.size();
            ConstructorConstructor.C32066 r5 = this.write;
            ConstructorConstructor.C32033 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    C3211xc959795f constructorConstructor$6$MediaBrowserCompat$CustomActionResultReceiver = C3211xc959795f.this;
                    ((C1153xe809f160) obj).write(constructorConstructor$6$MediaBrowserCompat$CustomActionResultReceiver.write.write, constructorConstructor$6$MediaBrowserCompat$CustomActionResultReceiver.write.IconCompatParcelizer);
                }
            };
            if (r5.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r0.IconCompatParcelizer(r5.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        ConstructorConstructor.C32066.MediaBrowserCompat$SearchResultReceiver(this.write);
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
