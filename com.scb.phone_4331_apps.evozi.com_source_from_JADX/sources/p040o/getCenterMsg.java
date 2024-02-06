package p040o;

import org.json.JSONObject;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCenterMsg */
public final /* synthetic */ class getCenterMsg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ JSONObject read;

    public /* synthetic */ getCenterMsg(JSONObject jSONObject) {
        this.read = jSONObject;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1163x1ce8468d) obj).read(this.read);
    }
}
