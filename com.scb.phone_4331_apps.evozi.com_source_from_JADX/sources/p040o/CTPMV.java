package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kony.sdk.client.KonyLogger;
import com.kony.sdk.client.SyncServiceCallback;
import com.kony.sdk.common.KonyException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p039io.beid.beidk.definitions.LivenessStatus;

/* renamed from: o.CTPMV */
final class CTPMV extends Thread {
    static String read = "KonyRestClient";
    private String IconCompatParcelizer;
    private Object MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f5483x50fd9e4a;
    private IdCaptureModule_GetUriKtaFactory MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private JSONObject RatingCompat;
    PreregistrationLandingActivity write;

    public CTPMV() {
        this.RatingCompat = null;
        this.MediaDescriptionCompat = null;
        this.MediaSessionCompat$QueueItem = 0;
        this.MediaBrowserCompat$MediaItem = 0;
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public CTPMV(String str, String str2, String str3, CTRMV ctrmv) throws KonyException {
        this();
        try {
            String str4 = read;
            StringBuilder sb = new StringBuilder();
            sb.append("KonyRestClient(");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append(" );");
            KonyLogger.MediaBrowserCompat$ItemReceiver(str4, sb.toString());
            this.MediaMetadataCompat = str;
            this.MediaBrowserCompat$SearchResultReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = ctrmv;
            if (str2 == "POST") {
                KonyLogger.MediaBrowserCompat$ItemReceiver(read, "REQUEST_TYPE_POST");
                this.write = new PreregistrationTCActivity(this.MediaMetadataCompat);
            } else if (str2 == "GET") {
                KonyLogger.MediaBrowserCompat$ItemReceiver(read, "REQUEST_TYPE_GET");
                this.write = new PreregistrationOtpActivity(this.MediaMetadataCompat);
            } else if (str2 == "DELETE") {
                KonyLogger.MediaBrowserCompat$ItemReceiver(read, "REQUEST_TYPE_DELETE");
                this.write = new UserUnderAgeErrorActivity(this.MediaMetadataCompat);
            }
            String str5 = read;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("HttpClient Created for ");
            sb2.append(this.MediaBrowserCompat$SearchResultReceiver);
            KonyLogger.MediaBrowserCompat$ItemReceiver(str5, sb2.toString());
        } catch (Exception e) {
            throw new KonyException(e.getMessage(), e.getCause());
        }
    }

    private void IconCompatParcelizer() throws Exception {
        KonyLogger.MediaBrowserCompat$ItemReceiver(read, "in execute() ");
        this.MediaBrowserCompat$ItemReceiver = false;
        if (this.write != null) {
            KonyLogger.MediaBrowserCompat$ItemReceiver(read, "Network Active");
            AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding = new AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding();
            ManageAccountInboundActivity manageAccountInboundActivity = ManageAccountInboundActivity.IconCompatParcelizer;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding, "HTTP parameters");
            amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver("http.protocol.version", (Object) manageAccountInboundActivity);
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding, "HTTP parameters");
            amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver("http.protocol.content-charset", (Object) "utf-8");
            amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding.read("http.protocol.expect-continue", false);
            TransferReviewActivity transferReviewActivity = new TransferReviewActivity();
            if (!(this.MediaBrowserCompat$CustomActionResultReceiver instanceof SyncServiceCallback)) {
                TransferReviewActivity transferReviewActivity2 = transferReviewActivity;
                CardlessATMTutorialActivity write2 = CSYMM.write();
                synchronized (transferReviewActivity2) {
                    transferReviewActivity2.MediaBrowserCompat$CustomActionResultReceiver = write2;
                }
                ScbPrivacyPolicyActivity IconCompatParcelizer2 = transferReviewActivity.IconCompatParcelizer(this.write);
                if (IconCompatParcelizer2 != null) {
                    getTile$MediaBrowserCompat$CustomActionResultReceiver gettile_mediabrowsercompat_customactionresultreceiver = new getTile$MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
                    int MediaBrowserCompat$CustomActionResultReceiver2 = gettile_mediabrowsercompat_customactionresultreceiver.write().MediaBrowserCompat$CustomActionResultReceiver();
                    String str = read;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got Status Code: ");
                    sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
                    KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == 200) {
                        JSONObject MediaBrowserCompat$ItemReceiver2 = gettile_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
                        int MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                        String str2 = read;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("opstatus: ");
                        sb2.append(MediaBrowserCompat$CustomActionResultReceiver3);
                        KonyLogger.MediaBrowserCompat$ItemReceiver(str2, sb2.toString());
                        if (MediaBrowserCompat$CustomActionResultReceiver3 == 0) {
                            this.MediaDescriptionCompat = gettile_mediabrowsercompat_customactionresultreceiver;
                            this.RatingCompat = null;
                            this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver2;
                            return;
                        }
                        this.MediaDescriptionCompat = null;
                        this.RatingCompat = MediaBrowserCompat$ItemReceiver2;
                        this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver2;
                        return;
                    }
                    JSONObject MediaBrowserCompat$ItemReceiver3 = gettile_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
                    if (MediaBrowserCompat$ItemReceiver3 != null) {
                        this.MediaDescriptionCompat = null;
                        this.RatingCompat = MediaBrowserCompat$ItemReceiver3;
                        this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver2;
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(MediaBrowserCompat$CustomActionResultReceiver2);
                    throw new KonyException("Invalid JSON from response", sb3.toString());
                }
                throw new KonyException("Got null response from server side");
            }
            ScbPrivacyPolicyActivity IconCompatParcelizer3 = transferReviewActivity.IconCompatParcelizer(this.write);
            if (IconCompatParcelizer3 != null) {
                this.f5483x50fd9e4a = read(IconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver().write());
                return;
            }
            throw new KonyException("Got null response from server side");
        }
        throw new IllegalArgumentException("Request can not be null");
    }

    private void read() {
        KonyLogger.IconCompatParcelizer("Now Calling CallBacks :: ");
        try {
            if (this.MediaBrowserCompat$CustomActionResultReceiver instanceof CTRMV) {
                KonyLogger.MediaBrowserCompat$ItemReceiver(read, "CallBack is instance of ServiceCallBack");
                if (this.RatingCompat != null || this.MediaDescriptionCompat == null) {
                    ((CTRMV) this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver(this.RatingCompat, this.MediaSessionCompat$ResultReceiverWrapper);
                    return;
                }
                ((CTRMV) this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver());
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver instanceof SyncServiceCallback) {
                KonyLogger.MediaBrowserCompat$ItemReceiver(read, "CallBack is instance of SyncServiceCallBack");
                if (this.RatingCompat == null) {
                    ((SyncServiceCallback) this.MediaBrowserCompat$CustomActionResultReceiver).ndkinvokeServiceHandler(this.f5483x50fd9e4a, 0, false, (String) null, (String) null);
                } else {
                    ((SyncServiceCallback) this.MediaBrowserCompat$CustomActionResultReceiver).ndkinvokeServiceHandler(this.RatingCompat.toString(), 0, true, this.RatingCompat.getString("errorCode"), this.RatingCompat.getString("errorDetail"));
                }
            }
        } catch (Exception e) {
            KonyLogger.write(read, "Error in excuting CallBack function");
            KonyLogger.read(e);
        }
    }

    public final void write(Map map) {
        if (map.size() > 0) {
            for (Object next : map.keySet()) {
                this.write.MediaBrowserCompat$ItemReceiver((String) next, (String) map.get(next));
            }
        }
    }

    public final void write(Object obj) {
        if (obj != null) {
            try {
                if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 3)) {
                    String str = read;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Request Parameters : ");
                    sb.append(obj.toString());
                    KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
                }
                if (this.IconCompatParcelizer == "application/json") {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(read, "Content is application/json");
                    ((PreregistrationInformationActivity) this.write).write = new FixedTransferSuccessActivity(obj.toString());
                } else if (this.IconCompatParcelizer == "application/x-www-form-urlencoded") {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(read, "Content is application/x-www-form-urlencoded");
                    ((PreregistrationInformationActivity) this.write).write = new RegistrationNoDataActivity_ViewBinding((List) obj);
                }
            } catch (UnsupportedEncodingException e) {
                KonyLogger.read(e);
            }
        }
    }

    static PrepaidRequestMarketConductActivity[] MediaBrowserCompat$CustomActionResultReceiver(int i, String str) {
        int i2 = i;
        String str2 = str;
        String str3 = "android";
        if (i2 == 1) {
            return new PrepaidRequestMarketConductActivity[]{new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-App-Key", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("appkey")), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-App-Secret", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("appsecret")), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("Content-Type", "application/json"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-RequestId", FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver()), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-RequestId", FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver()), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-SDK-Type", "android-native"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-SDK-Version", "SDK-GA-7.2.1.8"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-Platform-Type", str3)};
        } else if (i2 == 2) {
            return new PrepaidRequestMarketConductActivity[]{new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-App-Key", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("appkey")), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-App-Secret", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("appsecret")), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("Content-Type", "application/json"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("Authorization", str2), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-RequestId", FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver()), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-SDK-Type", "android-native"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-SDK-Version", "SDK-GA-7.2.1.8"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-Platform-Type", str3)};
        } else if (i2 != 3) {
            return null;
        } else {
            return new PrepaidRequestMarketConductActivity[]{new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-Authorization", str2), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("Content-Type", "application/x-www-form-urlencoded"), new ManageChequeAdapter$ManageChequeHolder_ViewBinding("X-Kony-RequestId", FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver())};
        }
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(JSONObject jSONObject) {
        if (jSONObject.has("opstatus")) {
            try {
                return jSONObject.getInt("opstatus");
            } catch (JSONException e) {
                KonyLogger.read(e);
            }
        }
        return 0;
    }

    private static String read(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(readLine);
                    sb2.append("\n");
                    sb.append(sb2.toString());
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        KonyLogger.read(e);
                        throw e;
                    }
                }
            } catch (IOException e2) {
                KonyLogger.read(e2);
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    KonyLogger.read(e3);
                    throw e3;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e4) {
                    KonyLogger.read(e4);
                    throw e4;
                }
            }
        }
        inputStream.close();
        return sb.toString();
    }

    public final void run() {
        write();
    }

    private static JSONObject write(KonyException konyException) {
        JSONObject jSONObject = new JSONObject();
        String message = konyException.getMessage();
        String IconCompatParcelizer2 = konyException.IconCompatParcelizer();
        try {
            jSONObject.put(C8183f.f4230JO, message);
            jSONObject.put("errorCode", IconCompatParcelizer2);
            StringWriter stringWriter = new StringWriter();
            konyException.printStackTrace(new PrintWriter(stringWriter));
            jSONObject.put("errorDetail", stringWriter.toString());
        } catch (JSONException unused) {
            KonyLogger.MediaBrowserCompat$ItemReceiver(read, "The Exception in Request AsyncTask");
        }
        return jSONObject;
    }

    private static KonyException IconCompatParcelizer(IOException iOException) {
        if (iOException instanceof NoHttpResponseException) {
            return new KonyException(iOException.getMessage(), "KNY2013E", iOException);
        }
        if (iOException instanceof ConnectTimeoutException) {
            return new KonyException(iOException.getMessage(), "KNY2012E", iOException);
        }
        return new KonyException(iOException.getMessage(), "KNY2011E", iOException);
    }

    private void MediaBrowserCompat$ItemReceiver() {
        this.MediaSessionCompat$QueueItem--;
        try {
            Thread.sleep((long) null.read);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.RatingCompat = null;
        write();
    }

    private void write() {
        boolean z;
        try {
            if (CSYR2K.MediaBrowserCompat$CustomActionResultReceiver != null) {
                z = FragmentBuilder_BindMyInsuranceFragment.read();
            } else {
                z = true;
            }
            if (!z) {
                this.MediaDescriptionCompat = null;
                JSONObject jSONObject = new JSONObject();
                this.RatingCompat = jSONObject;
                try {
                    jSONObject.put(C8183f.f4230JO, "Device has no WIFI or mobile connectivity. Please try the operation after establishing connectivity.");
                    this.RatingCompat.put("errorCode", "1011");
                    this.RatingCompat.put("errorDetail", "Device has no WIFI or mobile connectivity. Please try the operation after establishing connectivity.");
                } catch (JSONException e) {
                    KonyLogger.MediaBrowserCompat$ItemReceiver(read, e.getMessage());
                }
                if (this.MediaSessionCompat$QueueItem > 0) {
                    MediaBrowserCompat$ItemReceiver();
                    return;
                }
                read();
            }
            IconCompatParcelizer();
            read();
        } catch (ClientProtocolException e2) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str = read;
                StringBuilder sb = new StringBuilder();
                sb.append("The ClientProtocolException in KonyRestClient execute");
                sb.append(e2.getMessage());
                KonyLogger.IconCompatParcelizer(str, sb.toString());
            }
            throw new KonyException("Request Failed.", "1012");
        } catch (IllegalArgumentException e3) {
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str2 = read;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The IllegalArgumentException in KonyRestClient execute");
                sb2.append(e3.getMessage());
                KonyLogger.IconCompatParcelizer(str2, sb2.toString());
            }
            throw new KonyException("Invalid input url. Please check the url", LivenessStatus.ERROR_MATCHING_FAIL);
        } catch (IOException e4) {
            this.MediaBrowserCompat$ItemReceiver = true;
            if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 6)) {
                String str3 = read;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("The IOException in KonyRestClient execute");
                sb3.append(e4.getMessage());
                KonyLogger.IconCompatParcelizer(str3, sb3.toString());
            }
            throw IconCompatParcelizer(e4);
        } catch (Exception e5) {
            throw new KonyException("Unknown Error occured", "1000", e5);
        } catch (SecurityException e6) {
            throw new KonyException(e6.getMessage(), "KNY2010E", e6);
        } catch (KonyException e7) {
            this.MediaDescriptionCompat = null;
            this.RatingCompat = write(e7);
            if (this.MediaBrowserCompat$ItemReceiver && this.MediaSessionCompat$QueueItem > 0) {
                MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}
