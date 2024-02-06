package com.kofax.mobile.sdk.p025n;

import com.kofax.mobile.sdk.p026o.C0982b;
import java.util.Locale;

/* renamed from: com.kofax.mobile.sdk.n.c */
public class C0971c implements C0982b {

    /* renamed from: HW */
    private static final String f2355HW = "<?xml version='1.0' encoding='iso-8859-1'?><Configuration name='Cadence'>  <Section name='DocumentTracker'>    <Parm name='DetectorConfig' type='DetectorConfig' value='GenericSingleConfig'/>    <Parm name='MaxTrackedDocuments' type='int' value='1'/>    <Parm name='FrameHistorySize' type='int' value='50'/>  </Section>  <Section name='GenericSingleConfig'>    <Parm name='DetectorType' type='string' value='GenericSingleDetector'/>    <Parm name='SegmentationConfig' type='string' value='GenericSingleSegmentationConfig'/>    <Parm name='RelativeAreaRatio1' type='float' value='0.005'/>    <Parm name='RelativeAreaRatio2' type='float' value='%f'/>    <Parm name='IsCornerDetection' type='bool' value='yes'/>    <Parm name='RelativeImageMarginX' type='float' value='0.0'/>    <Parm name='RelativeImageMarginY' type='float' value='0.0'/>  </Section>  <Section name='GenericSingleSegmentationConfig'>    <Parm name='EdgeType' type='string' value='%s'/>    <Parm name='ScaleFactor' type='float' value='%f'/>    <Parm name='SmoothingSize' type='int' value='3'/>    <Parm name='FilterSize' type='int' value='3'/>    <Parm name='EdgeLowThreshold' type='int' value='30'/>    <Parm name='EdgeHighThreshold' type='int' value='255'/>    <Parm name='ContrastThreshold' type='int' value='50'/>  </Section></Configuration>";

    /* renamed from: HX */
    private float f2356HX = 0.2f;

    /* renamed from: HY */
    private C0972a f2357HY = C0972a.MAIN_COMPONENT;

    /* renamed from: HZ */
    private float f2358HZ = 0.2f;

    /* renamed from: mc */
    public String mo12383mc() {
        return "DocumentTracker";
    }

    /* renamed from: i */
    public void mo12379i(float f) {
        this.f2356HX = f;
    }

    /* renamed from: ma */
    public C0972a mo12381ma() {
        return this.f2357HY;
    }

    /* renamed from: a */
    public void mo12378a(C0972a aVar) {
        this.f2357HY = aVar;
    }

    /* renamed from: j */
    public void mo12380j(float f) {
        this.f2358HZ = f;
    }

    /* renamed from: mb */
    public String mo12382mb() {
        return String.format(Locale.US, f2355HW, new Object[]{Float.valueOf(this.f2356HX), this.f2357HY.name, Float.valueOf(this.f2358HZ)});
    }

    /* renamed from: com.kofax.mobile.sdk.n.c$a */
    public enum C0972a {
        MAIN_COMPONENT("MainComponent"),
        MAX_COLOR_VARIATION("MaxColorVariation"),
        COLOR_EDGE("ColorEdge");
        

        /* renamed from: Ie */
        private static final C0972a[] f2362Ie = null;
        /* access modifiers changed from: private */
        public final String name;

        static {
            f2362Ie = values();
        }

        private C0972a(String str) {
            this.name = str;
        }

        /* renamed from: md */
        public final C0972a mo12384md() {
            return f2362Ie[(ordinal() + 1) % f2362Ie.length];
        }
    }
}
