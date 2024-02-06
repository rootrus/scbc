package p040o;

import p040o.setLength;

/* renamed from: o.Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver */
public final class Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver<T, R> implements findFragmentByWho<ringRead, setLength> {
    public static final Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver();

    Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
        ringRead ringread = (ringRead) obj;
        setLength.read read = setLength.read;
        setLength$MediaBrowserCompat$ItemReceiver setlength_mediabrowsercompat_itemreceiver = new setLength$MediaBrowserCompat$ItemReceiver();
        setlength_mediabrowsercompat_itemreceiver.MediaDescriptionCompat = 15;
        String str = ringread.read;
        onGetStartedClick.write((Object) str, "applicationId");
        setlength_mediabrowsercompat_itemreceiver.IconCompatParcelizer = str;
        String str2 = ringread.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        onGetStartedClick.write((Object) str2, "cardRefNo");
        setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = str2;
        String str4 = ringread.MediaBrowserCompat$ItemReceiver;
        if (str4 == null) {
            str4 = str3;
        }
        onGetStartedClick.write((Object) str4, "cardMask");
        setlength_mediabrowsercompat_itemreceiver.read = str4;
        String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(ringread.MediaBrowserCompat$ItemReceiver, (String) null);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "Utilities.maskCreditCard(account.cardMask, null)");
        onGetStartedClick.write((Object) IconCompatParcelizer, "accountNoToShow");
        setlength_mediabrowsercompat_itemreceiver.write = IconCompatParcelizer;
        String str5 = ringread.write;
        if (str5 == null) {
            str5 = str3;
        }
        onGetStartedClick.write((Object) str5, "productName");
        setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem = str5;
        String str6 = ringread.write;
        if (str6 != null) {
            str3 = str6;
        }
        onGetStartedClick.write((Object) str3, "productNameToShow");
        setlength_mediabrowsercompat_itemreceiver.MediaMetadataCompat = str3;
        return new setLength(setlength_mediabrowsercompat_itemreceiver, (byte) 0);
    }
}
