package com.scb.phone.view.fragment.landingpage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0065xe743b54a;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.bankingaccount.BankingActionActivity;
import com.scb.phone.view.activity.contactus.ContactUsActivity;
import com.scb.phone.view.activity.donations.DonationsLandingActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.activity.etb.ETBCheckEligibilityActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.hml.C5607x23cfbb87;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsLandingActivity;
import com.scb.phone.view.activity.juristic.JuristicOnboardingLandingActivity;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import com.scb.phone.view.activity.landingpage.GroupBillerActivity;
import com.scb.phone.view.activity.landingpage.GroupFavoriteActivity;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.activity.landingpage.PredictiveTilesLearnMoreActivity;
import com.scb.phone.view.activity.mwpartner.MwLandingActivity;
import com.scb.phone.view.activity.partner.PartnerLandingActivity;
import com.scb.phone.view.activity.personalize.PersonalizeActivity;
import com.scb.phone.view.activity.personallimit.PersonalLimitActivity;
import com.scb.phone.view.activity.requesttopay.GoManagePromptPayActivity;
import com.scb.phone.view.activity.requesttopay.RequestToPayActivity;
import com.scb.phone.view.activity.sme.SMELandingPageActivity;
import com.scb.phone.view.activity.sme.gifting.GiftSelectionActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMTutorialActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$MediaItem;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomGridLayoutManager;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040o.ActivityBuilder_ContributeDealsSuccessActivity;
import p040o.ActivityBuilder_ContributeDebitCardActivationInputActivity;
import p040o.ActivityBuilder_ContributeDebitCardCoachMarkActivity;
import p040o.ActivityBuilder_ContributeDebitCardConfirmPinActivity;
import p040o.ActivityBuilder_ContributeDebitCardDetailActivity;
import p040o.ActivityBuilder_ContributeDebitCardLandingActivity;
import p040o.ActivityBuilder_ContributeDirectDebitReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C1277x72464c4d;
import p040o.C7112xb25efb72;
import p040o.CheckCaptureModule;
import p040o.FragmentBuilder_BindCurrentAddressFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptGroup;
import p040o.ScriptIntrinsic3DLUT;
import p040o.ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver;
import p040o.Utils;
import p040o.addReference;
import p040o.debitCardReward;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.ensureAnimationInfo;
import p040o.getArguments;
import p040o.getDebitCardActivationLandingData;
import p040o.getFieldID;
import p040o.getGeoDataClient;
import p040o.getIdType;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setLUT;
import p040o.setTapText;
import p040o.setupDialog;
import p040o.show;
import p040o.zzjx;
import p040o.zzmd;

public abstract class BaseDragAndDropFragment extends BaseFragment implements CheckCaptureModule.RttiExceptionResponseDeserializer, FragmentBuilder_BindCurrentAddressFragment {
    public CustomGridLayoutManager IconCompatParcelizer;
    public ScriptIntrinsic3DLUT MediaBrowserCompat$CustomActionResultReceiver;
    public TileAdapter MediaBrowserCompat$MediaItem;
    private RecyclerView.IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver;
    private ActivityBuilder_ContributeDirectDebitReviewActivity MediaMetadataCompat;
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @BindView
    public RecyclerView mRecyclerView;

    public void ListMenuItemView() {
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(long j) {
    }

    public /* synthetic */ void MediaBrowserCompat$ItemReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
    }

    public /* synthetic */ void MediaBrowserCompat$MediaItem(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
    }

    public /* synthetic */ void MediaMetadataCompat(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
    }

    public void MediaMetadataCompat(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
    }

    /* access modifiers changed from: protected */
    public void read(long j, String str, boolean z) {
    }

    public void read(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
    }

    public void setPopupCallback() {
    }

    public /* synthetic */ void setTitle() {
    }

    public void write(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
    }

