package p040o;

import com.kony.sdk.client.KonyLogger;
import com.kony.sdk.common.IntegrationServiceException;
import com.kony.sdk.common.KonyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.CHPR2 */
public final class CHPR2 implements IdExtractorResponse {
    static String write = "IntegrationServiceImpl";
    private String IconCompatParcelizer = null;
    private Map<String, String> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private boolean MediaBrowserCompat$ItemReceiver = false;

    public CHPR2(String str) throws KonyException {
        if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaMetadataCompat != null) {
            Iterator<String> it = FragmentBuilder_BindInvestmentFundDetailFragment.MediaMetadataCompat.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(str)) {
                        this.IconCompatParcelizer = str;
                        this.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindInvestmentFundDetailFragment.MediaMetadataCompat;
                        this.MediaBrowserCompat$ItemReceiver = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!this.MediaBrowserCompat$ItemReceiver) {
                throw new KonyException("Invalid Service Name");
            }
            return;
        }
        throw new KonyException(FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver);
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(KonyException konyException, IdCaptureModule_GetIIdDeserializerOnDeviceFactory idCaptureModule_GetIIdDeserializerOnDeviceFactory) {
        if (!(konyException instanceof IntegrationServiceException)) {
            IntegrationServiceException integrationServiceException = new IntegrationServiceException(konyException.getMessage());
            integrationServiceException.read = konyException.IconCompatParcelizer();
            String str = konyException.MediaBrowserCompat$ItemReceiver;
            if (str == null) {
                str = "";
            }
            integrationServiceException.MediaBrowserCompat$ItemReceiver = str;
            if (idCaptureModule_GetIIdDeserializerOnDeviceFactory != null) {
                idCaptureModule_GetIIdDeserializerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver(integrationServiceException);
            }
        } else if (idCaptureModule_GetIIdDeserializerOnDeviceFactory != null) {
            idCaptureModule_GetIIdDeserializerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver((IntegrationServiceException) konyException);
        }
    }

    static IntegrationServiceException MediaBrowserCompat$ItemReceiver(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = null;
        try {
            if (jSONObject.has("opstatus")) {
                jSONObject.getInt("opstatus");
            }
            str = jSONObject.has("errmsg") ? jSONObject.getString("errmsg") : null;
            try {
                if (jSONObject.has("mfcode")) {
                    str3 = jSONObject.getString("mfcode");
                    str2 = FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(jSONObject);
                } else {
                    str2 = null;
                }
                if (str2 == null && jSONObject.has("httpStatusCode")) {
                    jSONObject.getString("httpStatusCode");
                }
            } catch (JSONException e) {
                e = e;
                KonyLogger.read(e);
                IntegrationServiceException integrationServiceException = new IntegrationServiceException(str3, str);
                integrationServiceException.MediaBrowserCompat$ItemReceiver = jSONObject.toString();
                return integrationServiceException;
            }
        } catch (JSONException e2) {
            e = e2;
            str = null;
            KonyLogger.read(e);
            IntegrationServiceException integrationServiceException2 = new IntegrationServiceException(str3, str);
            integrationServiceException2.MediaBrowserCompat$ItemReceiver = jSONObject.toString();
            return integrationServiceException2;
        }
        IntegrationServiceException integrationServiceException22 = new IntegrationServiceException(str3, str);
        integrationServiceException22.MediaBrowserCompat$ItemReceiver = jSONObject.toString();
        return integrationServiceException22;
    }

    private static List<AddAccountsActivity> read(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding("konyreportingparams", CTBSV.write(str).toString()));
        if (obj != null) {
            HashMap hashMap = (HashMap) obj;
            if (hashMap.size() > 0) {
                for (String str2 : hashMap.keySet()) {
                    arrayList.add(new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(str2, (String) hashMap.get(str2)));
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(CHPR2 chpr2, String str, Map map, Map map2, String str2, String str3, boolean z, IdCaptureModule_GetIIdDeserializerOnDeviceFactory idCaptureModule_GetIIdDeserializerOnDeviceFactory) {
        CHPR2 chpr22 = chpr2;
        String str4 = str;
        Map map3 = map;
        String str5 = write;
        StringBuilder sb = new StringBuilder();
        sb.append("Calling Integration service for service ");
        sb.append(chpr22.IconCompatParcelizer);
        sb.append(",  and operation ");
        sb.append(str4);
        KonyLogger.MediaBrowserCompat$ItemReceiver(str5, sb.toString());
        String str6 = chpr22.IconCompatParcelizer;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(chpr22.MediaBrowserCompat$CustomActionResultReceiver.get(str6));
        sb2.append("/");
        sb2.append(str4);
        try {
            final IdCaptureModule_GetIIdDeserializerOnDeviceFactory idCaptureModule_GetIIdDeserializerOnDeviceFactory2 = idCaptureModule_GetIIdDeserializerOnDeviceFactory;
            final boolean z2 = z;
            final String str7 = str3;
            final String str8 = str;
            final Map map4 = map;
            final Map map5 = map2;
            CTPMV ctpmv = new CTPMV(sb2.toString(), "POST", "application/x-www-form-urlencoded", new CTRMV() {
                public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, int i) {
                    CSYRK csyrk;
                    CTBSV.read();
                    String str = CHPR2.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("integration service failed ... statuscode: ");
                    sb.append(i);
                    sb.append(", and response:");
                    sb.append(jSONObject.toString());
                    KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
                    boolean z = false;
                    if (jSONObject.has("mfcode")) {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CHPR2.write, "errorResponse contains mfcode");
                        try {
                            String string = jSONObject.getString("mfcode");
                            if (string != null && (string.equals("Auth-5") || string.equals("Auth-6") || string.equals("Gateway-31") || string.equals("Gateway-33") || string.equals("Gateway-35") || string.equals("Gateway-36") || string.equals("Auth-46") || string.equals("Auth-55"))) {
                                String str2 = str7;
                                if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                                    FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                                }
                                FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.remove(str2);
                                if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                                    FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                                }
                                if (((String) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get("LastLoginProvider")).equals(str2)) {
                                    if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                                        FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                                    }
                                    FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.put("LastLoginProvider", "$anonymousProvider");
                                }
                            }
                        } catch (JSONException e) {
                            KonyLogger.read(e);
                        }
                    } else {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CHPR2.write, "errorResponse does not contain mfcode");
                        try {
                            if (z2) {
                                if (i != 401) {
                                    if (jSONObject.has("httpStatusCode") && jSONObject.getInt("httpStatusCode") == 401) {
                                        String str3 = CHPR2.write;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("value of errorResponse.httpStatusCode:");
                                        sb2.append(jSONObject.getInt("httpStatusCode"));
                                        KonyLogger.MediaBrowserCompat$ItemReceiver(str3, sb2.toString());
                                        z = true;
                                    }
                                }
                            }
                        } catch (JSONException e2) {
                            KonyLogger.read(e2);
                        }
                    }
                    if (z) {
                        CHPR2 chpr2 = CHPR2.this;
                        String str4 = str8;
                        Map map = map4;
                        Map map2 = map5;
                        IdCaptureModule_GetIIdDeserializerOnDeviceFactory idCaptureModule_GetIIdDeserializerOnDeviceFactory = idCaptureModule_GetIIdDeserializerOnDeviceFactory2;
                        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
                            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
                        }
                        String str5 = (String) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get("LastLoginProvider");
                        if (str5 == null) {
                            IntegrationServiceException integrationServiceException = new IntegrationServiceException("User is Not logged In. Please Login Before Calling this Method.Need a valid token for an integration call.");
                            if (idCaptureModule_GetIIdDeserializerOnDeviceFactory != null) {
                                idCaptureModule_GetIIdDeserializerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver(integrationServiceException);
                                return;
                            }
                            return;
                        }
                        try {
                            csyrk = new CSYRK(str5);
                        } catch (KonyException e3) {
                            CHPR2.MediaBrowserCompat$CustomActionResultReceiver(e3, idCaptureModule_GetIIdDeserializerOnDeviceFactory);
                            csyrk = null;
                        }
                        if (csyrk != null) {
                            C96844 r6 = new IdCaptureModule_GetIIdExtractionServerRttiFactory(str4, map, map2, str5, idCaptureModule_GetIIdDeserializerOnDeviceFactory) {
                                private /* synthetic */ Map IconCompatParcelizer;
                                private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
                                private /* synthetic */ String MediaBrowserCompat$MediaItem;
                                private /* synthetic */ IdCaptureModule_GetIIdDeserializerOnDeviceFactory read;
                                private /* synthetic */ Map write;

                                {
                                    this.MediaBrowserCompat$ItemReceiver = r2;
                                    this.IconCompatParcelizer = r3;
                                    this.write = r4;
                                    this.MediaBrowserCompat$MediaItem = r5;
                                    this.read = r6;
                                }

                                public final void read(String str) {
                                    CHPR2.MediaBrowserCompat$ItemReceiver(CHPR2.this, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.write, str, this.MediaBrowserCompat$MediaItem, false, this.read);
                                }

                                public final void MediaBrowserCompat$CustomActionResultReceiver(KonyException konyException) {
                                    CHPR2.MediaBrowserCompat$CustomActionResultReceiver(konyException, this.read);
                                }
                            };
                            KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Refresh the backend_token (provider_token) and claims token.");
                            csyrk.IconCompatParcelizer(str5, FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(str5), true, r6);
                            return;
                        }
                        return;
                    }
                    CHPR2.MediaBrowserCompat$CustomActionResultReceiver(CHPR2.MediaBrowserCompat$ItemReceiver(jSONObject), idCaptureModule_GetIIdDeserializerOnDeviceFactory2);
                }

                public final void IconCompatParcelizer(JSONObject jSONObject) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CHPR2.write, "Integration service Sccessfull");
                    CTBSV.IconCompatParcelizer();
                    if (idCaptureModule_GetIIdDeserializerOnDeviceFactory2 != null) {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CHPR2.write, "Caling Integration service Success callback");
                        idCaptureModule_GetIIdDeserializerOnDeviceFactory2.MediaBrowserCompat$ItemReceiver(jSONObject);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("X-Kony-Authorization", str2);
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("X-Kony-RequestId", FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver());
            if (map3 != null) {
                hashMap.putAll(map3);
            }
            ctpmv.write((Map) hashMap);
            ctpmv.write((Object) read(map2, str4));
            KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "executeAsync() Started");
            ctpmv.start();
        } catch (KonyException e) {
            KonyLogger.read(e);
            idCaptureModule_GetIIdDeserializerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver(new IntegrationServiceException(e.getMessage()));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, Map map, IdCaptureModule_GetIIdDeserializerOnDeviceFactory idCaptureModule_GetIIdDeserializerOnDeviceFactory) {
        CSYRK csyrk;
        boolean z;
        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
        }
        String str2 = (String) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get("LastLoginProvider");
        if (str2 != null) {
            try {
                csyrk = new CSYRK(str2);
            } catch (KonyException e) {
                MediaBrowserCompat$CustomActionResultReceiver(e, idCaptureModule_GetIIdDeserializerOnDeviceFactory);
                csyrk = null;
            }
            CSYRK csyrk2 = csyrk;
            if (csyrk2 != null) {
                C96833 r1 = new IdCaptureModule_GetIIdExtractionServerRttiFactory(str, (Map) null, map, str2, idCaptureModule_GetIIdDeserializerOnDeviceFactory) {
                    private /* synthetic */ Map MediaBrowserCompat$CustomActionResultReceiver;
                    private /* synthetic */ IdCaptureModule_GetIIdDeserializerOnDeviceFactory MediaBrowserCompat$ItemReceiver;
                    private /* synthetic */ String MediaBrowserCompat$MediaItem;
                    private /* synthetic */ String read;
                    private /* synthetic */ Map write = null;

                    {
                        this.read = r2;
                        this.MediaBrowserCompat$CustomActionResultReceiver = r4;
                        this.MediaBrowserCompat$MediaItem = r5;
                        this.MediaBrowserCompat$ItemReceiver = r6;
                    }

                    public final void read(String str) {
                        CHPR2.MediaBrowserCompat$ItemReceiver(CHPR2.this, this.read, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, str, this.MediaBrowserCompat$MediaItem, true, this.MediaBrowserCompat$ItemReceiver);
                    }

                    public final void MediaBrowserCompat$CustomActionResultReceiver(KonyException konyException) {
                        CHPR2.MediaBrowserCompat$CustomActionResultReceiver(konyException, this.MediaBrowserCompat$ItemReceiver);
                    }
                };
                String read = FragmentBuilder_BindMyInsuranceFragment.read(str2);
                if (read != null) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Claims token is available  ...");
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Checking claims token expiry ...");
                    long IconCompatParcelizer2 = FragmentBuilder_BindMyInsuranceFragment.IconCompatParcelizer(str2);
                    long currentTimeMillis = System.currentTimeMillis();
                    String str3 = CSYRK.read;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expired date: \"");
                    sb.append(IconCompatParcelizer2);
                    sb.append(" \", and currentdate: \"");
                    sb.append(currentTimeMillis);
                    sb.append("\"");
                    KonyLogger.MediaBrowserCompat$ItemReceiver(str3, sb.toString());
                    if (currentTimeMillis > IconCompatParcelizer2) {
                        String str4 = CSYRK.read;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("claims_token expired for provider ");
                        sb2.append(str2);
                        sb2.append("...");
                        KonyLogger.MediaBrowserCompat$ItemReceiver(str4, sb2.toString());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Claims token hes expired...");
                        if ("$anonymousProvider".equals(str2)) {
                            csyrk2.IconCompatParcelizer(str2, r1);
                            return;
                        }
                        String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(str2);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                            KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Refresh the claims token from server...");
                            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                                csyrk2.IconCompatParcelizer(str2, FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver(str2), false, r1);
                            } else {
                                csyrk2.IconCompatParcelizer(str2, MediaBrowserCompat$CustomActionResultReceiver2, false, r1);
                            }
                        } else {
                            r1.MediaBrowserCompat$CustomActionResultReceiver(new KonyException("Session Expired. please relogin", "104"));
                        }
                    } else {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "claims_token has not expired, using claims_token from cache to make a call...");
                        r1.read(read);
                    }
                } else if ("$anonymousProvider".equals(str2)) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(CSYRK.read, "Claims token is not available, Calling anonymous login to get application_user_token (anonymous_token)");
                    csyrk2.IconCompatParcelizer(str2, r1);
                } else {
                    KonyException konyException = new KonyException("Claims Token is Unavailable. Please login.");
                    konyException.read = "106";
                    r1.MediaBrowserCompat$CustomActionResultReceiver(konyException);
                }
            }
        } else {
            idCaptureModule_GetIIdDeserializerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver(new IntegrationServiceException("User is Not logged In. Please Login Before Calling this Method.Need a valid token for an integration call."));
        }
    }
}
