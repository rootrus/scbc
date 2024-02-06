package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.access$2300;

/* renamed from: o.getImageOriginalDateTime$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4588xd4fb11e extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setEventInterceptor> {
    private /* synthetic */ getImageOriginalDateTime MediaBrowserCompat$CustomActionResultReceiver;

    private C4588xd4fb11e(getImageOriginalDateTime getimageoriginaldatetime) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getimageoriginaldatetime;
    }

    public /* synthetic */ C4588xd4fb11e(getImageOriginalDateTime getimageoriginaldatetime, byte b) {
        this(getimageoriginaldatetime);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getImageOriginalDateTime.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        sha1 MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver((setEventInterceptor) obj);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.write = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver;
        getImageOriginalDateTime getimageoriginaldatetime = this.MediaBrowserCompat$CustomActionResultReceiver;
        C5463x xVar = new C5463x(this, MediaBrowserCompat$CustomActionResultReceiver2);
        if (getimageoriginaldatetime.RatingCompat != null) {
            xVar.IconCompatParcelizer(getimageoriginaldatetime.RatingCompat);
        }
    }

    public final /* synthetic */ void write(sha1 sha1, CheckExtractActivity_MembersInjector.setVisibility setvisibility) {
        setvisibility.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(sha1));
        setvisibility.write(true);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
