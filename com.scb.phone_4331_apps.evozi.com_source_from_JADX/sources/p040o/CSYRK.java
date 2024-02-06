package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kony.sdk.client.KonyLogger;
import com.kony.sdk.common.IdentityServiceException;
import com.kony.sdk.common.KonyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.i18n.ErrorBundle;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.IdExtractor;

/* renamed from: o.CSYRK */
public final class CSYRK implements IdExtractor.C69101 {
    static String read = "IdentityServiceImpl";
    private Map<String, List<String>> IconCompatParcelizer = new HashMap();
    String MediaBrowserCompat$CustomActionResultReceiver = null;
    private boolean MediaBrowserCompat$ItemReceiver = false;

    public CSYRK(String str) throws KonyException {
        String str2;
        if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$ItemReceiver == null) {
            throw new KonyException("Please initialize sdk before calling login");
        } else if (str != null) {
            Map<String, String> map = FragmentBuilder_BindInvestmentFundDetailFragment.read;
            if (map != null) {
                str2 = map.get(str);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                Map<String, String> map2 = FragmentBuilder_BindInvestmentFundDetailFragment.read;
                if (map2 != null) {
                    str = map2.get(str);
                } else {
                    str = null;
                }
            }
            for (String equals : FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$ItemReceiver.keySet()) {
                if (equals.equals(str)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = str;
                    this.IconCompatParcelizer = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$ItemReceiver;
                    this.MediaBrowserCompat$ItemReceiver = true;
                }
            }
            if (!this.MediaBrowserCompat$ItemReceiver) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid Identity Name : ");
                sb.append(str);
                throw new KonyException(sb.toString());
            }
        } else {
            throw new KonyException("Invalid Identity Name : null");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, final IdCaptureModule_GetIIdDeserializerKtaFactory idCaptureModule_GetIIdDeserializerKtaFactory) {
        final String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.IconCompatParcelizer.get(str3);
        if (!(list != null ? (String) list.get(1) : null).equals("oauth2") || !(str == null || str2 == null)) {
            try {
                CTPMV ctpmv = new CTPMV(read(str3), "POST", "application/json", new CTRMV() {
                    public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, int i) {
                        IdCaptureModule_GetIIdDeserializerKtaFactory idCaptureModule_GetIIdDeserializerKtaFactory = idCaptureModule_GetIIdDeserializerKtaFactory;
                        if (idCaptureModule_GetIIdDeserializerKtaFactory != null) {
                            idCaptureModule_GetIIdDeserializerKtaFactory.read(CSYRK.MediaBrowserCompat$ItemReceiver(jSONObject, i));
                        }
                    }

                    public final void IconCompatParcelizer(JSONObject jSONObject) {
                        JSONObject write2;
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        FragmentBuilder_BindMwEditCreateQrFragment fragmentBuilder_BindMwEditCreateQrFragment = FragmentBuilder_BindMwEditCreateQrFragment.read;
                        fragmentBuilder_BindMwEditCreateQrFragment.IconCompatParcelizer.put(str3, jSONObject);
                        if (CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyUserID") == null && (write2 = FragmentBuilder_BindMyInsuranceFragment.write(CSYRK.this.MediaBrowserCompat$CustomActionResultReceiver)) != null) {
                            try {
                                if (write2.has("userid")) {
                                    CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyUserID", write2.getString("userid"));
                                }
                            } catch (JSONException e) {
                                String str = CSYRK.read;
                                StringBuilder sb = new StringBuilder();
                                sb.append("While reading the KonyUsrid");
                                sb.append(e.getMessage());
                                KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
                            }
                        }
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        FragmentBuilder_BindMwEditCreateQrFragment fragmentBuilder_BindMwEditCreateQrFragment2 = FragmentBuilder_BindMwEditCreateQrFragment.read;
                        fragmentBuilder_BindMwEditCreateQrFragment2.IconCompatParcelizer.put("LastLoginProvider", str3);
                        IdCaptureModule_GetIIdDeserializerKtaFactory idCaptureModule_GetIIdDeserializerKtaFactory = idCaptureModule_GetIIdDeserializerKtaFactory;
                        if (idCaptureModule_GetIIdDeserializerKtaFactory != null) {
                            idCaptureModule_GetIIdDeserializerKtaFactory.IconCompatParcelizer();
                        }
                    }
                });
                KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Started");
                ctpmv.write.IconCompatParcelizer(CTPMV.MediaBrowserCompat$CustomActionResultReceiver(1, (String) null));
                KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Ended");
                ctpmv.write(MediaBrowserCompat$ItemReceiver(str, str2));
                KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "executeAsync() Started");
                ctpmv.start();
            } catch (KonyException e) {
                KonyLogger.read(e);
                idCaptureModule_GetIIdDeserializerKtaFactory.read(new IdentityServiceException(e.getMessage()));
            }
        } else {
            idCaptureModule_GetIIdDeserializerKtaFactory.read(new IdentityServiceException("IdentityType is oauth2. Use the Oauth login API, OR provide userid and password for generic OAuth Login"));
        }
    }

    static IdentityServiceException MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, int i) {
        String str = null;
        try {
            if (jSONObject.has(C8183f.f4230JO)) {
                str = jSONObject.getString(C8183f.f4230JO);
            }
            if (jSONObject.has("httpstatus")) {
                jSONObject.getString("httpstatus");
            }
            if (jSONObject.has("mfcode")) {
                jSONObject.getString("mfcode");
            }
        } catch (JSONException e) {
            KonyLogger.read(e);
        }
        IdentityServiceException identityServiceException = new IdentityServiceException(str, (byte) 0);
        identityServiceException.read = FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(jSONObject);
        identityServiceException.MediaBrowserCompat$ItemReceiver = jSONObject.toString();
        return identityServiceException;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(final String str, String str2, boolean z, final IdCaptureModule_GetIIdExtractionServerRttiFactory idCaptureModule_GetIIdExtractionServerRttiFactory) {
        String str3;
        String str4 = read;
        StringBuilder sb = new StringBuilder();
        sb.append("refreshClaimsToken() called ...isBackenedTokenRefreshRequired: ");
        sb.append(z);
        KonyLogger.MediaBrowserCompat$ItemReceiver(str4, sb.toString());
        try {
            List list = this.IconCompatParcelizer.get(str);
            String str5 = list != null ? (String) list.get(0) : null;
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append("/claims?refresh=true");
                str3 = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str5);
                sb3.append("/claims");
                str3 = sb3.toString();
            }
            CTPMV ctpmv = new CTPMV(str3, "POST", "application/json", new CTRMV() {
                public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, int i) {
                    try {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Claims Token refresh failed ... ");
                        String str = str;
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.remove(str);
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        if (((String) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get("LastLoginProvider")).equals(str)) {
                            if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                                FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                            }
                            FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.put("LastLoginProvider", "$anonymousProvider");
                        }
                        KonyException konyException = new KonyException(jSONObject.getString(C8183f.f4230JO));
                        konyException.read = FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(jSONObject);
                        if (!jSONObject.isNull(ErrorBundle.DETAIL_ENTRY)) {
                            konyException.MediaBrowserCompat$ItemReceiver = jSONObject.getJSONObject(ErrorBundle.DETAIL_ENTRY).getString(C8183f.f4230JO);
                        }
                        idCaptureModule_GetIIdExtractionServerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(konyException);
                    } catch (JSONException e) {
                        KonyLogger.read(e);
                    }
                }

                public final void IconCompatParcelizer(JSONObject jSONObject) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Claims Token refresh successful.. ");
                    if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                        FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                    }
                    FragmentBuilder_BindMwEditCreateQrFragment fragmentBuilder_BindMwEditCreateQrFragment = FragmentBuilder_BindMwEditCreateQrFragment.read;
                    fragmentBuilder_BindMwEditCreateQrFragment.IconCompatParcelizer.put(str, jSONObject);
                    idCaptureModule_GetIIdExtractionServerRttiFactory.read(FragmentBuilder_BindMyInsuranceFragment.read(str));
                }
            });
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Started");
            ctpmv.write.IconCompatParcelizer(CTPMV.MediaBrowserCompat$CustomActionResultReceiver(2, str2));
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Ended");
            ctpmv.write((Object) new JSONObject());
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "executeAsync() Started");
            ctpmv.start();
        } catch (KonyException e) {
            KonyLogger.read(e);
            idCaptureModule_GetIIdExtractionServerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(e);
        }
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(final String str, final IdCaptureModule_GetIIdExtractionServerRttiFactory idCaptureModule_GetIIdExtractionServerRttiFactory) {
        KonyLogger.MediaBrowserCompat$ItemReceiver(read, "making application_user (i.e. anonymous_user) login call to get claims_token.");
        try {
            CTPMV ctpmv = new CTPMV(read(str), "POST", "application/json", new CTRMV() {
                public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, int i) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "application_user (i.e. anonymous_user) login call failed.");
                    try {
                        String str = str;
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.remove(str);
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        if (((String) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get("LastLoginProvider")).equals(str)) {
                            if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                                FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                            }
                            FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.put("LastLoginProvider", "$anonymousProvider");
                        }
                        KonyException konyException = new KonyException(jSONObject.getString(C8183f.f4230JO));
                        konyException.read = FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(jSONObject);
                        if (!jSONObject.isNull(ErrorBundle.DETAIL_ENTRY)) {
                            konyException.MediaBrowserCompat$ItemReceiver = jSONObject.getJSONObject(ErrorBundle.DETAIL_ENTRY).getString(C8183f.f4230JO);
                        }
                        idCaptureModule_GetIIdExtractionServerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(konyException);
                    } catch (JSONException e) {
                        KonyLogger.read(e);
                    }
                }

                public final void IconCompatParcelizer(JSONObject jSONObject) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "application_user (i.e. anonymous_user) login call successfull.");
                    if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                        FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                    }
                    FragmentBuilder_BindMwEditCreateQrFragment fragmentBuilder_BindMwEditCreateQrFragment = FragmentBuilder_BindMwEditCreateQrFragment.read;
                    fragmentBuilder_BindMwEditCreateQrFragment.IconCompatParcelizer.put(str, jSONObject);
                    idCaptureModule_GetIIdExtractionServerRttiFactory.read(FragmentBuilder_BindMyInsuranceFragment.read(str));
                }
            });
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Started");
            ctpmv.write.IconCompatParcelizer(CTPMV.MediaBrowserCompat$CustomActionResultReceiver(1, (String) null));
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Ended");
            ctpmv.write((Object) new JSONObject());
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "executeAsync() Started");
            ctpmv.start();
        } catch (KonyException e) {
            KonyLogger.read(e);
            idCaptureModule_GetIIdExtractionServerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(e);
        }
    }

    private String read(String str) {
        List list = this.IconCompatParcelizer.get(str);
        String str2 = list != null ? (String) list.get(0) : null;
        if (str.equals("$anonymousProvider")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/login?provider=");
        sb.append(str);
        return sb.toString();
    }

    private static Object MediaBrowserCompat$ItemReceiver(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (!(str == null || str2 == null)) {
            try {
                jSONObject.put("userid", str);
                jSONObject.put("password", str2);
            } catch (JSONException e) {
                KonyLogger.read(e);
            }
        }
        return jSONObject;
    }
}