    public void onDestroyView() {
        RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo;
        List<RecyclerView.ParcelableVolumeInfo> list;
        C0065xe743b54a recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (scriptIntrinsic3DLUT != null) {
            scriptIntrinsic3DLUT.write(true);
            C1277x72464c4d scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver = scriptIntrinsic3DLUT.ParcelableVolumeInfo;
            if (scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver != null) {
                scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.removeCallbacksAndMessages((Object) null);
                scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.write = null;
                scriptIntrinsic3DLUT.ParcelableVolumeInfo = null;
            }
            getFieldID getfieldid = scriptIntrinsic3DLUT.MediaSessionCompat$Token;
            if (getfieldid != null) {
                if (getfieldid.MediaBrowserCompat$SearchResultReceiver) {
                    getfieldid.IconCompatParcelizer.IconCompatParcelizer((RecyclerView.RatingCompat) getfieldid);
                }
                getfieldid.write();
                getfieldid.IconCompatParcelizer = null;
                getfieldid.MediaBrowserCompat$SearchResultReceiver = false;
                scriptIntrinsic3DLUT.MediaSessionCompat$Token = null;
            }
            RecyclerView recyclerView = scriptIntrinsic3DLUT.setShortcut;
            if (!(recyclerView == null || (recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = scriptIntrinsic3DLUT.setBackgroundResource) == null)) {
                recyclerView.mOnItemTouchListeners.remove(recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                if (recyclerView.RatingCompat == recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                    recyclerView.RatingCompat = null;
                }
            }
            scriptIntrinsic3DLUT.setBackgroundResource = null;
            RecyclerView recyclerView2 = scriptIntrinsic3DLUT.setShortcut;
            if (!(recyclerView2 == null || (parcelableVolumeInfo = scriptIntrinsic3DLUT.AppCompatActivity) == null || (list = recyclerView2.setGroupDividerEnabled) == null)) {
                list.remove(parcelableVolumeInfo);
            }
            scriptIntrinsic3DLUT.AppCompatActivity = null;
            ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver = scriptIntrinsic3DLUT.setPopupCallback;
            if (scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver != null) {
                scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.read.clear();
                scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.write = false;
                scriptIntrinsic3DLUT.setPopupCallback = null;
            }
            scriptIntrinsic3DLUT.ExpandedMenuView = null;
            scriptIntrinsic3DLUT.setShortcut = null;
            scriptIntrinsic3DLUT.setGroupDividerEnabled = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.mRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.mRecyclerView = null;
        }
        TileAdapter tileAdapter = this.MediaBrowserCompat$MediaItem;
        if (tileAdapter != null) {
            tileAdapter.read = null;
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$SearchResultReceiver;
        if (iconCompatParcelizer != null) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
        this.MediaBrowserCompat$MediaItem = null;
        this.IconCompatParcelizer = null;
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, View view, TileAdapter$MediaBrowserCompat$MediaItem tileAdapter$MediaBrowserCompat$MediaItem) {
        this.mRecyclerView = recyclerView;
        ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = new ScriptIntrinsic3DLUT();
        this.MediaBrowserCompat$CustomActionResultReceiver = scriptIntrinsic3DLUT;
        scriptIntrinsic3DLUT.PlaybackStateCompat = true;
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = true;
        boolean z = false;
        this.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = false;
        this.MediaBrowserCompat$CustomActionResultReceiver.setCheckable = 750;
        this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = 1;
        this.MediaBrowserCompat$CustomActionResultReceiver.setContentView = new ScriptIntrinsic3DLUT.IconCompatParcelizer(this) {
        };
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = 250;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.read = 0.8f;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver = 1.3f;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.write = BitmapDescriptorFactory.HUE_RED;
        TileAdapter tileAdapter = new TileAdapter(view, new ActivityBuilder_ContributeDebitCardActivationInputActivity(this, tileAdapter$MediaBrowserCompat$MediaItem), this, new ActivityBuilder_ContributeDebitCardConfirmPinActivity(this), new ActivityBuilder_ContributeDebitCardLandingActivity(this));
        this.MediaBrowserCompat$MediaItem = tileAdapter;
        tileAdapter.read = getLifecycle();
        this.MediaMetadataCompat = new ActivityBuilder_ContributeDirectDebitReviewActivity(this.MediaBrowserCompat$MediaItem);
        ScriptIntrinsic3DLUT scriptIntrinsic3DLUT2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        TileAdapter tileAdapter2 = this.MediaBrowserCompat$MediaItem;
        if (!tileAdapter2.MediaBrowserCompat$CustomActionResultReceiver) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        } else if (scriptIntrinsic3DLUT2.ExpandedMenuView == null) {
            addReference addreference = new addReference(scriptIntrinsic3DLUT2, tileAdapter2);
            scriptIntrinsic3DLUT2.ExpandedMenuView = addreference;
            this.MediaBrowserCompat$SearchResultReceiver = addreference;
            ScriptGroup.Builder2 builder2 = new ScriptGroup.Builder2();
            CustomGridLayoutManager customGridLayoutManager = new CustomGridLayoutManager(getContext());
            this.IconCompatParcelizer = customGridLayoutManager;
            customGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat;
            this.mRecyclerView.setLayoutManager(this.IconCompatParcelizer);
            this.mRecyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
            this.mRecyclerView.setItemAnimator(builder2);
            this.mRecyclerView.setNestedScrollingEnabled(false);
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            RecyclerView recyclerView2 = this.mRecyclerView;
            if (scriptIntrinsic3DLUT3.setBackgroundResource == null) {
                throw new IllegalStateException("Accessing released object");
            } else if (scriptIntrinsic3DLUT3.setShortcut == null) {
                scriptIntrinsic3DLUT3.setShortcut = recyclerView2;
                RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo = scriptIntrinsic3DLUT3.AppCompatActivity;
                if (recyclerView2.setGroupDividerEnabled == null) {
                    recyclerView2.setGroupDividerEnabled = new ArrayList();
                }
                recyclerView2.setGroupDividerEnabled.add(parcelableVolumeInfo);
                scriptIntrinsic3DLUT3.setShortcut.mOnItemTouchListeners.add(scriptIntrinsic3DLUT3.setBackgroundResource);
                scriptIntrinsic3DLUT3.MediaMetadataCompat = scriptIntrinsic3DLUT3.setShortcut.getResources().getDisplayMetrics().density;
                int scaledTouchSlop = ViewConfiguration.get(scriptIntrinsic3DLUT3.setShortcut.getContext()).getScaledTouchSlop();
                scriptIntrinsic3DLUT3.setForceShowIcon = scaledTouchSlop;
                scriptIntrinsic3DLUT3.setPadding = (int) ((((float) scaledTouchSlop) * 1.5f) + 0.5f);
                scriptIntrinsic3DLUT3.ParcelableVolumeInfo = new C1277x72464c4d(scriptIntrinsic3DLUT3);
                if (Build.VERSION.SDK_INT >= 14) {
                    z = true;
                }
                if (z) {
                    int write = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(scriptIntrinsic3DLUT3.setShortcut.AppCompatActivity);
                    if (write == 0) {
                        scriptIntrinsic3DLUT3.MediaSessionCompat$Token = new ScriptGroup.Node(scriptIntrinsic3DLUT3.setShortcut);
                    } else if (write == 1) {
                        scriptIntrinsic3DLUT3.MediaSessionCompat$Token = new setLUT(scriptIntrinsic3DLUT3.setShortcut);
                    }
                    getFieldID getfieldid = scriptIntrinsic3DLUT3.MediaSessionCompat$Token;
                    if (getfieldid != null) {
                        getfieldid.IconCompatParcelizer();
                    }
                }
            } else {
                throw new IllegalStateException("RecyclerView instance has already been set");
            }
        } else {
            throw new IllegalStateException("already have a wrapped adapter");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(list);
    }

    public void IconCompatParcelizer(long j) {
        TileAdapter tileAdapter = this.MediaBrowserCompat$MediaItem;
        tileAdapter.MediaBrowserCompat$ItemReceiver((List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) (List) new show(tileAdapter.MediaDescriptionCompat).read(new debitCardReward(j)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
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
        })));
    }

