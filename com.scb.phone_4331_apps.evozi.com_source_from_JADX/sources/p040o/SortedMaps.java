package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.LinkedList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsCore;
import p040o.ExecutorUtils;
import p040o.isBuildIdValid;
import p040o.setupDialog;

/* renamed from: o.SortedMaps */
public final /* synthetic */ class SortedMaps implements getArguments {
    public static final /* synthetic */ SortedMaps read = new SortedMaps();

    /* renamed from: o.SortedMaps$FilteredSortedMap */
    public final /* synthetic */ class FilteredSortedMap implements findFragmentByWho {
        private final /* synthetic */ C38043 write;

        public /* synthetic */ FilteredSortedMap(C38043 r1) {
            this.write = r1;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return C38043.MediaBrowserCompat$ItemReceiver((setAlwaysShow) obj);
        }
    }

    private /* synthetic */ SortedMaps() {
    }

    public final Object read() {
        return new LinkedList();
    }

    /* renamed from: o.SortedMaps$SortedMapDifferenceImpl */
    public final class SortedMapDifferenceImpl extends constrainedListMultimap {
        @HmlPinActivity
        public SortedMapDifferenceImpl(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        static waitForAutomaticDataCollectionEnabled MediaBrowserCompat$ItemReceiver(LocationSettingsRequest locationSettingsRequest) {
            return new waitForAutomaticDataCollectionEnabled(locationSettingsRequest.MediaBrowserCompat$CustomActionResultReceiver, locationSettingsRequest.write, locationSettingsRequest.IconCompatParcelizer, locationSettingsRequest.RatingCompat, locationSettingsRequest.MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$ItemReceiver(Double.valueOf(locationSettingsRequest.read)), locationSettingsRequest.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.SortedMaps$TransformedEntriesSortedMap */
    public final class TransformedEntriesSortedMap extends constrainedListMultimap {
        @HmlPinActivity
        public TransformedEntriesSortedMap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        public final ExecutorUtils.C33371 MediaBrowserCompat$ItemReceiver(LocationAvailability locationAvailability, setNeedBle setneedble, String str, DataTransportState dataTransportState, waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled, String str2, String str3, String str4, String str5) {
            String str6;
            String str7;
            String str8;
            CrashlyticsFileMarker crashlyticsFileMarker;
            String str9;
            String str10;
            OffsetDateTime offsetDateTime;
            String str11;
            if ("U".equals(str2)) {
                str7 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_8);
                str6 = MediaBrowserCompat$ItemReceiver(Double.valueOf(Double.parseDouble(str4)));
            } else {
                str7 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_7);
                str6 = write(Double.valueOf(Double.parseDouble(str3)));
            }
            isBuildIdValid.IconCompatParcelizer IconCompatParcelizer = isBuildIdValid.IconCompatParcelizer();
            IconCompatParcelizer.f2873x50fd9e4a = "FUND_ACTION_SWITCH";
            IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_3);
            IconCompatParcelizer.MediaBrowserCompat$MediaItem = getICheckDeserializerRtti.MediaDescriptionCompat(str);
            IconCompatParcelizer.MediaSessionCompat$Token = str5;
            IconCompatParcelizer.setHasDecor = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_4);
            IconCompatParcelizer.PlaybackStateCompat$CustomAction = dataTransportState.MediaDescriptionCompat;
            IconCompatParcelizer.ParcelableVolumeInfo = dataTransportState.MediaSessionCompat$ResultReceiverWrapper;
            IconCompatParcelizer.Keep = dataTransportState.MediaBrowserCompat$MediaItem;
            IconCompatParcelizer.write = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_5);
            IconCompatParcelizer.read = waitforautomaticdatacollectionenabled.RatingCompat;
            IconCompatParcelizer.IconCompatParcelizer = waitforautomaticdatacollectionenabled.read;
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = waitforautomaticdatacollectionenabled.read;
            String str12 = "";
            if (setneedble.MediaSessionCompat$ResultReceiverWrapper != null) {
                str8 = IconCompatParcelizer("dd MMM yyyy", setneedble.MediaSessionCompat$ResultReceiverWrapper);
            } else {
                str8 = str12;
            }
            IconCompatParcelizer.PlaybackStateCompat = str8;
            IconCompatParcelizer.setContentView = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_6);
            IconCompatParcelizer.RatingCompat = str7;
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str6;
            IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_9);
            StringBuilder sb = new StringBuilder();
            sb.append(waitforautomaticdatacollectionenabled.IconCompatParcelizer);
            sb.append("%");
            IconCompatParcelizer.MediaSessionCompat$QueueItem = sb.toString();
            IconCompatParcelizer.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_review_10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dataTransportState.MediaBrowserCompat$SearchResultReceiver);
            sb2.append("%");
            IconCompatParcelizer.MediaDescriptionCompat = sb2.toString();
            LinkedList<CrashlyticsCore.C32462> linkedList = null;
            if (locationAvailability == null) {
                crashlyticsFileMarker = null;
            } else {
                if (setneedble.MediaSessionCompat$ResultReceiverWrapper != null) {
                    offsetDateTime = setneedble.MediaSessionCompat$ResultReceiverWrapper;
                } else {
                    offsetDateTime = setneedble.f5559x50fd9e4a;
                }
                C3254x99ffbafc crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver = new C3254x99ffbafc();
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.read = 0;
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = 2;
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.effective_investment_label);
                if (locationAvailability.write != null) {
                    str11 = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, locationAvailability.write);
                } else {
                    str11 = str12;
                }
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str11;
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.switch_investment_label);
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = IconCompatParcelizer("dd MMM yyyy", offsetDateTime);
                crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.write = null;
                crashlyticsFileMarker = new CrashlyticsFileMarker(crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
            }
            IconCompatParcelizer.AlertController$RecycleListView = crashlyticsFileMarker;
            isBuildIdValid isbuildidvalid = new isBuildIdValid(IconCompatParcelizer, (byte) 0);
            ExecutorUtils.C33371.IconCompatParcelizer iconCompatParcelizer = new ExecutorUtils.C33371.IconCompatParcelizer();
            iconCompatParcelizer.Keep = setneedble.Keep;
            iconCompatParcelizer.AlertController$RecycleListView = setneedble.MediaSessionCompat$Token;
            if (setneedble.f5559x50fd9e4a != null) {
                str9 = IconCompatParcelizer("dd MMM yyyy", setneedble.f5559x50fd9e4a);
            } else {
                str9 = str12;
            }
            iconCompatParcelizer.f2708x50fd9e4a = str9;
            if (setneedble.MediaSessionCompat$ResultReceiverWrapper != null) {
                str10 = IconCompatParcelizer("dd MMM yyyy", setneedble.MediaSessionCompat$ResultReceiverWrapper);
            } else {
                str10 = str12;
            }
            iconCompatParcelizer.MediaMetadataCompat = str10;
            iconCompatParcelizer.MediaBrowserCompat$MediaItem = setneedble.MediaDescriptionCompat;
            iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = setneedble.RatingCompat;
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = setneedble.read;
            iconCompatParcelizer.MediaSessionCompat$QueueItem = setneedble.MediaSessionCompat$QueueItem;
            iconCompatParcelizer.ParcelableVolumeInfo = setneedble.ParcelableVolumeInfo;
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = isbuildidvalid;
            boolean z = true;
            iconCompatParcelizer.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver(setneedble.write, true);
            iconCompatParcelizer.read = setneedble.MediaBrowserCompat$ItemReceiver;
            iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = waitforautomaticdatacollectionenabled.MediaMetadataCompat;
            iconCompatParcelizer.MediaSessionCompat$Token = dataTransportState.MediaMetadataCompat;
            iconCompatParcelizer.MediaDescriptionCompat = setneedble.MediaBrowserCompat$MediaItem;
            if (setneedble.AlertController$RecycleListView == null || !setneedble.AlertController$RecycleListView.equals("Y")) {
                z = false;
            }
            iconCompatParcelizer.write = z;
            if (setneedble.PlaybackStateCompat != null) {
                str12 = setneedble.PlaybackStateCompat;
            }
            iconCompatParcelizer.PlaybackStateCompat$CustomAction = str12;
            if (setneedble.MediaMetadataCompat != null) {
                linkedList = MediaBrowserCompat$CustomActionResultReceiver(setneedble.MediaMetadataCompat);
            }
            iconCompatParcelizer.RatingCompat = linkedList;
            return new ExecutorUtils.C33371(iconCompatParcelizer, (byte) 0);
        }

        private LinkedList<CrashlyticsCore.C32462> MediaBrowserCompat$CustomActionResultReceiver(List<setInitialTrigger> list) {
            show show = new show(list);
            return (LinkedList) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new orNaturalOrder(this))).write(new setupDialog.IconCompatParcelizer(SortedMaps.read, new ensureAnimationInfo<R, T>() {
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.3.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.3.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
            }));
        }
    }
}
