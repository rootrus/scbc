package p040o;

import p040o.setLength;

/* renamed from: o.Tables$TransposeTable$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3839x5b0c968e<T, R> implements findFragmentByWho<ringRead, setLength> {
    public static final C3839x5b0c968e MediaBrowserCompat$ItemReceiver = new C3839x5b0c968e();

    C3839x5b0c968e() {
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        ringRead ringread = (ringRead) obj;
        setLength.read read = setLength.read;
        setLength$MediaBrowserCompat$ItemReceiver setlength_mediabrowsercompat_itemreceiver = new setLength$MediaBrowserCompat$ItemReceiver();
        setlength_mediabrowsercompat_itemreceiver.MediaDescriptionCompat = 3;
        String str3 = ringread.read;
        onGetStartedClick.write((Object) str3, "applicationId");
        setlength_mediabrowsercompat_itemreceiver.IconCompatParcelizer = str3;
        String str4 = ringread.MediaBrowserCompat$CustomActionResultReceiver;
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        onGetStartedClick.write((Object) str4, "cardRefNo");
        setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = str4;
        String str6 = ringread.MediaBrowserCompat$ItemReceiver;
        if (str6 == null) {
            str6 = str5;
        }
        onGetStartedClick.write((Object) str6, "cardMask");
        setlength_mediabrowsercompat_itemreceiver.read = str6;
        writeInts writeints = ringread.MediaMetadataCompat;
        if (writeints == null || (str = writeints.MediaBrowserCompat$ItemReceiver) == null) {
            str = str5;
        }
        onGetStartedClick.write((Object) str, "productCode");
        setlength_mediabrowsercompat_itemreceiver.RatingCompat = str;
        String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(ringread.MediaBrowserCompat$CustomActionResultReceiver, ringread.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "Utilities.maskCreditCard…dRefNo, account.cardMask)");
        onGetStartedClick.write((Object) IconCompatParcelizer, "accountNoToShow");
        setlength_mediabrowsercompat_itemreceiver.write = IconCompatParcelizer;
        writeInts writeints2 = ringread.MediaMetadataCompat;
        if (!(writeints2 == null || (str2 = writeints2.write) == null)) {
            str5 = str2;
        }
        onGetStartedClick.write((Object) str5, "productNameToShow");
        setlength_mediabrowsercompat_itemreceiver.MediaMetadataCompat = str5;
        return new setLength(setlength_mediabrowsercompat_itemreceiver, (byte) 0);
    }
}
