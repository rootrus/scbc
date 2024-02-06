package p040o;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import p040o.zzma;

/* renamed from: o.validateUplo */
public class validateUplo {
    public static final String IconCompatParcelizer = validateUplo.class.getSimpleName();
    public zzma MediaBrowserCompat$CustomActionResultReceiver;
    public final Handler.Callback MediaBrowserCompat$ItemReceiver = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_decode) {
                validateUplo.MediaBrowserCompat$ItemReceiver(validateUplo.this, (zzma.IconCompatParcelizer) message.obj);
                return true;
            } else if (message.what != rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_preview_failed) {
                return true;
            } else {
                validateUplo.IconCompatParcelizer(validateUplo.this);
                return true;
            }
        }
    };
    public final IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory MediaBrowserCompat$MediaItem = new IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(zzma.IconCompatParcelizer iconCompatParcelizer) {
            synchronized (validateUplo.this.MediaBrowserCompat$SearchResultReceiver) {
                if (validateUplo.this.MediaDescriptionCompat) {
                    validateUplo.this.RatingCompat.obtainMessage(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_decode, iconCompatParcelizer).sendToTarget();
                }
            }
        }

        public final void IconCompatParcelizer() {
            synchronized (validateUplo.this.MediaBrowserCompat$SearchResultReceiver) {
                if (validateUplo.this.MediaDescriptionCompat) {
                    validateUplo.this.RatingCompat.obtainMessage(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_preview_failed).sendToTarget();
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public final Object MediaBrowserCompat$SearchResultReceiver = new Object();
    public boolean MediaDescriptionCompat = false;
    public HandlerThread MediaMetadataCompat;
    private Handler MediaSessionCompat$ResultReceiverWrapper;
    public Handler RatingCompat;
    public CGERU read;
    public Rect write;

    public validateUplo(CGERU cgeru, zzma zzma, Handler handler) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.read = cgeru;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzma;
            this.MediaSessionCompat$ResultReceiverWrapper = handler;
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(p040o.validateUplo r22, p040o.zzma.IconCompatParcelizer r23) {
        /*
            r0 = r22
            r1 = r23
            long r2 = java.lang.System.currentTimeMillis()
            android.graphics.Rect r4 = r0.write
            r1.MediaBrowserCompat$ItemReceiver = r4
            android.graphics.Rect r4 = r0.write
            r5 = 0
            if (r4 != 0) goto L_0x0014
            r4 = r5
            goto L_0x00cb
        L_0x0014:
            int r4 = r1.MediaDescriptionCompat
            byte[] r6 = r1.IconCompatParcelizer
            int r7 = r1.write
            int r8 = r1.read
            r9 = 90
            r10 = 180(0xb4, float:2.52E-43)
            r11 = 0
            r12 = 1
            if (r4 == r9) goto L_0x005a
            if (r4 == r10) goto L_0x0049
            r9 = 270(0x10e, float:3.78E-43)
            if (r4 == r9) goto L_0x002c
            r15 = r6
            goto L_0x0076
        L_0x002c:
            int r4 = r7 * r8
            byte[] r9 = new byte[r4]
            int r4 = r4 - r12
            r13 = r11
        L_0x0032:
            if (r13 >= r7) goto L_0x0047
            int r14 = r8 + -1
        L_0x0036:
            if (r14 < 0) goto L_0x0044
            int r15 = r14 * r7
            int r15 = r15 + r13
            byte r15 = r6[r15]
            r9[r4] = r15
            int r4 = r4 + -1
            int r14 = r14 + -1
            goto L_0x0036
        L_0x0044:
            int r13 = r13 + 1
            goto L_0x0032
        L_0x0047:
            r15 = r9
            goto L_0x0076
        L_0x0049:
            int r7 = r7 * r8
            byte[] r4 = new byte[r7]
            int r8 = r7 + -1
            r9 = r11
        L_0x004f:
            if (r9 >= r7) goto L_0x0075
            byte r13 = r6[r9]
            r4[r8] = r13
            int r8 = r8 + -1
            int r9 = r9 + 1
            goto L_0x004f
        L_0x005a:
            int r4 = r7 * r8
            byte[] r4 = new byte[r4]
            r9 = r11
            r13 = r9
        L_0x0060:
            if (r9 >= r7) goto L_0x0075
            int r14 = r8 + -1
        L_0x0064:
            if (r14 < 0) goto L_0x0072
            int r15 = r14 * r7
            int r15 = r15 + r9
            byte r15 = r6[r15]
            r4[r13] = r15
            int r13 = r13 + 1
            int r14 = r14 + -1
            goto L_0x0064
        L_0x0072:
            int r9 = r9 + 1
            goto L_0x0060
        L_0x0075:
            r15 = r4
        L_0x0076:
            int r4 = r1.MediaDescriptionCompat
            int r4 = r4 % r10
            if (r4 == 0) goto L_0x007c
            r11 = r12
        L_0x007c:
            if (r11 == 0) goto L_0x00a5
            o.rsnIncTypeCreate r4 = new o.rsnIncTypeCreate
            int r6 = r1.read
            int r7 = r1.write
            android.graphics.Rect r8 = r1.MediaBrowserCompat$ItemReceiver
            int r8 = r8.left
            android.graphics.Rect r9 = r1.MediaBrowserCompat$ItemReceiver
            int r9 = r9.top
            android.graphics.Rect r10 = r1.MediaBrowserCompat$ItemReceiver
            int r20 = r10.width()
            android.graphics.Rect r10 = r1.MediaBrowserCompat$ItemReceiver
            int r21 = r10.height()
            r14 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00cb
        L_0x00a5:
            o.rsnIncTypeCreate r4 = new o.rsnIncTypeCreate
            int r6 = r1.write
            int r7 = r1.read
            android.graphics.Rect r8 = r1.MediaBrowserCompat$ItemReceiver
            int r8 = r8.left
            android.graphics.Rect r9 = r1.MediaBrowserCompat$ItemReceiver
            int r9 = r9.top
            android.graphics.Rect r10 = r1.MediaBrowserCompat$ItemReceiver
            int r20 = r10.width()
            android.graphics.Rect r10 = r1.MediaBrowserCompat$ItemReceiver
            int r21 = r10.height()
            r14 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
        L_0x00cb:
            if (r4 == 0) goto L_0x00d3
            o.zzma r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r5 = r5.MediaBrowserCompat$CustomActionResultReceiver((p040o.rsnIncElementCreate) r4)
        L_0x00d3:
            if (r5 == 0) goto L_0x0112
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = IconCompatParcelizer
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found barcode in "
            r8.append(r9)
            long r6 = r6 - r2
            r8.append(r6)
            java.lang.String r2 = " ms"
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            android.util.Log.d(r4, r2)
            android.os.Handler r2 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == 0) goto L_0x011f
            o.zzlr$MediaBrowserCompat$ItemReceiver r2 = new o.zzlr$MediaBrowserCompat$ItemReceiver
            r2.<init>(r5, r1)
            android.os.Handler r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r3 = p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_decode_succeeded
            android.os.Message r1 = android.os.Message.obtain(r1, r3, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1.setData(r2)
            r1.sendToTarget()
            goto L_0x011f
        L_0x0112:
            android.os.Handler r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r1 == 0) goto L_0x011f
            int r2 = p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_decode_failed
            android.os.Message r1 = android.os.Message.obtain(r1, r2)
            r1.sendToTarget()
        L_0x011f:
            android.os.Handler r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r1 == 0) goto L_0x0137
            o.zzma r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<o.rsnScriptForEach> r1 = r1.IconCompatParcelizer
            r2.<init>(r1)
            android.os.Handler r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r3 = p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_possible_result_points
            android.os.Message r1 = android.os.Message.obtain(r1, r3, r2)
            r1.sendToTarget()
        L_0x0137:
            o.CGERU r1 = r0.read
            o.IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory r0 = r0.MediaBrowserCompat$MediaItem
            android.os.Handler r2 = r1.MediaDescriptionCompat
            o.CGERU$1 r3 = new o.CGERU$1
            r3.<init>(r0)
            r2.post(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.validateUplo.MediaBrowserCompat$ItemReceiver(o.validateUplo, o.zzma$IconCompatParcelizer):void");
    }

    static /* synthetic */ void IconCompatParcelizer(validateUplo validateuplo) {
        CGERU cgeru = validateuplo.read;
        cgeru.MediaDescriptionCompat.post(new Runnable(validateuplo.MediaBrowserCompat$MediaItem) {
            final /* synthetic */ IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory IconCompatParcelizer;

            public final void run(
/*
Method generation error in method: o.CGERU.1.run():void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CGERU.1.run():void, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
        });
    }

    public final void IconCompatParcelizer() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            synchronized (this.MediaBrowserCompat$SearchResultReceiver) {
                this.MediaDescriptionCompat = false;
                this.RatingCompat.removeCallbacksAndMessages((Object) null);
                this.MediaMetadataCompat.quit();
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
