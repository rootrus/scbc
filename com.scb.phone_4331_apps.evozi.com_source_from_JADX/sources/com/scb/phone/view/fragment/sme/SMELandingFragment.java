package com.scb.phone.view.fragment.sme;

import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.promptpay.PromptPayQRActivity;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$MediaItem;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeRegistrationManageDevicesActivity;
import p040o.ActivityBuilder_ContributeRegistrationOnboardingActivity;
import p040o.ActivityBuilder_ContributeRemittanceAddFavouriteActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10078ni;
import p040o.C5442v;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.convertStreamToString;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getImageDimensionMismatch;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.updateRttiRequest;
import p040o.writeUInt64NoTag;

public class SMELandingFragment extends BaseDragAndDropFragment implements getImageDimensionMismatch.IconCompatParcelizer {
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @BindView
    CustomProfileImageView cusIvProfile;
    @HmlPinActivity
    public convertStreamToString landingPagePresenter;
    @BindView
    ViewGroup qrCodeBeltButton;
    @BindView
    ViewGroup scanBeltButton;
    @BindView
    TextView tvHomeCity;
    @BindView
    TextView tvHomeWelcomeHeadline;
    @BindView
    TextView tvHomeWelcomeUserName;

    public final void IconCompatParcelizer(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
    }

    public final void IconCompatParcelizer(boolean z) {
    }

    public final void MediaBrowserCompat$ItemReceiver(long j, long j2) {
    }

    public final void MediaBrowserCompat$MediaItem() {
    }

    public final void MediaSessionCompat$QueueItem() {
    }

    public final void setPadding() {
    }

    public static SMELandingFragment write(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        bundle.putParcelableArrayList("com.scb.phone.EXTRA_LANDING_TILESS", arrayList);
        SMELandingFragment sMELandingFragment = new SMELandingFragment();
        sMELandingFragment.setArguments(bundle);
        return sMELandingFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88242131494051, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(0);
        }
        setTitleOptional();
        MediaBrowserCompat$ItemReceiver(this.mRecyclerView, (View) null, (TileAdapter$MediaBrowserCompat$MediaItem) null);
        this.landingPagePresenter.MediaBrowserCompat$ItemReceiver(this);
        convertStreamToString convertstreamtostring = this.landingPagePresenter;
        C5442v.C54431 r1 = new writeUInt64NoTag.IconCompatParcelizer(getArguments().getParcelableArrayList("com.scb.phone.EXTRA_LANDING_TILESS")) {
            private final /* synthetic */ ArrayList MediaBrowserCompat$CustomActionResultReceiver;

            public final void IconCompatParcelizer(
/*
Method generation error in method: o.v.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.v.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (convertstreamtostring.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r1.IconCompatParcelizer(convertstreamtostring.RatingCompat);
        }
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_PROFILE_UPDATED")).subscribe(new ActivityBuilder_ContributeRegistrationOnboardingActivity(this), ActivityBuilder_ContributeRemittanceAddFavouriteActivity.read);
        this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_UPDATE_LOCATION")).subscribe(new ActivityBuilder_ContributeRegistrationManageDevicesActivity(this), ActivityBuilder_ContributeRemittanceAddFavouriteActivity.read);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        this.landingPagePresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void AppCompatDelegateImpl$ListMenuDecorView() {
        LocationManager locationManager = (LocationManager) getActivity().getSystemService("location");
        if (getContext() != null && setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(getContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && locationManager.isProviderEnabled("gps")) {
            convertStreamToString convertstreamtostring = this.landingPagePresenter;
            convertstreamtostring.PlaybackStateCompat$CustomAction.read();
            convertstreamtostring.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new convertStreamToString.write(convertstreamtostring, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34104 r3) {
        this.tvHomeWelcomeUserName.setVisibility(TextUtils.isEmpty(r3.RatingCompat) ? 8 : 0);
        this.tvHomeWelcomeUserName.setText(r3.RatingCompat);
        this.tvHomeWelcomeHeadline.setText(r3.read);
        if (getContext() != null) {
            this.cusIvProfile.setImageUrl(r3.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void read(String str) {
        this.tvHomeCity.setText(str);
        this.tvHomeCity.setVisibility(str.isEmpty() ? 4 : 0);
    }

    public final void read(long j) {
        this.landingPagePresenter.MediaBrowserCompat$CustomActionResultReceiver(j);
    }

    /* access modifiers changed from: protected */
    @OnClick
    public void onQRBeltScanButtonClicked() {
        convertStreamToString convertstreamtostring = this.landingPagePresenter;
        C10078ni niVar = C10078ni.MediaBrowserCompat$CustomActionResultReceiver;
        if (convertstreamtostring.RatingCompat != null) {
            niVar.IconCompatParcelizer(convertstreamtostring.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    @OnClick
    public void onQRBeltCreateButtonClicked() {
        convertStreamToString convertstreamtostring = this.landingPagePresenter;
        updateRttiRequest updaterttirequest = updateRttiRequest.MediaBrowserCompat$ItemReceiver;
        if (convertstreamtostring.RatingCompat != null) {
            updaterttirequest.IconCompatParcelizer(convertstreamtostring.RatingCompat);
        }
    }

    public static /* synthetic */ void read(SMELandingFragment sMELandingFragment) {
        convertStreamToString convertstreamtostring = sMELandingFragment.landingPagePresenter;
        if (convertstreamtostring != null) {
            convertstreamtostring.read();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ssme_tile_createqr");
        }
        Intent intent = new Intent(getActivity(), PromptPayQRActivity.class);
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

    public final void AppCompatDialogFragment() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ssme_qr_belt_create");
        }
        Intent intent = new Intent(getActivity(), PromptPayQRActivity.class);
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

    public final void MediaSessionCompat$Token() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ssme_qr_belt_scan");
        }
        super.MediaSessionCompat$Token();
    }
}
