package com.scb.phone.view.fragment.profilemanagement.manageaccounts;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeJuristicSetupResetPinActivity;
import p040o.ActivityBuilder_ContributeJustForYouLandingActivity;
import p040o.ActivityBuilder_ContributeLifestyleDeepLinkActivity;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.VideoPlayerCameraPlayer;
import p040o.access$2300;
import p040o.getBlackStreakMaxHeight;
import p040o.getDateOfBirthFieldName;
import p040o.getDocumentStateFieldName;
import p040o.getDocumentTypeFieldName;
import p040o.getSignal;
import p040o.isInetAddress;
import p040o.preauthenticate;
import p040o.setMaxHeight;
import p040o.updateDevice;
import p040o.zzmd;
import p040o.zzuk;
import p040o.zzvf;

public class AccountManagementFragment extends BaseFragment implements getBlackStreakMaxHeight.read {
    /* access modifiers changed from: private */
    public updateDevice IconCompatParcelizer;
    private CustomDialog MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    View layoutEmptyAccount;
    @HmlPinActivity
    public VideoPlayerCameraPlayer.C3943b presenter;
    @BindView
    RecyclerView recyclerView;

    public static AccountManagementFragment MediaDescriptionCompat() {
        Bundle bundle = new Bundle();
        AccountManagementFragment accountManagementFragment = new AccountManagementFragment();
        accountManagementFragment.setArguments(bundle);
        return accountManagementFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85452131493772, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("manageaccount_landing");
        }
        zzmd.zzm.zzb.zza zza2 = null;
        if (this.IconCompatParcelizer == null) {
            zzmd.zzm.zzb.zza zza3 = zzmd.zzm.zzb.zza.JURISTIC;
            if (getActivity() instanceof PreLoadCheckActivity) {
                zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
            } else {
                zza = null;
            }
            this.IconCompatParcelizer = new updateDevice(zza3 == zza, new updateDevice.read() {
                public final void read(getSignal getsignal) {
                    String string;
                    String string2;
                    String string3;
                    String string4;
                    VideoPlayerCameraPlayer.C3943b bVar = AccountManagementFragment.this.presenter;
                    if (15 == getsignal.read()) {
                        string = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_title_type_debit_card);
                        string2 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_message_type_debit_card);
                        string3 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_positive_label);
                        string4 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_negative_label);
                    } else if (2 == getsignal.read()) {
                        string = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_title_type_deposit);
                        string2 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_message_type_deposit);
                        string3 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_deposit_positive_label);
                        string4 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_deposit_negative_label);
                    } else {
                        string = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_title);
                        string2 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_message);
                        string3 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_positive_label);
                        string4 = bVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_delete_negative_label);
                    }
                    getDocumentStateFieldName getdocumentstatefieldname = new getDocumentStateFieldName(bVar, string, string2, string3, string4, getsignal);
                    if (bVar.RatingCompat != null) {
                        getdocumentstatefieldname.IconCompatParcelizer(bVar.RatingCompat);
                    }
                }

                public final void write(getSignal getsignal, String str) {
                    VideoPlayerCameraPlayer.C3943b bVar = AccountManagementFragment.this.presenter;
                    if (bVar.RatingCompat != null) {
                        bVar.RatingCompat.AlertController$RecycleListView();
                    }
                    bVar.write.read(isInetAddress.read(getsignal, str));
                    bVar.write.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk>() {
                        public final /* synthetic */ void onNext(
/*
Method generation error in method: o.VideoPlayerCameraPlayer.b.1.onNext(java.lang.Object):void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.VideoPlayerCameraPlayer.b.1.onNext(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        public final void onError(
/*
Method generation error in method: o.VideoPlayerCameraPlayer.b.1.onError(java.lang.Throwable):void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.VideoPlayerCameraPlayer.b.1.onError(java.lang.Throwable):void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }

                public final void write(getSignal getsignal) {
                    AccountManagementFragment.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(getsignal);
                }
            }, new ActivityBuilder_ContributeJuristicSetupResetPinActivity(this));
        }
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setItemAnimator(new setMaxHeight());
        this.recyclerView.setAdapter(this.IconCompatParcelizer);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new preauthenticate(), -1);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        VideoPlayerCameraPlayer.C3943b bVar = this.presenter;
        zzmd.zzm.zzb.zza zza4 = zzmd.zzm.zzb.zza.JURISTIC;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza2 = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        }
        boolean z2 = zza4 == zza2;
        bVar.MediaBrowserCompat$ItemReceiver = z2;
        zzvf RatingCompat = bVar.read.read.RatingCompat();
        List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> IconCompatParcelizer2 = bVar.MediaDescriptionCompat.IconCompatParcelizer(RatingCompat, bVar.write.MediaBrowserCompat$ItemReceiver.setItemInvoker(), z2);
        bVar.IconCompatParcelizer = IconCompatParcelizer2;
        if (IconCompatParcelizer2.isEmpty() && RatingCompat != null && !RatingCompat.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver) {
            getDateOfBirthFieldName getdateofbirthfieldname = getDateOfBirthFieldName.read;
            if (bVar.RatingCompat != null) {
                getdateofbirthfieldname.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
        getDocumentTypeFieldName getdocumenttypefieldname = new getDocumentTypeFieldName(bVar);
        if (bVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getdocumenttypefieldname.IconCompatParcelizer(bVar.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        this.IconCompatParcelizer.IconCompatParcelizer(list);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, access$2300 access_2300) {
        CustomDialog customDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customDialog != null) {
            customDialog.dismiss();
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2);
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str3, new ActivityBuilder_ContributeJustForYouLandingActivity(access_2300));
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(str4, ActivityBuilder_ContributeLifestyleDeepLinkActivity.IconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver.setCancelable(false);
        this.MediaBrowserCompat$CustomActionResultReceiver.show();
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(access$2300 access_2300, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        access_2300.MediaBrowserCompat$CustomActionResultReceiver.run();
    }

    public final void read(int i) {
        String str;
        if (i == 1) {
            str = getString(R.string.account_management_last_account_errror_message);
        } else if (i == 0) {
            str = getString(R.string.account_management_mutual_fund_errror_message);
        } else {
            str = "";
        }
        String str2 = str;
        if (getActivity() != null) {
            AlertController$RecycleListView.read(getActivity(), R.id.view_group_root, R.drawable.error, str2, R.color.f71012131100257, R.color.f66062131099761, 0);
        }
    }

    public final void read(String str) {
        if (getActivity() != null) {
            AlertController$RecycleListView.read(getActivity(), R.id.view_group_root, R.drawable.error, str, R.color.f71012131100257, R.color.f66062131099761, 0);
        }
    }

    public final void RatingCompat() {
        MediaBrowserCompat$ItemReceiver(getString(R.string.account_management_delete_success));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    public final void write() {
        if (getContext() != null) {
            AddAccountConsentActivity.IconCompatParcelizer(getContext());
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH");
            getActivity().sendBroadcast(intent);
        }
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_NICKNAME_CHANGED");
            getActivity().sendBroadcast(intent);
        }
    }

    public final void read() {
        this.layoutEmptyAccount.setVisibility(0);
    }
}
