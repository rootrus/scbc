package p040o;

import p040o.AutocompleteFilter;
import p040o.access$2300;

/* renamed from: o.getPosX$MediaBrowserCompat$CustomActionResultReceiver */
public class getPosX$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<AutocompleteFilter.Builder> {
    final /* synthetic */ getPosX read;

    private getPosX$MediaBrowserCompat$CustomActionResultReceiver(getPosX getposx) {
        this.read = getposx;
    }

    public /* synthetic */ getPosX$MediaBrowserCompat$CustomActionResultReceiver(getPosX getposx, byte b) {
        this(getposx);
    }

    public final /* synthetic */ void onNext(Object obj) {
        AutocompleteFilter.Builder builder = (AutocompleteFilter.Builder) obj;
        super.onNext(builder);
        getPosX.IconCompatParcelizer(this.read);
        getPosX getposx = this.read;
        getposx.IconCompatParcelizer = getposx.MediaBrowserCompat$MediaItem.IconCompatParcelizer(builder);
        getPosX getposx2 = this.read;
        getBitmapLandscape getbitmaplandscape = new getBitmapLandscape(this);
        if (getposx2.RatingCompat != null) {
            getbitmaplandscape.IconCompatParcelizer(getposx2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
