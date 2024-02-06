package p040o;

import android.content.Context;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kony.sdk.client.KonyLogger;
import com.kony.sdk.common.IdentityServiceException;
import com.kony.sdk.common.KonyException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.CSYR2K */
public final class CSYR2K {
    private static String IconCompatParcelizer;
    public static Context MediaBrowserCompat$CustomActionResultReceiver;
    public static IdExtractActivity MediaBrowserCompat$ItemReceiver;
    protected static CHPR read;

    public final void MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, final proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice) throws KonyException {
        if (context == null || str == null || str2 == null || str3 == null) {
            throw new KonyException("One of the value (Appkey, AppSecret, ServiceURL, Callback) is Null");
        }
        try {
            IconCompatParcelizer = str3;
            MediaBrowserCompat$CustomActionResultReceiver = context;
            MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindMileageReviewRedemptionFragment();
            read = CHPR.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver);
            try {
                HashMap hashMap = new HashMap();
                FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer = hashMap;
                hashMap.put("appkey", str);
                FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.put("appsecret", str2);
            } catch (Exception e) {
                String str4 = FragmentBuilder_BindInvestmentFundDetailFragment.write;
                StringBuilder sb = new StringBuilder();
                sb.append("setAppKeySecret :");
                sb.append(e.getMessage());
                KonyLogger.MediaBrowserCompat$ItemReceiver(str4, sb.toString());
            }
            CTRMM ctrmm = new CTRMM();
            String str5 = IconCompatParcelizer;
            C96865 r5 = new proxyGetIIdDeserializerOnDevice() {
                public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", 6)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Exception When Fetching the Config file : ");
                            sb.append(FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver);
                            KonyLogger.IconCompatParcelizer("KonyClient", sb.toString());
                        }
                        KonyException konyException = new KonyException(FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver);
                        proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice = proxyGetIIdDeserializerOnDevice.this;
                        if (proxygetiiddeserializerondevice != null) {
                            proxygetiiddeserializerondevice.read(konyException);
                        }
                    } else if (FragmentBuilder_BindInvestmentFundDetailFragment.write(jSONObject)) {
                        if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Config File SuccessFully Initialized");
                            sb2.append(jSONObject);
                            KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", sb2.toString());
                        }
                        proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice2 = proxyGetIIdDeserializerOnDevice.this;
                        KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", "AnonymousLogin Service Started");
                        try {
                            new CSYRK("$anonymousProvider").MediaBrowserCompat$CustomActionResultReceiver((String) null, (String) null, new IdCaptureModule_GetIIdDeserializerKtaFactory(proxygetiiddeserializerondevice2, jSONObject) {
                                private /* synthetic */ JSONObject IconCompatParcelizer;
                                private /* synthetic */ proxyGetIIdDeserializerOnDevice read;

                                {
                                    this.read = r1;
                                    this.IconCompatParcelizer = r2;
                                }

                                public final void IconCompatParcelizer() {
                                    KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", "Anonymous Login is Successfull");
                                    CSYR2K.MediaBrowserCompat$ItemReceiver(this.read, this.IconCompatParcelizer);
                                }

                                public final void read(IdentityServiceException identityServiceException) {
                                    KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", "Anonymous Login Failed");
                                    KonyException konyException = new KonyException(identityServiceException.write, identityServiceException.IconCompatParcelizer());
                                    proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice = this.read;
                                    if (proxygetiiddeserializerondevice != null) {
                                        proxygetiiddeserializerondevice.read(konyException);
                                    }
                                }
                            });
                        } catch (Exception e) {
                            KonyLogger.read(e);
                        }
                    } else {
                        if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", 6)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid Config File:");
                            sb3.append(FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver);
                            KonyLogger.IconCompatParcelizer("KonyClient", sb3.toString());
                        }
                        KonyException konyException2 = new KonyException(FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver);
                        proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice3 = proxyGetIIdDeserializerOnDevice.this;
                        if (proxygetiiddeserializerondevice3 != null) {
                            proxygetiiddeserializerondevice3.read(konyException2);
                        }
                    }
                }

                public final void read(KonyException konyException) {
                    proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice = proxyGetIIdDeserializerOnDevice.this;
                    if (proxygetiiddeserializerondevice != null) {
                        proxygetiiddeserializerondevice.read(konyException);
                    }
                }
            };
            try {
                CTPMV ctpmv = new CTPMV(str5, "GET", "application/x-www-form-urlencoded", new CTRMV(str5, r5) {
                    private /* synthetic */ String IconCompatParcelizer;
                    private /* synthetic */ proxyGetIIdDeserializerOnDevice read;

                    {
                        this.IconCompatParcelizer = r2;
                        this.read = r3;
                    }

                    public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, int i) {
                        KonyException konyException;
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CTRMM.MediaBrowserCompat$ItemReceiver, "in ServiceDocument onFailure");
                        try {
                            konyException = new KonyException(jSONObject.has(C8183f.f4230JO) ? jSONObject.getString(C8183f.f4230JO) : null);
                            if (jSONObject.has("errorCode")) {
                                konyException.read = jSONObject.getString("errorCode");
                            }
                        } catch (JSONException e) {
                            konyException = new KonyException(e.getMessage());
                            KonyLogger.read(e);
                        }
                        proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice = this.read;
                        if (proxygetiiddeserializerondevice != null) {
                            proxygetiiddeserializerondevice.read(konyException);
                        }
                    }

                    public final void IconCompatParcelizer(JSONObject jSONObject) {
                        KonyLogger.MediaBrowserCompat$ItemReceiver(CTRMM.MediaBrowserCompat$ItemReceiver, "in ServiceDocument onSuccess");
                        CTRMM.this.write = this.IconCompatParcelizer;
                        this.read.MediaBrowserCompat$ItemReceiver(jSONObject);
                    }
                });
                KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Started");
                ctpmv.write.IconCompatParcelizer(CTPMV.MediaBrowserCompat$CustomActionResultReceiver(1, (String) null));
                KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "setHeaders Ended");
                KonyLogger.MediaBrowserCompat$ItemReceiver(CTPMV.read, "executeAsync() Started");
                ctpmv.start();
            } catch (KonyException e2) {
                KonyLogger.read(e2);
                r5.read(e2);
            }
        } catch (Exception e3) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", 6)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Got Exception When Initializing init");
                sb2.append(e3.getMessage());
                KonyLogger.IconCompatParcelizer("KonyClient", sb2.toString());
            }
            proxygetiiddeserializerondevice.read(new KonyException(e3.getMessage()));
        }
    }

    static void MediaBrowserCompat$ItemReceiver(proxyGetIIdDeserializerOnDevice proxygetiiddeserializerondevice, JSONObject jSONObject) {
        KonyLogger.MediaBrowserCompat$ItemReceiver("KonyClient", "Performing the callbacks for init success.");
        try {
            CTPSV ctpsv = new CTPSV();
            if (MediaBrowserCompat$ItemReceiver.read("konyUserID") != null) {
                MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("konyUserID");
            }
            ctpsv.write(true);
        } catch (KonyException e) {
            KonyLogger.read(e);
        }
        if (proxygetiiddeserializerondevice != null) {
            proxygetiiddeserializerondevice.MediaBrowserCompat$ItemReceiver(jSONObject);
        }
    }
}
