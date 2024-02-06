package p040o;

import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.C3080xc2f5febc;
import p040o.ComponentDiscovery;
import p040o.FieldNamingStrategy;
import p040o.GoogleMap;
import p040o.getIIdDeserializerOnDevice;
import p040o.setupDialog;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString */
public final class typeToString extends writeUInt64NoTag<getIIdDeserializerOnDevice.IconCompatParcelizer> {
    public boolean IconCompatParcelizer;
    public final forEnumeration MediaBrowserCompat$ItemReceiver;
    public jsonFromMapEntryString MediaBrowserCompat$MediaItem = jsonFromMapEntryString.NORMAL;
    /* access modifiers changed from: private */
    public final String MediaBrowserCompat$SearchResultReceiver;
    public lambda$processSetComponents$1 MediaDescriptionCompat;
    public Integer MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final expectedSize MediaSessionCompat$QueueItem;
    public String read;
    public chain write;

    /* renamed from: o.typeToString$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        private /* synthetic */ typeToString MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(typeToString typetostring) {
            this.MediaBrowserCompat$ItemReceiver = typetostring;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        }
    }

    /* renamed from: o.typeToString$MediaMetadataCompat */
    static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        private /* synthetic */ typeToString read;

        MediaMetadataCompat(typeToString typetostring) {
            this.read = typetostring;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).write(this.read.MediaBrowserCompat$CustomActionResultReceiver(), this.read.MediaMetadataCompat);
        }
    }

    /* renamed from: o.typeToString$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        private /* synthetic */ typeToString write;

        ParcelableVolumeInfo(typeToString typetostring) {
            this.write = typetostring;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).read(this.write.write != null);
        }
    }

    /* renamed from: o.typeToString$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        private /* synthetic */ boolean read;

        RatingCompat(boolean z) {
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.read);
        }
    }

    /* renamed from: o.typeToString$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(true);
        }
    }

    /* renamed from: o.typeToString$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    public static final /* synthetic */ lambda$processSetComponents$1 MediaBrowserCompat$SearchResultReceiver(typeToString typetostring) {
        lambda$processSetComponents$1 lambda_processsetcomponents_1 = typetostring.MediaDescriptionCompat;
        if (lambda_processsetcomponents_1 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPurchaseCcSofDisplay");
        }
        return lambda_processsetcomponents_1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public typeToString(RegularImmutableBiMap regularImmutableBiMap, expectedSize expectedsize, forEnumeration forenumeration, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) expectedsize, "mCcSofCreditCardOnlyInputMapper");
        onGetStartedClick.write((Object) forenumeration, "mController");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.MediaSessionCompat$QueueItem = expectedsize;
        this.MediaBrowserCompat$ItemReceiver = forenumeration;
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    /* renamed from: o.typeToString$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ KeepName IconCompatParcelizer;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(KeepName keepName) {
            this.IconCompatParcelizer = keepName;
        }

        public final Object IconCompatParcelizer(Object obj) {
            KeepName keepName = this.IconCompatParcelizer;
            ValueParser valueParser = (ValueParser) obj;
            int i = valueParser.ParcelableVolumeInfo;
            String str = valueParser.MediaSessionCompat$ResultReceiverWrapper;
            String str2 = valueParser.IconCompatParcelizer;
            BigDecimal bigDecimal = valueParser.MediaMetadataCompat;
            OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(valueParser.MediaBrowserCompat$MediaItem, (OffsetDateTime) null);
            String str3 = valueParser.MediaBrowserCompat$SearchResultReceiver;
            String str4 = valueParser.write;
            String str5 = valueParser.MediaDescriptionCompat;
            OffsetDateTime write2 = FragmentBuilder_BindSummaryFragment.write(valueParser.f2794x50fd9e4a, (OffsetDateTime) null);
            BigDecimal bigDecimal2 = valueParser.MediaSessionCompat$QueueItem;
            BigDecimal bigDecimal3 = valueParser.RatingCompat;
            String str6 = valueParser.MediaBrowserCompat$ItemReceiver;
            String str7 = valueParser.read;
            Iterable iterable = valueParser.MediaBrowserCompat$CustomActionResultReceiver;
            if (iterable == null) {
                iterable = new ArrayList();
            }
            show show = new show(iterable);
            FieldNamingStrategy.IconCompatParcelizer iconCompatParcelizer = new FieldNamingStrategy.IconCompatParcelizer(keepName);
            String str8 = str7;
            String str9 = str8;
            return new HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver(i, str, str2, bigDecimal, write, str3, str4, str5, write2, bigDecimal2, bigDecimal3, str6, str8, (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, iconCompatParcelizer)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                /*  JADX ERROR: Method generation error: null
                    java.util.ConcurrentModificationException
                    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.1.read():java.lang.Object, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
            }, new ensureAnimationInfo<List<T>, T>() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                /*  JADX ERROR: Method generation error: null
                    java.util.ConcurrentModificationException
                    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
            })));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r0 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r0 != null) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.lambda$processSetComponents$1 r5, p040o.chain r6, java.lang.String r7, p040o.jsonFromMapEntryString r8) {
        /*
            r4 = this;
            java.lang.String r0 = "purchaseCcSofDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = "paymentFlowType"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            r4.MediaDescriptionCompat = r5
            r4.write = r6
            r4.read = r7
            java.util.List r5 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            java.lang.String r6 = "$this$firstOrNull"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r6)
            boolean r6 = r5.isEmpty()
            r7 = 0
            r0 = 0
            if (r6 == 0) goto L_0x0023
            r5 = r0
            goto L_0x0027
        L_0x0023:
            java.lang.Object r5 = r5.get(r7)
        L_0x0027:
            o.ComponentDiscovery$RegistrarNameRetriever r5 = (p040o.ComponentDiscovery.RegistrarNameRetriever) r5
            if (r5 == 0) goto L_0x0032
            int r5 = r5.RatingCompat
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0033
        L_0x0032:
            r5 = r0
        L_0x0033:
            o.chain r6 = r4.write
            java.lang.String r1 = "mPurchaseCcSofDisplay"
            r2 = 1
            if (r6 == 0) goto L_0x0056
            java.util.ArrayList<java.lang.String> r6 = r6.read
            if (r6 == 0) goto L_0x0056
            java.lang.String r3 = "SHOW_CREDITCARD_TENOR"
            boolean r6 = r6.contains(r3)
            if (r6 != r2) goto L_0x0056
            o.lambda$processSetComponents$1 r6 = r4.MediaDescriptionCompat
            if (r6 != 0) goto L_0x004d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x004d:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x0075
            java.lang.Integer r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0056:
            o.chain r6 = r4.write
            if (r6 == 0) goto L_0x0076
            java.util.ArrayList<java.lang.String> r6 = r6.read
            if (r6 == 0) goto L_0x0076
            java.lang.String r3 = "SHOW_SPEEDYCASH_TENOR"
            boolean r6 = r6.contains(r3)
            if (r6 != r2) goto L_0x0076
            o.lambda$processSetComponents$1 r6 = r4.MediaDescriptionCompat
            if (r6 != 0) goto L_0x006d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x006d:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x0075
            java.lang.Integer r0 = r6.RatingCompat
            if (r0 != 0) goto L_0x0076
        L_0x0075:
            r0 = r5
        L_0x0076:
            r4.MediaMetadataCompat = r0
            o.chain r5 = r4.write
            if (r5 == 0) goto L_0x0087
            java.util.ArrayList<java.lang.String> r5 = r5.read
            if (r5 == 0) goto L_0x0087
            java.lang.String r6 = "PURCHASE_INSTALLMENT_SOURCE"
            boolean r5 = r5.contains(r6)
            goto L_0x0088
        L_0x0087:
            r5 = r7
        L_0x0088:
            o.chain r6 = r4.write
            if (r6 == 0) goto L_0x0097
            java.util.ArrayList<java.lang.String> r6 = r6.read
            if (r6 == 0) goto L_0x0097
            java.lang.String r0 = "PURCHASE_FULL_AMOUNT_SOURCE"
            boolean r6 = r6.contains(r0)
            goto L_0x0098
        L_0x0097:
            r6 = r7
        L_0x0098:
            if (r5 != 0) goto L_0x009b
            goto L_0x00b2
        L_0x009b:
            if (r6 == 0) goto L_0x00b1
            o.lambda$processSetComponents$1 r5 = r4.MediaDescriptionCompat
            if (r5 != 0) goto L_0x00a4
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00a4:
            java.util.List<java.lang.String> r5 = r5.RatingCompat
            o.CrashlyticsReportJsonTransform$$Lambda$9 r6 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_FULL_AMOUNT
            java.lang.String r6 = r6.code
            boolean r5 = r5.contains(r6)
            r5 = r5 ^ r2
            r7 = r5
            goto L_0x00b2
        L_0x00b1:
            r7 = r2
        L_0x00b2:
            r4.IconCompatParcelizer = r7
            r4.MediaBrowserCompat$MediaItem = r8
            r4.write((boolean) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.typeToString.IconCompatParcelizer(o.lambda$processSetComponents$1, o.chain, java.lang.String, o.jsonFromMapEntryString):void");
    }

    public final List<ComponentDiscovery.RegistrarNameRetriever> MediaBrowserCompat$CustomActionResultReceiver() {
        ArrayList<String> arrayList;
        List<ComponentDiscovery.RegistrarNameRetriever> list;
        ArrayList<String> arrayList2;
        List<ComponentDiscovery.RegistrarNameRetriever> list2;
        chain chain = this.write;
        if (chain == null || (arrayList2 = chain.read) == null || !arrayList2.contains("SHOW_CREDITCARD_TENOR")) {
            chain chain2 = this.write;
            if (chain2 == null || (arrayList = chain2.read) == null || !arrayList.contains("SHOW_SPEEDYCASH_TENOR")) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
            lambda$processSetComponents$1 lambda_processsetcomponents_1 = this.MediaDescriptionCompat;
            if (lambda_processsetcomponents_1 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPurchaseCcSofDisplay");
            }
            ComponentDiscovery.MetadataRegistrarNameRetriever metadataRegistrarNameRetriever = lambda_processsetcomponents_1.MediaBrowserCompat$CustomActionResultReceiver;
            if (metadataRegistrarNameRetriever == null || (list = metadataRegistrarNameRetriever.MediaBrowserCompat$SearchResultReceiver) == null) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
            return list;
        }
        lambda$processSetComponents$1 lambda_processsetcomponents_12 = this.MediaDescriptionCompat;
        if (lambda_processsetcomponents_12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPurchaseCcSofDisplay");
        }
        ComponentDiscovery.MetadataRegistrarNameRetriever metadataRegistrarNameRetriever2 = lambda_processsetcomponents_12.MediaBrowserCompat$CustomActionResultReceiver;
        if (metadataRegistrarNameRetriever2 == null || (list2 = metadataRegistrarNameRetriever2.write) == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        return list2;
    }

    public static final /* synthetic */ C3080xc2f5febc.C30811 IconCompatParcelizer(typeToString typetostring, chain chain, String str, GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever;
        String str2;
        lambda$processSetComponents$1 lambda_processsetcomponents_1;
        ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever2;
        ComponentFactory componentFactory;
        int i;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        processInstanceComponents processinstancecomponents;
        List list;
        Object obj;
        boolean z;
        typeToString typetostring2 = typetostring;
        GoogleMap.SnapshotReadyCallback snapshotReadyCallback2 = snapshotReadyCallback;
        boolean z2 = false;
        if (typetostring2.IconCompatParcelizer) {
            Iterator it = typetostring.MediaBrowserCompat$CustomActionResultReceiver().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int i2 = ((ComponentDiscovery.RegistrarNameRetriever) obj).RatingCompat;
                Integer num = typetostring2.MediaMetadataCompat;
                if (num == null || i2 != num.intValue()) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            registrarNameRetriever = (ComponentDiscovery.RegistrarNameRetriever) obj;
        } else {
            registrarNameRetriever = null;
        }
        lambda$processSetComponents$1 lambda_processsetcomponents_12 = typetostring2.MediaDescriptionCompat;
        if (lambda_processsetcomponents_12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPurchaseCcSofDisplay");
        }
        if (str.length() == 0) {
            z2 = true;
        }
        String str3 = z2 ? null : str;
        onGetStartedClick.write((Object) snapshotReadyCallback2, "domain");
        String str4 = snapshotReadyCallback2.MediaBrowserCompat$MediaItem;
        String str5 = snapshotReadyCallback2.MediaBrowserCompat$SearchResultReceiver;
        String str6 = snapshotReadyCallback2.MediaBrowserCompat$CustomActionResultReceiver;
        String str7 = snapshotReadyCallback2.IconCompatParcelizer;
        String str8 = snapshotReadyCallback2.read;
        String str9 = snapshotReadyCallback2.write;
        String str10 = snapshotReadyCallback2.MediaDescriptionCompat;
        onSnapshotReady onsnapshotready = snapshotReadyCallback2.MediaBrowserCompat$ItemReceiver;
        if (onsnapshotready != null) {
            String str11 = onsnapshotready.IconCompatParcelizer;
            GoogleMap.OnPolylineClickListener onPolylineClickListener = onsnapshotready.read;
            if (onPolylineClickListener != null) {
                registrarNameRetriever2 = registrarNameRetriever;
                str2 = str3;
                lambda_processsetcomponents_1 = lambda_processsetcomponents_12;
                processinstancecomponents = new processInstanceComponents(onPolylineClickListener.MediaBrowserCompat$ItemReceiver, onPolylineClickListener.read, onPolylineClickListener.MediaBrowserCompat$CustomActionResultReceiver, onPolylineClickListener.IconCompatParcelizer, onPolylineClickListener.MediaBrowserCompat$SearchResultReceiver, onPolylineClickListener.write);
            } else {
                lambda_processsetcomponents_1 = lambda_processsetcomponents_12;
                str2 = str3;
                registrarNameRetriever2 = registrarNameRetriever;
                processinstancecomponents = null;
            }
            List<onPolylineClick> list2 = onsnapshotready.write;
            if (list2 != null) {
                Iterable iterable = list2;
                int i3 = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i3 = ((Collection) iterable).size();
                }
                Collection arrayList3 = new ArrayList(i3);
                for (Iterator it2 = iterable.iterator(); it2.hasNext(); it2 = it2) {
                    onPolylineClick onpolylineclick = (onPolylineClick) it2.next();
                    arrayList3.add(new ComponentRuntime(onpolylineclick.MediaBrowserCompat$ItemReceiver, onpolylineclick.MediaBrowserCompat$CustomActionResultReceiver, onpolylineclick.IconCompatParcelizer, onpolylineclick.write, onpolylineclick.read));
                    typeToString typetostring3 = typetostring;
                }
                list = (List) arrayList3;
            } else {
                list = null;
            }
            componentFactory = new ComponentFactory(str11, processinstancecomponents, list);
        } else {
            lambda_processsetcomponents_1 = lambda_processsetcomponents_12;
            str2 = str3;
            registrarNameRetriever2 = registrarNameRetriever;
            componentFactory = null;
        }
        getFrames getframes = new getFrames(str4, str5, str6, str7, str8, str9, str10, componentFactory);
        typeToString typetostring4 = typetostring;
        chain chain2 = typetostring4.write;
        if (chain2 == null || (arrayList2 = chain2.read) == null || !arrayList2.contains("SHOW_CREDITCARD_TENOR")) {
            chain chain3 = typetostring4.write;
            i = (chain3 == null || (arrayList = chain3.read) == null || !arrayList.contains("SHOW_SPEEDYCASH_TENOR")) ? -1 : 102;
        } else {
            i = 101;
        }
        return new Parcelable(lambda_processsetcomponents_1, chain, str2, registrarNameRetriever2, getframes, i) {
            public static final Parcelable.Creator CREATOR;
            public final lambda$processSetComponents$1 IconCompatParcelizer;
            public final getFrames MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final ComponentDiscovery.RegistrarNameRetriever MediaBrowserCompat$MediaItem;
            public final chain read;
            public final int write;

            public final int describeContents(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.describeContents():int, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.describeContents():int, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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

            public final boolean equals(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.equals(java.lang.Object):boolean, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.equals(java.lang.Object):boolean, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.hashCode():int, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.hashCode():int, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.toString():java.lang.String, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.toString():java.lang.String, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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

            public final void writeToParcel(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.writeToParcel(android.os.Parcel, int):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.1.writeToParcel(android.os.Parcel, int):void, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
    }

    public static final /* synthetic */ void MediaBrowserCompat$MediaItem(typeToString typetostring) {
        if (typetostring.RatingCompat != null) {
            typetostring.RatingCompat.aj_();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: o.ComponentDiscovery$RegistrarNameRetriever} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: o.ComponentDiscovery$RegistrarNameRetriever} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: o.ComponentDiscovery$RegistrarNameRetriever} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: o.ComponentDiscovery$RegistrarNameRetriever} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "mPurchaseCcSofDisplay"
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x00c5
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x000e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x000e:
            java.util.List<java.lang.String> r9 = r9.RatingCompat
            int r9 = r9.size()
            if (r9 != r2) goto L_0x002b
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x001d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x001d:
            java.util.List<java.lang.String> r9 = r9.RatingCompat
            o.CrashlyticsReportJsonTransform$$Lambda$9 r4 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r4 = r4.code
            boolean r9 = r9.contains(r4)
            if (r9 == 0) goto L_0x002b
            r9 = r2
            goto L_0x002c
        L_0x002b:
            r9 = r3
        L_0x002c:
            o.chain r4 = r8.write
            if (r4 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x0034
            r9 = r2
            goto L_0x0035
        L_0x0034:
            r9 = r3
        L_0x0035:
            o.onNotNowClick$read r4 = new o.onNotNowClick$read
            r4.<init>()
            o.lambda$processSetComponents$1 r5 = r8.MediaDescriptionCompat
            if (r5 != 0) goto L_0x0041
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0041:
            o.retrieve r5 = r5.read
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0049
        L_0x0048:
            r5 = r0
        L_0x0049:
            r4.MediaBrowserCompat$ItemReceiver = r5
            o.onNotNowClick$read r5 = new o.onNotNowClick$read
            r5.<init>()
            o.lambda$processSetComponents$1 r6 = r8.MediaDescriptionCompat
            if (r6 != 0) goto L_0x0057
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0057:
            o.retrieve r6 = r6.read
            if (r6 == 0) goto L_0x005e
            java.lang.Double r6 = r6.IconCompatParcelizer
            goto L_0x005f
        L_0x005e:
            r6 = r0
        L_0x005f:
            r5.MediaBrowserCompat$ItemReceiver = r6
            o.onNotNowClick$read r6 = new o.onNotNowClick$read
            r6.<init>()
            o.lambda$processSetComponents$1 r7 = r8.MediaDescriptionCompat
            if (r7 != 0) goto L_0x006d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x006d:
            o.retrieve r7 = r7.read
            if (r7 == 0) goto L_0x0074
            java.lang.String r7 = r7.MediaBrowserCompat$ItemReceiver
            goto L_0x0075
        L_0x0074:
            r7 = r0
        L_0x0075:
            r6.MediaBrowserCompat$ItemReceiver = r7
            boolean r7 = r8.IconCompatParcelizer
            if (r7 != 0) goto L_0x007d
            if (r9 == 0) goto L_0x00b0
        L_0x007d:
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x0084
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0084:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 == 0) goto L_0x008b
            java.lang.String r9 = r9.IconCompatParcelizer
            goto L_0x008c
        L_0x008b:
            r9 = r0
        L_0x008c:
            r4.MediaBrowserCompat$ItemReceiver = r9
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x0095
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0095:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 == 0) goto L_0x009c
            java.lang.Double r9 = r9.read
            goto L_0x009d
        L_0x009c:
            r9 = r0
        L_0x009d:
            r5.MediaBrowserCompat$ItemReceiver = r9
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x00a6
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00a6:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 == 0) goto L_0x00ad
            java.lang.String r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x00ae
        L_0x00ad:
            r9 = r0
        L_0x00ae:
            r6.MediaBrowserCompat$ItemReceiver = r9
        L_0x00b0:
            o.typeToString$MediaSessionCompat$Token r9 = new o.typeToString$MediaSessionCompat$Token
            r9.<init>(r8, r4, r5, r6)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r4 = r8.RatingCompat
            if (r4 == 0) goto L_0x00bd
            r4 = r2
            goto L_0x00be
        L_0x00bd:
            r4 = r3
        L_0x00be:
            if (r4 == 0) goto L_0x00c5
            T r4 = r8.RatingCompat
            r9.IconCompatParcelizer(r4)
        L_0x00c5:
            o.typeToString$ParcelableVolumeInfo r9 = new o.typeToString$ParcelableVolumeInfo
            r9.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r4 = r8.RatingCompat
            if (r4 == 0) goto L_0x00d2
            r4 = r2
            goto L_0x00d3
        L_0x00d2:
            r4 = r3
        L_0x00d3:
            if (r4 == 0) goto L_0x00da
            T r4 = r8.RatingCompat
            r9.IconCompatParcelizer(r4)
        L_0x00da:
            o.chain r9 = r8.write
            if (r9 == 0) goto L_0x00e9
            java.util.ArrayList<java.lang.String> r9 = r9.read
            if (r9 == 0) goto L_0x00e9
            java.lang.String r4 = "PURCHASE_INSTALLMENT_SOURCE"
            boolean r9 = r9.contains(r4)
            goto L_0x00ea
        L_0x00e9:
            r9 = r3
        L_0x00ea:
            if (r9 != 0) goto L_0x00fe
            o.typeToString$MediaBrowserCompat$SearchResultReceiver r9 = p040o.typeToString$MediaBrowserCompat$SearchResultReceiver.write
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r2 = r3
        L_0x00f6:
            if (r2 == 0) goto L_0x00fd
            T r0 = r8.RatingCompat
            r9.IconCompatParcelizer(r0)
        L_0x00fd:
            return
        L_0x00fe:
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x0105
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0105:
            java.util.List<java.lang.String> r9 = r9.RatingCompat
            o.CrashlyticsReportJsonTransform$$Lambda$9 r4 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r4 = r4.code
            boolean r9 = r9.contains(r4)
            o.typeToString$RatingCompat r4 = new o.typeToString$RatingCompat
            r4.<init>(r9)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r8.RatingCompat
            if (r5 == 0) goto L_0x011c
            r5 = r2
            goto L_0x011d
        L_0x011c:
            r5 = r3
        L_0x011d:
            if (r5 == 0) goto L_0x0124
            T r5 = r8.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x0124:
            if (r9 == 0) goto L_0x018e
            o.chain r9 = r8.write
            if (r9 == 0) goto L_0x0135
            java.util.ArrayList<java.lang.String> r9 = r9.read
            if (r9 == 0) goto L_0x0135
            java.lang.String r4 = "PURCHASE_FULL_AMOUNT_SOURCE"
            boolean r9 = r9.contains(r4)
            goto L_0x0136
        L_0x0135:
            r9 = r3
        L_0x0136:
            if (r9 != 0) goto L_0x013a
            r9 = r3
            goto L_0x016b
        L_0x013a:
            o.lambda$processSetComponents$1 r9 = r8.MediaDescriptionCompat
            if (r9 != 0) goto L_0x0141
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0141:
            java.util.List<java.lang.String> r9 = r9.RatingCompat
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            o.CrashlyticsReportJsonTransform$$Lambda$9 r5 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_FULL_AMOUNT
            java.lang.String r5 = r5.code
            r4[r3] = r5
            o.CrashlyticsReportJsonTransform$$Lambda$9 r5 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r5 = r5.code
            r4[r2] = r5
            java.lang.String r5 = "elements"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r5)
            java.lang.String r5 = "$this$asList"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r5)
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.String r5 = "ArraysUtilJVM.asList(this)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r9 = r9.containsAll(r4)
        L_0x016b:
            boolean r4 = r8.IconCompatParcelizer
            if (r4 != 0) goto L_0x0172
            int r4 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ccsof_check_box_default
            goto L_0x0179
        L_0x0172:
            if (r9 == 0) goto L_0x0177
            int r4 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ccsof_check_box_selected
            goto L_0x0179
        L_0x0177:
            int r4 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ccsof_check_box_selected_disabled
        L_0x0179:
            o.typeToString$MediaBrowserCompat$MediaItem r5 = new o.typeToString$MediaBrowserCompat$MediaItem
            r5.<init>(r8, r9, r4)
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r9 = r8.RatingCompat
            if (r9 == 0) goto L_0x0186
            r9 = r2
            goto L_0x0187
        L_0x0186:
            r9 = r3
        L_0x0187:
            if (r9 == 0) goto L_0x018e
            T r9 = r8.RatingCompat
            r5.IconCompatParcelizer(r9)
        L_0x018e:
            o.typeToString$MediaDescriptionCompat r9 = new o.typeToString$MediaDescriptionCompat
            r9.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r4 = r8.RatingCompat
            if (r4 == 0) goto L_0x019b
            r4 = r2
            goto L_0x019c
        L_0x019b:
            r4 = r3
        L_0x019c:
            if (r4 == 0) goto L_0x01a3
            T r4 = r8.RatingCompat
            r9.IconCompatParcelizer(r4)
        L_0x01a3:
            boolean r9 = r8.IconCompatParcelizer
            if (r9 == 0) goto L_0x01bc
            o.typeToString$MediaMetadataCompat r9 = new o.typeToString$MediaMetadataCompat
            r9.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r4 = r8.RatingCompat
            if (r4 == 0) goto L_0x01b4
            r4 = r2
            goto L_0x01b5
        L_0x01b4:
            r4 = r3
        L_0x01b5:
            if (r4 == 0) goto L_0x01bc
            T r4 = r8.RatingCompat
            r9.IconCompatParcelizer(r4)
        L_0x01bc:
            boolean r9 = r8.IconCompatParcelizer
            if (r9 == 0) goto L_0x01c6
            java.lang.Integer r9 = r8.MediaMetadataCompat
            if (r9 == 0) goto L_0x01c6
            r9 = r2
            goto L_0x01c7
        L_0x01c6:
            r9 = r3
        L_0x01c7:
            o.typeToString$MediaSessionCompat$ResultReceiverWrapper r4 = new o.typeToString$MediaSessionCompat$ResultReceiverWrapper
            r4.<init>(r9)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r8.RatingCompat
            if (r5 == 0) goto L_0x01d4
            r5 = r2
            goto L_0x01d5
        L_0x01d4:
            r5 = r3
        L_0x01d5:
            if (r5 == 0) goto L_0x01dc
            T r5 = r8.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x01dc:
            if (r9 == 0) goto L_0x023c
            o.expectedSize r9 = r8.MediaSessionCompat$QueueItem
            java.util.List r4 = r8.MediaBrowserCompat$CustomActionResultReceiver()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01ea:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0209
            java.lang.Object r5 = r4.next()
            r6 = r5
            o.ComponentDiscovery$RegistrarNameRetriever r6 = (p040o.ComponentDiscovery.RegistrarNameRetriever) r6
            int r6 = r6.RatingCompat
            java.lang.Integer r7 = r8.MediaMetadataCompat
            if (r7 == 0) goto L_0x0205
            int r7 = r7.intValue()
            if (r6 != r7) goto L_0x0205
            r6 = r2
            goto L_0x0206
        L_0x0205:
            r6 = r3
        L_0x0206:
            if (r6 == 0) goto L_0x01ea
            r0 = r5
        L_0x0209:
            o.ComponentDiscovery$RegistrarNameRetriever r0 = (p040o.ComponentDiscovery.RegistrarNameRetriever) r0
            o.ComponentDiscoveryService r9 = r9.MediaBrowserCompat$CustomActionResultReceiver(r0)
            o.lambda$processSetComponents$1 r0 = r8.MediaDescriptionCompat
            if (r0 != 0) goto L_0x0216
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0216:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x021e
            java.lang.Double r0 = r0.read
            if (r0 != 0) goto L_0x0224
        L_0x021e:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0224:
            java.lang.String r0 = p040o.expectedSize.write((java.lang.Double) r0)
            o.typeToString$MediaSessionCompat$QueueItem r1 = new o.typeToString$MediaSessionCompat$QueueItem
            r1.<init>(r9, r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r9 = r8.RatingCompat
            if (r9 == 0) goto L_0x0234
            goto L_0x0235
        L_0x0234:
            r2 = r3
        L_0x0235:
            if (r2 == 0) goto L_0x023c
            T r9 = r8.RatingCompat
            r1.IconCompatParcelizer(r9)
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.typeToString.write(boolean):void");
    }
}
