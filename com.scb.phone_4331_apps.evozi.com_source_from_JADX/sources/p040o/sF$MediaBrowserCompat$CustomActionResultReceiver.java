package p040o;

import java.util.List;
import p040o.C7431sF;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;

/* renamed from: o.sF$MediaBrowserCompat$CustomActionResultReceiver */
public final class sF$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanoramaFragment.zza> {
    final /* synthetic */ C7431sF IconCompatParcelizer;

    private sF$MediaBrowserCompat$CustomActionResultReceiver(C7431sF sFVar) {
        this.IconCompatParcelizer = sFVar;
    }

    public /* synthetic */ sF$MediaBrowserCompat$CustomActionResultReceiver(C7431sF sFVar, byte b) {
        this(sFVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        StreetViewPanoramaFragment.zza zza = (StreetViewPanoramaFragment.zza) obj;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            C7431sF sFVar = this.IconCompatParcelizer;
            List unused = sFVar.MediaDescriptionCompat = sFVar.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(zza.write, this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.setCheckable());
            if ("EBILL".equals(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo)) {
                C7431sF sFVar2 = this.IconCompatParcelizer;
                CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver = C7431sF.MediaBrowserCompat$CustomActionResultReceiver(sFVar2, sFVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                if (MediaBrowserCompat$CustomActionResultReceiver != null && ("03".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver.RatingCompat) || "04".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver.RatingCompat))) {
                    C7431sF sFVar3 = this.IconCompatParcelizer;
                    if (sFVar3.RatingCompat != null) {
                        C7530tv tvVar = C7530tv.IconCompatParcelizer;
                        if (sFVar3.RatingCompat != null) {
                            tvVar.IconCompatParcelizer(sFVar3.RatingCompat);
                        }
                        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = sFVar3.MediaBrowserCompat$ItemReceiver;
                        Collections2 MediaBrowserCompat$CustomActionResultReceiver2 = Collections2.MediaBrowserCompat$CustomActionResultReceiver();
                        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = putInstance.MediaBrowserCompat$CustomActionResultReceiver(sFVar3.read);
                        MediaBrowserCompat$CustomActionResultReceiver2.write = builder.IconCompatParcelizer;
                        String str = builder.AppCompatViewInflater;
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        MediaBrowserCompat$CustomActionResultReceiver2.read = str;
                        String str3 = builder.setChecked;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = str2;
                        sFVar3.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                        sFVar3.IconCompatParcelizer.IconCompatParcelizer(new C7431sF.write(sFVar3, (byte) 0));
                    }
                }
                C7431sF sFVar4 = this.IconCompatParcelizer;
                C7439sN sNVar = new C7439sN(this, MediaBrowserCompat$CustomActionResultReceiver);
                if (sFVar4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    sNVar.IconCompatParcelizer(sFVar4.RatingCompat);
                }
            } else {
                C7431sF sFVar5 = this.IconCompatParcelizer;
                C7442sR sRVar = new C7442sR(this);
                if (sFVar5.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    sRVar.IconCompatParcelizer(sFVar5.RatingCompat);
                }
            }
            C7431sF.MediaDescriptionCompat(this.IconCompatParcelizer);
        }
    }

    public final void onComplete() {
        C7431sF.write(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
