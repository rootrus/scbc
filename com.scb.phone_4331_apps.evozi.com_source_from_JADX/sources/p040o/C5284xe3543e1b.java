package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setCorrectCaseUserName$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5284xe3543e1b<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIPassportDetectorFactory> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ setCorrectCaseUserName read;
    private /* synthetic */ String write;

    public C5284xe3543e1b(setCorrectCaseUserName setcorrectcaseusername, String str, String str2) {
        this.read = setcorrectcaseusername;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetIPassportDetectorFactory) obj).write(setCorrectCaseUserName.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver), this.write);
    }
}
