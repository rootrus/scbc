package p040o;

import p040o.Image;
import p040o.access$2300;

/* renamed from: o.Image$b$MediaBrowserCompat$CustomActionResultReceiver */
public final class Image$b$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onCircleClick> {
    private final submit MediaBrowserCompat$CustomActionResultReceiver;
    final /* synthetic */ Image.C3462b write;

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        onCircleClick oncircleclick = (onCircleClick) obj;
        super.onNext(oncircleclick);
        Image.C3462b.write(this.write);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == null) {
            str = "";
        } else {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        }
        Image.C3462b bVar = this.write;
        ImagePerfectionProfile imagePerfectionProfile = new ImagePerfectionProfile(this, str, oncircleclick);
        if (bVar.RatingCompat != null) {
            imagePerfectionProfile.IconCompatParcelizer(bVar.RatingCompat);
        }
    }

    public Image$b$MediaBrowserCompat$CustomActionResultReceiver(Image.C3462b bVar, submit submit) {
        this.write = bVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = submit;
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
