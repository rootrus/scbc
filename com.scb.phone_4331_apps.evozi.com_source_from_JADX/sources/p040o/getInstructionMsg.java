package p040o;

import org.json.JSONObject;
import p040o.writeUInt64NoTag;

/* renamed from: o.getInstructionMsg */
public final /* synthetic */ class getInstructionMsg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_User MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ JSONObject MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getInstructionMsg(JSONObject jSONObject, AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        this.MediaBrowserCompat$ItemReceiver = jSONObject;
        this.MediaBrowserCompat$CustomActionResultReceiver = autoValue_CrashlyticsReport_Session_User;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1163x1ce8468d) obj).read(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat);
    }
}
