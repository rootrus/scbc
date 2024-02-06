package p040o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.CaptureDocumentActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver */
public final class C6353x8e6ee4bf implements FundFactSheetActivity<State, Result> {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
    private /* synthetic */ BaseDiscoverSearchActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$MediaItem;
    private Result MediaBrowserCompat$SearchResultReceiver;
    private /* synthetic */ FundFactSheetActivity MediaDescriptionCompat;
    private List<? extends Object> MediaMetadataCompat;
    private /* synthetic */ FundFactSheetActivity RatingCompat;
    private /* synthetic */ FundFactSheetActivity read;
    private /* synthetic */ FundFactSheetActivity write;

    C6353x8e6ee4bf(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, FundFactSheetActivity fundFactSheetActivity3, FundFactSheetActivity fundFactSheetActivity4, FundFactSheetActivity fundFactSheetActivity5, FundFactSheetActivity fundFactSheetActivity6, FundFactSheetActivity fundFactSheetActivity7, BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        this.write = fundFactSheetActivity2;
        this.read = fundFactSheetActivity3;
        this.IconCompatParcelizer = fundFactSheetActivity4;
        this.MediaBrowserCompat$MediaItem = fundFactSheetActivity5;
        this.RatingCompat = fundFactSheetActivity6;
        this.MediaDescriptionCompat = fundFactSheetActivity7;
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverSearchActivity;
    }

    public final Result invoke(State state) {
        Object invoke = this.MediaBrowserCompat$ItemReceiver.invoke(state);
        Object invoke2 = this.write.invoke(state);
        Object invoke3 = this.read.invoke(state);
        Object invoke4 = this.IconCompatParcelizer.invoke(state);
        Object invoke5 = this.MediaBrowserCompat$MediaItem.invoke(state);
        Object invoke6 = this.RatingCompat.invoke(state);
        Object invoke7 = this.MediaDescriptionCompat.invoke(state);
        Object[] objArr = {invoke, invoke2, invoke3, invoke4, invoke5, invoke6, invoke7};
        onGetStartedClick.write((Object) objArr, "elements");
        onGetStartedClick.write((Object) objArr, "$this$asList");
        List<? extends Object> asList = Arrays.asList(objArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, asList)) {
            this.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.read(invoke, invoke2, invoke3, invoke4, invoke5, invoke6, invoke7);
        }
        this.MediaMetadataCompat = asList;
        return this.MediaBrowserCompat$SearchResultReceiver;
    }
}
