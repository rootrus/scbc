package p040o;

import p040o.setBaseAddress;
import p040o.writeUInt64NoTag;

/* renamed from: o.jh */
public final /* synthetic */ class C4869jh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4889kC MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4869jh(C4889kC kCVar) {
        this.MediaBrowserCompat$ItemReceiver = kCVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        C4889kC kCVar = this.MediaBrowserCompat$ItemReceiver;
        getMicr getmicr = (getMicr) obj;
        isUriInetAddress isuriinetaddress = kCVar.MediaMetadataCompat;
        setExecution setexecution = kCVar.write;
        int i = setexecution.read;
        if (i == 0) {
            String str2 = setexecution.MediaMetadataCompat;
            String string = isuriinetaddress.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_type_mobile);
            Object[] objArr = new Object[1];
            if (str2.length() >= 4) {
                str2 = str2.substring(str2.length() - 4);
            }
            objArr[0] = str2;
            str = String.format(string, objArr);
        } else if (i != 1) {
            str = "";
        } else {
            str = isuriinetaddress.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_type_citizen);
        }
        setBaseAddress.IconCompatParcelizer iconCompatParcelizer = new setBaseAddress.IconCompatParcelizer((byte) 0);
        iconCompatParcelizer.write = isuriinetaddress.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_unlink_dialog_title);
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = String.format(isuriinetaddress.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_unlink_dialog_message), new Object[]{str});
        iconCompatParcelizer.IconCompatParcelizer = isuriinetaddress.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_unlink_dialog_yes);
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = isuriinetaddress.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_unlink_dialog_no);
        getmicr.MediaBrowserCompat$CustomActionResultReceiver(new setBaseAddress(iconCompatParcelizer, (byte) 0));
    }
}
