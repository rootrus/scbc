package p040o;

import android.os.Build;
import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.PinCase;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.cache.DiskLruCache;
import p040o.GoogleMap;
import p040o.MapView;
import p040o.Suppliers;
import p040o.access$2300;
import p040o.zzmd;

/* renamed from: o.OcrEventListener */
public final class OcrEventListener extends writeUInt32<getPassportNumber> {
    private static final Long MediaMetadataCompat = 1L;
    final PinCase IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final getInheritableThreadLocalsField MediaBrowserCompat$MediaItem;
    private final memoize MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f2765x50fd9e4a;
    private final setUserPropertyInternal MediaDescriptionCompat;
    private final Suppliers.MemoizingSupplier MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final getRootCause MediaSessionCompat$Token;
    DebitCardResetOtpActivity<Long> write;

    @HmlPinActivity
    public OcrEventListener(performActionWithResponse performactionwithresponse, RegularImmutableBiMap regularImmutableBiMap, PinCase pinCase, FileBackedOutputStream fileBackedOutputStream, getInheritableThreadLocalsField getinheritablethreadlocalsfield, memoize memoize, setUserPropertyInternal setuserpropertyinternal, getRootCause getrootcause, Suppliers.MemoizingSupplier memoizingSupplier, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        this.IconCompatParcelizer = pinCase;
        this.MediaBrowserCompat$MediaItem = getinheritablethreadlocalsfield;
        this.MediaBrowserCompat$SearchResultReceiver = memoize;
        this.MediaDescriptionCompat = setuserpropertyinternal;
        this.MediaSessionCompat$Token = getrootcause;
        this.MediaSessionCompat$QueueItem = memoizingSupplier;
        this.f2765x50fd9e4a = str;
    }

    public final void write(String str) {
        findSubsetIndex findsubsetindex;
        boolean z = true;
        final Boolean valueOf = Boolean.valueOf(this.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver() == 1 && !this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(false));
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.write = DebitCardResetOtpActivity.timer(MediaMetadataCompat.longValue(), TimeUnit.SECONDS).cache();
        if (!valueOf.booleanValue() || !this.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver().equals(zzmd.zzn.FE_MOBILE.f2998id)) {
            findsubsetindex = new findSubsetIndex(zzmd.zzn.MOVING_MIGRATE.f2998id);
        } else {
            findsubsetindex = new findSubsetIndex("FEMobile");
        }
        this.IconCompatParcelizer.write(this.IconCompatParcelizer.write.read(findsubsetindex).doOnComplete(new setOCRStatus(this)).onErrorResumeNext(this.IconCompatParcelizer.write.read(findsubsetindex).doOnComplete(new OcrEngine(this))).delay(new OcrCompletedEvent(this)).flatMap(new C9852ad(this, str)), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<MapView.zzb>() {
            public final /* synthetic */ void onNext(Object obj) {
                MapView.zzb zzb = (MapView.zzb) obj;
                OcrEventListener.write(OcrEventListener.this);
                if (valueOf.booleanValue()) {
                    OcrEventListener.this.write(zzb);
                    return;
                }
                OcrEventListener ocrEventListener = OcrEventListener.this;
                getOCRStatus getocrstatus = new getOCRStatus(this, zzb);
                if (ocrEventListener.RatingCompat != null) {
                    getocrstatus.IconCompatParcelizer(ocrEventListener.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                OcrEventListener.this.write();
                OcrEventListener.this.MediaBrowserCompat$ItemReceiver(OcrEventListener.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        });
    }

    public final void onDestroy() {
        super.onDestroy();
        PinCase pinCase = this.IconCompatParcelizer;
        if (!pinCase.MediaBrowserCompat$MediaItem.isDisposed()) {
            pinCase.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public static Boolean read(String str) {
        return Boolean.valueOf("CC_ACTIVATION".equalsIgnoreCase(str));
    }

    static /* synthetic */ void write(OcrEventListener ocrEventListener) {
        if (ocrEventListener.RatingCompat != null) {
            ocrEventListener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(OcrEventListener ocrEventListener) {
        if (ocrEventListener.RatingCompat != null) {
            ocrEventListener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(OcrEventListener ocrEventListener) {
        if (ocrEventListener.RatingCompat != null) {
            ocrEventListener.RatingCompat.aj_();
        }
    }

    public final void write(final MapView.zzb zzb) {
        addCopies addcopies;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        memoize memoize = this.MediaBrowserCompat$SearchResultReceiver;
        String IconCompatParcelizer2 = this.MediaDescriptionCompat.RatingCompat.IconCompatParcelizer();
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = this.MediaDescriptionCompat.RatingCompat.MediaBrowserCompat$ItemReceiver() ? DiskLruCache.VERSION_1 : "0";
        if (this.MediaSessionCompat$Token.write.MediaMetadataCompat() != null) {
            addcopies = new addCopies("EASYAPP", this.MediaSessionCompat$Token.write.MediaMetadataCompat());
        } else {
            addcopies = null;
        }
        memoize.read(new Object(IconCompatParcelizer2, "", str, str2, str3, str4, addcopies, this.f2765x50fd9e4a, "") {
            public String IconCompatParcelizer;
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            private final String MediaBrowserCompat$ItemReceiver;
            private final String MediaBrowserCompat$MediaItem;
            private final addCopies MediaBrowserCompat$SearchResultReceiver;
            private final String MediaMetadataCompat;
            private final String RatingCompat;
            private final String read;
            public String write;

            public final boolean equals(
/*
Method generation error in method: o.Collections2.1.equals(java.lang.Object):boolean, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.Collections2.1.equals(java.lang.Object):boolean, class status: UNLOADED
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

            public final int hashCode(
/*
Method generation error in method: o.Collections2.1.hashCode():int, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.Collections2.1.hashCode():int, class status: UNLOADED
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

            public final java.lang.String toString(
/*
Method generation error in method: o.Collections2.1.toString():java.lang.String, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.Collections2.1.toString():java.lang.String, class status: UNLOADED
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
        }, this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMarkerDragListener>() {
            public final void onError(Throwable th) {
                super.onError(th);
                if (!OcrEventListener.this.MediaBrowserCompat$SearchResultReceiver(th) && (th instanceof RetrofitException)) {
                    RetrofitException retrofitException = (RetrofitException) th;
                    if (!(retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null || !"1024".equalsIgnoreCase(retrofitException.IconCompatParcelizer.write.IconCompatParcelizer))) {
                        OcrEventListener.IconCompatParcelizer(OcrEventListener.this);
                        OcrEventListener ocrEventListener = OcrEventListener.this;
                        ProcessPageResults processPageResults = new ProcessPageResults(this, th, zzb);
                        if (ocrEventListener.RatingCompat != null) {
                            processPageResults.IconCompatParcelizer(ocrEventListener.RatingCompat);
                            return;
                        }
                        return;
                    }
                }
                OcrEventListener.this.MediaBrowserCompat$ItemReceiver(OcrEventListener.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }

            public final /* synthetic */ void onNext(Object obj) {
                OcrEventListener.MediaBrowserCompat$CustomActionResultReceiver(OcrEventListener.this);
                OcrEventListener.this.MediaSessionCompat$Token.write.MediaBrowserCompat$CustomActionResultReceiver((String) null);
                OcrEventListener ocrEventListener = OcrEventListener.this;
                setQuickAnalysisSettings setquickanalysissettings = new setQuickAnalysisSettings(this, zzb);
                if (ocrEventListener.RatingCompat != null) {
                    setquickanalysissettings.IconCompatParcelizer(ocrEventListener.RatingCompat);
                }
            }
        });
    }
}
