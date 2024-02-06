package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.MemoryHelper;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.ModifyQuickTopUpReviewActivity;

public class AppStatsJsonExportHandler implements AppStatsDsExportHandler, AppStatsExportListener {
    private static final String TAG = AppStatsJsonExportHandler.class.getSimpleName();
    private static AppStatistics appStats;
    private static AppStatistics.FriendAS asFriend;
    private final String LINE_SEPARATOR;

    /* renamed from: pE */
    private final String f3612pE = "AppStatisticsVersion";

    /* renamed from: pF */
    private final String f3613pF = "AppStatisticsTables";

    /* renamed from: pG */
    private final String f3614pG = ".json";

    /* renamed from: pH */
    private final float f3615pH = 0.1f;

    /* renamed from: pI */
    private final String f3616pI;

    /* renamed from: pJ */
    private JSONObject f3617pJ;

    /* renamed from: pK */
    private JSONObject f3618pK;

    /* renamed from: pL */
    private File f3619pL;

    /* renamed from: pM */
    private Map<String, Object> f3620pM;

    /* renamed from: pN */
    private String f3621pN;

    /* renamed from: pO */
    private String f3622pO;

    /* renamed from: pP */
    private String f3623pP;

    /* renamed from: pQ */
    private String f3624pQ;

    /* renamed from: pR */
    private String f3625pR;

    /* renamed from: pS */
    private String f3626pS;

    /* renamed from: pT */
    private boolean f3627pT;

    /* renamed from: pU */
    private boolean f3628pU;

    static {
        AppStatistics instance = AppStatistics.getInstance();
        appStats = instance;
        asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
    }

    public AppStatsJsonExportHandler() {
        StringBuilder sb = new StringBuilder();
        sb.append(",");
        sb.append(System.getProperty("line.separator"));
        this.f3616pI = sb.toString();
        this.LINE_SEPARATOR = System.getProperty("line.separator");
        this.f3617pJ = new JSONObject();
        this.f3618pK = new JSONObject();
        this.f3619pL = null;
        this.f3620pM = new HashMap();
        this.f3621pN = "";
        this.f3622pO = "";
        this.f3623pP = "";
        this.f3624pQ = "";
        this.f3625pR = "";
        this.f3626pS = "";
        this.f3627pT = false;
        this.f3628pU = false;
        try {
            this.f3617pJ.put("AppStatisticsVersion", SdkVersion.getSdkVersion());
            this.f3617pJ.put("AppStatisticsTables", this.f3618pK);
            String jSONObject = this.f3617pJ.toString(2);
            int indexOf = jSONObject.indexOf("{", 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jSONObject.substring(0, indexOf + 1));
            sb2.append(this.LINE_SEPARATOR);
            this.f3621pN = sb2.toString();
            asFriend.addAppStatsExportListener(this, 0);
        } catch (JSONException e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
            throw kmcRuntimeException;
        }
    }

