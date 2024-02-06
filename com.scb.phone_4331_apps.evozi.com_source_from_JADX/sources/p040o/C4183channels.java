package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.channels */
public final /* synthetic */ class C4183channels implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsBackgroundWorker.C32131 IconCompatParcelizer;
    private final /* synthetic */ ICheckDetector MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4183channels(ICheckDetector iCheckDetector, CrashlyticsBackgroundWorker.C32131 r2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iCheckDetector;
        this.IconCompatParcelizer = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        CrashlyticsBackgroundWorker.C32131 r0 = this.IconCompatParcelizer;
        CheckExtractActivity_MembersInjector.ParcelableVolumeInfo parcelableVolumeInfo = (CheckExtractActivity_MembersInjector.ParcelableVolumeInfo) obj;
        parcelableVolumeInfo.MediaDescriptionCompat();
        parcelableVolumeInfo.IconCompatParcelizer(r0);
        parcelableVolumeInfo.read();
        parcelableVolumeInfo.IconCompatParcelizer();
        List<CrashlyticsBackgroundWorker.C32142> list = r0.IconCompatParcelizer;
        T t = null;
        if (list != null && !list.isEmpty()) {
            show show = new show(list);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, XVrsOperations.read));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            T t2 = issupportfragmentclass.IconCompatParcelizer;
            if (t2 != null) {
                t = t2;
            }
            t = (CrashlyticsBackgroundWorker.C32142) t;
        }
        if (t == null) {
            parcelableVolumeInfo.RatingCompat();
        } else {
            parcelableVolumeInfo.write(t);
        }
    }
}
