package com.scb.phone.view.activity.p038tc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.ErrorPageActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import com.scb.phone.view.activity.privacymanagement.PrivacyConsentActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4027ai;
import p040o.C5202rT;
import p040o.C5399sg;
import p040o.C5400sh;
import p040o.C5410sk;
import p040o.C5411sl;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.generateBinaryImagesJsonString;
import p040o.getLibraryFile;
import p040o.immediateFailedFuture;
import p040o.setTapText;
import p040o.zzmd;

/* renamed from: com.scb.phone.view.activity.tc.EasyAppTermsAndConditionsActivity */
public class EasyAppTermsAndConditionsActivity extends BaseActivityWithFragment implements ServerProjectProvider.C128911, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public C5411sl presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static void IconCompatParcelizer(Context context) {
        Intent intent = new Intent(context, EasyAppTermsAndConditionsActivity.class);
        intent.putExtra("com.scb.phone.view.activity.tc.EasyAppTermsAndConditionsActivity.EXTRA_IS_READ_ONLY_MODE", true);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Intent IconCompatParcelizer(Context context, LogFileManager.DirectoryProvider directoryProvider, boolean z) {
        Intent intent = new Intent(context, EasyAppTermsAndConditionsActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_PRELOAD_CHECK", directoryProvider);
        intent.putExtra("com.scb.phone.EXTRA_DEEP_LINK", z);
        if (z) {
            intent.addFlags(32768);
        } else {
            intent.addFlags(268468224);
        }
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        boolean booleanExtra = getIntent().getBooleanExtra("com.scb.phone.view.activity.tc.EasyAppTermsAndConditionsActivity.EXTRA_IS_READ_ONLY_MODE", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("com.scb.phone.EXTRA_DEEP_LINK", false);
        C5411sl slVar = this.presenter;
        slVar.MediaBrowserCompat$ItemReceiver = booleanExtra;
        slVar.read = booleanExtra2;
        slVar.MediaBrowserCompat$SearchResultReceiver = (LogFileManager.DirectoryProvider) getIntent().getParcelableExtra("com.scb.phone.EXTRA_PRELOAD_CHECK");
        C5399sg sgVar = new C5399sg(slVar, booleanExtra);
        if (slVar.RatingCompat != null) {
            sgVar.IconCompatParcelizer(slVar.RatingCompat);
        }
        super.setStackedBackground();
        if (!this.presenter.MediaBrowserCompat$ItemReceiver && this.read != null) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        if (!this.presenter.MediaBrowserCompat$ItemReceiver && this.read != null) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    public final void ListMenuItemView() {
        if (this.read != null) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    public void onBackPressed() {
        if (this.presenter.MediaBrowserCompat$ItemReceiver) {
            super.onBackPressed();
        } else {
            write("EASYAPP");
        }
    }

    public final zzmd.zzm.zzb.zza setTitleOptional() {
        if (this.presenter.MediaBrowserCompat$ItemReceiver) {
            return zzmd.zzm.zzb.zza.INDIVIDUAL;
        }
        return super.setTitleOptional();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        return getString(R.string.tc_action_bar_title);
    }

    public final void IconCompatParcelizer(String str) {
        C5411sl slVar = this.presenter;
        C5410sk skVar = C5410sk.read;
        if (slVar.RatingCompat != null) {
            skVar.IconCompatParcelizer(slVar.RatingCompat);
        }
        slVar.IconCompatParcelizer.write(slVar.IconCompatParcelizer.write(slVar.write), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                super.onNext((Boolean) obj);
                C5411sl.write(C5411sl.this);
                generateBinaryImagesJsonString MediaBrowserCompat$CustomActionResultReceiver2 = C5411sl.MediaBrowserCompat$CustomActionResultReceiver(C5411sl.this);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    C5411sl.MediaBrowserCompat$ItemReceiver(C5411sl.this);
                } else {
                    C5411sl.IconCompatParcelizer(C5411sl.this, MediaBrowserCompat$CustomActionResultReceiver2);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                C5411sl slVar = C5411sl.this;
                C4027ai.C40292 r1 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: CONSTRUCTOR  (r1v0 'r1' o.ai$2) = 
                      (r2v0 'this' o.sl$3 A[THIS])
                      (r3v0 'th' java.lang.Throwable)
                     call: o.ai.2.<init>(o.sl$3, java.lang.Throwable):void type: CONSTRUCTOR in method: o.sl.3.onError(java.lang.Throwable):void, dex: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.ai, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 61 more
                    */
                /*
                    this = this;
                    super.onError(r3)
                    o.sl r0 = p040o.C5411sl.this
                    o.ai$2 r1 = new o.ai$2
                    r1.<init>(r2, r3)
                    T r3 = r0.RatingCompat
                    if (r3 == 0) goto L_0x0010
                    r3 = 1
                    goto L_0x0011
                L_0x0010:
                    r3 = 0
                L_0x0011:
                    if (r3 == 0) goto L_0x0018
                    T r3 = r0.RatingCompat
                    r1.IconCompatParcelizer(r3)
                L_0x0018:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.C5411sl.C54123.onError(java.lang.Throwable):void");
            }
        });
    }

    public final void write(String str) {
        zzmd.zzm.zzb.zza zza;
        boolean z = false;
        this.presenter.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(false);
        if (getApplication() instanceof AndroidApplication) {
            ((AndroidApplication) getApplication()).IconCompatParcelizer = true;
        }
        C5411sl slVar = this.presenter;
        if (slVar.MediaBrowserCompat$ItemReceiver) {
            zza = zzmd.zzm.zzb.zza.INDIVIDUAL;
        } else {
            zza = super.setTitleOptional();
        }
        if (zzmd.zzm.zzb.zza.JURISTIC.equals(zza)) {
            C5202rT rTVar = C5202rT.write;
            if (slVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                rTVar.IconCompatParcelizer(slVar.RatingCompat);
                return;
            }
            return;
        }
        C5400sh shVar = C5400sh.IconCompatParcelizer;
        if (slVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            shVar.IconCompatParcelizer(slVar.RatingCompat);
        }
    }

    public final void read() {
        finish();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void setContentView() {
        if (this.presenter.MediaBrowserCompat$ItemReceiver) {
            onBackPressed();
        } else {
            SplashActivity.IconCompatParcelizer(this);
        }
    }

    public final void write() {
        RatingCompat(false);
    }

    public final void IconCompatParcelizer(generateBinaryImagesJsonString generatebinaryimagesjsonstring, LogFileManager.DirectoryProvider directoryProvider) {
        Intent read = PrivacyConsentActivity.read(this, generatebinaryimagesjsonstring, getLibraryFile.PRELOAD_CHECK, directoryProvider, this.presenter.read);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(LogFileManager.DirectoryProvider directoryProvider) {
        Intent MediaBrowserCompat$ItemReceiver = MarketingCSentWebViewActivity.MediaBrowserCompat$ItemReceiver((Context) this, directoryProvider);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && this.presenter.read && i2 == -1 && this.presenter.read) {
            setResult(i2);
            finish();
        }
    }

    public final void read(LogFileManager.DirectoryProvider directoryProvider) {
        HomeActivity.read((Context) this, directoryProvider);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.presenter.read) {
            setResult(-1);
            finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent IconCompatParcelizer = ErrorPageActivity.IconCompatParcelizer(this, getString(R.string.tc_decline_title_juristic), getString(R.string.tc_decline_message_juristic));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
