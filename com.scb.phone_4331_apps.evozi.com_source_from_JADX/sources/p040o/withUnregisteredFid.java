package p040o;

import p040o.FirebaseInstallations;
import p040o.FirebaseInstallationsException;
import p040o.TouchPointInstructionActivity;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.withUnregisteredFid */
public class withUnregisteredFid extends writeUInt64NoTag<C1422x86f1bdff> {
    public SimpleTimeLimiter IconCompatParcelizer;
    public final MapStyleOptions MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final C10849mapDifference write;

    @HmlPinActivity
    public withUnregisteredFid(RegularImmutableBiMap regularImmutableBiMap, MapStyleOptions mapStyleOptions, C10849mapDifference mapdifference) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = mapStyleOptions;
        this.write = mapdifference;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(SimpleTimeLimiter simpleTimeLimiter) {
        this.IconCompatParcelizer = simpleTimeLimiter;
        FirebaseInstallations$$Lambda$3 firebaseInstallations$$Lambda$3 = new FirebaseInstallations$$Lambda$3(simpleTimeLimiter);
        boolean z = true;
        if (this.RatingCompat != null) {
            firebaseInstallations$$Lambda$3.IconCompatParcelizer(this.RatingCompat);
        }
        if (simpleTimeLimiter.MediaMetadataCompat == null) {
            z = false;
        }
        write(z, new FirebaseInstallationsException(simpleTimeLimiter));
    }

    /* renamed from: o.withUnregisteredFid$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<TouchPointInstructionActivity.write> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(withUnregisteredFid withunregisteredfid, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            withUnregisteredFid.write(withUnregisteredFid.this);
            withUnregisteredFid withunregisteredfid = withUnregisteredFid.this;
            FirebaseInstallationsApi firebaseInstallationsApi = new FirebaseInstallationsApi(this, (TouchPointInstructionActivity.write) obj);
            if (withunregisteredfid.RatingCompat != null) {
                firebaseInstallationsApi.IconCompatParcelizer(withunregisteredfid.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            withUnregisteredFid.IconCompatParcelizer(withUnregisteredFid.this);
            boolean z = true;
            if (writeUInt64NoTag.IconCompatParcelizer(th)) {
                withUnregisteredFid withunregisteredfid = withUnregisteredFid.this;
                FirebaseInstallationsException.Status status = new FirebaseInstallationsException.Status(this);
                if (withunregisteredfid.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    status.IconCompatParcelizer(withunregisteredfid.RatingCompat);
                }
            } else if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
                withUnregisteredFid withunregisteredfid2 = withUnregisteredFid.this;
                FirebaseInstallations.C33772 r3 = new writeUInt64NoTag.IconCompatParcelizer(th) {
                    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.FirebaseInstallations.2.IconCompatParcelizer(java.lang.Object):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.FirebaseInstallations.2.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                if (withunregisteredfid2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r3.IconCompatParcelizer(withunregisteredfid2.RatingCompat);
                }
            } else if (writeUInt64NoTag.read(th) || !withUnregisteredFid.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                withUnregisteredFid withunregisteredfid3 = withUnregisteredFid.this;
                withunregisteredfid3.MediaBrowserCompat$ItemReceiver(withunregisteredfid3.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(withUnregisteredFid withunregisteredfid) {
        if (withunregisteredfid.RatingCompat != null) {
            withunregisteredfid.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(withUnregisteredFid withunregisteredfid) {
        if (withunregisteredfid.RatingCompat != null) {
            withunregisteredfid.RatingCompat.aj_();
        }
    }
}
