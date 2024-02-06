package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040o.ExecutorUtils;
import p040o.Iterables;

/* renamed from: o.StandardRowSortedTable */
public final class StandardRowSortedTable extends constrainedListMultimap {
    @HmlPinActivity
    public StandardRowSortedTable(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: o.StandardRowSortedTable$RowKeySortedSet */
    public final class RowKeySortedSet extends constrainedListMultimap {
        public int read;

        @HmlPinActivity
        public RowKeySortedSet(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        private ExecutorUtils MediaBrowserCompat$CustomActionResultReceiver(GeofencingRequest geofencingRequest) {
            int i;
            int i2 = 0;
            if (geofencingRequest == null) {
                ExecutorUtils executorUtils = new ExecutorUtils();
                executorUtils.MediaBrowserCompat$CustomActionResultReceiver = "";
                executorUtils.MediaBrowserCompat$MediaItem = "";
                executorUtils.MediaBrowserCompat$ItemReceiver = "";
                executorUtils.IconCompatParcelizer = "";
                executorUtils.write = Iterables.C35273.read.fake_black;
                executorUtils.read = 0;
                return executorUtils;
            }
            double d = geofencingRequest.f2714x50fd9e4a;
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_details_nav, new Object[]{String.format(Locale.US, "%.4f", new Object[]{Double.valueOf(geofencingRequest.MediaBrowserCompat$MediaItem)})});
            String write = write(Double.valueOf(geofencingRequest.MediaSessionCompat$Token));
            String format = String.format("%s (%s%%)", new Object[]{read(Double.valueOf(d)), read(Double.valueOf(geofencingRequest.MediaSessionCompat$ResultReceiverWrapper))});
            int i3 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i3 > 0) {
                i = Iterables.C35273.read.light_green;
            } else if (d < 0.0d) {
                i = Iterables.C35273.read.light_red;
            } else {
                i = Iterables.C35273.read.fake_black;
            }
            if (i3 != 0) {
                i2 = i3 > 0 ? Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_up : Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_down;
            }
            ExecutorUtils executorUtils2 = new ExecutorUtils();
            executorUtils2.MediaBrowserCompat$CustomActionResultReceiver = geofencingRequest.write;
            executorUtils2.MediaBrowserCompat$MediaItem = string;
            executorUtils2.MediaBrowserCompat$ItemReceiver = write;
            executorUtils2.IconCompatParcelizer = format;
            executorUtils2.write = i;
            executorUtils2.read = i2;
            return executorUtils2;
        }

        private createAndStoreIid MediaBrowserCompat$ItemReceiver(getGeofenceTransition getgeofencetransition) {
            String str;
            String str2 = getgeofencetransition.RatingCompat;
            String str3 = getgeofencetransition.write;
            String MediaDescriptionCompat = TextUtils.isEmpty(str2) ? getICheckDeserializerRtti.MediaDescriptionCompat(str3) : str2;
            String MediaDescriptionCompat2 = TextUtils.isEmpty(str2) ? "" : getICheckDeserializerRtti.MediaDescriptionCompat(str3);
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_number_of_funds, new Object[]{Integer.valueOf(getgeofencetransition.MediaBrowserCompat$MediaItem)});
            if (getgeofencetransition.MediaSessionCompat$Token == 0) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_details_client_no_tax);
            } else {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_details_client_tax);
            }
            createAndStoreIid createandstoreiid = new createAndStoreIid();
            createandstoreiid.MediaBrowserCompat$ItemReceiver = str3;
            createandstoreiid.read = MediaDescriptionCompat;
            createandstoreiid.write = MediaDescriptionCompat2;
            createandstoreiid.MediaBrowserCompat$CustomActionResultReceiver = string;
            createandstoreiid.IconCompatParcelizer = str;
            return createandstoreiid;
        }

        public final void write(getGeofenceTransition getgeofencetransition, List<buildSingleThreadExecutorService> list) {
            int i;
            String str;
            int i2 = getgeofencetransition.MediaBrowserCompat$MediaItem;
            int i3 = 0;
            if (i2 == 0) {
                String str2 = getgeofencetransition.RatingCompat;
                String str3 = getgeofencetransition.write;
                String MediaDescriptionCompat = TextUtils.isEmpty(str2) ? getICheckDeserializerRtti.MediaDescriptionCompat(str3) : str2;
                String MediaDescriptionCompat2 = TextUtils.isEmpty(str2) ? "" : getICheckDeserializerRtti.MediaDescriptionCompat(str3);
                String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_number_of_funds, new Object[]{Integer.valueOf(getgeofencetransition.MediaBrowserCompat$MediaItem)});
                if (getgeofencetransition.MediaSessionCompat$Token == 0) {
                    str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_details_client_no_tax);
                } else {
                    str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_details_client_tax);
                }
                FileBackedNativeSessionFile fileBackedNativeSessionFile = new FileBackedNativeSessionFile();
                fileBackedNativeSessionFile.write = MediaDescriptionCompat;
                fileBackedNativeSessionFile.MediaBrowserCompat$ItemReceiver = MediaDescriptionCompat2;
                fileBackedNativeSessionFile.MediaBrowserCompat$CustomActionResultReceiver = string;
                fileBackedNativeSessionFile.IconCompatParcelizer = str;
                this.read++;
                fileBackedNativeSessionFile.read = "MY_FUNDS_GROUP_VIEW_TYPE_NO_FUND";
                list.add(fileBackedNativeSessionFile);
            } else if (i2 == 1) {
                createAndStoreIid MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(getgeofencetransition);
                List<GeofencingRequest> list2 = getgeofencetransition.MediaBrowserCompat$CustomActionResultReceiver;
                ExecutorUtils MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver((list2 == null || list2.isEmpty()) ? null : list2.get(0));
                ExecutorUtils.C33402 r1 = new buildSingleThreadExecutorService() {
                    public ExecutorUtils MediaBrowserCompat$ItemReceiver;
                    public createAndStoreIid write;
                };
                r1.write = MediaBrowserCompat$ItemReceiver;
                r1.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;
                this.read++;
                r1.read = "MY_FUNDS_GROUP_VIEW_TYPE_SINGLE";
                list.add(r1);
            } else {
                ArrayList arrayList = new ArrayList();
                for (GeofencingRequest MediaBrowserCompat$CustomActionResultReceiver2 : getgeofencetransition.MediaBrowserCompat$CustomActionResultReceiver) {
                    ExecutorUtils.C33371.C33381 r5 = new buildSingleThreadExecutorService() {
                        public ExecutorUtils write;
                    };
                    r5.write = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                    this.read++;
                    arrayList.add(r5);
                }
                createAndStoreIid MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(getgeofencetransition);
                getNamedThreadFactory getnamedthreadfactory = new getNamedThreadFactory();
                getnamedthreadfactory.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
                getnamedthreadfactory.write = arrayList;
                this.read++;
                getnamedthreadfactory.read = "MY_FUNDS_VIEW_TYPE_EXPANDABLE";
                list.add(getnamedthreadfactory);
                double d = getgeofencetransition.MediaBrowserCompat$SearchResultReceiver;
                String write = write(Double.valueOf(getgeofencetransition.ParcelableVolumeInfo));
                String format = String.format("%s (%s%%)", new Object[]{read(Double.valueOf(d)), read(Double.valueOf(getgeofencetransition.MediaMetadataCompat))});
                int i4 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
                if (i4 > 0) {
                    i = Iterables.C35273.read.light_green;
                } else if (d < 0.0d) {
                    i = Iterables.C35273.read.light_red;
                } else {
                    i = Iterables.C35273.read.fake_black;
                }
                if (i4 != 0) {
                    i3 = i4 > 0 ? Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_up : Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_down;
                }
                formatId formatid = new formatId();
                formatid.IconCompatParcelizer = write;
                formatid.write = format;
                formatid.MediaBrowserCompat$ItemReceiver = i;
                formatid.MediaBrowserCompat$CustomActionResultReceiver = i3;
                this.read++;
                formatid.read = "MY_FUNDS_GROUP_VIEW_TYPE_FOOTER";
                list.add(formatid);
            }
        }
    }

    /* renamed from: o.StandardRowSortedTable$RowSortedMap */
    public final /* synthetic */ class RowSortedMap implements findFragmentByWho {
        private final /* synthetic */ createColumnKeyIterator write;

        public /* synthetic */ RowSortedMap(createColumnKeyIterator createcolumnkeyiterator) {
            this.write = createcolumnkeyiterator;
        }

        public final Object IconCompatParcelizer(Object obj) {
            setInitialTrigger setinitialtrigger = (setInitialTrigger) obj;
            return new Object(setinitialtrigger.MediaBrowserCompat$ItemReceiver, setinitialtrigger.write, setinitialtrigger.MediaBrowserCompat$CustomActionResultReceiver) {
                public final String IconCompatParcelizer;
                public final String MediaBrowserCompat$CustomActionResultReceiver;
                public final String read;

                public final boolean equals(
/*
Method generation error in method: o.CrashlyticsCore.2.equals(java.lang.Object):boolean, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CrashlyticsCore.2.equals(java.lang.Object):boolean, class status: UNLOADED
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

                public final int hashCode(
/*
Method generation error in method: o.CrashlyticsCore.2.hashCode():int, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CrashlyticsCore.2.hashCode():int, class status: UNLOADED
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

                public final java.lang.String toString(
/*
Method generation error in method: o.CrashlyticsCore.2.toString():java.lang.String, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CrashlyticsCore.2.toString():java.lang.String, class status: UNLOADED
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
        }
    }
}