    public void onExportAppStatsRowEvent(String str, AppStatsDaoField[] appStatsDaoFieldArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("s");
        String obj = sb.toString();
        try {
            if (!this.f3618pK.has(obj)) {
                if (!this.f3626pS.isEmpty()) {
                    this.f3624pQ = m3816e(false);
                    m3815b(this.f3626pS, true);
                    m3817f(false);
                    this.f3618pK.remove(this.f3626pS);
                    this.f3626pS = "";
                }
                if (this.f3618pK.length() > 0 && MemoryHelper.getTotalFreeMemoryAsPctOfMax() < 0.1f) {
                    m3811aR();
                }
                this.f3628pU = false;
                this.f3618pK.put(obj, new JSONArray());
            } else if (MemoryHelper.getTotalFreeMemoryAsPctOfMax() < 0.1f) {
                if (!this.f3628pU) {
                    JSONArray jSONArray = this.f3618pK.getJSONArray(obj);
                    this.f3618pK.remove(obj);
                    m3811aR();
                    this.f3618pK.put(obj, jSONArray);
                    StringBuilder sb2 = new StringBuilder(this.f3617pJ.toString(2));
                    sb2.delete(0, this.f3621pN.length());
                    sb2.delete(sb2.length() - this.f3622pO.length(), sb2.length());
                    int indexOf = sb2.indexOf("[", 0);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2.substring(0, indexOf + 1));
                    sb3.append(this.LINE_SEPARATOR);
                    this.f3623pP = sb3.toString();
                    this.f3624pQ = m3816e(true);
                    StringBuilder sb4 = new StringBuilder(this.f3617pJ.toString(2));
                    sb4.delete(0, this.f3621pN.length());
                    sb4.delete(0, this.f3623pP.length());
                    sb4.delete(0, this.f3624pQ.length());
                    sb4.delete(sb4.indexOf(this.f3622pO), sb4.length());
                    this.f3625pR = sb4.toString();
                    m3814aU();
                    m3815b(obj, false);
                    this.f3626pS = obj;
                } else {
                    this.f3624pQ = m3816e(false);
                    m3815b(obj, false);
                }
            }
            JSONArray jSONArray2 = this.f3618pK.getJSONArray(obj);
            this.f3620pM.clear();
            for (AppStatsDaoField appStatsDaoField : appStatsDaoFieldArr) {
                String dsValueString = appStatsDaoField.getDsValueString();
                if (dsValueString.equals("null")) {
                    this.f3620pM.put(appStatsDaoField.getDsFieldName(), JSONObject.NULL);
                } else {
                    this.f3620pM.put(appStatsDaoField.getDsFieldName(), dsValueString);
                }
            }
            jSONArray2.put(new JSONObject(this.f3620pM));
        } catch (JSONException e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
            throw kmcRuntimeException;
        }
    }

    public void configDsExpFilePath(String str) {
        if (!str.endsWith(".json")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".json");
            str = sb.toString();
        }
        this.f3619pL = new File(str);
    }

    public void exportStatusEvent(AppStatsExportEvent appStatsExportEvent) {
        if (appStatsExportEvent.getPercentComplete() == 100) {
            try {
                if (!this.f3627pT) {
                    m3808a(this.f3617pJ.toString(2), this.f3619pL);
                } else if (!this.f3626pS.isEmpty()) {
                    this.f3624pQ = m3816e(false);
                    m3815b(this.f3626pS, true);
                    m3817f(true);
                    m3813aT();
                    this.f3626pS = "";
                } else {
                    m3818g(true);
                    m3813aT();
                }
                appStats.removeAppStatsExportListener(this);
            } catch (JSONException e) {
                e.printStackTrace();
                KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
                kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
                throw kmcRuntimeException;
            }
        }
    }

    /* renamed from: aQ */
    private void m3810aQ() {
        Iterator<String> keys = this.f3618pK.keys();
        while (keys.hasNext()) {
            keys.next();
            keys.remove();
        }
    }

    /* renamed from: aR */
    private void m3811aR() {
        try {
            if (!this.f3627pT) {
                m3812aS();
                String jSONObject = this.f3617pJ.toString(2);
                this.f3622pO = jSONObject.substring(jSONObject.lastIndexOf("]") + 2, jSONObject.length());
            }
            m3818g(false);
            m3810aQ();
        } catch (JSONException e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
            throw kmcRuntimeException;
        }
    }

    /* renamed from: a */
    private void m3808a(String str, File file) {
        m3809a(str, file, false);
    }

    /* renamed from: aS */
    private void m3812aS() {
        this.f3627pT = true;
        m3809a(this.f3621pN, this.f3619pL, false);
    }

    /* renamed from: aT */
    private void m3813aT() {
        m3809a(this.f3622pO, this.f3619pL, true);
    }

    /* renamed from: aU */
    private void m3814aU() {
        this.f3628pU = true;
        m3809a(this.f3623pP, this.f3619pL, true);
    }

    /* renamed from: e */
    private String m3816e(boolean z) {
        try {
            StringBuilder sb = new StringBuilder(this.f3617pJ.toString(2));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.LINE_SEPARATOR);
            String obj = sb2.toString();
            sb.delete(0, sb.indexOf(obj) + obj.length());
            sb.delete(sb.lastIndexOf("]"), sb.length());
            if (!z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(",");
                sb3.append(this.LINE_SEPARATOR);
                sb.insert(0, sb3.toString());
            }
            sb.trimToSize();
            String obj2 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" ");
            sb4.append(this.LINE_SEPARATOR);
            return ModifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver(obj2, sb4.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
            throw kmcRuntimeException;
        }
    }

    /* renamed from: b */
    private void m3815b(String str, boolean z) {
        m3809a(this.f3624pQ, this.f3619pL, true);
        if (!z) {
            try {
                this.f3618pK.put(str, new JSONArray());
            } catch (JSONException e) {
                e.printStackTrace();
                KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
                kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
                throw kmcRuntimeException;
            }
        }
    }

    /* renamed from: f */
    private void m3817f(boolean z) {
        String str;
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(ModifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver(this.f3625pR, this.LINE_SEPARATOR));
            sb.append(this.f3616pI);
            str = sb.toString();
        } else {
            str = this.f3625pR;
        }
        m3809a(str, this.f3619pL, true);
    }

    /* renamed from: g */
    private void m3818g(boolean z) {
        try {
            StringBuilder sb = new StringBuilder(this.f3618pK.toString(4));
            sb.replace(0, sb.indexOf(" "), "");
            sb.deleteCharAt(sb.lastIndexOf("}"));
            if (!z) {
                sb.insert(sb.lastIndexOf("]") + 1, ",");
            }
            m3809a(sb.toString(), this.f3619pL, true);
        } catch (JSONException e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
            throw kmcRuntimeException;
        }
    }

    /* renamed from: a */
    private void m3809a(String str, File file, boolean z) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
            kmcRuntimeException.getErrorInfo().setErrCause(e.getMessage());
            throw kmcRuntimeException;
        } catch (IOException e2) {
            e2.printStackTrace();
            KmcRuntimeException kmcRuntimeException2 = new KmcRuntimeException(ErrorInfo.KMC_GN_IO_EXCEPTION);
            kmcRuntimeException2.getErrorInfo().setErrCause(e2.getMessage());
            throw kmcRuntimeException2;
        }
    }
}