    public final void write(long j) {
        PersonalizeActivity.write(getContext(), j);
    }

    /* renamed from: com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment$2 */
    static /* synthetic */ class C60762 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(68:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getGeoDataClient[] r0 = p040o.getGeoDataClient.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILLER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.FAVOURITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.CONTACTUS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.DONATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.MANAGE_SCB_PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.ACCOUNT_SUMMARY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.CARDLESS_ATM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.CHANGE_TRANSFER_LIMIT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006c }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TOP_UP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TRANSFER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.REQUEST_MONEY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.FIND_US     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x009c }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILL_PAYMENT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00a8 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILLERSCAN     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00b4 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.INVESTMENT_TILE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00c0 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.PROMTPAY_QR     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00cc }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.GIFTING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00d8 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.SCB_ONE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00e4 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.OPEN_SCB_ACCOUNT_ETB     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00f0 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.MAE_MANEE_SHOP     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00fc }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.SCBS_INVESTMENT     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0108 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.HML_LANDING     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0114 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.DOCUMENT_FORMS     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0120 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.REQUEST_TO_ADD_JURISTIC_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x012c }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.GO_TO_PERSONAL     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0138 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.FRIENDS_GET_FRIENDS     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0144 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.WEBVIEWTILE     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0150 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.APPLICATION     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x015c }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TILES     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0168 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TILE_CATEGORY     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0174 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.WEBVIEW_PARTNER     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0180 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.SME_SERVICES     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x018c }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.DEEPLINK     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0198 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.FUNCTION     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment.C60762.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$MediaItem(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        int i = C60762.write[discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle.ordinal()];
        if (i == 1) {
            Intent intent = new Intent(getActivity(), GroupBillerActivity.class);
            intent.putExtra("EXTRA_TILE_PROPERTIES", discardoldlogfiles_mediabrowsercompat_itemreceiver);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (i == 2) {
            Intent intent2 = new Intent(getActivity(), GroupFavoriteActivity.class);
            intent2.putExtra("EXTRA_TILE_PROPERTIES", discardoldlogfiles_mediabrowsercompat_itemreceiver);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent2 = setTapText.write(activity2, intent2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb2.append(intent2.getData());
                sb2.append("\n with context ");
                sb2.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                startActivity(intent2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        SMELandingPageActivity.MediaBrowserCompat$ItemReceiver(getContext(), list);
    }

    public void RatingCompat() {
        Intent intent = new Intent(getContext(), GoManagePromptPayActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_FROM_BANKING_ACTION", true);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void read() {
        FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), false);
    }

    public void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = new Intent(getContext(), PersonalLimitActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaDescriptionCompat() {
        RequestToPayActivity.IconCompatParcelizer(getContext(), "");
    }

    public void write() {
        CardlessATMTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), "bankingservice");
    }

    public void MediaSessionCompat$Token() {
        if (this.iDeviceCompatibilityHelper.read()) {
            Intent intent = new Intent(getActivity(), ScanPaymentActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(long j, boolean z, int i) {
        Intent intent = new Intent(getActivity(), PartnerWebViewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_PARTNER_ID", j);
        intent.putExtra("EXTRA_REQUIRE_LOGIN", i);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void aN_() {
        Intent intent = new Intent(getActivity(), DonationsLandingActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void IconCompatParcelizer() {
        Intent intent = new Intent(getContext(), ContactUsActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public void mo36889x50fd9e4a() {
        C7112xb25efb72 getdebitcardactivationlandingdata_mediabrowsercompat_customactionresultreceiver;
        TileAdapter tileAdapter = this.MediaBrowserCompat$MediaItem;
        getDebitCardActivationLandingData getdebitcardactivationlandingdata = tileAdapter.write;
        if (getdebitcardactivationlandingdata.read.isEmpty()) {
            getdebitcardactivationlandingdata_mediabrowsercompat_customactionresultreceiver = null;
        } else {
            getdebitcardactivationlandingdata_mediabrowsercompat_customactionresultreceiver = getdebitcardactivationlandingdata.read.pop();
        }
        if (getdebitcardactivationlandingdata_mediabrowsercompat_customactionresultreceiver != null) {
            int i = getdebitcardactivationlandingdata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = getdebitcardactivationlandingdata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            ArrayList arrayList = new ArrayList(tileAdapter.MediaDescriptionCompat);
            Collections.swap(arrayList, i, i2);
            tileAdapter.MediaBrowserCompat$ItemReceiver((List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) arrayList);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Utils.C39323.C12941 r5) {
        if (getContext() != null) {
            Intent read = JuristicOnboardingLandingActivity.read(getContext(), r5);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaMetadataCompat() {
        if (getActivity() instanceof PreLoadCheckActivity) {
            ((PreLoadCheckActivity) getActivity()).setMenuPrepared();
        }
    }

    public final /* synthetic */ void RatingCompat(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource);
    }

    public final void MediaDescriptionCompat(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        if (discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatDelegateImpl$ListMenuDecorView) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.confirm_delete_tile).IconCompatParcelizer((int) R.string.confirm_delete_tile_description);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.yes_delete), new ActivityBuilder_ContributeDealsSuccessActivity(this, discardoldlogfiles_mediabrowsercompat_itemreceiver));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.no_keep_it), ActivityBuilder_ContributeDebitCardCoachMarkActivity.write).show();
            return;
        }
        CustomDialog IconCompatParcelizer4 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.remove_item).IconCompatParcelizer((int) R.string.tile_cannot_be_deleted);
        IconCompatParcelizer4.IconCompatParcelizer(IconCompatParcelizer4.read.getString(R.string.ok), ActivityBuilder_ContributeDebitCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void setGroupDividerEnabled() {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent(getActivity(), PredictiveTilesLearnMoreActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setForceShowIcon() {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent(getActivity(), BankingActionActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        String str = discardoldlogfiles_mediabrowsercompat_itemreceiver.PlaybackStateCompat$CustomAction;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_(str);
        }
        switch (C60762.write[discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle.ordinal()]) {
            case 27:
                MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver, discardoldlogfiles_mediabrowsercompat_itemreceiver.setShortcut);
                return;
            case 28:
                read(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                return;
            case 29:
                SMELandingPageActivity.MediaBrowserCompat$ItemReceiver(getContext(), discardoldlogfiles_mediabrowsercompat_itemreceiver.setGroupDividerEnabled);
                return;
            case 30:
                Intent MediaBrowserCompat$ItemReceiver = PartnerLandingActivity.MediaBrowserCompat$ItemReceiver(getContext(), discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                    }
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb.append(MediaBrowserCompat$ItemReceiver.getData());
                    sb.append("\n with context ");
                    sb.append(activity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(MediaBrowserCompat$ItemReceiver);
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            case 31:
                read(discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource, discardoldlogfiles_mediabrowsercompat_itemreceiver.write, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver);
                return;
            case 32:
                MediaMetadataCompat(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                return;
            case 33:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$QueueItem));
                    AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                    try {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            intent = setTapText.write(activity2, intent).read();
                        }
                        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                        sb2.append(intent.getData());
                        sb2.append("\n with context ");
                        sb2.append(activity2.hashCode());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                        startActivity(intent);
                        return;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                } catch (ActivityNotFoundException e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                    return;
                }
            case 34:
                if (discardoldlogfiles_mediabrowsercompat_itemreceiver.PlaybackStateCompat != null) {
                    switch (C60762.write[discardoldlogfiles_mediabrowsercompat_itemreceiver.PlaybackStateCompat.ordinal()]) {
                        case 3:
                            IconCompatParcelizer();
                            return;
                        case 4:
                            aN_();
                            return;
                        case 5:
                            RatingCompat();
                            return;
                        case 6:
                            MediaBrowserCompat$ItemReceiver();
                            return;
                        case 7:
                            write();
                            return;
                        case 8:
                            MediaSessionCompat$ResultReceiverWrapper();
                            return;
                        case 9:
                            MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle);
                            return;
                        case 10:
                            read(discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle);
                            return;
                        case 11:
                            MediaDescriptionCompat();
                            return;
                        case 12:
                            read();
                            return;
                        case 13:
                            write(discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle);
                            return;
                        case 14:
                            MediaSessionCompat$Token();
                            return;
                        case 15:
                            MediaBrowserCompat$MediaItem();
                            return;
                        case 16:
                            MediaBrowserCompat$SearchResultReceiver();
                            return;
                        case 17:
                            Intent intent2 = new Intent(getActivity(), GiftSelectionActivity.class);
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity3 = getActivity();
                                if (activity3 != null) {
                                    intent2 = setTapText.write(activity3, intent2).read();
                                }
                                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb3 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb3.append(intent2.getData());
                                sb3.append("\n with context ");
                                sb3.append(activity3.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb3.toString());
                                startActivity(intent2);
                                return;
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                                return;
                            }
                        case 18:
                            Intent intent3 = new Intent(getActivity(), EasycashLandingActivity.class);
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity4 = getActivity();
                                if (activity4 != null) {
                                    intent3 = setTapText.write(activity4, intent3).read();
                                }
                                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb4 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb4.append(intent3.getData());
                                sb4.append("\n with context ");
                                sb4.append(activity4.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb4.toString());
                                startActivity(intent3);
                                return;
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                                return;
                            }
                        case 19:
                            Intent read = ETBCheckEligibilityActivity.read(getContext());
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity5 = getActivity();
                                if (activity5 != null) {
                                    read = setTapText.write(activity5, read).read();
                                }
                                MyECouponActivity_ViewBinding.write write5 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb5 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb5.append(read.getData());
                                sb5.append("\n with context ");
                                sb5.append(activity5.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write5, sb5.toString());
                                startActivity(read);
                                return;
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                                return;
                            }
                        case 20:
                            Intent MediaBrowserCompat$CustomActionResultReceiver2 = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity6 = getActivity();
                                if (activity6 != null) {
                                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity6, MediaBrowserCompat$CustomActionResultReceiver2).read();
                                }
                                MyECouponActivity_ViewBinding.write write6 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb6 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb6.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                                sb6.append("\n with context ");
                                sb6.append(activity6.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write6, sb6.toString());
                                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
                                return;
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                                return;
                            }
                        case 21:
                            if (getActivity() != null) {
                                ((BaseActivity) getActivity()).mo13676d_("investment_landing");
                            }
                            Intent read2 = ScbsLandingActivity.read(getContext());
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity7 = getActivity();
                                if (activity7 != null) {
                                    read2 = setTapText.write(activity7, read2).read();
                                }
                                MyECouponActivity_ViewBinding.write write7 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb7 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb7.append(read2.getData());
                                sb7.append("\n with context ");
                                sb7.append(activity7.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write7, sb7.toString());
                                startActivity(read2);
                                return;
                            } catch (Throwable th7) {
                                th7.printStackTrace();
                                return;
                            }
                        case 22:
                            C5607x23cfbb87 hmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBLandingActivity.MediaBrowserCompat$MediaItem;
                            Intent IconCompatParcelizer2 = C5607x23cfbb87.IconCompatParcelizer(getContext(), zzjx.zza.zzb.GENERAL);
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity8 = getActivity();
                                if (activity8 != null) {
                                    IconCompatParcelizer2 = setTapText.write(activity8, IconCompatParcelizer2).read();
                                }
                                MyECouponActivity_ViewBinding.write write8 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb8 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb8.append(IconCompatParcelizer2.getData());
                                sb8.append("\n with context ");
                                sb8.append(activity8.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write8, sb8.toString());
                                startActivity(IconCompatParcelizer2);
                                return;
                            } catch (Throwable th8) {
                                th8.printStackTrace();
                                return;
                            }
                        case 23:
                        case 24:
                            Context context = getContext();
                            if (context != null) {
                                Intent MediaBrowserCompat$ItemReceiver2 = JuristicRequestFormActivity.MediaBrowserCompat$ItemReceiver(context);
                                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                                try {
                                    FragmentActivity activity9 = getActivity();
                                    if (activity9 != null) {
                                        MediaBrowserCompat$ItemReceiver2 = setTapText.write(activity9, MediaBrowserCompat$ItemReceiver2).read();
                                    }
                                    MyECouponActivity_ViewBinding.write write9 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                    StringBuilder sb9 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                    sb9.append(MediaBrowserCompat$ItemReceiver2.getData());
                                    sb9.append("\n with context ");
                                    sb9.append(activity9.hashCode());
                                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write9, sb9.toString());
                                    startActivity(MediaBrowserCompat$ItemReceiver2);
                                    return;
                                } catch (Throwable th9) {
                                    th9.printStackTrace();
                                    return;
                                }
                            } else {
                                return;
                            }
                        case 25:
                            if (getActivity() instanceof PreLoadCheckActivity) {
                                PreLoadCheckActivity preLoadCheckActivity = (PreLoadCheckActivity) getActivity();
                                preLoadCheckActivity.write(zzmd.zzm.zzb.zza.INDIVIDUAL);
                                preLoadCheckActivity.MediaSessionCompat$Token(true);
                                return;
                            }
                            return;
                        case 26:
                            Context context2 = getContext();
                            onGetStartedClick.write((Object) context2, "context");
                            Intent intent4 = new Intent(context2, FriendsLandingActivity.class);
                            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                            try {
                                FragmentActivity activity10 = getActivity();
                                if (activity10 != null) {
                                    intent4 = setTapText.write(activity10, intent4).read();
                                }
                                MyECouponActivity_ViewBinding.write write10 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb10 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                                sb10.append(intent4.getData());
                                sb10.append("\n with context ");
                                sb10.append(activity10.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write10, sb10.toString());
                                startActivity(intent4);
                                return;
                            } catch (Throwable th10) {
                                th10.printStackTrace();
                                return;
                            }
                        default:
                            return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public void write(getGeoDataClient getgeodataclient) {
        if (getgeodataclient.equals(getGeoDataClient.FAVOURITE)) {
            BillPaymentActivity.read(getContext(), "favourite");
        } else {
            BillPaymentActivity.read(getContext(), "tile");
        }
    }

    public void MediaBrowserCompat$ItemReceiver(getGeoDataClient getgeodataclient) {
        if (getgeodataclient.equals(getGeoDataClient.FAVOURITE)) {
            TopUpActivity.MediaBrowserCompat$ItemReceiver(getContext(), "favourite");
        } else {
            TopUpActivity.MediaBrowserCompat$ItemReceiver(getContext(), "tile");
        }
    }

    public void read(getGeoDataClient getgeodataclient) {
        if (getgeodataclient.equals(getGeoDataClient.FAVOURITE)) {
            TransferActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), "favourite");
        } else {
            TransferActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), "tile");
        }
    }
}
