package p040o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.CaptureDocumentActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
public final class C6352x87ff10ed implements FundFactSheetActivity<State, Result> {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$ItemReceiver;
    private Result MediaBrowserCompat$SearchResultReceiver;
    private List<? extends Object> MediaMetadataCompat;
    private /* synthetic */ FundFactSheetActivity RatingCompat;
    private /* synthetic */ DiscoverActivity read;
    private /* synthetic */ FundFactSheetActivity write;

    C6352x87ff10ed(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, FundFactSheetActivity fundFactSheetActivity3, FundFactSheetActivity fundFactSheetActivity4, FundFactSheetActivity fundFactSheetActivity5, DiscoverActivity discoverActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        this.IconCompatParcelizer = fundFactSheetActivity2;
        this.write = fundFactSheetActivity3;
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity4;
        this.RatingCompat = fundFactSheetActivity5;
        this.read = discoverActivity;
    }

    public final Result invoke(State state) {
        Object invoke = this.MediaBrowserCompat$CustomActionResultReceiver.invoke(state);
        Object invoke2 = this.IconCompatParcelizer.invoke(state);
        Object invoke3 = this.write.invoke(state);
        Object invoke4 = this.MediaBrowserCompat$ItemReceiver.invoke(state);
        Object invoke5 = this.RatingCompat.invoke(state);
        Object[] objArr = {invoke, invoke2, invoke3, invoke4, invoke5};
        onGetStartedClick.write((Object) objArr, "elements");
        onGetStartedClick.write((Object) objArr, "$this$asList");
        List<? extends Object> asList = Arrays.asList(objArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, asList)) {
            this.MediaBrowserCompat$SearchResultReceiver = this.read.read(invoke, invoke2, invoke3, invoke4, invoke5);
        }
        this.MediaMetadataCompat = asList;
        return this.MediaBrowserCompat$SearchResultReceiver;
    }
}
