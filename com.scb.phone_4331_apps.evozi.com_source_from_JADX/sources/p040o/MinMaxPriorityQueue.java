package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p040o.AlertController$RecycleListView;
import p040o.ComponentDiscovery;
import p040o.CrashlyticsReport;
import p040o.GoogleMap;
import p040o.Iterables;
import p040o.MapConstraints;
import p040o.SignedBytes;
import p040o.awaitEvenIfOnMainThread;
import p040o.race;
import p040o.standardStartAndWait;

/* renamed from: o.MinMaxPriorityQueue */
public final class MinMaxPriorityQueue extends MapConstraints.C36312.C36321 {
    private final String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.MinMaxPriorityQueue$MoveDesc */
    public final class MoveDesc extends constrainedListMultimap {
        @HmlPinActivity
        public MoveDesc(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    /* renamed from: o.MinMaxPriorityQueue$Builder */
    public final class Builder extends SignedBytes.LexicographicalComparator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public Builder(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
            super(resources, sharedPreferences, str);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) str, "baseAssetsURL");
        }
    }

    /* renamed from: o.MinMaxPriorityQueue$Heap */
    public final class Heap extends pollLast {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public Heap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }

        public final getComponent write(getLocationAvailability getlocationavailability, requestActivityUpdates requestactivityupdates, zzvo zzvo) {
            String str;
            getLocationAvailability getlocationavailability2 = getlocationavailability;
            requestActivityUpdates requestactivityupdates2 = requestactivityupdates;
            zzvo zzvo2 = zzvo;
            onGetStartedClick.write((Object) getlocationavailability2, "closeConfirmation");
            onGetStartedClick.write((Object) requestactivityupdates2, "eligibility");
            onGetStartedClick.write((Object) zzvo2, "closingAccount");
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            NumberFormat MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance);
            String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(requestactivityupdates2.read.RatingCompat, false);
            String str2 = getlocationavailability2.MediaBrowserCompat$ItemReceiver;
            if (getlocationavailability2.IconCompatParcelizer == null) {
                str = "";
            } else {
                str = IconCompatParcelizer("dd MMM yyyy - HH:mm", getlocationavailability2.IconCompatParcelizer);
            }
            onGetStartedClick.IconCompatParcelizer((Object) str, "if (closeConfirmation.tr…tion.transactionDateTime)");
            String str3 = requestactivityupdates2.read.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "accountNumber");
            standardStopAndWait standardstopandwait = new standardStopAndWait(str3, MediaBrowserCompat$CustomActionResultReceiver, requestactivityupdates2.read.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver(requestactivityupdates2.read.MediaSessionCompat$Token, zzvo2.MediaSessionCompat$QueueItem), requestactivityupdates2.read.MediaMetadataCompat);
            String format = MediaBrowserCompat$ItemReceiver.format(requestactivityupdates2.read.write);
            onGetStartedClick.IconCompatParcelizer((Object) format, "formatter.format(eligibi…y.closingAccount.balance)");
            String format2 = MediaBrowserCompat$ItemReceiver.format(requestactivityupdates2.read.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) format2, "formatter.format(eligibi….closingAccount.interest)");
            double d = requestactivityupdates2.read.MediaBrowserCompat$SearchResultReceiver;
            if (d > 0.0d) {
                d = -d;
            }
            String format3 = MediaBrowserCompat$ItemReceiver.format(d);
            onGetStartedClick.IconCompatParcelizer((Object) format3, "formatter.format(eligibi…                       })");
            double d2 = requestactivityupdates2.read.MediaBrowserCompat$CustomActionResultReceiver;
            if (d2 > 0.0d) {
                d2 = -d2;
            }
            String format4 = MediaBrowserCompat$ItemReceiver.format(d2);
            onGetStartedClick.IconCompatParcelizer((Object) format4, "formatter.format(eligibi…                       })");
            String str4 = str2;
            double d3 = requestactivityupdates2.read.read;
            if (d3 > 0.0d) {
                d3 = -d3;
            }
            String format5 = MediaBrowserCompat$ItemReceiver.format(d3);
            onGetStartedClick.IconCompatParcelizer((Object) format5, "formatter.format(eligibi…                       })");
            String format6 = MediaBrowserCompat$ItemReceiver.format(requestactivityupdates2.read.MediaDescriptionCompat);
            onGetStartedClick.IconCompatParcelizer((Object) format6, "formatter.format(eligibi…closingAccount.netAmount)");
            addDependency adddependency = new addDependency(format, format2, format3, format4, format5, format6);
            String str5 = requestactivityupdates2.MediaBrowserCompat$ItemReceiver.write;
            if (str5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            MissingDependencyException missingDependencyException = new MissingDependencyException(str5, getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(requestactivityupdates2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, true), getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString());
            List<C5229x76737fb9> list = requestactivityupdates2.IconCompatParcelizer;
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance2.setMinimumFractionDigits(2);
            currencyInstance2.setMaximumFractionDigits(2);
            NumberFormat MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (C5229x76737fb9 requestactivityupdates_mediabrowsercompat_customactionresultreceiver : list) {
                    this.read = new ArrayList();
                    race.write MediaBrowserCompat$ItemReceiver3 = race.MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$ItemReceiver3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.close_account_details_amount_success);
                    MediaBrowserCompat$ItemReceiver3.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.format(requestactivityupdates_mediabrowsercompat_customactionresultreceiver.read);
                    MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$MediaItem = true;
                    read(MediaBrowserCompat$ItemReceiver3.read());
                    race.write MediaBrowserCompat$ItemReceiver4 = race.MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$ItemReceiver4.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.close_account_details_interest);
                    MediaBrowserCompat$ItemReceiver4.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.format(requestactivityupdates_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver4.MediaBrowserCompat$MediaItem = true;
                    read(MediaBrowserCompat$ItemReceiver4.read());
                    race.write MediaBrowserCompat$ItemReceiver5 = race.MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$ItemReceiver5.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.close_account_details_withholding);
                    double d4 = requestactivityupdates_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
                    if (d4 > 0.0d) {
                        d4 = -d4;
                    }
                    MediaBrowserCompat$ItemReceiver5.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.format(d4);
                    MediaBrowserCompat$ItemReceiver5.MediaBrowserCompat$MediaItem = true;
                    read(MediaBrowserCompat$ItemReceiver5.read());
                    race.write MediaBrowserCompat$ItemReceiver6 = race.MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$ItemReceiver6.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.close_account_details_total_amount);
                    MediaBrowserCompat$ItemReceiver6.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.format(requestactivityupdates_mediabrowsercompat_customactionresultreceiver.RatingCompat);
                    MediaBrowserCompat$ItemReceiver6.MediaBrowserCompat$MediaItem = true;
                    race read = MediaBrowserCompat$ItemReceiver6.read();
                    List<ForwardingFuture> list2 = this.read;
                    onGetStartedClick.IconCompatParcelizer((Object) list2, "displays");
                    List MediaBrowserCompat$CustomActionResultReceiver2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(list2);
                    String str6 = requestactivityupdates_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
                    onGetStartedClick.IconCompatParcelizer((Object) read, "totalAmountDisplay");
                    arrayList.add(new addDependent(str6, MediaBrowserCompat$CustomActionResultReceiver2, read));
                }
            }
            return new getComponent(str4, str, standardstopandwait, adddependency, missingDependencyException, arrayList, "CloseConfirmationFile");
        }
    }

    /* renamed from: o.MinMaxPriorityQueue$QueueIterator */
    public final class QueueIterator extends constrainedListMultimap {
        @HmlPinActivity
        public QueueIterator(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        public final standardStartAndWait write(List<ForwardingFuture> list, clearTileCache cleartilecache) {
            String str;
            ArrayList arrayList = new ArrayList();
            capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read = capSessionCount.read();
            read.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_card_request_success_header);
            read.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
            if (cleartilecache.MediaBrowserCompat$ItemReceiver == null) {
                str = "";
            } else {
                str = IconCompatParcelizer("dd MMM yyyy - HH:mm", cleartilecache.MediaBrowserCompat$ItemReceiver);
            }
            read.read = str;
            read.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id, new Object[]{cleartilecache.IconCompatParcelizer});
            arrayList.add(new capSessionCount(read, (byte) 0));
            arrayList.add(new callTask());
            arrayList.addAll(list);
            standardStartAndWait.IconCompatParcelizer write = standardStartAndWait.write(arrayList, this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_card_request_filename));
            write.MediaDescriptionCompat = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_card_request_remaining_text), new Object[]{write(Double.valueOf(cleartilecache.MediaBrowserCompat$CustomActionResultReceiver))});
            return write.read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public MinMaxPriorityQueue(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        new constrainedListMultimap(resources, sharedPreferences) {
            public List<ForwardingFuture> read;

            public final void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.MapConstraints.2.1.MediaBrowserCompat$CustomActionResultReceiver(o.ForwardingFuture):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.MediaBrowserCompat$CustomActionResultReceiver(o.ForwardingFuture):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void read(
/*
Method generation error in method: o.MapConstraints.2.1.read(o.ForwardingFuture):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.read(o.ForwardingFuture):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void IconCompatParcelizer(
/*
Method generation error in method: o.MapConstraints.2.1.IconCompatParcelizer(java.util.List, boolean):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.IconCompatParcelizer(java.util.List, boolean):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void write(
/*
Method generation error in method: o.MapConstraints.2.1.write(o.ForwardingFuture):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.write(o.ForwardingFuture):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void IconCompatParcelizer(
/*
Method generation error in method: o.MapConstraints.2.1.IconCompatParcelizer(o.ForwardingFuture, boolean):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.IconCompatParcelizer(o.ForwardingFuture, boolean):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void MediaBrowserCompat$ItemReceiver(
/*
Method generation error in method: o.MapConstraints.2.1.MediaBrowserCompat$ItemReceiver(o.ForwardingFuture):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.MediaBrowserCompat$ItemReceiver(o.ForwardingFuture):void, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final java.lang.String MediaBrowserCompat$MediaItem(
/*
Method generation error in method: o.MapConstraints.2.1.MediaBrowserCompat$MediaItem(java.lang.String):java.lang.String, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.MapConstraints.2.1.MediaBrowserCompat$MediaItem(java.lang.String):java.lang.String, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        };
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final standardStartAndWait read(setOfProvider setofprovider, GoogleMap.zza zza) {
        String str;
        onGetStartedClick.write((Object) setofprovider, "ccSofReviewDisplay");
        onGetStartedClick.write((Object) zza, "purchasePaymentConfirmation");
        ArrayList arrayList = new ArrayList();
        capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read = capSessionCount.read();
        read.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.successful_purchase_payment);
        read.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
        String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy - HH:mm", zza.MediaBrowserCompat$ItemReceiver);
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = "-";
        }
        read.read = IconCompatParcelizer;
        read.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id, new Object[]{zza.read});
        read.MediaBrowserCompat$CustomActionResultReceiver = Iterables.C35273.read.dark_gray;
        arrayList.add(new capSessionCount(read, CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SUCCESS_HEADER, (byte) 0));
        arrayList.add(new callTask(true));
        arrayList.addAll(MediaBrowserCompat$CustomActionResultReceiver(setofprovider));
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(setofprovider.RatingCompat, CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN.code, false)) {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.txv_deejung_installments_updation_text);
            onGetStartedClick.IconCompatParcelizer((Object) str, "resources.getString(R.st…stallments_updation_text)");
        } else {
            FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_success_extra_text_remaining_balance);
            onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…a_text_remaining_balance)");
            str = String.format(string, Arrays.copyOf(new Object[]{write(zza.write)}, 1));
            onGetStartedClick.IconCompatParcelizer((Object) str, "java.lang.String.format(format, *args)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CcSof_");
        sb.append(zza.read);
        standardStartAndWait.IconCompatParcelizer write = standardStartAndWait.write(arrayList, sb.toString());
        write.RatingCompat = true;
        write.MediaDescriptionCompat = str;
        write.MediaSessionCompat$ResultReceiverWrapper = ProcMapEntry.DEFAULT;
        standardStartAndWait read2 = write.read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "SuccessfulDisplay.newBui…\n                .build()");
        return read2;
    }

    public static List<getUserId> read(List<ambientEnabled> list) {
        if (list == null) {
            return null;
        }
        Iterable<ambientEnabled> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (ambientEnabled ambientenabled : iterable) {
            arrayList.add(new getUserId(ambientenabled.MediaBrowserCompat$CustomActionResultReceiver, ambientenabled.IconCompatParcelizer));
        }
        return (List) arrayList;
    }

    private final List<ForwardingFuture> MediaBrowserCompat$CustomActionResultReceiver(setOfProvider setofprovider) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List<ComponentRuntime> list;
        this.read.clear();
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.from);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
        ComponentDiscovery.C31871 r1 = setofprovider.MediaBrowserCompat$SearchResultReceiver;
        String str8 = null;
        if (r1 != null) {
            str = r1.MediaBrowserCompat$ItemReceiver;
        } else {
            str = null;
        }
        iconCompatParcelizer.MediaMetadataCompat = str;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        ComponentDiscovery.C31871 r12 = setofprovider.MediaBrowserCompat$SearchResultReceiver;
        if (r12 != null) {
            str2 = r12.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str2 = null;
        }
        ComponentDiscovery.C31871 r3 = setofprovider.MediaBrowserCompat$SearchResultReceiver;
        if (r3 != null) {
            str3 = r3.read;
        } else {
            str3 = null;
        }
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.IconCompatParcelizer(str2, str3);
        iconCompatParcelizer2.IconCompatParcelizer = true;
        ComponentDiscovery.C31871 r32 = setofprovider.MediaBrowserCompat$SearchResultReceiver;
        if (r32 != null) {
            str4 = r32.IconCompatParcelizer;
        } else {
            str4 = null;
        }
        iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(str4, Iterables$3$MediaBrowserCompat$ItemReceiver.ic_bill_credit_card);
        iconCompatParcelizer2.read = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_bill_credit_card;
        MediaBrowserCompat$CustomActionResultReceiver(new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0));
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer2 = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2745to);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer2;
        forContext forcontext = setofprovider.MediaDescriptionCompat;
        if (forcontext != null) {
            str5 = forcontext.read;
        } else {
            str5 = null;
        }
        iconCompatParcelizer3.MediaMetadataCompat = str5;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer3;
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_1));
        sb.append(' ');
        sb.append(": ");
        forContext forcontext2 = setofprovider.MediaDescriptionCompat;
        if (forcontext2 != null) {
            str6 = forcontext2.IconCompatParcelizer;
        } else {
            str6 = null;
        }
        sb.append(str6);
        iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
        forContext forcontext3 = setofprovider.MediaDescriptionCompat;
        if (forcontext3 != null) {
            str8 = forcontext3.write;
        }
        iconCompatParcelizer4.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(str8, Iterables$3$MediaBrowserCompat$ItemReceiver.biller_place_holder);
        iconCompatParcelizer4.read = Iterables$3$MediaBrowserCompat$ItemReceiver.biller_place_holder;
        iconCompatParcelizer4.ParcelableVolumeInfo = true;
        MediaBrowserCompat$CustomActionResultReceiver(new awaitEvenIfOnMainThread(iconCompatParcelizer4, (byte) 0));
        race.write read = race.read();
        read.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.amount);
        read.MediaMetadataCompat = write(setofprovider.write);
        read.MediaDescriptionCompat = true;
        MediaBrowserCompat$ItemReceiver(read.read());
        race.write read2 = race.read();
        read2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_cash_out_fee);
        if (setofprovider.IconCompatParcelizer == null || setofprovider.IconCompatParcelizer.doubleValue() <= 0.0d) {
            str7 = write(Double.valueOf(0.0d));
            onGetStartedClick.IconCompatParcelizer((Object) str7, "transformFund(0.00)");
        } else {
            str7 = write(setofprovider.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) str7, "transformFund(ccSofReviewDisplay.fee)");
        }
        read2.MediaMetadataCompat = str7;
        read2.ParcelableVolumeInfo = true;
        if (setofprovider.IconCompatParcelizer == null || setofprovider.IconCompatParcelizer.doubleValue() <= 0.0d) {
            read2.MediaSessionCompat$Token = true;
        }
        MediaBrowserCompat$CustomActionResultReceiver(read2.read());
        ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever = setofprovider.read;
        if (registrarNameRetriever != null) {
            race.write read3 = race.read();
            read3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.duration);
            read3.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_review_no_of_months, new Object[]{Integer.valueOf(registrarNameRetriever.RatingCompat)});
            MediaBrowserCompat$ItemReceiver(read3.read());
            race.write read4 = race.read();
            read4.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_input_monthly_interest_rate);
            StringBuilder sb2 = new StringBuilder();
            Double valueOf = Double.valueOf(registrarNameRetriever.MediaBrowserCompat$CustomActionResultReceiver);
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            sb2.append(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf));
            sb2.append('%');
            read4.MediaMetadataCompat = sb2.toString();
            MediaBrowserCompat$ItemReceiver(read4.read());
            race.write read5 = race.read();
            read5.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_input_total_payment);
            read5.MediaMetadataCompat = write(Double.valueOf(registrarNameRetriever.MediaBrowserCompat$SearchResultReceiver));
            read5.MediaDescriptionCompat = true;
            MediaBrowserCompat$ItemReceiver(read5.read());
            race.write MediaBrowserCompat$ItemReceiver2 = race.MediaBrowserCompat$ItemReceiver(CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE_SUB_ITEM);
            MediaBrowserCompat$ItemReceiver2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_input_principal);
            MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat = write(setofprovider.write);
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem = true;
            MediaBrowserCompat$ItemReceiver2.MediaDescriptionCompat = true;
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2.read());
            race.write MediaBrowserCompat$ItemReceiver3 = race.MediaBrowserCompat$ItemReceiver(CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE_SUB_ITEM);
            MediaBrowserCompat$ItemReceiver3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_input_interest);
            MediaBrowserCompat$ItemReceiver3.MediaMetadataCompat = write(Double.valueOf(registrarNameRetriever.read));
            MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$MediaItem = true;
            MediaBrowserCompat$ItemReceiver3.ParcelableVolumeInfo = true;
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3.read());
            race.write read6 = race.read();
            read6.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_input_monthly_payment);
            read6.MediaMetadataCompat = write(Double.valueOf(registrarNameRetriever.MediaBrowserCompat$ItemReceiver));
            MediaBrowserCompat$ItemReceiver(read6.read());
        }
        String str9 = setofprovider.MediaBrowserCompat$CustomActionResultReceiver;
        if (str9 != null && !AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(str9)) {
            capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_ccsof_review_email);
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = true;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = setofprovider.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$ItemReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0));
        }
        String str10 = setofprovider.MediaBrowserCompat$MediaItem;
        if (str10 != null && !AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(str10)) {
            capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = true;
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = setofprovider.MediaBrowserCompat$MediaItem;
            MediaBrowserCompat$ItemReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0));
        }
        String str11 = setofprovider.MediaMetadataCompat;
        if (str11 != null && !AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(str11)) {
            capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver3 = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver3.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_cash_out_note);
            MediaBrowserCompat$CustomActionResultReceiver3.MediaSessionCompat$Token = true;
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver = setofprovider.MediaMetadataCompat;
            MediaBrowserCompat$ItemReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver3, (byte) 0));
        }
        ComponentFactory componentFactory = setofprovider.MediaBrowserCompat$ItemReceiver;
        if (!(componentFactory == null || (list = componentFactory.MediaBrowserCompat$ItemReceiver) == null)) {
            list.isEmpty();
            C3769x8df5a479 write = SessionReportingCoordinator$$Lambda$1.write();
            Iterable<ComponentRuntime> iterable = setofprovider.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (ComponentRuntime componentRuntime : iterable) {
                arrayList.add(new CrashlyticsReport.Session.OperatingSystem.Builder(componentRuntime.MediaBrowserCompat$CustomActionResultReceiver, componentRuntime.write, componentRuntime.MediaBrowserCompat$ItemReceiver, componentRuntime.IconCompatParcelizer, componentRuntime.read, (String) null));
            }
            write.MediaBrowserCompat$ItemReceiver = (List) arrayList;
            MediaBrowserCompat$ItemReceiver(new SessionReportingCoordinator$$Lambda$1((C3769x8df5a479<?>) write));
        }
        List<ForwardingFuture> list2 = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) list2, "displays");
        return list2;
    }

    private final String MediaBrowserCompat$ItemReceiver(String str, int i) {
        String str2;
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str, this.MediaBrowserCompat$ItemReceiver);
        Uri MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (str2 = MediaBrowserCompat$CustomActionResultReceiver2.toString()) == null) {
            str2 = "";
        }
        onGetStartedClick.IconCompatParcelizer((Object) str2, "Utilities.drawableUri(pl…holder)?.toString() ?: \"\"");
        return AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver) ? str2 : MediaBrowserCompat$CustomActionResultReceiver;
    }
}
