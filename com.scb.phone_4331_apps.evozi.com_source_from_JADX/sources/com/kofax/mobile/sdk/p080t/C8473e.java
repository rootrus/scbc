package com.kofax.mobile.sdk.p080t;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.android.abc.document.Element;
import com.kofax.android.abc.document.Field;
import java.util.ArrayList;
import org.bouncycastle.asn1.x509.DisplayText;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.kofax.mobile.sdk.t.e */
class C8473e {

    /* renamed from: NJ */
    private final C8476b f5052NJ = new C8476b();

    C8473e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo55378b(Bitmap bitmap, String str) {
        return m5107a(bitmap, new C8475a(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo55376a(Bitmap bitmap, Iterable<Element> iterable) {
        Bitmap j = m5111j(bitmap);
        Canvas canvas = new Canvas(j);
        for (Element rectangle : iterable) {
            canvas.drawRect(rectangle.getRectangle(), this.f5052NJ.f5054NL);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo55377b(Bitmap bitmap, Iterable<Field> iterable) {
        Bitmap j = m5111j(bitmap);
        Canvas canvas = new Canvas(j);
        for (Field a : iterable) {
            m5108a(canvas, a);
        }
        return j;
    }

    /* renamed from: c */
    public Bitmap mo55379c(Bitmap bitmap, Iterable<Element> iterable) {
        Bitmap a = mo55376a(bitmap, iterable);
        Canvas canvas = new Canvas(a);
        for (Element next : iterable) {
            Rect rectangle = next.getRectangle();
            canvas.drawRect(rectangle, this.f5052NJ.f5055NM);
            m5109a(canvas, next.getToken(), rectangle, this.f5052NJ.f5056NN);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Bitmap mo55380d(Bitmap bitmap, Iterable<Field> iterable) {
        Bitmap b = mo55377b(bitmap, iterable);
        Canvas canvas = new Canvas(b);
        for (Field next : iterable) {
            Rect rectangle = next.getRectangle();
            canvas.drawRect(rectangle, this.f5052NJ.f5055NM);
            m5109a(canvas, next.getValue(), rectangle, this.f5052NJ.f5056NN);
            m5108a(canvas, next);
        }
        return b;
    }

    /* renamed from: a */
    private Bitmap m5107a(Bitmap bitmap, C8475a aVar) {
        Bitmap j = m5111j(bitmap);
        Canvas canvas = new Canvas(j);
        for (Rect drawRect : aVar.mo55383ov()) {
            canvas.drawRect(drawRect, this.f5052NJ.f5054NL);
        }
        return j;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m5108a(Canvas canvas, Field field) {
        Rect rectangle = field.getRectangle();
        canvas.drawRect(rectangle, this.f5052NJ.f5054NL);
        Paint paint = this.f5052NJ.f5056NN;
        float textSize = paint.getTextSize();
        try {
            paint.setTextSize((float) (canvas.getWidth() / DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE));
            canvas.drawText(field.getLabel(), (float) rectangle.left, (float) rectangle.top, paint);
            paint.setTextSize(textSize);
        } catch (Throwable th) {
            paint.setTextSize(textSize);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m5109a(Canvas canvas, String str, Rect rect, Paint paint) {
        float textSize = paint.getTextSize();
        float textScaleX = paint.getTextScaleX();
        try {
            Path path = new Path();
            RectF rectF = new RectF();
            paint.setTextSize((float) rect.height());
            m5110a(paint, str, path, rectF);
            paint.setTextSize((paint.getTextSize() * ((float) rect.height())) / rectF.height());
            m5110a(paint, str, path, rectF);
            paint.setTextScaleX((paint.getTextScaleX() * ((float) rect.width())) / rectF.width());
            m5110a(paint, str, path, rectF);
            canvas.drawText(str, ((float) rect.left) + (((((float) rect.width()) - rectF.width()) / 2.0f) - rectF.left), ((float) rect.bottom) + (((-(((float) rect.height()) - rectF.height())) / 2.0f) - rectF.bottom), paint);
        } finally {
            paint.setTextSize(textSize);
            paint.setTextScaleX(textScaleX);
        }
    }

    /* renamed from: a */
    private static void m5110a(Paint paint, String str, Path path, RectF rectF) {
        paint.getTextPath(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, path);
        path.computeBounds(rectF, true);
    }

    /* renamed from: j */
    private static Bitmap m5111j(Bitmap bitmap) {
        return bitmap.copy(bitmap.getConfig(), true);
    }

    /* renamed from: com.kofax.mobile.sdk.t.e$b */
    static class C8476b {

        /* renamed from: NL */
        final Paint f5054NL;

        /* renamed from: NM */
        final Paint f5055NM;

        /* renamed from: NN */
        final Paint f5056NN;

        private C8476b() {
            Paint paint = new Paint(1);
            this.f5054NL = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f5054NL.setColor(-65536);
            Paint paint2 = new Paint(1);
            this.f5055NM = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f5055NM.setColor(-1);
            Paint paint3 = new Paint(1);
            this.f5056NN = paint3;
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f5056NN.setLinearText(true);
            this.f5056NN.setSubpixelText(true);
            this.f5056NN.setColor(-65536);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.t.e$a */
    static class C8475a {

        /* renamed from: NK */
        final JSONObject f5053NK;

        C8475a(String str) {
            try {
                this.f5053NK = new JSONObject(str).getJSONObject("Front Side");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ot */
        public Iterable<JSONObject> mo55381ot() {
            return m5117a(this.f5053NK.optJSONObject("Text Lines").optJSONArray("Lines"));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ou */
        public Iterable<JSONObject> mo55382ou() {
            ArrayList arrayList = new ArrayList();
            for (JSONObject b : mo55381ot()) {
                for (JSONObject add : m5118b(b)) {
                    arrayList.add(add);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ov */
        public Iterable<Rect> mo55383ov() {
            ArrayList arrayList = new ArrayList();
            for (JSONObject c : mo55382ou()) {
                arrayList.add(m5119c(c));
            }
            return arrayList;
        }

        /* renamed from: a */
        static Iterable<JSONObject> m5117a(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optJSONObject(i));
            }
            return arrayList;
        }

        /* renamed from: b */
        static Iterable<JSONObject> m5118b(JSONObject jSONObject) {
            return m5117a(jSONObject.optJSONArray("Words"));
        }

        /* renamed from: c */
        static Rect m5119c(JSONObject jSONObject) {
            return new Rect(jSONObject.optInt("TLx"), jSONObject.optInt("TLy"), jSONObject.optInt("BRx"), jSONObject.optInt("BRy"));
        }
    }
}
