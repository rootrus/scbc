package p040o;

import android.graphics.Bitmap;
import p040o.AppMeasurement;
import p040o.C3077xfe724d07;
import p040o.C4946m;
import p040o.GoogleMap;
import p040o.getBottomEdgeTearHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.p */
public final /* synthetic */ class C10100p implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ C10100p MediaBrowserCompat$ItemReceiver = new C10100p();

    /* renamed from: o.p$b */
    public final /* synthetic */ class C5122b implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C5122b IconCompatParcelizer = new C5122b();

        private /* synthetic */ C5122b() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getCarbonStrip$MediaBrowserCompat$ItemReceiver) obj).read();
        }
    }

    private /* synthetic */ C10100p() {
    }

    public final void IconCompatParcelizer(Object obj) {
        C9771x3ae934ff.IconCompatParcelizer((Check) obj);
    }

    /* renamed from: o.p$a */
    public class C5120a extends writeUInt64NoTag<getBottomEdgeTearHeight.write> {
        public final AppMeasurement.ConditionalUserProperty IconCompatParcelizer;
        C3077xfe724d07.Builder MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public final toUriString read;
        public boolean write = false;

        @HmlPinActivity
        C5120a(AppMeasurement.ConditionalUserProperty conditionalUserProperty, toUriString touristring, RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
            this.IconCompatParcelizer = conditionalUserProperty;
            this.read = touristring;
        }

        /* renamed from: o.p$a$write */
        public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMyLocationClickListener> {
            private write() {
            }

            public /* synthetic */ write(C5120a aVar, byte b) {
                this();
            }

            public final /* synthetic */ void onNext(Object obj) {
                GoogleMap.OnMyLocationClickListener onMyLocationClickListener = (GoogleMap.OnMyLocationClickListener) obj;
                if ((C5120a.this.RatingCompat != null) && C51214.MediaBrowserCompat$ItemReceiver[onMyLocationClickListener.MediaBrowserCompat$ItemReceiver.ordinal()] == 1) {
                    C5120a.MediaBrowserCompat$ItemReceiver(C5120a.this, C5120a.this.read.IconCompatParcelizer(onMyLocationClickListener, true));
                }
            }

            public final void onComplete() {
                C5120a.MediaBrowserCompat$ItemReceiver(C5120a.this);
                boolean unused = C5120a.this.write = false;
            }

            public final void onError(Throwable th) {
                C5120a.MediaBrowserCompat$CustomActionResultReceiver(C5120a.this);
                if (!C5120a.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                    C5120a aVar = C5120a.this;
                    C4887kA kAVar = new C4887kA(this, th);
                    if (aVar.RatingCompat != null) {
                        kAVar.IconCompatParcelizer(aVar.RatingCompat);
                    }
                }
                boolean unused = C5120a.this.write = false;
            }
        }

        /* renamed from: o.p$a$4 */
        static /* synthetic */ class C51214 {
            static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

            /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
            static {
                /*
                    o.onPoiClick[] r0 = p040o.onPoiClick.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    MediaBrowserCompat$ItemReceiver = r0
                    o.onPoiClick r1 = p040o.onPoiClick.PROMPT_PAY_QR_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
                L_0x0012:
                    int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                    o.onPoiClick r1 = p040o.onPoiClick.NO_PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x001d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
                L_0x001d:
                    int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                    o.onPoiClick r1 = p040o.onPoiClick.PROMPT_PAY_QR_EDIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
                L_0x0028:
                    int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                    o.onPoiClick r1 = p040o.onPoiClick.NO_RTP     // Catch:{ NoSuchFieldError -> 0x0033 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
                L_0x0033:
                    int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                    o.onPoiClick r1 = p040o.onPoiClick.HAVE_PROMPTPAY_WITH_RTP     // Catch:{ NoSuchFieldError -> 0x003e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
                L_0x003e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.C10100p.C5120a.C51214.<clinit>():void");
            }
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5120a aVar) {
            if (aVar.RatingCompat != null) {
                aVar.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5120a aVar) {
            if (aVar.RatingCompat != null) {
                aVar.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5120a aVar, C3077xfe724d07.Builder builder) {
            aVar.MediaBrowserCompat$ItemReceiver = builder;
            boolean z = true;
            if (aVar.RatingCompat != null) {
                C4946m.C49471 r3 = new writeUInt64NoTag.IconCompatParcelizer(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(builder.MediaBrowserCompat$CustomActionResultReceiver, builder.IconCompatParcelizer, 5.0d)) {
                    private final /* synthetic */ Bitmap MediaBrowserCompat$ItemReceiver;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.m.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.m.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                if (aVar.RatingCompat != null) {
                    r3.IconCompatParcelizer(aVar.RatingCompat);
                }
                C4890kD kDVar = new C4890kD(builder);
                if (aVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kDVar.IconCompatParcelizer(aVar.RatingCompat);
                }
            }
        }
    }
}
