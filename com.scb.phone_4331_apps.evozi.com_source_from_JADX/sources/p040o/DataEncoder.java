package p040o;

import java.util.List;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.DataEncoder */
public final /* synthetic */ class DataEncoder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ DefaultHeartBeatInfo read;

    public /* synthetic */ DataEncoder(DefaultHeartBeatInfo defaultHeartBeatInfo, String str) {
        this.read = defaultHeartBeatInfo;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.read;
        String str = this.IconCompatParcelizer;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.mo36017b_(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver());
        List<getContents> list = defaultHeartBeatInfo.MediaBrowserCompat$SearchResultReceiver;
        String str2 = "";
        if (list != null) {
            if (!str.equals(list.get(defaultHeartBeatInfo.MediaMetadataCompat).IconCompatParcelizer)) {
                if (str != null && !str.equals(str2)) {
                    str = str.replace("-", str2);
                }
            }
            bVar.read(10, str2);
        } else if (str != null && !str.equals(str2)) {
            str = str.replace("-", str2);
        }
        str2 = str;
        bVar.read(10, str2);
    }
}
