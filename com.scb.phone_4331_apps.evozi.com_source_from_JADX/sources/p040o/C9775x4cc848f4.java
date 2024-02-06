package p040o;

import p040o.LinkedListMultimap;

/* renamed from: o.LinkedListMultimap$DistinctKeyIterator$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9775x4cc848f4 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PlaceBuffer> {
    private /* synthetic */ LinkedListMultimap.DistinctKeyIterator IconCompatParcelizer;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FundFactSheetActivity read;
    private /* synthetic */ String write;

    public C9775x4cc848f4(LinkedListMultimap.DistinctKeyIterator distinctKeyIterator, String str, String str2, FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2) {
        this.IconCompatParcelizer = distinctKeyIterator;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.read = fundFactSheetActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity2;
    }

    public final /* synthetic */ void onNext(Object obj) {
        PlaceBuffer placeBuffer = (PlaceBuffer) obj;
        onGetStartedClick.write((Object) placeBuffer, "preAuthenticate");
        super.onNext(placeBuffer);
        String str = placeBuffer.read;
        onGetStartedClick.IconCompatParcelizer((Object) str, "preAuthenticate.e2eeSid");
        isUpperCase isuppercase = this.IconCompatParcelizer.read;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) str2, "pin");
        String write2 = isuppercase.write(str2);
        onGetStartedClick.IconCompatParcelizer((Object) write2, "encrypt(pin)");
        to$MediaBrowserCompat$ItemReceiver to_mediabrowsercompat_itemreceiver = new to$MediaBrowserCompat$ItemReceiver(str, write2, this.write);
        LinkedListMultimap.DistinctKeyIterator distinctKeyIterator = this.IconCompatParcelizer;
        distinctKeyIterator.IconCompatParcelizer(distinctKeyIterator.IconCompatParcelizer, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, to_mediabrowsercompat_itemreceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke(th);
    }
}
