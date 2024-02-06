package p040o;

/* renamed from: o.CaptureDocumentActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6351x57c5459e implements FundFactSheetActivity<State, Result> {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$ItemReceiver;
    private Result read;
    private Object write;

    public C6351x57c5459e(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2) {
        this.IconCompatParcelizer = fundFactSheetActivity;
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity2;
    }

    public final Result invoke(State state) {
        Object invoke = this.IconCompatParcelizer.invoke(state);
        if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.write, invoke)) {
            this.read = this.MediaBrowserCompat$ItemReceiver.invoke(invoke);
        }
        this.write = invoke;
        return this.read;
    }
}
