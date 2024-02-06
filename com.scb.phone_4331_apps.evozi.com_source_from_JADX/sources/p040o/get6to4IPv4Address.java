package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getSignal;
import p040o.setUiOrientation;

/* renamed from: o.get6to4IPv4Address */
public final class get6to4IPv4Address extends constrainedListMultimap {
    public boolean MediaBrowserCompat$ItemReceiver = true;

    @HmlPinActivity
    public get6to4IPv4Address(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder, boolean z) {
        ArrayList arrayList = new ArrayList();
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_pending_cards_header);
        ArrayList arrayList2 = new ArrayList();
        if (builder.read.IconCompatParcelizer != null) {
            String str = builder.read.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer.read = 13;
            IconCompatParcelizer.write = str;
            arrayList2.add(new setUiOrientation(IconCompatParcelizer, (byte) 0));
        } else {
            arrayList2.addAll(MediaBrowserCompat$ItemReceiver(builder.read.write, new MultiInputStream(this)));
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            ((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) arrayList2.get(arrayList2.size() - 1)).read(true);
            getThreads$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver2 = getThreads.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = 1;
            MediaBrowserCompat$ItemReceiver2.read = "";
            arrayList2.add(new getThreads(MediaBrowserCompat$ItemReceiver2, (byte) 0));
            getThreads$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver3 = getThreads.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$CustomActionResultReceiver = 1;
            MediaBrowserCompat$ItemReceiver3.read = string;
            arrayList3.add(new getThreads(MediaBrowserCompat$ItemReceiver3, (byte) 0));
            arrayList3.addAll(arrayList2);
        }
        arrayList.addAll(arrayList3);
        int size = builder.write.write.size();
        int size2 = builder.IconCompatParcelizer.write.size();
        int size3 = size + size2 + builder.MediaBrowserCompat$CustomActionResultReceiver.write.size() + builder.MediaBrowserCompat$ItemReceiver.write.size() + builder.PlaybackStateCompat$CustomAction.write.size() + builder.PlaybackStateCompat.write.size() + builder.Keep.write.size() + builder.setHasDecor.write.size();
        if (builder.AlertController$RecycleListView.write == null && builder.AlertController$RecycleListView.IconCompatParcelizer) {
            size3++;
        }
        if (size3 > 0) {
            setThreads$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver4 = setThreads.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver4.MediaBrowserCompat$CustomActionResultReceiver = 9;
            MediaBrowserCompat$ItemReceiver4.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_title_selector);
            MediaBrowserCompat$ItemReceiver4.read = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_description_selector);
            arrayList.add(new setThreads(MediaBrowserCompat$ItemReceiver4, (byte) 0));
        } else {
            if (!((builder.write.IconCompatParcelizer == null && builder.IconCompatParcelizer.IconCompatParcelizer == null && builder.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == null && builder.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == null && builder.PlaybackStateCompat$CustomAction.IconCompatParcelizer == null && builder.PlaybackStateCompat.IconCompatParcelizer == null && builder.Keep.IconCompatParcelizer == null && builder.setHasDecor.IconCompatParcelizer == null && builder.AlertController$RecycleListView.write == null) ? false : true)) {
                this.MediaBrowserCompat$ItemReceiver = false;
            }
        }
        String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_credit_cards_and_speedy_cash_header);
        ArrayList arrayList4 = new ArrayList();
        if (builder.write.IconCompatParcelizer != null) {
            String str2 = builder.write.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer2 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer2.read = 13;
            IconCompatParcelizer2.write = str2;
            arrayList4.add(new setUiOrientation(IconCompatParcelizer2, (byte) 0));
        } else {
            arrayList4.addAll(MediaBrowserCompat$ItemReceiver(builder.write.write, new PatternFilenameFilter(this)));
        }
        arrayList.addAll(IconCompatParcelizer(string2, arrayList4));
        String string3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_atm_add_account_section);
        ArrayList arrayList5 = new ArrayList();
        if (builder.IconCompatParcelizer.IconCompatParcelizer != null) {
            String str3 = builder.IconCompatParcelizer.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer3 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer3.read = 13;
            IconCompatParcelizer3.write = str3;
            arrayList5.add(new setUiOrientation(IconCompatParcelizer3, (byte) 0));
        } else {
            arrayList5.addAll(MediaBrowserCompat$ItemReceiver(builder.IconCompatParcelizer.write, new OutputSupplier(this)));
        }
        arrayList.addAll(IconCompatParcelizer(string3, arrayList5));
        String string4 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_prepaid_card_header);
        ArrayList arrayList6 = new ArrayList();
        if (builder.Keep.IconCompatParcelizer != null) {
            String str4 = builder.Keep.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer4 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer4.read = 13;
            IconCompatParcelizer4.write = str4;
            arrayList6.add(new setUiOrientation(IconCompatParcelizer4, (byte) 0));
        } else {
            arrayList6.addAll(MediaBrowserCompat$ItemReceiver(builder.Keep.write, new Resources(this)));
        }
        arrayList.addAll(IconCompatParcelizer(string4, arrayList6));
        if (builder.MediaSessionCompat$Token) {
            String string5 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_accounts_need_verification);
            getUuid$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = getUuid.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 11;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = string5;
            MediaBrowserCompat$CustomActionResultReceiver.read = true;
            arrayList.add(new getUuid(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0));
        }
        String string6 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_deposit_header);
        ArrayList arrayList7 = new ArrayList();
        if (builder.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null) {
            String str5 = builder.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer5 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer5.read = 13;
            IconCompatParcelizer5.write = str5;
            arrayList7.add(new setUiOrientation(IconCompatParcelizer5, (byte) 0));
        } else {
            arrayList7.addAll(MediaBrowserCompat$ItemReceiver(builder.MediaBrowserCompat$ItemReceiver.write, new NullOutputStream(this, z)));
        }
        arrayList.addAll(IconCompatParcelizer(string6, arrayList7));
        String string7 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_shops_header);
        ArrayList arrayList8 = new ArrayList();
        if (builder.PlaybackStateCompat.IconCompatParcelizer != null) {
            String str6 = builder.PlaybackStateCompat.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer6 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer6.read = 13;
            IconCompatParcelizer6.write = str6;
            arrayList8.add(new setUiOrientation(IconCompatParcelizer6, (byte) 0));
        } else {
            arrayList8.addAll(MediaBrowserCompat$ItemReceiver(builder.PlaybackStateCompat.write, new findFragmentByWho() {
                public final java.lang.Object IconCompatParcelizer(
/*
Method generation error in method: o.Resources.1.IconCompatParcelizer(java.lang.Object):java.lang.Object, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.Resources.1.IconCompatParcelizer(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }));
        }
        arrayList.addAll(IconCompatParcelizer(string7, arrayList8));
        String string8 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_investment_header);
        ArrayList arrayList9 = new ArrayList();
        if (builder.AlertController$RecycleListView.write != null) {
            String str7 = builder.AlertController$RecycleListView.write;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer7 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer7.read = 13;
            IconCompatParcelizer7.write = str7;
            arrayList9.add(new setUiOrientation(IconCompatParcelizer7, (byte) 0));
        } else if (builder.AlertController$RecycleListView.IconCompatParcelizer) {
            getSignal.read MediaBrowserCompat$CustomActionResultReceiver2 = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = 12;
            MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_scbs_label);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$SearchResultReceiver = true;
            arrayList9.add(new getSignal(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0));
        }
        if (builder.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != null) {
            String str8 = builder.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer8 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer8.read = 13;
            IconCompatParcelizer8.write = str8;
            arrayList9.add(new setUiOrientation(IconCompatParcelizer8, (byte) 0));
        } else {
            arrayList9.addAll(MediaBrowserCompat$ItemReceiver(builder.MediaBrowserCompat$CustomActionResultReceiver.write, new getResource(this)));
        }
        arrayList.addAll(IconCompatParcelizer(string8, arrayList9));
        String string9 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_loans_header);
        ArrayList arrayList10 = new ArrayList();
        if (builder.PlaybackStateCompat$CustomAction.IconCompatParcelizer != null) {
            String str9 = builder.PlaybackStateCompat$CustomAction.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer9 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer9.read = 13;
            IconCompatParcelizer9.write = str9;
            arrayList10.add(new setUiOrientation(IconCompatParcelizer9, (byte) 0));
        } else {
            arrayList10.addAll(MediaBrowserCompat$ItemReceiver(builder.PlaybackStateCompat$CustomAction.write, new markSupported(this)));
        }
        arrayList.addAll(IconCompatParcelizer(string9, arrayList10));
        String string10 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_business_loans_header);
        ArrayList arrayList11 = new ArrayList();
        if (builder.setHasDecor.IconCompatParcelizer != null) {
            String str10 = builder.setHasDecor.IconCompatParcelizer;
            setUiOrientation.IconCompatParcelizer IconCompatParcelizer10 = setUiOrientation.IconCompatParcelizer();
            IconCompatParcelizer10.read = 13;
            IconCompatParcelizer10.write = str10;
            arrayList11.add(new setUiOrientation(IconCompatParcelizer10, (byte) 0));
        } else {
            arrayList11.addAll(MediaBrowserCompat$ItemReceiver(builder.setHasDecor.write, new ready(this)));
        }
        arrayList.addAll(IconCompatParcelizer(string10, arrayList11));
        return arrayList;
    }

    static AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder write(String str, int i, String str2, String str3, String str4, String str5) {
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = i;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = str;
        MediaBrowserCompat$CustomActionResultReceiver.read = str2;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = str3;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = str4;
        MediaBrowserCompat$CustomActionResultReceiver.write = str5;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }

    private static List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> IconCompatParcelizer(String str, List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            list.get(list.size() - 1).read(true);
            getThreads$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver2 = getThreads.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = 1;
            MediaBrowserCompat$ItemReceiver2.read = str;
            arrayList.add(new getThreads(MediaBrowserCompat$ItemReceiver2, (byte) 0));
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
