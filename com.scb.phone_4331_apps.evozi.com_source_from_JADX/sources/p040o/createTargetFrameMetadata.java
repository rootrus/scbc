package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.createTargetFrameMetadata */
public final /* synthetic */ class createTargetFrameMetadata implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ listSessionBeginFiles read;

    public /* synthetic */ createTargetFrameMetadata(listSessionBeginFiles listsessionbeginfiles) {
        this.read = listsessionbeginfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((LookAndFeelParameters_Factory) obj).read(this.read);
    }
}
