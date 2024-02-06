package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.AppMeasurementSdk;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.AutoValue_TokenResult;
import p040o.writeUInt64NoTag;

/* renamed from: o.getJsonBytes */
public class getJsonBytes extends writeUInt64NoTag<C6381x4d1a9e14> {
    /* access modifiers changed from: package-private */
    public final checkedCast IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public final doGoAsync MediaBrowserCompat$ItemReceiver;
    private final include MediaBrowserCompat$MediaItem;
    public final getAppIdOrigin MediaBrowserCompat$SearchResultReceiver;
    public final AppMeasurementSdk.OnEventListener MediaDescriptionCompat;
    public List<CalendarDay> read = new ArrayList();
    public CalendarDay write;

    @HmlPinActivity
    public getJsonBytes(doGoAsync dogoasync, AppMeasurementSdk.OnEventListener onEventListener, getAppIdOrigin getappidorigin, include include, RegularImmutableBiMap regularImmutableBiMap, checkedCast checkedcast) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = dogoasync;
        this.MediaDescriptionCompat = onEventListener;
        this.MediaBrowserCompat$SearchResultReceiver = getappidorigin;
        this.MediaBrowserCompat$MediaItem = include;
        this.IconCompatParcelizer = checkedcast;
    }

    /* renamed from: o.getJsonBytes$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<OnStreetViewPanoramaReadyCallback> {
        private read() {
        }

        /* synthetic */ read(getJsonBytes getjsonbytes, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getJsonBytes.MediaMetadataCompat(getJsonBytes.this);
            getJsonBytes getjsonbytes = getJsonBytes.this;
            AutoValue_TokenResult.C31061 r1 = new writeUInt64NoTag.IconCompatParcelizer((OnStreetViewPanoramaReadyCallback) obj) {
                private final /* synthetic */ OnStreetViewPanoramaReadyCallback MediaBrowserCompat$ItemReceiver;

                public final void IconCompatParcelizer(
/*
Method generation error in method: o.AutoValue_TokenResult.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_TokenResult.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
            if (getjsonbytes.RatingCompat != null) {
                r1.IconCompatParcelizer(getjsonbytes.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getJsonBytes.read(getJsonBytes.this);
            if (!getJsonBytes.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getJsonBytes getjsonbytes = getJsonBytes.this;
                getFingerprintHashForPackage getfingerprinthashforpackage = getFingerprintHashForPackage.IconCompatParcelizer;
                if (getjsonbytes.RatingCompat != null) {
                    getfingerprinthashforpackage.IconCompatParcelizer(getjsonbytes.RatingCompat);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        doGoAsync dogoasync = this.MediaBrowserCompat$ItemReceiver;
        if (!dogoasync.MediaBrowserCompat$MediaItem.isDisposed()) {
            dogoasync.MediaBrowserCompat$MediaItem.dispose();
        }
        getAppIdOrigin getappidorigin = this.MediaBrowserCompat$SearchResultReceiver;
        if (!getappidorigin.MediaBrowserCompat$MediaItem.isDisposed()) {
            getappidorigin.MediaBrowserCompat$MediaItem.dispose();
        }
        include include = this.MediaBrowserCompat$MediaItem;
        if (!include.MediaBrowserCompat$MediaItem.isDisposed()) {
            include.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.getJsonBytes$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
        AutoValue_CrashlyticsReport_Session_Event_Device.Builder read;

        public final /* synthetic */ void onNext(Object obj) {
            isSupportFragmentClass issupportfragmentclass;
            String str;
            show show = new show((List) obj);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new setFid(this)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            boolean z = true;
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t != null) {
                    str = ((StreetViewPanoramaFragment) t).read;
                } else {
                    throw new NoSuchElementException("No value present");
                }
            } else {
                str = "";
            }
            getJsonBytes getjsonbytes = getJsonBytes.this;
            AutoValue_TokenResult autoValue_TokenResult = new AutoValue_TokenResult(this, str);
            if (getjsonbytes.RatingCompat == null) {
                z = false;
            }
            if (z) {
                autoValue_TokenResult.IconCompatParcelizer(getjsonbytes.RatingCompat);
            }
            getJsonBytes.MediaBrowserCompat$ItemReceiver(getJsonBytes.this);
        }

        public write(AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder) {
            this.read = builder;
        }

        public final void onError(Throwable th) {
            RegularImmutableBiMap unused = getJsonBytes.this.MediaBrowserCompat$CustomActionResultReceiver;
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableBiMap.IconCompatParcelizer(th), new Object[0]);
        }
    }

    /* renamed from: o.getJsonBytes$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
        AutoValue_CrashlyticsReport_Session_Event_Device.Builder MediaBrowserCompat$CustomActionResultReceiver;

        public final /* synthetic */ void onNext(Object obj) {
            getJsonBytes getjsonbytes = getJsonBytes.this;
            AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder(this, (List) obj);
            if (getjsonbytes.RatingCompat != null) {
                builder.IconCompatParcelizer(getjsonbytes.RatingCompat);
            }
            getJsonBytes.MediaBrowserCompat$SearchResultReceiver(getJsonBytes.this);
        }

        public IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder;
        }

        public final void onError(Throwable th) {
            RegularImmutableBiMap unused = getJsonBytes.this.MediaBrowserCompat$CustomActionResultReceiver;
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableBiMap.IconCompatParcelizer(th), new Object[0]);
        }
    }

    static /* synthetic */ void read(getJsonBytes getjsonbytes) {
        if (getjsonbytes.RatingCompat != null) {
            getjsonbytes.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getJsonBytes getjsonbytes) {
        if (getjsonbytes.RatingCompat != null) {
            getjsonbytes.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getJsonBytes getjsonbytes) {
        if (getjsonbytes.RatingCompat != null) {
            getjsonbytes.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(getJsonBytes getjsonbytes) {
        if (getjsonbytes.RatingCompat != null) {
            getjsonbytes.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$Token(getJsonBytes getjsonbytes) {
        if (getjsonbytes.RatingCompat != null) {
            getjsonbytes.RatingCompat.ay_();
        }
    }
}
