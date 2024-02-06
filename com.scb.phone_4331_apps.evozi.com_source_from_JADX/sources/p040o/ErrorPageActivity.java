package p040o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.gson.Gson;
import com.scb.phone.view.activity.deeplink.C5588xdb5a0e5b;
import java.io.Closeable;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindIssuerInputFragment;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.JuristicResetPinLandingActivity;
import p040o.closeTutorial;
import p040o.setupDialog;

/* renamed from: o.ErrorPageActivity */
public final class ErrorPageActivity implements FullScreenLoadingActivity {
    private static final String[] read = {"_id", "request", "request_type", "site_key", "timestamp", "host_uri"};
    private final Gson IconCompatParcelizer;

    public final int MediaBrowserCompat$ItemReceiver() {
        return 3;
    }

    public final int read() {
        return 2;
    }

    public ErrorPageActivity() {
        Gson PlaybackStateCompat$CustomAction = FragmentBuilder_BindHmlIssuerLandingFragment.PlaybackStateCompat$CustomAction();
        onGetStartedClick.IconCompatParcelizer((Object) PlaybackStateCompat$CustomAction, "OneInternalProvider.getGson()");
        this.IconCompatParcelizer = PlaybackStateCompat$CustomAction;
    }

    public final FragmentBuilder_BindIssuerInputFragment<Exception, Boolean> MediaBrowserCompat$CustomActionResultReceiver(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            return FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new ErrorPageActivity$MediaBrowserCompat$ItemReceiver(sQLiteDatabase, this));
        }
        C6559x7897674c fragmentBuilder_BindIssuerInputFragment$MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer;
        return new FragmentBuilder_BindIssuerInputFragment.write<>(new NullPointerException(FragmentBuilder_BindMailingAddressSuccessfulFragment.NULL_SQLITE_THUNDERHEAD_DB_UPGRADE.toString()));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[Catch:{ Exception -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ Exception -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String IconCompatParcelizer(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x000f
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 == 0) goto L_0x0013
            return r7
        L_0x0013:
            com.google.gson.Gson r0 = r5.IconCompatParcelizer     // Catch:{ Exception -> 0x0070 }
            java.lang.Class<com.thunderhead.android.infrastructure.server.requests.BaseRequest> r3 = com.thunderhead.android.infrastructure.server.requests.BaseRequest.class
            java.lang.Object r0 = r0.fromJson((java.lang.String) r6, r3)     // Catch:{ Exception -> 0x0070 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r0 = (com.thunderhead.android.infrastructure.server.requests.BaseRequest) r0     // Catch:{ Exception -> 0x0070 }
            java.net.URI r3 = new java.net.URI     // Catch:{ Exception -> 0x0070 }
            java.lang.String r4 = "maybeBaseRequest"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r0 = r0.getUri()     // Catch:{ Exception -> 0x0070 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r0 = r3.getScheme()     // Catch:{ Exception -> 0x0070 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x003c
            int r0 = r0.length()     // Catch:{ Exception -> 0x0070 }
            if (r0 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r0 = r1
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = r3.getAuthority()     // Catch:{ Exception -> 0x0070 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0050
            int r0 = r0.length()     // Catch:{ Exception -> 0x0070 }
            if (r0 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r0 = r1
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 != 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0070 }
            r0.<init>()     // Catch:{ Exception -> 0x0070 }
            java.lang.String r4 = r3.getScheme()     // Catch:{ Exception -> 0x0070 }
            r0.append(r4)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r4 = "://"
            r0.append(r4)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r3 = r3.getAuthority()     // Catch:{ Exception -> 0x0070 }
            r0.append(r3)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x0070 }
            goto L_0x007f
        L_0x0070:
            r0 = move-exception
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r3 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V2_OFFLINE_INTERACTION_TOUCHPOINT
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r3 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r3, r2)
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r0)
        L_0x007f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity.IconCompatParcelizer(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ Exception -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051 A[Catch:{ Exception -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String MediaBrowserCompat$ItemReceiver(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x000f
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 == 0) goto L_0x0013
            return r7
        L_0x0013:
            com.google.gson.Gson r0 = r5.IconCompatParcelizer     // Catch:{ Exception -> 0x006e }
            java.lang.Class<o.ECouponCommonActivity> r3 = p040o.ECouponCommonActivity.class
            java.lang.Object r0 = r0.fromJson((java.lang.String) r6, r3)     // Catch:{ Exception -> 0x006e }
            o.ECouponCommonActivity r0 = (p040o.ECouponCommonActivity) r0     // Catch:{ Exception -> 0x006e }
            java.net.URI r3 = new java.net.URI     // Catch:{ Exception -> 0x006e }
            java.lang.String r4 = "maybeProperties"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = r0.IconCompatParcelizer     // Catch:{ Exception -> 0x006e }
            r3.<init>(r0)     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = r3.getScheme()     // Catch:{ Exception -> 0x006e }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x006e }
            if (r0 == 0) goto L_0x003a
            int r0 = r0.length()     // Catch:{ Exception -> 0x006e }
            if (r0 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r0 = r1
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = r3.getAuthority()     // Catch:{ Exception -> 0x006e }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x006e }
            if (r0 == 0) goto L_0x004e
            int r0 = r0.length()     // Catch:{ Exception -> 0x006e }
            if (r0 != 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            if (r0 != 0) goto L_0x007d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006e }
            r0.<init>()     // Catch:{ Exception -> 0x006e }
            java.lang.String r4 = r3.getScheme()     // Catch:{ Exception -> 0x006e }
            r0.append(r4)     // Catch:{ Exception -> 0x006e }
            java.lang.String r4 = "://"
            r0.append(r4)     // Catch:{ Exception -> 0x006e }
            java.lang.String r3 = r3.getAuthority()     // Catch:{ Exception -> 0x006e }
            r0.append(r3)     // Catch:{ Exception -> 0x006e }
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x006e }
            goto L_0x007d
        L_0x006e:
            r0 = move-exception
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r3 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V2_OFFLINE_PROPERTIES_TOUCHPOINT
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r3 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r3, r2)
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r0)
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity.MediaBrowserCompat$ItemReceiver(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: o.ErrorPageActivity$write */
    public static final class write implements setMap {
        private final FragmentBuilder_BindPurchaseProfileManagementFragment.write IconCompatParcelizer;
        private final C5588xdb5a0e5b MediaBrowserCompat$ItemReceiver;
        public final KeepName read;

        private write() {
        }

        public write(C5588xdb5a0e5b webViewDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindPurchaseProfileManagementFragment.write write, KeepName keepName) {
            this.MediaBrowserCompat$ItemReceiver = webViewDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.IconCompatParcelizer = write;
            this.read = keepName;
        }

        public List<zzrt> MediaBrowserCompat$ItemReceiver() {
            zzvf zzvf = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write;
            if (zzvf == null || zzvf.MediaBrowserCompat$SearchResultReceiver == null) {
                return new ArrayList();
            }
            return zzvf.MediaBrowserCompat$SearchResultReceiver;
        }

        private C10857result write() {
            C10857result write = C10857result.write();
            show show = new show(MediaBrowserCompat$ItemReceiver());
            write.write = (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, getStringFlagValue.MediaBrowserCompat$CustomActionResultReceiver)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
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
            }));
            return write;
        }

        public final DebitCardResetOtpActivity<List<zzvy>> IconCompatParcelizer() {
            C10857result write = write();
            if (write != null && write.write != null && write.write.isEmpty()) {
                return DebitCardResetOtpActivity.just(new ArrayList());
            }
            C5588xdb5a0e5b webViewDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
            return webViewDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver.read.getSmeLoanSummary(write()).flatMap(new transactAndReadException(this));
        }
    }

    /* renamed from: o.ErrorPageActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<Map<Integer, ? extends ContentValues>> {
        final /* synthetic */ ErrorPageActivity IconCompatParcelizer;
        private /* synthetic */ Cursor MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ String read;
        final /* synthetic */ String write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(ErrorPageActivity errorPageActivity, Cursor cursor, String str, String str2, String str3) {
            super(0);
            this.IconCompatParcelizer = errorPageActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = cursor;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
            this.write = str3;
        }

        public final /* synthetic */ Object invoke() {
            final Long valueOf = Long.valueOf(System.currentTimeMillis());
            Cursor cursor = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) cursor, "$this$toSequence");
            FundActionsSuccessActivity closetutorial_mediabrowsercompat_itemreceiver = new closeTutorial$MediaBrowserCompat$ItemReceiver(cursor);
            onGetStartedClick.write((Object) closetutorial_mediabrowsercompat_itemreceiver, "nextFunction");
            BaseJuristicPinActivity_ViewBinding selectInvestmentActivity = new SelectInvestmentActivity(closetutorial_mediabrowsercompat_itemreceiver, new JuristicResetPinLandingActivity.IconCompatParcelizer(closetutorial_mediabrowsercompat_itemreceiver));
            onGetStartedClick.write((Object) selectInvestmentActivity, "$this$constrainOnce");
            BaseJuristicPinActivity_ViewBinding scbsOnboardingTcActivity = new ScbsOnboardingTcActivity(selectInvestmentActivity);
            FundFactSheetActivity r1 = new FundFactSheetActivity<Cursor, HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends FragmentBuilder_BindReviewRedemptionFragment>>(this) {
                private /* synthetic */ IconCompatParcelizer write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment;
                    Cursor cursor = (Cursor) obj;
                    onGetStartedClick.write((Object) cursor, "it");
                    int i = cursor.getInt(cursor.getColumnIndex("_id"));
                    FragmentBuilder_BindIssuerInputFragment MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new read(this.write.IconCompatParcelizer, cursor, valueOf, this.write.read, this.write.MediaBrowserCompat$ItemReceiver, this.write.write));
                    if (MediaBrowserCompat$CustomActionResultReceiver instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) MediaBrowserCompat$CustomActionResultReceiver).write);
                        fragmentBuilder_BindReviewRedemptionFragment = null;
                    } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
                        fragmentBuilder_BindReviewRedemptionFragment = (FragmentBuilder_BindReviewRedemptionFragment) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(i), fragmentBuilder_BindReviewRedemptionFragment);
                }
            };
            onGetStartedClick.write((Object) scbsOnboardingTcActivity, "$this$map");
            onGetStartedClick.write((Object) r1, "transform");
            BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity = new JuristicSetupNewPinActivity(scbsOnboardingTcActivity, r1);
            FundFactSheetActivity fundFactSheetActivity = C64641.write;
            onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$filter");
            onGetStartedClick.write((Object) fundFactSheetActivity, "predicate");
            BaseJuristicPinActivity_ViewBinding setupScheduleActivity = new SetupScheduleActivity(juristicSetupNewPinActivity, true, fundFactSheetActivity);
            FundFactSheetActivity r12 = new FundFactSheetActivity<HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends FragmentBuilder_BindReviewRedemptionFragment>, HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends ContentValues>>(this) {
                private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Long l;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment;
                    HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
                    onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "<name for destructuring parameter 0>");
                    int intValue = ((Number) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver).intValue();
                    FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment = (FragmentBuilder_BindReviewRedemptionFragment) hmlVerifyEmailSuccessfulActivity.write;
                    ContentValues contentValues = new ContentValues();
                    if (fragmentBuilder_BindReviewRedemptionFragment == null || (l = fragmentBuilder_BindReviewRedemptionFragment.RatingCompat) == null) {
                        l = valueOf;
                    }
                    contentValues.put("timestamp", l);
                    if (fragmentBuilder_BindReviewRedemptionFragment == null || (str = fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$ItemReceiver) == null) {
                        str = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    }
                    contentValues.put("site_key", str);
                    if (fragmentBuilder_BindReviewRedemptionFragment == null || (str2 = fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                        str2 = this.IconCompatParcelizer.read;
                    }
                    contentValues.put("host_uri", str2);
                    if (fragmentBuilder_BindReviewRedemptionFragment == null || (str3 = fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$SearchResultReceiver) == null) {
                        str3 = this.IconCompatParcelizer.write;
                    }
                    contentValues.put("touchpoint_uri", str3);
                    if (fragmentBuilder_BindReviewRedemptionFragment == null || (fragmentBuilder_BindRiskSelectionFragment = fragmentBuilder_BindReviewRedemptionFragment.IconCompatParcelizer) == null || (str4 = fragmentBuilder_BindRiskSelectionFragment.name()) == null) {
                        str4 = FragmentBuilder_BindRiskSelectionFragment.UNKNOWN.name();
                    }
                    contentValues.put("request_type", str4);
                    return new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(intValue), contentValues);
                }
            };
            onGetStartedClick.write((Object) setupScheduleActivity, "$this$map");
            onGetStartedClick.write((Object) r12, "transform");
            BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity2 = new JuristicSetupNewPinActivity(setupScheduleActivity, r12);
            onGetStartedClick.write((Object) juristicSetupNewPinActivity2, "$this$toMap");
            return HmlNdidSelectIdpActivity.read(HmlNdidSelectIdpActivity.write(juristicSetupNewPinActivity2, new LinkedHashMap()));
        }
    }

    /* renamed from: o.ErrorPageActivity$read */
    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<FragmentBuilder_BindReviewRedemptionFragment> {
        private /* synthetic */ Long IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ ErrorPageActivity MediaBrowserCompat$SearchResultReceiver;
        private /* synthetic */ Cursor read;
        private /* synthetic */ String write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(ErrorPageActivity errorPageActivity, Cursor cursor, Long l, String str, String str2, String str3) {
            super(0);
            this.MediaBrowserCompat$SearchResultReceiver = errorPageActivity;
            this.read = cursor;
            this.IconCompatParcelizer = l;
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r8 = this;
                android.database.Cursor r0 = r8.read
                java.lang.String r1 = "timestamp"
                int r1 = r0.getColumnIndex(r1)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "getString(getColumnIndex(v2v3ColumnTimeStamp))"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r1 = "$this$toLongOrNull"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.Long r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$MediaItem(r0)
                if (r0 != 0) goto L_0x001e
                java.lang.Long r0 = r8.IconCompatParcelizer
            L_0x001e:
                r2 = r0
                android.database.Cursor r0 = r8.read
                java.lang.String r1 = "host_uri"
                int r1 = r0.getColumnIndex(r1)
                java.lang.String r0 = r0.getString(r1)
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x003a
                int r1 = r1.length()
                if (r1 == 0) goto L_0x003a
                r1 = r3
                goto L_0x003b
            L_0x003a:
                r1 = r4
            L_0x003b:
                if (r1 == 0) goto L_0x003f
                java.lang.String r0 = r8.write
            L_0x003f:
                android.database.Cursor r1 = r8.read
                java.lang.String r5 = "site_key"
                int r5 = r1.getColumnIndex(r5)
                java.lang.String r1 = r1.getString(r5)
                r5 = r1
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0056
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0057
            L_0x0056:
                r3 = r4
            L_0x0057:
                if (r3 == 0) goto L_0x005b
                java.lang.String r1 = r8.MediaBrowserCompat$ItemReceiver
            L_0x005b:
                r5 = r1
                android.database.Cursor r1 = r8.read
                java.lang.String r3 = "request_type"
                int r3 = r1.getColumnIndex(r3)
                java.lang.String r1 = r1.getString(r3)
                if (r1 == 0) goto L_0x0097
                int r3 = r1.hashCode()
                r6 = -897369731(0xffffffffca83397d, float:-4299966.5)
                if (r3 == r6) goto L_0x008c
                if (r3 == 0) goto L_0x0085
                r6 = 1520785679(0x5aa5590f, float:2.32706461E16)
                if (r3 != r6) goto L_0x0097
                java.lang.String r3 = "offline_properties"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0097
                o.FragmentBuilder_BindRiskSelectionFragment r1 = p040o.FragmentBuilder_BindRiskSelectionFragment.PROPERTY
                goto L_0x0099
            L_0x0085:
                java.lang.String r3 = ""
                boolean r1 = r1.equals(r3)
                goto L_0x0097
            L_0x008c:
                java.lang.String r3 = "offline_interactions"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0097
                o.FragmentBuilder_BindRiskSelectionFragment r1 = p040o.FragmentBuilder_BindRiskSelectionFragment.INTERACTION
                goto L_0x0099
            L_0x0097:
                o.FragmentBuilder_BindRiskSelectionFragment r1 = p040o.FragmentBuilder_BindRiskSelectionFragment.UNKNOWN
            L_0x0099:
                r6 = r1
                int[] r1 = p040o.ErrorGenericActivity.IconCompatParcelizer
                int r3 = r6.ordinal()
                r1 = r1[r3]
                java.lang.String r3 = "request"
                if (r1 == r4) goto L_0x00bf
                r4 = 2
                if (r1 == r4) goto L_0x00ac
                java.lang.String r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
                goto L_0x00d1
            L_0x00ac:
                o.ErrorPageActivity r1 = r8.MediaBrowserCompat$SearchResultReceiver
                android.database.Cursor r4 = r8.read
                int r3 = r4.getColumnIndex(r3)
                java.lang.String r3 = r4.getString(r3)
                java.lang.String r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r1 = r1.IconCompatParcelizer(r3, r4)
                goto L_0x00d1
            L_0x00bf:
                o.ErrorPageActivity r1 = r8.MediaBrowserCompat$SearchResultReceiver
                android.database.Cursor r4 = r8.read
                int r3 = r4.getColumnIndex(r3)
                java.lang.String r3 = r4.getString(r3)
                java.lang.String r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver((java.lang.String) r3, (java.lang.String) r4)
            L_0x00d1:
                r3 = r1
                o.ErrorPageActivity$read$4 r7 = new o.ErrorPageActivity$read$4
                r1 = r7
                r4 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                o.FundFactSheetActivity r7 = (p040o.FundFactSheetActivity) r7
                java.lang.String r0 = "initializer"
                p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
                o.FragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver r0 = new o.FragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver
                r0.<init>()
                r7.invoke(r0)
                o.FragmentBuilder_BindReviewRedemptionFragment r0 = r0.write()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity.read.invoke():java.lang.Object");
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(ErrorPageActivity errorPageActivity, SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        Throwable th;
        URI uri;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V2_OFFLINE_INTERACTIONS_START, new Object[0]);
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
        onGetStartedClick.IconCompatParcelizer((Object) customView, "OneInternalProvider.getStateStore()");
        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver = customView.MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "OneInternalProvider.getStateStore().state");
        OnBoardingTutorialActivity onBoardingTutorialActivity = MediaBrowserCompat$ItemReceiver;
        String invoke = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity);
        CharSequence charSequence = invoke;
        if (charSequence == null || charSequence.length() == 0) {
            invoke = "~~SITEKEY~~";
        }
        String str3 = invoke;
        FragmentBuilder_BindHmlOperatingBankFragment invoke2 = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$MediaItem().invoke(onBoardingTutorialActivity);
        if (invoke2 == null || (uri = invoke2.write) == null || (str = uri.toString()) == null) {
            str = "~~HOST~~";
        }
        String str4 = str;
        onGetStartedClick.IconCompatParcelizer((Object) str4, "selectThinstance(state)?…3ColumnHostUriPlaceHolder");
        URI invoke3 = FragmentBuilder_BindOnboardingInputAddressFragment.ParcelableVolumeInfo().invoke(onBoardingTutorialActivity);
        if (invoke3 == null || (str2 = invoke3.toString()) == null) {
            str2 = "~~TOUCHPOINT~~";
        }
        String str5 = str2;
        onGetStartedClick.IconCompatParcelizer((Object) str5, "touchpointWithAndroidSch…nTouchpointUriPlaceHolder");
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V3_OFFLINE_INTERACTIONS_SITEKEY_HOST_TOUCHPOINT, str3, str4, str5);
        Cursor query = sQLiteDatabase.query("offline_requests", read, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
        if (query != null) {
            Closeable closeable = query;
            try {
                Cursor cursor = (Cursor) closeable;
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.V2_OFFLINE_INTERACTIONS_COUNT, Integer.valueOf(cursor.getCount()));
                FragmentBuilder_BindIssuerInputFragment MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new IconCompatParcelizer(errorPageActivity, cursor, str3, str4, str5));
                AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(closeable, (Throwable) null);
                if (MediaBrowserCompat$CustomActionResultReceiver instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                    MyECouponActivity_ViewBinding.read((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) MediaBrowserCompat$CustomActionResultReceiver).write, FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_LOADING_CURSOR);
                } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
                    FundFactSheetActivity errorPageActivity$MediaBrowserCompat$CustomActionResultReceiver = new ErrorPageActivity$MediaBrowserCompat$CustomActionResultReceiver((Map) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver);
                    onGetStartedClick.write((Object) sQLiteDatabase2, "$this$transaction");
                    onGetStartedClick.write((Object) errorPageActivity$MediaBrowserCompat$CustomActionResultReceiver, "block");
                    FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new closeTutorial.IconCompatParcelizer(sQLiteDatabase2, errorPageActivity$MediaBrowserCompat$CustomActionResultReceiver));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(closeable, th);
                throw th3;
            }
        }
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V2_OFFLINE_INTERACTIONS_STOP, new Object[0]);
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ErrorPageActivity errorPageActivity, SQLiteDatabase sQLiteDatabase) {
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_COLUMNS_START, "offline_requests", 2, 3);
        sQLiteDatabase.execSQL("ALTER TABLE offline_requests ADD COLUMN touchpoint_uri TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''");
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_COLUMNS_STOP, "offline_requests", 2, 3);
    }
}
