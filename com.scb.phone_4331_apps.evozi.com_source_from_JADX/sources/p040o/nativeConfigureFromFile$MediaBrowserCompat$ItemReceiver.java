package p040o;

import java.util.List;
import p040o.IdParameters;

/* renamed from: o.nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver */
class nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<PlaceLikelihoodBuffer>> {
    final /* synthetic */ nativeConfigureFromFile MediaBrowserCompat$ItemReceiver;

    private nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver(nativeConfigureFromFile nativeconfigurefromfile) {
        this.MediaBrowserCompat$ItemReceiver = nativeconfigurefromfile;
    }

    /* synthetic */ nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver(nativeConfigureFromFile nativeconfigurefromfile, byte b) {
        this(nativeconfigurefromfile);
    }

    public final /* synthetic */ void onNext(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.MediaBrowserCompat$ItemReceiver;
        nativeInitializeFromString nativeinitializefromstring = new nativeInitializeFromString(this, (List) obj);
        if (nativeconfigurefromfile.RatingCompat != null) {
            nativeinitializefromstring.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        nativeConfigureFromFile nativeconfigurefromfile = this.MediaBrowserCompat$ItemReceiver;
        initializeString initializestring = initializeString.MediaBrowserCompat$CustomActionResultReceiver;
        if (nativeconfigurefromfile.RatingCompat != null) {
            initializestring.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(IdParameters.C6915a aVar) {
        aVar.aj_();
        aVar.ActionMenuItemView();
    }
}
