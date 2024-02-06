package p040o;

/* renamed from: o.nativeConfigureFromFile$MediaBrowserCompat$CustomActionResultReceiver */
final class C5030x3f61e9c2 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setStartCap> {
    private /* synthetic */ nativeConfigureFromFile IconCompatParcelizer;

    private C5030x3f61e9c2(nativeConfigureFromFile nativeconfigurefromfile) {
        this.IconCompatParcelizer = nativeconfigurefromfile;
    }

    /* synthetic */ C5030x3f61e9c2(nativeConfigureFromFile nativeconfigurefromfile, byte b) {
        this(nativeconfigurefromfile);
    }

    public final /* synthetic */ void onNext(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.IconCompatParcelizer;
        nativeReleaseFrame nativereleaseframe = new nativeReleaseFrame((setStartCap) obj);
        if (nativeconfigurefromfile.RatingCompat != null) {
            nativereleaseframe.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
        }
    }
}
