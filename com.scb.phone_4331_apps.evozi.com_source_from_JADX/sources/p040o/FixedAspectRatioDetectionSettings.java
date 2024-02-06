package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.FixedAspectRatioDetectionSettings */
public final /* synthetic */ class FixedAspectRatioDetectionSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getStringsFileValue IconCompatParcelizer;
    private final /* synthetic */ clearBitmapWithoutRecycle MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FixedAspectRatioDetectionSettings(clearBitmapWithoutRecycle clearbitmapwithoutrecycle, getStringsFileValue getstringsfilevalue) {
        this.MediaBrowserCompat$CustomActionResultReceiver = clearbitmapwithoutrecycle;
        this.IconCompatParcelizer = getstringsfilevalue;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringsFileValue getstringsfilevalue = this.IconCompatParcelizer;
        CheckExtractActivity_MembersInjector.setShortcut.read read = (CheckExtractActivity_MembersInjector.setShortcut.read) obj;
        read.read(leastOf.MediaBrowserCompat$ItemReceiver(getstringsfilevalue));
        read.read(usingToString.read(getstringsfilevalue));
        read.write(getstringsfilevalue.MediaSessionCompat$ResultReceiverWrapper);
        if (getstringsfilevalue.setHasDecor) {
            read.IconCompatParcelizer();
        }
    }
}
