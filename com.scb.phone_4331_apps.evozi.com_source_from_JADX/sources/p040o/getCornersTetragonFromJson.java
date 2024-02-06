package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getCornersTetragonFromJson */
public final /* synthetic */ class getCornersTetragonFromJson implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ listSessionBeginFiles read;

    public /* synthetic */ getCornersTetragonFromJson(listSessionBeginFiles listsessionbeginfiles) {
        this.read = listsessionbeginfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((LookAndFeelParameters_Factory) obj).read(this.read.MediaMetadataCompat);
    }
}
