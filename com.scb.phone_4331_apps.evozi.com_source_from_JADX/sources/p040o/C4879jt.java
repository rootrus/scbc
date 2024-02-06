package p040o;

import p040o.AppMeasurement;
import p040o.C3077xfe724d07;
import p040o.C4783i;
import p040o.C9839a;
import p040o.GoogleMap;
import p040o.access$2300;
import p040o.getBottomEdgeTearHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.jt */
public class C4879jt extends writeUInt64NoTag<getBottomEdgeTearHeight.IconCompatParcelizer> {
    public final AppMeasurement.ConditionalUserProperty IconCompatParcelizer;
    private final toUriString MediaBrowserCompat$ItemReceiver;
    public boolean write = false;

    @HmlPinActivity
    public C4879jt(AppMeasurement.ConditionalUserProperty conditionalUserProperty, toUriString touristring, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = conditionalUserProperty;
        this.MediaBrowserCompat$ItemReceiver = touristring;
    }

    /* renamed from: o.jt$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMyLocationClickListener> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C4879jt jtVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            GoogleMap.OnMyLocationClickListener onMyLocationClickListener = (GoogleMap.OnMyLocationClickListener) obj;
            if (C4879jt.this.RatingCompat != null) {
                C4879jt.MediaBrowserCompat$CustomActionResultReceiver(C4879jt.this, onMyLocationClickListener);
            }
        }

        public final void onComplete() {
            C4879jt.write(C4879jt.this);
            boolean unused = C4879jt.this.write = false;
        }

        public final void onError(Throwable th) {
            C4879jt.MediaBrowserCompat$ItemReceiver(C4879jt.this);
            if (!C4879jt.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C4879jt jtVar = C4879jt.this;
                C4921kx kxVar = new C4921kx(this, th);
                if (jtVar.RatingCompat != null) {
                    kxVar.IconCompatParcelizer(jtVar.RatingCompat);
                }
            }
            boolean unused = C4879jt.this.write = false;
        }
    }

    /* renamed from: o.jt$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMyLocationClickListener> {
        public final void onComplete() {
        }

        private read() {
        }

        public /* synthetic */ read(C4879jt jtVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((GoogleMap.OnMyLocationClickListener) obj) != null) {
                C4879jt jtVar = C4879jt.this;
                C9839a.C9840a aVar = C9839a.C9840a.read;
                if (jtVar.RatingCompat != null) {
                    aVar.IconCompatParcelizer(jtVar.RatingCompat);
                }
                C4879jt.MediaBrowserCompat$CustomActionResultReceiver(C4879jt.this);
            }
        }

        public final void onError(Throwable th) {
            if (!C4879jt.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C4879jt jtVar = C4879jt.this;
                jtVar.MediaBrowserCompat$ItemReceiver(jtVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                C4879jt jtVar2 = C4879jt.this;
                C10033ky kyVar = C10033ky.IconCompatParcelizer;
                if (jtVar2.RatingCompat != null) {
                    kyVar.IconCompatParcelizer(jtVar2.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4879jt jtVar) {
        if (jtVar.RatingCompat != null) {
            jtVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4879jt jtVar) {
        if (jtVar.RatingCompat != null) {
            jtVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4879jt jtVar) {
        if (jtVar.RatingCompat != null) {
            jtVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4879jt jtVar, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        C4783i.C47852 r1 = new writeUInt64NoTag.IconCompatParcelizer(jtVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(onMyLocationClickListener, jtVar.IconCompatParcelizer.write.setItemInvoker())) {
            private final /* synthetic */ C3077xfe724d07.Builder MediaBrowserCompat$CustomActionResultReceiver;

            public final void IconCompatParcelizer(
/*
Method generation error in method: o.i.2.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.i.2.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        };
        if (jtVar.RatingCompat != null) {
            r1.IconCompatParcelizer(jtVar.RatingCompat);
        }
    }
}
