package p040o;

import java.util.List;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.ValueEncoder */
public final /* synthetic */ class ValueEncoder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String[] IconCompatParcelizer;
    private final /* synthetic */ List read;
    private final /* synthetic */ DefaultHeartBeatInfo write;

    public /* synthetic */ ValueEncoder(DefaultHeartBeatInfo defaultHeartBeatInfo, List list, String[] strArr) {
        this.write = defaultHeartBeatInfo;
        this.read = list;
        this.IconCompatParcelizer = strArr;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonCheck.C7042b) obj).read((String[]) this.read.toArray(this.IconCompatParcelizer), this.write.MediaMetadataCompat);
    }
}
