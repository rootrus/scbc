package com.pingan.p031ai;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pingan.p031ai.face.entity.PreviewFrame;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import com.pingan.p031ai.face.view.AuroraView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pingan.ai.e */
public class C1028e {

    /* renamed from: a */
    public List<byte[]> f2507a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public List<float[]> f2508b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    public byte[] f2509c = new byte[7];

    /* renamed from: d */
    public SparseIntArray f2510d = new SparseIntArray(5);

    /* renamed from: e */
    public List<Integer> f2511e = new ArrayList(7);

    /* renamed from: f */
    public float f2512f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: com.pingan.ai.e$a */
    public class C1029a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AuroraView f2513a;

        /* renamed from: b */
        public final /* synthetic */ Integer f2514b;

        public C1029a(C1028e eVar, AuroraView auroraView, Integer num) {
            this.f2513a = auroraView;
            this.f2514b = num;
        }

        public void run() {
            this.f2513a.setAuroraViewColor(this.f2514b.intValue());
        }
    }

    /* renamed from: a */
    public native float mo12551a(PreviewFrame previewFrame, Context context);

    /* renamed from: a */
    public final String mo12552a(Integer num) {
        return num != null ? num.intValue() == 0 ? "normal" : num.intValue() == -65536 ? "red" : num.intValue() == -16711936 ? "green" : num.intValue() == -16776961 ? "blue" : num.intValue() == -256 ? "yellow" : "null" : "null";
    }

    /* renamed from: a */
    public native void mo12553a(PreviewFrame previewFrame, float[] fArr, AuroraView auroraView);

    /* renamed from: a */
    public boolean mo12554a() {
        return this.f2507a.size() == 7;
    }

    /* renamed from: b */
    public final Integer mo12555b() {
        if (this.f2511e.size() == 0) {
            return null;
        }
        Integer remove = this.f2511e.remove(0);
        int size = 6 - this.f2511e.size();
        this.f2509c[size] = (byte) this.f2510d.indexOfValue(remove.intValue());
        StringBuilder sb = new StringBuilder();
        sb.append("indexAndColor, index=");
        sb.append(size);
        sb.append(", color=");
        sb.append(mo12552a(remove));
        sb.append(", codes=");
        sb.append(this.f2509c[size]);
        PaFaceLogger.error(sb.toString());
        return remove;
    }

    /* renamed from: c */
    public void mo12556c() {
        this.f2507a.clear();
        this.f2508b.clear();
        int i = 0;
        while (true) {
            byte[] bArr = this.f2509c;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.f2512f = BitmapDescriptorFactory.HUE_RED;
                this.f2511e.clear();
                this.f2511e.add(-65536);
                this.f2511e.add(-16711936);
                this.f2511e.add(-16776961);
                this.f2511e.add(-256);
                Collections.shuffle(this.f2511e);
                List<Integer> list = this.f2511e;
                list.add(list.get(2));
                List<Integer> list2 = this.f2511e;
                list2.add(list2.get(3));
                this.f2511e.add(0, 0);
                this.f2510d.clear();
                this.f2510d.append(0, 0);
                this.f2510d.append(1, -65536);
                this.f2510d.append(2, -16711936);
                this.f2510d.append(3, -16776961);
                this.f2510d.append(4, -256);
                return;
            }
        }
    }
}
