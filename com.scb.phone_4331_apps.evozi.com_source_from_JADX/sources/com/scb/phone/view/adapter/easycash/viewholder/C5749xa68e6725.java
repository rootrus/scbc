package com.scb.phone.view.adapter.easycash.viewholder;

import java.util.List;
import org.json.JSONObject;
import p040o.clickManagePin$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.dump;

/* renamed from: com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoNationalIdViewHolder$MediaBrowserCompat$ItemReceiver */
public final class C5749xa68e6725 implements dump {
    private final /* synthetic */ JSONObject IconCompatParcelizer;
    private final /* synthetic */ List read;

    private C5749xa68e6725() {
    }

    public /* synthetic */ C5749xa68e6725(JSONObject jSONObject, List list) {
        this.IconCompatParcelizer = jSONObject;
        this.read = list;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        JSONObject jSONObject = this.IconCompatParcelizer;
        List list = this.read;
        String str = (String) obj;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        clickManagePin$MediaBrowserCompat$CustomActionResultReceiver clickmanagepin_mediabrowsercompat_customactionresultreceiver = new clickManagePin$MediaBrowserCompat$CustomActionResultReceiver();
        clickmanagepin_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        clickmanagepin_mediabrowsercompat_customactionresultreceiver.write = optJSONObject.optDouble("lat");
        clickmanagepin_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = optJSONObject.optDouble("lng");
        list.add(clickmanagepin_mediabrowsercompat_customactionresultreceiver);
    }
}
