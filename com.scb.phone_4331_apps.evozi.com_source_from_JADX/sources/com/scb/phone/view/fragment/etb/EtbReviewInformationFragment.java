package com.scb.phone.view.fragment.etb;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.etb.EtbOtpActivity;
import com.scb.phone.view.custom.CustomInformationList;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C3696O;
import p040o.C9805Q;
import p040o.HmlPinActivity;
import p040o.IGPUImageRenderer;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBlend;
import p040o.StreetViewPanoramaFragment;
import p040o.TextureRotationUtil;
import p040o.access$1900;
import p040o.access$2600;
import p040o.defaultReportUploader;
import p040o.getSecondPassThresholdUniform;
import p040o.isGrayScaleInputTextureRequired;
import p040o.newGPUStrategyForcedEdgeDetection;
import p040o.setCvv$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;

public class EtbReviewInformationFragment extends BaseEtbFragment implements setCvv$MediaBrowserCompat$ItemReceiver {
    private ScriptIntrinsicBlend MediaBrowserCompat$CustomActionResultReceiver = new ScriptIntrinsicBlend();
    @BindView
    Button btnConfirm;
    @HmlPinActivity
    public getSecondPassThresholdUniform etbReviewInformationPresenter;
    @BindView
    CustomInformationList vAccountInfo;
    @BindView
    CustomInformationList vMonthlyDeduction;
    @BindView
    CustomInformationList vOpeningDeposit;

    public final int ParcelableVolumeInfo() {
        return 3;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EtbReviewInformationFragment write(access$1900 access_1900, defaultReportUploader defaultreportuploader) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT", access_1900);
        bundle.putParcelable("ARG_ETB_REVIEW", defaultreportuploader);
        EtbReviewInformationFragment etbReviewInformationFragment = new EtbReviewInformationFragment();
        etbReviewInformationFragment.setArguments(bundle);
        return etbReviewInformationFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87342131493961, viewGroup, false);
        inflate.setFocusableInTouchMode(true);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.etbReviewInformationPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(this.etbReviewInformationPresenter == null || getArguments() == null || !getArguments().containsKey("ARG_ETB_REVIEW"))) {
            access$1900 access_1900 = (access$1900) getArguments().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT");
            this.btnConfirm.setEnabled(true);
            getSecondPassThresholdUniform getsecondpassthresholduniform = this.etbReviewInformationPresenter;
            defaultReportUploader defaultreportuploader = (defaultReportUploader) getArguments().getParcelable("ARG_ETB_REVIEW");
            String stackedBackground = setStackedBackground();
            IGPUImageRenderer iGPUImageRenderer = new IGPUImageRenderer(getsecondpassthresholduniform.write.write(access_1900, defaultreportuploader, getsecondpassthresholduniform.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker(), (String) null));
            if (getsecondpassthresholduniform.RatingCompat != null) {
                iGPUImageRenderer.IconCompatParcelizer(getsecondpassthresholduniform.RatingCompat);
            }
            isGrayScaleInputTextureRequired isgrayscaleinputtexturerequired = new isGrayScaleInputTextureRequired(getsecondpassthresholduniform.write.MediaBrowserCompat$ItemReceiver(defaultreportuploader, getsecondpassthresholduniform.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker(), (String) null));
            if (getsecondpassthresholduniform.RatingCompat != null) {
                isgrayscaleinputtexturerequired.IconCompatParcelizer(getsecondpassthresholduniform.RatingCompat);
            }
            newGPUStrategyForcedEdgeDetection newgpustrategyforcededgedetection = new newGPUStrategyForcedEdgeDetection(getsecondpassthresholduniform.write.IconCompatParcelizer(defaultreportuploader, getsecondpassthresholduniform.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker(), (String) null, getsecondpassthresholduniform.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable()));
            if (getsecondpassthresholduniform.RatingCompat != null) {
                newgpustrategyforcededgedetection.IconCompatParcelizer(getsecondpassthresholduniform.RatingCompat);
            }
            if ("2".equalsIgnoreCase(access_1900.MediaBrowserCompat$CustomActionResultReceiver)) {
                TextureRotationUtil.C38601 r4 = TextureRotationUtil.C38601.MediaBrowserCompat$ItemReceiver;
                if (getsecondpassthresholduniform.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    r4.IconCompatParcelizer(getsecondpassthresholduniform.RatingCompat);
                }
            } else if (DiskLruCache.VERSION_1.equalsIgnoreCase(access_1900.MediaBrowserCompat$CustomActionResultReceiver)) {
                C3696O o = C3696O.MediaBrowserCompat$ItemReceiver;
                if (getsecondpassthresholduniform.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    o.IconCompatParcelizer(getsecondpassthresholduniform.RatingCompat);
                }
            }
            getsecondpassthresholduniform.MediaBrowserCompat$ItemReceiver.write(stackedBackground);
            getsecondpassthresholduniform.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>>(access_1900, defaultreportuploader) {
                private /* synthetic */ access$1900 IconCompatParcelizer;
                private /* synthetic */ defaultReportUploader MediaBrowserCompat$ItemReceiver;

                public final /* synthetic */ void onNext(
/*
Method generation error in method: o.getSecondPassThresholdUniform.4.onNext(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.getSecondPassThresholdUniform.4.onNext(java.lang.Object):void, class status: UNLOADED
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
        ScriptIntrinsicBlend scriptIntrinsicBlend = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            scriptIntrinsicBlend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_product_review");
        }
        return inflate;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.f93082131558413, menu);
        menu.findItem(R.id.menu_action_help).setVisible(false);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        super.onDestroy();
        this.etbReviewInformationPresenter.onDestroy();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onConfirmClick() {
        getSecondPassThresholdUniform getsecondpassthresholduniform = this.etbReviewInformationPresenter;
        C9805Q q = C9805Q.write;
        if (getsecondpassthresholduniform.RatingCompat != null) {
            q.IconCompatParcelizer(getsecondpassthresholduniform.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<access$2600> list) {
        this.vAccountInfo.setItems(list, false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<access$2600> list) {
        this.vOpeningDeposit.setItems(list, false);
    }

    public final void read(List<access$2600> list) {
        this.vMonthlyDeduction.setItems(list, true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = EtbOtpActivity.IconCompatParcelizer(getActivity());
        IconCompatParcelizer.putExtra("com.scb.phone.view.fragment.etb.ARG_ACCOUNT", (access$1900) getArguments().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT"));
        IconCompatParcelizer.putExtra("ARG_ETB_REVIEW", (defaultReportUploader) getArguments().getParcelable("ARG_ETB_REVIEW"));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer, 1777);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        this.vOpeningDeposit.setVisibility(8);
        this.vMonthlyDeduction.setVisibility(8);
    }

    public final void write() {
        this.vMonthlyDeduction.setVisibility(8);
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_review_info_page);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1777) {
            getActivity().getSupportFragmentManager().MediaMetadataCompat();
        }
    }
}
