package p040o;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.CTRMM */
final class CTRMM extends CTBMV {
    static String MediaBrowserCompat$ItemReceiver = "KonyServiceDocument";
    String write = null;

    CTRMM() {
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.write != null) {
                jSONObject.put("selflink", this.write);
            }
            if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaMetadataCompat != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : FragmentBuilder_BindInvestmentFundDetailFragment.MediaMetadataCompat.entrySet()) {
                    jSONObject2.put((String) next.getKey(), (String) next.getValue());
                }
                jSONObject.put("integsvc", jSONObject2);
            }
            if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$MediaItem != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ImagesContract.URL, FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver.get(ImagesContract.URL));
                jSONObject3.put("appId", FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver.get("appId"));
                jSONObject.put("messagingsvc", jSONObject3);
            }
            if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("customurl", FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver.get("custom"));
                jSONObject4.put("sessionurl", FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver.get("session"));
                jSONObject.put("reportingsvc", jSONObject4);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
