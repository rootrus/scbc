package p040o;

/* renamed from: o.CaptureDocumentActivity_ViewBinding$MediaBrowserCompat$MediaItem */
public final class CaptureDocumentActivity_ViewBinding$MediaBrowserCompat$MediaItem implements FundFactSheetActivity<State, Result> {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
    private /* synthetic */ FundFactSheetActivity read;

    public CaptureDocumentActivity_ViewBinding$MediaBrowserCompat$MediaItem(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2) {
        this.read = fundFactSheetActivity;
        this.IconCompatParcelizer = fundFactSheetActivity2;
    }

    public final Result invoke(State state) {
        return this.read.invoke(this.IconCompatParcelizer.invoke(state));
    }
}
