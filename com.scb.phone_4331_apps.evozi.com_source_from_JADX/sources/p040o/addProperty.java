package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.addProperty */
public final /* synthetic */ class addProperty implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ declaringClassOf read;

    public /* synthetic */ addProperty(declaringClassOf declaringclassof, String str) {
        this.read = declaringclassof;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        declaringClassOf declaringclassof = this.read;
        ((IdCaptureActivity_MembersInjector) obj).IconCompatParcelizer(declaringclassof.MediaBrowserCompat$ItemReceiver, declaringclassof.read(), this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
