package p040o;

import p040o.C4365ee;
import p040o.writeUInt64NoTag;

/* renamed from: o.mX$MediaBrowserCompat$ItemReceiver */
public final class mX$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onExitAmbient> {
    final /* synthetic */ C4960mX write;

    private mX$MediaBrowserCompat$ItemReceiver(C4960mX mXVar) {
        this.write = mXVar;
    }

    public /* synthetic */ mX$MediaBrowserCompat$ItemReceiver(C4960mX mXVar, byte b) {
        this(mXVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        int i;
        int i2;
        onExitAmbient onexitambient = (onExitAmbient) obj;
        boolean z = false;
        if (this.write.RatingCompat != null) {
            if (onexitambient.write > 0) {
                i2 = onexitambient.write;
                i = onexitambient.MediaBrowserCompat$CustomActionResultReceiver + 1;
            } else {
                i = onexitambient.MediaBrowserCompat$CustomActionResultReceiver;
                i2 = 1;
            }
            if (this.write.read == 1) {
                C4960mX mXVar = this.write;
                C4365ee.C43661 r5 = new writeUInt64NoTag.IconCompatParcelizer(onexitambient) {
                    private final /* synthetic */ onExitAmbient MediaBrowserCompat$ItemReceiver;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.ee.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ee.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                if (mXVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    r5.IconCompatParcelizer(mXVar.RatingCompat);
                }
                int unused = this.write.read = i;
                int unused2 = this.write.MediaBrowserCompat$SearchResultReceiver = i2;
            } else if (this.write.read > onexitambient.MediaBrowserCompat$CustomActionResultReceiver || this.write.read > onexitambient.write) {
                C4960mX mXVar2 = this.write;
                C5090oh ohVar = new C5090oh(onexitambient);
                if (mXVar2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    ohVar.IconCompatParcelizer(mXVar2.RatingCompat);
                }
                int unused3 = this.write.MediaBrowserCompat$SearchResultReceiver = 1;
            } else {
                C4960mX mXVar3 = this.write;
                C5089og ogVar = new C5089og(this, onexitambient);
                if (mXVar3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    ogVar.IconCompatParcelizer(mXVar3.RatingCompat);
                }
                int unused4 = this.write.read = i;
                int unused5 = this.write.MediaBrowserCompat$SearchResultReceiver = i2;
            }
            C4960mX.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }

    public final void onComplete() {
        C4960mX.MediaMetadataCompat(this.write);
    }

    public final void onError(Throwable th) {
        if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            boolean z = true;
            if (this.write.RatingCompat != null) {
                C4960mX mXVar = this.write;
                C5086ob obVar = new C5086ob(this, th);
                if (mXVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    obVar.IconCompatParcelizer(mXVar.RatingCompat);
                }
            }
        }
    }
}
