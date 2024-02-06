package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanorama;

/* renamed from: o.onAcceptButtonClick$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5093x84279d7c extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
    private String IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ onAcceptButtonClick write;

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        boolean z = true;
        if (!(this.write.RatingCompat != null)) {
            return;
        }
        if (list == null || list.isEmpty()) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                onAcceptButtonClick onacceptbuttonclick = this.write;
                C5193rI rIVar = C5193rI.write;
                if (onacceptbuttonclick.RatingCompat != null) {
                    rIVar.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
                }
            }
            onAcceptButtonClick onacceptbuttonclick2 = this.write;
            setBorderThickness setborderthickness = new setBorderThickness(this);
            if (onacceptbuttonclick2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setborderthickness.IconCompatParcelizer(onacceptbuttonclick2.RatingCompat);
                return;
            }
            return;
        }
        onAcceptButtonClick.read(this.write);
        List unused = this.write.MediaDescriptionCompat = list;
        StreetViewPanorama.OnStreetViewPanoramaLongClickListener MediaDescriptionCompat = onAcceptButtonClick.MediaDescriptionCompat(this.write);
        String str = MediaDescriptionCompat == null ? null : MediaDescriptionCompat.write;
        List<CrashlyticsReport.FilesPayload.File.Builder> MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(list, this.write.MediaBrowserCompat$SearchResultReceiver.write.setItemInvoker(), this.MediaBrowserCompat$CustomActionResultReceiver);
        onAcceptButtonClick onacceptbuttonclick3 = this.write;
        if (this.MediaBrowserCompat$ItemReceiver) {
            str = this.IconCompatParcelizer;
        }
        int MediaBrowserCompat$ItemReceiver3 = onAcceptButtonClick.MediaBrowserCompat$ItemReceiver(onacceptbuttonclick3, MediaBrowserCompat$ItemReceiver2, str);
        onAcceptButtonClick onacceptbuttonclick4 = this.write;
        C5196rL rLVar = new C5196rL(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3);
        if (onacceptbuttonclick4.RatingCompat == null) {
            z = false;
        }
        if (z) {
            rLVar.IconCompatParcelizer(onacceptbuttonclick4.RatingCompat);
        }
    }

    C5093x84279d7c(onAcceptButtonClick onacceptbuttonclick, boolean z) {
        this(onacceptbuttonclick, (String) null, false, z);
    }

    public C5093x84279d7c(onAcceptButtonClick onacceptbuttonclick, String str, boolean z, boolean z2) {
        this.write = onacceptbuttonclick;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
    }

    public final void onComplete() {
        onAcceptButtonClick.MediaBrowserCompat$ItemReceiver(this.write);
    }

    public final void onError(Throwable th) {
        if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            boolean z = true;
            if (this.write.RatingCompat != null) {
                if (this.MediaBrowserCompat$ItemReceiver) {
                    onAcceptButtonClick onacceptbuttonclick = this.write;
                    C5193rI rIVar = C5193rI.write;
                    if (onacceptbuttonclick.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        rIVar.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
                    }
                }
                onAcceptButtonClick.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                onAcceptButtonClick.write(this.write);
            }
        }
    }
}
