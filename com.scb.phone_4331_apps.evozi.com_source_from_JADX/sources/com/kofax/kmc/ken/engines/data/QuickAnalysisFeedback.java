package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p015ak.C0857a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.ModifyQuickTopUpReviewActivity;

public class QuickAnalysisFeedback implements Serializable, Cloneable {

    /* renamed from: ex */
    private static int f291ex = 20;
    private static final long serialVersionUID = -5200932471645846116L;
    /* access modifiers changed from: private */
    public String TAG = QuickAnalysisFeedback.class.getSimpleName();

    /* renamed from: eA */
    private transient Point f292eA;

    /* renamed from: eB */
    private transient Point f293eB;

    /* renamed from: eC */
    private transient Point f294eC;
    /* access modifiers changed from: private */

    /* renamed from: em */
    public transient Boolean f295em;
    /* access modifiers changed from: private */

    /* renamed from: en */
    public transient Boolean f296en;
    /* access modifiers changed from: private */

    /* renamed from: eo */
    public transient Boolean f297eo;
    /* access modifiers changed from: private */

    /* renamed from: ep */
    public transient Boolean f298ep;
    /* access modifiers changed from: private */

    /* renamed from: eq */
    public transient Boolean f299eq;
    /* access modifiers changed from: private */

    /* renamed from: er */
    public transient Boolean f300er;
    /* access modifiers changed from: private */

    /* renamed from: es */
    public transient Boolean f301es;
    /* access modifiers changed from: private */

    /* renamed from: et */
    public transient Boolean f302et;

    /* renamed from: eu */
    private transient BoundingTetragon f303eu;
    /* access modifiers changed from: private */

    /* renamed from: ev */
    public transient String f304ev;
    /* access modifiers changed from: private */

    /* renamed from: ew */
    public transient Bitmap f305ew;
    /* access modifiers changed from: private */

    /* renamed from: ey */
    public transient Map<String, String> f306ey;

    /* renamed from: ez */
    private transient Point f307ez;

    public QuickAnalysisFeedback() {
        Boolean bool = Boolean.FALSE;
        this.f295em = bool;
        this.f299eq = bool;
        this.f300er = bool;
        this.f301es = bool;
        this.f302et = bool;
        this.f303eu = null;
        this.f304ev = new String();
        this.f305ew = null;
        this.f306ey = null;
        this.f307ez = null;
        this.f292eA = null;
        this.f293eB = null;
        this.f294eC = null;
        if (this.f303eu == null) {
            this.f303eu = new BoundingTetragon();
            this.f307ez = new Point();
            this.f292eA = new Point();
            this.f293eB = new Point();
            this.f294eC = new Point();
        }
        m279I();
    }

    public QuickAnalysisFeedback clone() {
        C0767k.m1807c(this.TAG, "Enter:: QuickAnalysisFeedback clone");
        try {
            return (QuickAnalysisFeedback) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("QuickAnalysisFeedback: unexpected clone not supported exception");
        }
    }

    public Bitmap getViewBoundariesImage() {
        return this.f305ew;
    }

    public boolean isBlurry() {
        return this.f296en.booleanValue();
    }

    public boolean isGlareDetected() {
        return this.f295em.booleanValue();
    }

    public boolean isOversaturated() {
        return this.f297eo.booleanValue();
    }

    public boolean isUndersaturated() {
        return this.f298ep.booleanValue();
    }

    public boolean isOverlySkewed() {
        return this.f299eq.booleanValue();
    }

    public boolean isShadowed() {
        return this.f300er.booleanValue();
    }

    public boolean isMissingBorders() {
        return this.f301es.booleanValue();
    }

    public boolean isLowContrastBackground() {
        return this.f302et.booleanValue();
    }

