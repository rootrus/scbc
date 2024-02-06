package com.pingan.p031ai;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.pingan.p031ai.face.common.PaFaceConstants;
import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.utils.PaFaceLogger;

/* renamed from: com.pingan.ai.j */
public class C8672j {

    /* renamed from: a */
    public C1022d f5406a;

    /* renamed from: b */
    public LiveFaceConfig f5407b;

    /* renamed from: c */
    public SensorManager f5408c;

    /* renamed from: d */
    public Sensor f5409d;

    /* renamed from: e */
    public float f5410e = 10.0f;

    /* renamed from: f */
    public SensorEventListener f5411f = new C8673a();

    /* renamed from: com.pingan.ai.j$a */
    public class C8673a implements SensorEventListener {
        public C8673a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float unused = C8672j.this.f5410e = sensorEvent.values[1];
        }
    }

    public C8672j(C1022d dVar, LiveFaceConfig liveFaceConfig) {
        this.f5406a = dVar;
        this.f5407b = liveFaceConfig;
    }

    /* renamed from: b */
    public void mo55570b() {
        try {
            if (this.f5408c != null) {
                this.f5408c.unregisterListener(this.f5411f, this.f5409d);
            }
        } catch (Exception e) {
            C1022d dVar = this.f5406a;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception:");
            sb.append(C1021c.m2615a());
            sb.append(" gravity:poseError,unregister=");
            sb.append(e.getMessage());
            dVar.mo12496a(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GRAVITY_POSE_ERROR  unregister=");
            sb2.append(e.getMessage());
            PaFaceLogger.error(sb2.toString());
        } finally {
            this.f5409d = null;
            this.f5408c = null;
            this.f5411f = null;
        }
    }

    /* renamed from: a */
    public void mo55568a(Context context) {
        try {
            if (this.f5408c == null) {
                this.f5408c = (SensorManager) context.getApplicationContext().getSystemService("sensor");
            }
            if (this.f5408c == null) {
                this.f5407b.setGravitySwitch(false);
                return;
            }
            if (this.f5409d == null) {
                this.f5409d = this.f5408c.getDefaultSensor(9);
            }
            if (this.f5409d == null) {
                this.f5407b.setGravitySwitch(false);
            } else {
                this.f5408c.registerListener(this.f5411f, this.f5409d, 1);
            }
        } catch (Exception e) {
            C1022d dVar = this.f5406a;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception:");
            sb.append(C1021c.m2615a());
            sb.append(" sensorManager init Exception : ");
            sb.append(e.getMessage());
            dVar.mo12496a(sb.toString());
            this.f5407b.setGravitySwitch(false);
        }
    }

    /* renamed from: a */
    public boolean mo55569a() {
        LiveFaceConfig liveFaceConfig = this.f5407b;
        if (liveFaceConfig == null || !liveFaceConfig.isGravitySwitch() || this.f5410e > this.f5407b.getGravityThr()) {
            return false;
        }
        this.f5406a.mo12506c(this.f5406a.mo12487a((int) PaFaceConstants.EnvironmentalTips.GRAVITY_POSE_ERROR));
        C1022d dVar = this.f5406a;
        StringBuilder sb = new StringBuilder();
        sb.append("GravityPossError:");
        sb.append(C1021c.m2615a());
        sb.append(" gravity:poseError,gravityY=");
        sb.append(this.f5410e);
        dVar.mo12496a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GRAVITY_POSE_ERROR  gravityY=");
        sb2.append(this.f5410e);
        PaFaceLogger.error(sb2.toString());
        return true;
    }
}
