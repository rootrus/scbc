package p040o;

import p040o.MissingNativeComponent;
import p040o.Multimaps;

/* renamed from: o.getDocument$MediaBrowserCompat$ItemReceiver */
public final class getDocument$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getHoles> {
    private /* synthetic */ getDocument read;

    private getDocument$MediaBrowserCompat$ItemReceiver(getDocument getdocument) {
        this.read = getdocument;
    }

    public /* synthetic */ getDocument$MediaBrowserCompat$ItemReceiver(getDocument getdocument, byte b) {
        this(getdocument);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getDocument getdocument = this.read;
        Multimaps.MapMultimap unused = getdocument.MediaBrowserCompat$ItemReceiver;
        getDocument.read(getdocument, Multimaps.MapMultimap.write((getHoles) obj));
    }

    public final void onError(Throwable th) {
        if (getDocument.IconCompatParcelizer(this.read) != null) {
            MissingNativeComponent.C36601.read();
            Multimaps.MapMultimap unused = this.read.MediaBrowserCompat$ItemReceiver;
            Multimaps.MapMultimap.IconCompatParcelizer(th);
            getDocument.IconCompatParcelizer(this.read);
        }
    }
}