    public BoundingTetragon getTetragonCorners() {
        BoundingTetragon boundingTetragon = this.f303eu;
        if (boundingTetragon != null) {
            return boundingTetragon.clone();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m286a(JSONObject jSONObject, Map<String, String> map) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str = null;
            try {
                String str2 = this.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Key in recursion :: ");
                sb.append(next);
                C0767k.m1801b(str2, sb.toString());
                m286a(jSONObject.getJSONObject(next), map);
            } catch (Exception unused) {
                str = jSONObject.getString(next);
            }
            if (str != null) {
                map.put(next, str);
            }
        }
        return map;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m279I() {
        Boolean bool = Boolean.FALSE;
        this.f296en = bool;
        this.f297eo = bool;
        this.f298ep = bool;
        this.f295em = bool;
        this.f302et = bool;
        this.f300er = bool;
        this.f299eq = bool;
        this.f301es = bool;
        this.f304ev = "";
        Bitmap bitmap = this.f305ew;
        if (bitmap != null) {
            bitmap.recycle();
            this.f305ew = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m287a(Map<String, String> map) {
        if (map != null) {
            m291b(map);
            String str = map.get("Blurry");
            if (str != null && str.equals("true")) {
                this.f296en = Boolean.TRUE;
            }
            String str2 = map.get("Oversaturated");
            if (str2 != null && str2.equals("true")) {
                this.f297eo = Boolean.TRUE;
            }
            String str3 = map.get("Undersaturated");
            if (str3 != null && str3.equals("true")) {
                this.f298ep = Boolean.TRUE;
            }
            String str4 = map.get("GlareDetected");
            if (str4 != null && str4.equals("true")) {
                this.f295em = Boolean.TRUE;
            }
            String str5 = map.get("Max Deviation from 90 in degrees");
            String str6 = map.get("Skew Angle");
            int i = 0;
            if (Math.abs(str5 != null ? (int) Float.parseFloat(str5) : 0) > f291ex) {
                this.f299eq = Boolean.TRUE;
            } else {
                if (str6 != null) {
                    i = (int) Float.parseFloat(str6);
                }
                if (Math.abs(i) > f291ex) {
                    this.f299eq = Boolean.TRUE;
                }
            }
            String str7 = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Blurry Val ==> ");
            sb.append(str);
            C0767k.m1801b(str7, sb.toString());
            String str8 = this.TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Oversaturated Val ==> ");
            sb2.append(str2);
            C0767k.m1801b(str8, sb2.toString());
            String str9 = this.TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Undersaturated Val ==> ");
            sb3.append(str3);
            C0767k.m1801b(str9, sb3.toString());
            String str10 = this.TAG;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("GlareDetected Val ==> ");
            sb4.append(str4);
            C0767k.m1801b(str10, sb4.toString());
            String str11 = this.TAG;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Max Deviation Val ==> ");
            sb5.append(str5);
            C0767k.m1801b(str11, sb5.toString());
            String str12 = this.TAG;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Skew Angle Val ==> ");
            sb6.append(str6);
            C0767k.m1801b(str12, sb6.toString());
        }
    }

    /* renamed from: b */
    private void m291b(Map<String, String> map) {
        this.f307ez.set((int) Float.parseFloat(map.get("TLx")), (int) Float.parseFloat(map.get("TLy")));
        this.f303eu.setTopLeft(this.f307ez);
        this.f292eA.set((int) Float.parseFloat(map.get("TRx")), (int) Float.parseFloat(map.get("TRy")));
        this.f303eu.setTopRight(this.f292eA);
        this.f293eB.set((int) Float.parseFloat(map.get("BLx")), (int) Float.parseFloat(map.get("BLy")));
        this.f303eu.setBottomLeft(this.f293eB);
        this.f294eC.set((int) Float.parseFloat(map.get("BRx")), (int) Float.parseFloat(map.get("BRy")));
        this.f303eu.setBottomRight(this.f294eC);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(QuickAnalysisFeedback.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f295em);
        objectOutputStream.writeObject(this.f296en);
        objectOutputStream.writeObject(this.f297eo);
        objectOutputStream.writeObject(this.f298ep);
        objectOutputStream.writeObject(this.f303eu);
        objectOutputStream.writeObject(this.f304ev);
        objectOutputStream.writeObject(this.f306ey);
        objectOutputStream.writeObject(Integer.valueOf(this.f307ez.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f307ez.y));
        objectOutputStream.writeObject(Integer.valueOf(this.f292eA.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f292eA.y));
        objectOutputStream.writeObject(Integer.valueOf(this.f293eB.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f293eB.y));
        objectOutputStream.writeObject(Integer.valueOf(this.f294eC.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f294eC.y));
        C0857a.m2190b(objectOutputStream, this.f305ew);
        objectOutputStream.writeObject(this.f299eq);
        objectOutputStream.writeObject(this.f300er);
        objectOutputStream.writeObject(this.f301es);
        objectOutputStream.writeObject(this.f302et);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (QuickAnalysisFeedback.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            String str = (String) objectInputStream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), str).booleanValue()) {
                this.f295em = (Boolean) objectInputStream.readObject();
                this.f296en = (Boolean) objectInputStream.readObject();
                this.f297eo = (Boolean) objectInputStream.readObject();
                this.f298ep = (Boolean) objectInputStream.readObject();
                this.f303eu = (BoundingTetragon) objectInputStream.readObject();
                this.f304ev = (String) objectInputStream.readObject();
                this.f306ey = (Map) objectInputStream.readObject();
                this.f307ez = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                this.f292eA = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                this.f293eB = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                this.f294eC = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                if (SdkVersion.compare(str, "2.4.0.0") >= 0) {
                    this.f305ew = C0857a.m2191d(objectInputStream);
                }
                if (SdkVersion.compare(str, "3.2.0.0") >= 0) {
                    this.f299eq = (Boolean) objectInputStream.readObject();
                    this.f300er = (Boolean) objectInputStream.readObject();
                    this.f301es = (Boolean) objectInputStream.readObject();
                    this.f302et = (Boolean) objectInputStream.readObject();
                    return;
                }
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }

    public class FriendQAF {
        public FriendQAF(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public void setBlurry(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f296en = Boolean.valueOf(z);
        }

        public void setOversaturated(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f297eo = Boolean.valueOf(z);
        }

        public void setUndersaturated(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f298ep = Boolean.valueOf(z);
        }

        public void setIsShadowed(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f300er = Boolean.valueOf(z);
        }

        public void setGlareDetected(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f295em = Boolean.valueOf(z);
        }

        public void setOverlySkewed(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f299eq = Boolean.valueOf(z);
        }

        public void setMissingBorder(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f301es = Boolean.valueOf(z);
        }

        public void setLowContrastBackground(boolean z) {
            Boolean unused = QuickAnalysisFeedback.this.f302et = Boolean.valueOf(z);
        }

        public void setMetadata(String str) {
            String a = QuickAnalysisFeedback.this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("metadata from EVRS = ");
            sb.append(str);
            C0767k.m1807c(a, sb.toString());
            QuickAnalysisFeedback.this.m279I();
            String unused = QuickAnalysisFeedback.this.f304ev = str;
            if (QuickAnalysisFeedback.this.f304ev != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (QuickAnalysisFeedback.this.f306ey == null) {
                        Map unused2 = QuickAnalysisFeedback.this.f306ey = new HashMap();
                    } else {
                        QuickAnalysisFeedback.this.f306ey.clear();
                    }
                    Map unused3 = QuickAnalysisFeedback.this.m286a(jSONObject, (Map<String, String>) QuickAnalysisFeedback.this.f306ey);
                    QuickAnalysisFeedback.this.m287a((Map<String, String>) QuickAnalysisFeedback.this.f306ey);
                } catch (JSONException e) {
                    C0767k.m1820e(QuickAnalysisFeedback.this.TAG, "Exception:: ");
                    e.printStackTrace();
                }
            }
        }

        public String getMetadata() {
            return QuickAnalysisFeedback.this.f304ev;
        }

        public void setViewBoundariesImage(Bitmap bitmap) {
            Bitmap unused = QuickAnalysisFeedback.this.f305ew = bitmap;
        }
    }
}
