package p040o;

/* renamed from: o.Lists$TwoPlusArrayList$MediaBrowserCompat$ItemReceiver */
public final class Lists$TwoPlusArrayList$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FundFactSheetActivity write;

    public Lists$TwoPlusArrayList$MediaBrowserCompat$ItemReceiver(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        this.write = fundFactSheetActivity2;
    }

    public final /* synthetic */ void onNext(Object obj) {
        getProjection getprojection = (getProjection) obj;
        onGetStartedClick.write((Object) getprojection, "ekycRegistration");
        this.write.invoke(getprojection);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke(th);
    }
}
