package p040o;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kony.sdk.client.KonyLogger;
import com.kony.sdk.common.KonyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.FragmentBuilder_BindIssuerInputFragment;

/* renamed from: o.FragmentBuilder_BindInvestmentFundDetailFragment */
public final class FragmentBuilder_BindInvestmentFundDetailFragment {
    public static Map<String, String> IconCompatParcelizer = null;
    public static String MediaBrowserCompat$CustomActionResultReceiver = null;
    public static Map<String, List<String>> MediaBrowserCompat$ItemReceiver = null;
    public static Map<String, String> MediaBrowserCompat$MediaItem = null;
    public static Map<String, String> MediaBrowserCompat$SearchResultReceiver = null;
    public static Map<String, String> MediaMetadataCompat = null;
    private static Map<String, List<String>> MediaSessionCompat$QueueItem = null;
    private static Map<String, String> MediaSessionCompat$Token = null;
    public static Map<String, String> read = null;
    public static String write = "KonySettings";
    public final float MediaDescriptionCompat;
    public final float ParcelableVolumeInfo;
    public final int RatingCompat;

    public static final <T> FragmentBuilder_BindIssuerInputFragment<Exception, T> MediaBrowserCompat$CustomActionResultReceiver(FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "block");
        try {
            return new FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer<>(fundActionsSuccessActivity.invoke());
        } catch (Exception e) {
            return new FragmentBuilder_BindIssuerInputFragment.write<>(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object write(p040o.MwCasaOtpActivity r3, p040o.FundFactSheetActivity<? super p040o.HmlNTBPromptPayNotFoundActivity<? super T>, ? extends java.lang.Object> r4, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.FragmentBuilder_BindIssuerInputFragment<? extends java.lang.Exception, ? extends T>> r5) {
        /*
            boolean r3 = r5 instanceof p040o.C6558x4b92ecd7
            if (r3 == 0) goto L_0x0014
            r3 = r5
            o.FragmentBuilder_BindInvestmentFundDetailFragment$MediaBrowserCompat$CustomActionResultReceiver r3 = (p040o.C6558x4b92ecd7) r3
            int r0 = r3.MediaBrowserCompat$ItemReceiver
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0014
            int r5 = r3.MediaBrowserCompat$ItemReceiver
            int r5 = r5 + r1
            r3.MediaBrowserCompat$ItemReceiver = r5
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindInvestmentFundDetailFragment$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.FragmentBuilder_BindInvestmentFundDetailFragment$MediaBrowserCompat$CustomActionResultReceiver
            r3.<init>(r5)
        L_0x0019:
            java.lang.Object r5 = r3.IconCompatParcelizer
            o.HmlPromptPayVerificationActivity_ViewBinding r0 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r1 = r3.MediaBrowserCompat$ItemReceiver
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            boolean r3 = r5 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x004b }
            if (r3 != 0) goto L_0x0029
            goto L_0x0043
        L_0x0029:
            o.HmlVerifyIdentifyActivity$write r5 = (p040o.HmlVerifyIdentifyActivity.write) r5     // Catch:{ Exception -> 0x004b }
            java.lang.Throwable r3 = r5.read     // Catch:{ Exception -> 0x004b }
            throw r3     // Catch:{ Exception -> 0x004b }
        L_0x002e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0036:
            boolean r1 = r5 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r1 != 0) goto L_0x0055
            r3.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = r4.invoke(r3)     // Catch:{ Exception -> 0x004b }
            if (r5 != r0) goto L_0x0043
            return r0
        L_0x0043:
            o.FragmentBuilder_BindIssuerInputFragment$IconCompatParcelizer r3 = new o.FragmentBuilder_BindIssuerInputFragment$IconCompatParcelizer     // Catch:{ Exception -> 0x004b }
            r3.<init>(r5)     // Catch:{ Exception -> 0x004b }
            o.FragmentBuilder_BindIssuerInputFragment r3 = (p040o.FragmentBuilder_BindIssuerInputFragment) r3     // Catch:{ Exception -> 0x004b }
            goto L_0x0054
        L_0x004b:
            r3 = move-exception
            o.FragmentBuilder_BindIssuerInputFragment$write r4 = new o.FragmentBuilder_BindIssuerInputFragment$write
            r4.<init>(r3)
            r3 = r4
            o.FragmentBuilder_BindIssuerInputFragment r3 = (p040o.FragmentBuilder_BindIssuerInputFragment) r3
        L_0x0054:
            return r3
        L_0x0055:
            o.HmlVerifyIdentifyActivity$write r5 = (p040o.HmlVerifyIdentifyActivity.write) r5
            java.lang.Throwable r3 = r5.read
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindInvestmentFundDetailFragment.write(o.MwCasaOtpActivity, o.FundFactSheetActivity, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    private FragmentBuilder_BindInvestmentFundDetailFragment(byte b) {
    }

    private static boolean IconCompatParcelizer(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap();
            String replace = !jSONObject.isNull("selflink") ? jSONObject.getString("selflink").replace("/appconfig", "/login") : "";
            String str = write;
            StringBuilder sb = new StringBuilder();
            sb.append(" Added Auth Config::::  ");
            sb.append("$anonymousProvider");
            sb.append(" :");
            sb.append(replace);
            sb.append(",");
            sb.append("anonymous");
            KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(replace);
            arrayList.add("anonymous");
            hashMap.put("$anonymousProvider", arrayList);
            if (jSONObject.has("login")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("login");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    String str2 = (String) jSONObject2.get("type");
                    String str3 = (String) jSONObject2.get("prov");
                    String str4 = (String) jSONObject2.get(ImagesContract.URL);
                    if (!jSONObject2.isNull("alias")) {
                        String str5 = (String) jSONObject2.get("alias");
                        if (read == null) {
                            read = new Hashtable();
                        }
                        read.put(str5, str3);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str4);
                    arrayList2.add(str2);
                    hashMap.put(str3, arrayList2);
                    if ("basic".equals(str2)) {
                        if (MediaSessionCompat$QueueItem == null) {
                            MediaSessionCompat$QueueItem = new HashMap();
                        }
                        KonyLogger.MediaBrowserCompat$ItemReceiver(write, "Extracting Mandatory params");
                        if (jSONObject2.has("mandatory_fields")) {
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("mandatory_fields");
                            KonyLogger.MediaBrowserCompat$ItemReceiver(write, "after getting JSON Array of Fields");
                            ArrayList arrayList3 = new ArrayList();
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                arrayList3.add(jSONArray2.getString(i2));
                            }
                            MediaSessionCompat$QueueItem.put(str3, arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add("userid");
                            arrayList4.add("password");
                            MediaSessionCompat$QueueItem.put(str3, arrayList4);
                        }
                    }
                }
            }
            MediaBrowserCompat$ItemReceiver = hashMap;
            return true;
        } catch (JSONException e) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str6 = write;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("While Extracting the Auth Configuration Value");
                sb2.append(e.getMessage());
                KonyLogger.IconCompatParcelizer(str6, sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" AuthConfiguration error : ");
            sb3.append(e.getMessage());
            MediaBrowserCompat$CustomActionResultReceiver = sb3.toString();
            return false;
        }
    }

    private static boolean read(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("integsvc")) {
                return true;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("integsvc");
            MediaMetadataCompat = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            boolean z = false;
            while (keys.hasNext()) {
                String next = keys.next();
                MediaMetadataCompat.put(next, jSONObject2.getString(next));
                z = true;
            }
            return z;
        } catch (JSONException e) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str = write;
                StringBuilder sb = new StringBuilder();
                sb.append("While Extracting the Integration Configuration Value");
                sb.append(e.getMessage());
                KonyLogger.IconCompatParcelizer(str, sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IntegrationConfiguration error: ");
            sb2.append(e.getMessage());
            MediaBrowserCompat$CustomActionResultReceiver = sb2.toString();
            return false;
        }
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(JSONObject jSONObject) throws KonyException {
        try {
            if (jSONObject.has("messagingsvc")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("messagingsvc");
                String string = jSONObject2.getString(ImagesContract.URL);
                String string2 = jSONObject2.getString("appId");
                if (string2 == null && string == null) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                MediaBrowserCompat$MediaItem = hashMap;
                hashMap.put(ImagesContract.URL, string);
                MediaBrowserCompat$MediaItem.put("appId", string2);
            }
            return true;
        } catch (JSONException e) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str = write;
                StringBuilder sb = new StringBuilder();
                sb.append("While Extracting the KMS Configuration Value");
                sb.append(e.getMessage());
                KonyLogger.IconCompatParcelizer(str, sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("KMSConfiguration error :");
            sb2.append(e.getMessage());
            MediaBrowserCompat$CustomActionResultReceiver = sb2.toString();
            return false;
        }
    }

    private static boolean MediaBrowserCompat$ItemReceiver(JSONObject jSONObject) throws KonyException {
        try {
            if (!jSONObject.has("reportingsvc")) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("reportingsvc");
            String string = jSONObject2.getString("custom");
            String string2 = jSONObject2.getString("session");
            if (string == null && string == null) {
                return false;
            }
            HashMap hashMap = new HashMap();
            MediaBrowserCompat$SearchResultReceiver = hashMap;
            hashMap.put("customurl", string);
            MediaBrowserCompat$SearchResultReceiver.put("sessionurl", string2);
            return true;
        } catch (JSONException e) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str = write;
                StringBuilder sb = new StringBuilder();
                sb.append("While Extracting the Report Configuration Value :");
                sb.append(e.getMessage());
                KonyLogger.IconCompatParcelizer(str, sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Report Configuration error :");
            sb2.append(e.getMessage());
            MediaBrowserCompat$CustomActionResultReceiver = sb2.toString();
            return false;
        }
    }

    private static boolean MediaBrowserCompat$SearchResultReceiver(JSONObject jSONObject) throws KonyException {
        try {
            if (!jSONObject.has("sync")) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("sync");
            String string = jSONObject2.getString(ImagesContract.URL);
            String string2 = jSONObject2.getString("appId");
            if (string2 == null && string == null) {
                return false;
            }
            HashMap hashMap = new HashMap();
            MediaSessionCompat$Token = hashMap;
            hashMap.put(ImagesContract.URL, string);
            MediaSessionCompat$Token.put("appId", string2);
            return true;
        } catch (JSONException e) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str = write;
                StringBuilder sb = new StringBuilder();
                sb.append("While Extracting the Sync Configuration Value :");
                sb.append(e.getMessage());
                KonyLogger.IconCompatParcelizer(str, sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Report Configuration error :");
            sb2.append(e.getMessage());
            MediaBrowserCompat$CustomActionResultReceiver = sb2.toString();
            return false;
        }
    }

    public static boolean write(JSONObject jSONObject) {
        try {
            if (jSONObject.has("name")) {
                IconCompatParcelizer.put("mfaname", jSONObject.getString("name"));
            }
            if (jSONObject.has("baseId")) {
                IconCompatParcelizer.put("mfbaseid", jSONObject.getString("baseId"));
            }
            if (jSONObject.has("appId")) {
                IconCompatParcelizer.put("mfaid", jSONObject.getString("appId"));
            }
        } catch (JSONException e) {
            try {
                KonyLogger.read(e);
            } catch (Exception e2) {
                String str = write;
                StringBuilder sb = new StringBuilder();
                sb.append("setAppConfig :");
                sb.append(e2.getMessage());
                KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
                MediaBrowserCompat$CustomActionResultReceiver = e2.getMessage();
            }
        }
        boolean IconCompatParcelizer2 = IconCompatParcelizer(jSONObject);
        read(jSONObject);
        boolean MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(jSONObject);
        boolean MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(jSONObject);
        MediaBrowserCompat$SearchResultReceiver(jSONObject);
        boolean z = MediaBrowserCompat$ItemReceiver == null && MediaMetadataCompat == null && MediaBrowserCompat$MediaItem == null && MediaBrowserCompat$SearchResultReceiver == null && MediaSessionCompat$Token == null;
        if (!IconCompatParcelizer2 || !MediaBrowserCompat$CustomActionResultReceiver2 || !MediaBrowserCompat$ItemReceiver2 || z) {
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = "No services are configured";
            }
            MediaBrowserCompat$ItemReceiver = null;
            MediaMetadataCompat = null;
            MediaBrowserCompat$MediaItem = null;
            MediaBrowserCompat$SearchResultReceiver = null;
            MediaSessionCompat$Token = null;
            MediaSessionCompat$QueueItem = null;
            return false;
        }
        CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyServiceDocument", jSONObject.toString());
        MediaBrowserCompat$CustomActionResultReceiver = null;
        return true;
    }

    public FragmentBuilder_BindInvestmentFundDetailFragment() {
        this.RatingCompat = 17;
        this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = BitmapDescriptorFactory.HUE_RED;
    }
}
