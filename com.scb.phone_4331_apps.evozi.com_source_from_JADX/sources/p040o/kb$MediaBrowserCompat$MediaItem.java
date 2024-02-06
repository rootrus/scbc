package p040o;

import p040o.C4715h;
import p040o.writeUInt64NoTag;

/* renamed from: o.kb$MediaBrowserCompat$MediaItem */
final class kb$MediaBrowserCompat$MediaItem extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<newLatLngBoundsWithSize> {
    final /* synthetic */ C4895kb read;
    final parseEventSignal write;

    public final /* synthetic */ void onNext(Object obj) {
        newLatLngBoundsWithSize newlatlngboundswithsize = (newLatLngBoundsWithSize) obj;
        boolean z = true;
        if (this.read.RatingCompat != null) {
            double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.write.MediaSessionCompat$QueueItem).doubleValue();
            if (doubleValue >= newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver.doubleValue()) {
                doubleValue = newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
            }
            newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(doubleValue);
            C4895kb kbVar = this.read;
            C4855jQ jQVar = new C4855jQ(this);
            if (kbVar.RatingCompat != null) {
                jQVar.IconCompatParcelizer(kbVar.RatingCompat);
            }
            if (!this.write.MediaBrowserCompat$ItemReceiver()) {
                C4895kb kbVar2 = this.read;
                C4854jP jPVar = new C4854jP(this, newlatlngboundswithsize);
                if (kbVar2.RatingCompat != null) {
                    jPVar.IconCompatParcelizer(kbVar2.RatingCompat);
                }
            } else {
                C4895kb kbVar3 = this.read;
                C4715h.C47227 r3 = new writeUInt64NoTag.IconCompatParcelizer(newlatlngboundswithsize) {
                    private final /* synthetic */ newLatLngBoundsWithSize read;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.7.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.7.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                if (kbVar3.RatingCompat != null) {
                    r3.IconCompatParcelizer(kbVar3.RatingCompat);
                }
            }
        }
        C4895kb kbVar4 = this.read;
        C4848jF jFVar = C4848jF.write;
        if (kbVar4.RatingCompat == null) {
            z = false;
        }
        if (z) {
            jFVar.IconCompatParcelizer(kbVar4.RatingCompat);
        }
    }

    public kb$MediaBrowserCompat$MediaItem(C4895kb kbVar, parseEventSignal parseeventsignal) {
        this.read = kbVar;
        this.write = parseeventsignal;
    }

    public final void onComplete() {
        C4895kb kbVar = this.read;
        C4848jF jFVar = C4848jF.write;
        if (kbVar.RatingCompat != null) {
            jFVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        C4895kb kbVar = this.read;
        C4852jN jNVar = new C4852jN(this, th);
        if (kbVar.RatingCompat != null) {
            jNVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
    }
}
