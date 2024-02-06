package p040o;

import android.text.TextUtils;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AppMeasurementSdk;
import p040o.C10100p;
import p040o.C4715h;
import p040o.C4895kb;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.kb */
public class C4895kb extends writeUInt64NoTag<getCarbonStrip.IconCompatParcelizer> {
    public final include IconCompatParcelizer;
    public CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver;
    public final AbstractService MediaBrowserCompat$MediaItem;
    public setZoomControlsEnabled MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final AppMeasurementSdk.OnEventListener f2883x50fd9e4a;
    public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder MediaDescriptionCompat;
    public final getAppIdOrigin MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final isCancelled MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final lessThanUnsigned MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final UnsignedBytes MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public final notifyFailed ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final SignedBytes PlaybackStateCompat;
    /* access modifiers changed from: private */
    public final callWithTimeout PlaybackStateCompat$CustomAction;
    public CrashlyticsReport.Session.Event.Application.Execution read;
    /* access modifiers changed from: private */
    public final notifyStarted setHasDecor;
    public String write;

    @HmlPinActivity
    public C4895kb(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener, callWithTimeout callwithtimeout, include include, isCancelled iscancelled, lessThanUnsigned lessthanunsigned, notifyStarted notifystarted, UnsignedBytes unsignedBytes, getAppIdOrigin getappidorigin, SignedBytes signedBytes, notifyFailed notifyfailed, AbstractService abstractService) {
        super(regularImmutableBiMap);
        this.f2883x50fd9e4a = onEventListener;
        this.PlaybackStateCompat$CustomAction = callwithtimeout;
        this.IconCompatParcelizer = include;
        this.MediaSessionCompat$QueueItem = iscancelled;
        this.MediaSessionCompat$ResultReceiverWrapper = lessthanunsigned;
        this.setHasDecor = notifystarted;
        this.MediaSessionCompat$Token = unsignedBytes;
        this.MediaMetadataCompat = getappidorigin;
        this.PlaybackStateCompat = signedBytes;
        this.ParcelableVolumeInfo = notifyfailed;
        this.MediaBrowserCompat$MediaItem = abstractService;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder2;
        this.MediaDescriptionCompat = builder;
        boolean z = true;
        if ((this.RatingCompat != null) && (builder2 = this.MediaDescriptionCompat) != null) {
            this.write = builder2.MediaBrowserCompat$ItemReceiver;
            String str = this.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 79006) {
                if (hashCode == 79564 && str.equals("PTP")) {
                    c = 1;
                }
            } else if (str.equals("PBP")) {
                c = 0;
            }
            if (c == 0) {
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem);
                this.IconCompatParcelizer.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
                write("BILLPAYMENT");
            } else if (c == 1) {
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    this.RatingCompat.Keep();
                }
                this.MediaMetadataCompat.read();
                this.MediaMetadataCompat.IconCompatParcelizer(new RatingCompat(this, (byte) 0));
            }
        }
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return str.length() != 13 ? 10 : 13;
    }

    public static animateCameraWithCallback MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i == 13 ? animateCameraWithCallback.CID : animateCameraWithCallback.MOB;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue();
        CrashlyticsReport.FilesPayload.File.Builder builder = this.MediaBrowserCompat$ItemReceiver;
        return (builder == null || builder.MediaSessionCompat$Token == null || this.write == null || doubleValue > this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue() || doubleValue == 0.0d) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(java.lang.String r5) {
        /*
            r4 = this;
            o.jD r0 = p040o.C4846jD.read
            T r1 = r4.RatingCompat
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r3
        L_0x000b:
            if (r1 == 0) goto L_0x0012
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0012:
            int r0 = r5.hashCode()
            r1 = -486974465(0xffffffffe2f95bff, float:-2.2999341E21)
            if (r0 == r1) goto L_0x002a
            r1 = 2063509483(0x7afea7eb, float:6.611246E35)
            if (r0 != r1) goto L_0x0034
            java.lang.String r0 = "TRANSFER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "BILLPAYMENT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0041
            if (r0 != r2) goto L_0x0048
            o.include r0 = r4.IconCompatParcelizer
            java.lang.String r1 = "PROMPTPAY"
            r0.IconCompatParcelizer(r5, r1)
            goto L_0x0048
        L_0x0041:
            o.include r0 = r4.IconCompatParcelizer
            java.lang.String r1 = "ALL"
            r0.IconCompatParcelizer(r5, r1)
        L_0x0048:
            o.include r5 = r4.IconCompatParcelizer
            o.kb$read r0 = new o.kb$read
            r0.<init>(r4, r3)
            r5.IconCompatParcelizer(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4895kb.write(java.lang.String):void");
    }

    /* renamed from: o.kb$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
        private read() {
        }

        /* synthetic */ read(C4895kb kbVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4895kb kbVar = C4895kb.this;
            C4715h.C47192 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.2.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.2.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
            if (kbVar.RatingCompat != null) {
                r1.IconCompatParcelizer(kbVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if (!C4895kb.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C4895kb kbVar = C4895kb.this;
                C4715h.C47161 r0 = C4715h.C47161.IconCompatParcelizer;
                if (kbVar.RatingCompat != null) {
                    r0.IconCompatParcelizer(kbVar.RatingCompat);
                }
            }
        }

        static /* synthetic */ void IconCompatParcelizer(getCarbonStrip.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.write();
        }

        static /* synthetic */ void write(setBoundsBias setboundsbias, getCarbonStrip.IconCompatParcelizer iconCompatParcelizer) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            iconCompatParcelizer.IconCompatParcelizer(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(setboundsbias != null ? setboundsbias.MediaBrowserCompat$MediaItem.doubleValue() : 0.0d));
            iconCompatParcelizer.write();
        }
    }

    /* renamed from: o.kb$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanoramaFragment.zza> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(C4895kb kbVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4895kb.AlertController$RecycleListView(C4895kb.this);
            onInfoWindowLongClick read = onInfoWindowLongClick.read();
            read.setBackgroundResource = C4895kb.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
            read.AppCompatDelegateImpl$ListMenuDecorView = C4895kb.this.MediaDescriptionCompat.MediaMetadataCompat;
            read.AppCompatViewInflater = C4895kb.this.MediaDescriptionCompat.RatingCompat;
            read.setChecked = C4895kb.this.MediaDescriptionCompat.MediaDescriptionCompat;
            read.MediaBrowserCompat$MediaItem = C4895kb.this.MediaDescriptionCompat.read;
            read.setCheckable = C4895kb.this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem;
            read.MediaDescriptionCompat = C4895kb.this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
            C4895kb kbVar = C4895kb.this;
            CrashlyticsReport.Session.Event.Application.Execution unused = kbVar.read = kbVar.MediaSessionCompat$ResultReceiverWrapper.write(((StreetViewPanoramaFragment.zza) obj).write, read, C4895kb.this.IconCompatParcelizer.IconCompatParcelizer.setCheckable());
            C4895kb kbVar2 = C4895kb.this;
            C4844jB jBVar = new C4844jB(this);
            boolean z = true;
            if (kbVar2.RatingCompat != null) {
                jBVar.IconCompatParcelizer(kbVar2.RatingCompat);
            }
            if (!C4895kb.this.read.setGroupDividerEnabled.isEmpty()) {
                C4895kb kbVar3 = C4895kb.this;
                C4715h.C47161.C47171 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.1.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.1.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                if (kbVar3.RatingCompat != null) {
                    r0.IconCompatParcelizer(kbVar3.RatingCompat);
                }
            }
            if (!C4895kb.this.read.ExpandedMenuView.isEmpty()) {
                C4895kb kbVar4 = C4895kb.this;
                C4715h.C47203 r02 = new writeUInt64NoTag.IconCompatParcelizer() {
                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.3.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.3.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                if (kbVar4.RatingCompat != null) {
                    r02.IconCompatParcelizer(kbVar4.RatingCompat);
                }
            }
            if ("03".equalsIgnoreCase(C4895kb.this.read.RatingCompat) || "04".equalsIgnoreCase(C4895kb.this.read.RatingCompat)) {
                C4895kb.read(C4895kb.this);
                return;
            }
            C4895kb kbVar5 = C4895kb.this;
            C4715h.C47161.C47171.C47181 r03 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.1.1.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.1.1.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
            if (kbVar5.RatingCompat != null) {
                r03.IconCompatParcelizer(kbVar5.RatingCompat);
            }
            C4895kb kbVar6 = C4895kb.this;
            C4884jz jzVar = new C4884jz(this);
            if (kbVar6.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jzVar.IconCompatParcelizer(kbVar6.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4895kb.this.MediaBrowserCompat$ItemReceiver(C4895kb.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.kb$RatingCompat */
    final class RatingCompat extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<setZoomControlsEnabled>> {
        private RatingCompat() {
        }

        /* synthetic */ RatingCompat(C4895kb kbVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            isSupportFragmentClass issupportfragmentclass;
            List list = (List) obj;
            super.onNext(list);
            C4895kb.write(C4895kb.this);
            if (list != null) {
                show show = new show(list);
                show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getAllowReturnTransitionOverlap() {
                    public final boolean write(Object obj) {
                        return String.valueOf(((setZoomControlsEnabled) obj).read).equalsIgnoreCase(C4895kb.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver);
                    }
                }));
                if (show2.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                boolean z = true;
                if (issupportfragmentclass.IconCompatParcelizer != null) {
                    C4895kb kbVar = C4895kb.this;
                    T t = issupportfragmentclass.IconCompatParcelizer;
                    if (t != null) {
                        setZoomControlsEnabled unused = kbVar.MediaBrowserCompat$SearchResultReceiver = (setZoomControlsEnabled) t;
                        C4895kb kbVar2 = C4895kb.this;
                        C10100p.C51195 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
                            public final void IconCompatParcelizer(Object obj) {
                                C4895kb.RatingCompat ratingCompat = C4895kb.RatingCompat.this;
                                getCarbonStrip.IconCompatParcelizer iconCompatParcelizer = (getCarbonStrip.IconCompatParcelizer) obj;
                                iconCompatParcelizer.MediaDescriptionCompat(C4895kb.this.MediaDescriptionCompat.MediaMetadataCompat);
                                iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(C4895kb.this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer);
                                iconCompatParcelizer.RatingCompat(C4895kb.this.MediaBrowserCompat$MediaItem.mo26549c_(C4895kb.this.MediaBrowserCompat$SearchResultReceiver.write));
                                iconCompatParcelizer.read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(C4895kb.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.doubleValue()));
                            }
                        };
                        if (kbVar2.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            r0.IconCompatParcelizer(kbVar2.RatingCompat);
                        }
                        if (C4895kb.this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat == ICameraUpdateFactoryDelegate.TYPE_RANGE) {
                            C4895kb kbVar3 = C4895kb.this;
                            C4895kb.IconCompatParcelizer(kbVar3, kbVar3.MediaBrowserCompat$SearchResultReceiver);
                            return;
                        }
                        C4895kb kbVar4 = C4895kb.this;
                        C4895kb.read(kbVar4, kbVar4.MediaBrowserCompat$SearchResultReceiver);
                        return;
                    }
                    throw new NoSuchElementException("No value present");
                }
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            C4895kb.RatingCompat(C4895kb.this);
            C4895kb kbVar = C4895kb.this;
            C4857jS jSVar = new C4857jS(this, th);
            if (kbVar.RatingCompat != null) {
                jSVar.IconCompatParcelizer(kbVar.RatingCompat);
            }
        }

        public final void onComplete() {
            super.onComplete();
            C4895kb.MediaMetadataCompat(C4895kb.this);
        }
    }

    /* renamed from: o.kb$MediaMetadataCompat */
    final class MediaMetadataCompat extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<Integer>> {
        private MediaMetadataCompat() {
        }

        /* synthetic */ MediaMetadataCompat(C4895kb kbVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            boolean z = true;
            if (C4895kb.this.MediaDescriptionCompat == null || C4895kb.this.MediaDescriptionCompat.read <= 0.0d) {
                C4895kb kbVar = C4895kb.this;
                C4850jL jLVar = new C4850jL(list);
                if (kbVar.RatingCompat != null) {
                    jLVar.IconCompatParcelizer(kbVar.RatingCompat);
                }
            } else {
                C4895kb kbVar2 = C4895kb.this;
                C4715h.C47215 r3 = new writeUInt64NoTag.IconCompatParcelizer(list) {
                    private final /* synthetic */ List write;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.5.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.5.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                if (kbVar2.RatingCompat != null) {
                    r3.IconCompatParcelizer(kbVar2.RatingCompat);
                }
            }
            C4895kb kbVar3 = C4895kb.this;
            C4848jF jFVar = C4848jF.write;
            if (kbVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jFVar.IconCompatParcelizer(kbVar3.RatingCompat);
            }
        }

        public final void onComplete() {
            C4895kb kbVar = C4895kb.this;
            C4848jF jFVar = C4848jF.write;
            if (kbVar.RatingCompat != null) {
                jFVar.IconCompatParcelizer(kbVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4895kb.this.MediaBrowserCompat$ItemReceiver(C4895kb.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    /* renamed from: o.kb$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<userNavigationEnabled> {
        private String MediaBrowserCompat$CustomActionResultReceiver;
        private String MediaBrowserCompat$ItemReceiver;
        private String read;

        public final /* synthetic */ void onNext(Object obj) {
            userNavigationEnabled usernavigationenabled = (userNavigationEnabled) obj;
            C4895kb kbVar = C4895kb.this;
            C4848jF jFVar = C4848jF.write;
            boolean z = true;
            if (kbVar.RatingCompat != null) {
                jFVar.IconCompatParcelizer(kbVar.RatingCompat);
            }
            isCancelled unused = C4895kb.this.MediaSessionCompat$QueueItem;
            String str = usernavigationenabled.PlaybackStateCompat$CustomAction;
            String str2 = usernavigationenabled.setHasDecor;
            String str3 = this.read;
            if (!"012".equalsIgnoreCase(str)) {
                str2 = str3;
            }
            this.read = str2;
            isCancelled unused2 = C4895kb.this.MediaSessionCompat$QueueItem;
            String str4 = usernavigationenabled.PlaybackStateCompat$CustomAction;
            String str5 = usernavigationenabled.Keep;
            String str6 = this.MediaBrowserCompat$ItemReceiver;
            if (!"012".equalsIgnoreCase(str4)) {
                str5 = str6;
            }
            this.MediaBrowserCompat$ItemReceiver = str5;
            isCancelled unused3 = C4895kb.this.MediaSessionCompat$QueueItem;
            String str7 = usernavigationenabled.PlaybackStateCompat$CustomAction;
            String str8 = usernavigationenabled.AppCompatActivity;
            String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!"012".equalsIgnoreCase(str7)) {
                str8 = str9;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = str8;
            isCancelled unused4 = C4895kb.this.MediaSessionCompat$QueueItem;
            CrashlyticsReport.Session.Event.Application.Execution.Signal MediaBrowserCompat$CustomActionResultReceiver2 = isCancelled.MediaBrowserCompat$CustomActionResultReceiver(usernavigationenabled, C4895kb.this.IconCompatParcelizer.IconCompatParcelizer.AppCompatActivity(), this.read, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
            if (DiskLruCache.VERSION_1.equals(usernavigationenabled.AppCompatDelegateImpl$ListMenuDecorView)) {
                C4895kb kbVar2 = C4895kb.this;
                C4715h.C47266 r1 = new writeUInt64NoTag.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2) {
                    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Signal write;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.6.IconCompatParcelizer(java.lang.Object):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.6.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                if (kbVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r1.IconCompatParcelizer(kbVar2.RatingCompat);
                    return;
                }
                return;
            }
            C4895kb kbVar3 = C4895kb.this;
            C4715h.C47254 r12 = new writeUInt64NoTag.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2) {
                private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Signal MediaBrowserCompat$CustomActionResultReceiver;

                public final void IconCompatParcelizer(
/*
Method generation error in method: o.h.4.IconCompatParcelizer(java.lang.Object):void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.h.4.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
            if (kbVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r12.IconCompatParcelizer(kbVar3.RatingCompat);
            }
        }

        public write(String str, String str2, String str3) {
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }

        public final void onComplete() {
            C4895kb kbVar = C4895kb.this;
            C4848jF jFVar = C4848jF.write;
            if (kbVar.RatingCompat != null) {
                jFVar.IconCompatParcelizer(kbVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4895kb kbVar = C4895kb.this;
            kbVar.MediaBrowserCompat$ItemReceiver(kbVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void read(C4895kb kbVar) {
        C4864jZ jZVar = C4864jZ.MediaBrowserCompat$ItemReceiver;
        if (kbVar.RatingCompat != null) {
            jZVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
        Collections2 MediaBrowserCompat$CustomActionResultReceiver = Collections2.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = putInstance.MediaBrowserCompat$CustomActionResultReceiver(StreetViewPanoramaFragment.zzb.SCAN);
        MediaBrowserCompat$CustomActionResultReceiver.write = kbVar.read.MediaBrowserCompat$SearchResultReceiver;
        String str = kbVar.read.setPopupCallback;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        MediaBrowserCompat$CustomActionResultReceiver.read = str;
        String str3 = kbVar.read.setGroupDividerEnabled;
        if (str3 != null) {
            str2 = str3;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str2;
        kbVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver);
        kbVar.IconCompatParcelizer.IconCompatParcelizer(new kb$MediaBrowserCompat$ItemReceiver(kbVar, (byte) 0));
    }

    static /* synthetic */ boolean IconCompatParcelizer(C4895kb kbVar) {
        if (position.OFFUS_BILLER.equals(kbVar.read.MediaSessionCompat$ResultReceiverWrapper) || position.ONUS_BILLER.equals(kbVar.read.MediaSessionCompat$ResultReceiverWrapper)) {
            if ("01".equalsIgnoreCase(kbVar.read.RatingCompat) || "02".equalsIgnoreCase(kbVar.read.RatingCompat)) {
                return true;
            }
            if (!"05".equalsIgnoreCase(kbVar.read.RatingCompat)) {
                return false;
            }
            if (TextUtils.isEmpty(kbVar.read.MediaBrowserCompat$MediaItem) || getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(kbVar.read.MediaBrowserCompat$MediaItem).doubleValue() == 0.0d) {
                return getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(kbVar.read.MediaBrowserCompat$MediaItem);
            }
            return false;
        } else if ("01".equalsIgnoreCase(kbVar.read.RatingCompat) || "02".equalsIgnoreCase(kbVar.read.RatingCompat)) {
            return getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(kbVar.read.MediaBrowserCompat$MediaItem);
        } else {
            return false;
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4895kb kbVar) {
        if (kbVar.RatingCompat != null) {
            kbVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4895kb kbVar) {
        if (kbVar.RatingCompat != null) {
            kbVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4895kb kbVar, setZoomControlsEnabled setzoomcontrolsenabled) {
        C4864jZ jZVar = C4864jZ.MediaBrowserCompat$ItemReceiver;
        if (kbVar.RatingCompat != null) {
            jZVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
        kbVar.MediaMetadataCompat.IconCompatParcelizer(String.valueOf(setzoomcontrolsenabled.read));
        kbVar.MediaMetadataCompat.IconCompatParcelizer(new kb$MediaBrowserCompat$MediaItem(kbVar, kbVar.MediaBrowserCompat$MediaItem.IconCompatParcelizer(setzoomcontrolsenabled)));
    }

    static /* synthetic */ void read(C4895kb kbVar, setZoomControlsEnabled setzoomcontrolsenabled) {
        C4864jZ jZVar = C4864jZ.MediaBrowserCompat$ItemReceiver;
        if (kbVar.RatingCompat != null) {
            jZVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
        kbVar.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(String.valueOf(setzoomcontrolsenabled.read));
        kbVar.MediaMetadataCompat.IconCompatParcelizer(new MediaMetadataCompat(kbVar, (byte) 0));
    }

    static /* synthetic */ void RatingCompat(C4895kb kbVar) {
        if (kbVar.RatingCompat != null) {
            kbVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(C4895kb kbVar) {
        if (kbVar.RatingCompat != null) {
            kbVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void AlertController$RecycleListView(C4895kb kbVar) {
        if (kbVar.RatingCompat != null) {
            kbVar.RatingCompat.ay_();
        }
    }
}
