package p040o;

/* renamed from: o.LinkedListMultimap$2$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9774x220c19b5 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<moveCamera> {
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$ItemReceiver;

    public C9774x220c19b5(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2) {
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity2;
    }

    public final /* synthetic */ void onNext(Object obj) {
        moveCamera movecamera = (moveCamera) obj;
        onGetStartedClick.write((Object) movecamera, "t");
        super.onNext(movecamera);
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke(movecamera);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.MediaBrowserCompat$ItemReceiver.invoke(th);
    }
}
