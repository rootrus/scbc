package p040o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import kotlin.TypeCastException;
import org.xmlpull.p042v1.XmlPullParser;
import p040o.ContactUsActivity;
import p040o.onFacebookMessengerClick;

/* renamed from: o.MarketingCSentWebViewActivity */
public final class MarketingCSentWebViewActivity extends LayoutInflater {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    /* access modifiers changed from: private */
    public static final Set<String> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public static final HmlVerifyEmailActivity write;
    private final onCallUsClick IconCompatParcelizer;
    private final onCallUsClick MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean RatingCompat;
    private final boolean read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarketingCSentWebViewActivity(LayoutInflater layoutInflater, Context context, boolean z) {
        super(layoutInflater, context);
        onGetStartedClick.write((Object) layoutInflater, "original");
        onGetStartedClick.write((Object) context, "newContext");
        this.read = Build.VERSION.SDK_INT > 28 || setDividerDrawable.MediaBrowserCompat$ItemReceiver();
        this.IconCompatParcelizer = new MarketingCSentWebViewActivity$MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$SearchResultReceiver = new read(this);
        onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
        onFacebookMessengerClick read2 = onFacebookMessengerClick.MediaMetadataCompat;
        if (read2 == null) {
            read2 = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
            onFacebookMessengerClick.MediaMetadataCompat = read2;
        }
        this.RatingCompat = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z) {
            if (getFactory2() != null && !(getFactory2() instanceof MediaMetadataCompat)) {
                setFactory2(getFactory2());
            }
            if (getFactory() != null && !(getFactory() instanceof MediaDescriptionCompat)) {
                setFactory(getFactory());
            }
        }
    }

    public final LayoutInflater cloneInContext(Context context) {
        onGetStartedClick.write((Object) context, "newContext");
        return new MarketingCSentWebViewActivity(this, context, true);
    }

    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i, viewGroup, z);
        if (inflate != null && this.RatingCompat) {
            inflate.setTag(ContactUsActivity.CustomActionBar.write.viewpump_layout_res, Integer.valueOf(i));
        }
        return inflate;
    }

    public final void setFactory(LayoutInflater.Factory factory) {
        onGetStartedClick.write((Object) factory, "factory");
        if (!(factory instanceof MediaDescriptionCompat)) {
            factory = new MediaDescriptionCompat(factory);
        }
        super.setFactory(factory);
    }

    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        onGetStartedClick.write((Object) factory2, "factory2");
        if (!(factory2 instanceof MediaMetadataCompat)) {
            factory2 = new MediaMetadataCompat(factory2);
        }
        super.setFactory2(factory2);
    }

    /* access modifiers changed from: protected */
    public final View onCreateView(View view, String str, AttributeSet attributeSet) throws ClassNotFoundException {
        onGetStartedClick.write((Object) str, "name");
        onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
        onFacebookMessengerClick read2 = onFacebookMessengerClick.MediaMetadataCompat;
        if (read2 == null) {
            read2 = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
            onFacebookMessengerClick.MediaMetadataCompat = read2;
        }
        Context context = getContext();
        onGetStartedClick.IconCompatParcelizer((Object) context, "context");
        ThirdPartyWebActivity thirdPartyWebActivity = new ThirdPartyWebActivity(str, context, attributeSet, view, this.MediaBrowserCompat$SearchResultReceiver);
        onGetStartedClick.write((Object) thirdPartyWebActivity, "originalRequest");
        return new PrivacyCSentWebViewActivity(read2.MediaBrowserCompat$ItemReceiver, 0, thirdPartyWebActivity).write(thirdPartyWebActivity).read;
    }

    /* access modifiers changed from: protected */
    public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        onGetStartedClick.write((Object) str, "name");
        onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
        onFacebookMessengerClick read2 = onFacebookMessengerClick.MediaMetadataCompat;
        if (read2 == null) {
            read2 = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
            onFacebookMessengerClick.MediaMetadataCompat = read2;
        }
        Context context = getContext();
        onGetStartedClick.IconCompatParcelizer((Object) context, "context");
        ThirdPartyWebActivity thirdPartyWebActivity = new ThirdPartyWebActivity(str, context, attributeSet, this.IconCompatParcelizer);
        onGetStartedClick.write((Object) thirdPartyWebActivity, "originalRequest");
        return new PrivacyCSentWebViewActivity(read2.MediaBrowserCompat$ItemReceiver, 0, thirdPartyWebActivity).write(thirdPartyWebActivity).read;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:14|15|16|17|18|19|28|(3:29|30|38)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0[0] = r3;
        r9 = p040o.MarketingCSentWebViewActivity.write.MediaBrowserCompat$ItemReceiver();
        p040o.onGetStartedClick.write((java.lang.Object) r9, "receiver$0");
        p040o.onGetStartedClick.write((java.lang.Object) r7, "obj");
        p040o.onGetStartedClick.write((java.lang.Object) r0, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r9.set(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        r0[0] = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View MediaBrowserCompat$ItemReceiver(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            o.onFacebookMessengerClick$IconCompatParcelizer r0 = p040o.onFacebookMessengerClick.write
            o.onFacebookMessengerClick r0 = p040o.onFacebookMessengerClick.MediaMetadataCompat
            if (r0 != 0) goto L_0x0014
            o.onFacebookMessengerClick$write r0 = new o.onFacebookMessengerClick$write
            r0.<init>()
            o.onFacebookMessengerClick r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            p040o.onFacebookMessengerClick.MediaMetadataCompat = r0
        L_0x0014:
            boolean r0 = r0.read
            if (r0 != 0) goto L_0x0019
            return r8
        L_0x0019:
            if (r8 != 0) goto L_0x0091
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 46
            r2 = 0
            int r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.CharSequence) r0, (char) r1, (int) r2, (boolean) r2)
            if (r0 < 0) goto L_0x0091
            boolean r0 = r7.read
            r1 = 0
            if (r0 == 0) goto L_0x0035
            android.view.LayoutInflater r8 = r7.cloneInContext(r10)
            android.view.View r8 = r8.createView(r9, r1, r11)
            goto L_0x0091
        L_0x0035:
            java.lang.reflect.Field r0 = p040o.MarketingCSentWebViewActivity.write.MediaBrowserCompat$ItemReceiver()
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0089
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r3 = r0[r2]
            r0[r2] = r10
            java.lang.reflect.Field r10 = p040o.MarketingCSentWebViewActivity.write.MediaBrowserCompat$ItemReceiver()
            java.lang.String r4 = "receiver$0"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r4)
            java.lang.String r5 = "obj"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r5)
            java.lang.String r6 = "value"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r6)
            r10.set(r7, r0)     // Catch:{ IllegalAccessException -> 0x005b }
        L_0x005b:
            android.view.View r8 = r7.createView(r9, r1, r11)     // Catch:{ ClassNotFoundException -> 0x0076, all -> 0x0062 }
            r0[r2] = r3
            goto L_0x0078
        L_0x0062:
            r8 = move-exception
            r0[r2] = r3
            java.lang.reflect.Field r9 = p040o.MarketingCSentWebViewActivity.write.MediaBrowserCompat$ItemReceiver()
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r4)
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r5)
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r6)
            r9.set(r7, r0)     // Catch:{ IllegalAccessException -> 0x0075 }
        L_0x0075:
            throw r8
        L_0x0076:
            r0[r2] = r3
        L_0x0078:
            java.lang.reflect.Field r9 = p040o.MarketingCSentWebViewActivity.write.MediaBrowserCompat$ItemReceiver()
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r4)
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r5)
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r6)
            r9.set(r7, r0)     // Catch:{ IllegalAccessException -> 0x0091 }
            goto L_0x0091
        L_0x0089:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any>"
            r8.<init>(r9)
            throw r8
        L_0x0091:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MarketingCSentWebViewActivity.MediaBrowserCompat$ItemReceiver(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* access modifiers changed from: private */
    public final View MediaBrowserCompat$CustomActionResultReceiver(View view, String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(view, str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final View IconCompatParcelizer(String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: o.MarketingCSentWebViewActivity$read */
    static final class read implements onCallUsClick {
        private final MarketingCSentWebViewActivity MediaBrowserCompat$CustomActionResultReceiver;

        public read(MarketingCSentWebViewActivity marketingCSentWebViewActivity) {
            onGetStartedClick.write((Object) marketingCSentWebViewActivity, "inflater");
            this.MediaBrowserCompat$CustomActionResultReceiver = marketingCSentWebViewActivity;
        }

        public final View IconCompatParcelizer(View view, String str, Context context, AttributeSet attributeSet) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) context, "context");
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view, str, attributeSet);
        }
    }

    /* renamed from: o.MarketingCSentWebViewActivity$MediaDescriptionCompat */
    static final class MediaDescriptionCompat implements LayoutInflater.Factory {
        private final onCallUsClick MediaBrowserCompat$CustomActionResultReceiver;

        public MediaDescriptionCompat(LayoutInflater.Factory factory) {
            onGetStartedClick.write((Object) factory, "factory");
            this.MediaBrowserCompat$CustomActionResultReceiver = new MarketingCSentWebViewActivity$MediaBrowserCompat$MediaItem(factory);
        }

        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) context, "context");
            onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
            onFacebookMessengerClick read = onFacebookMessengerClick.MediaMetadataCompat;
            if (read == null) {
                read = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
                onFacebookMessengerClick.MediaMetadataCompat = read;
            }
            ThirdPartyWebActivity thirdPartyWebActivity = new ThirdPartyWebActivity(str, context, attributeSet, this.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.write((Object) thirdPartyWebActivity, "originalRequest");
            return new PrivacyCSentWebViewActivity(read.MediaBrowserCompat$ItemReceiver, 0, thirdPartyWebActivity).write(thirdPartyWebActivity).read;
        }
    }

    /* renamed from: o.MarketingCSentWebViewActivity$MediaMetadataCompat */
    static class MediaMetadataCompat implements LayoutInflater.Factory2 {
        private final RatingCompat MediaBrowserCompat$ItemReceiver;

        public MediaMetadataCompat(LayoutInflater.Factory2 factory2) {
            onGetStartedClick.write((Object) factory2, "factory2");
            this.MediaBrowserCompat$ItemReceiver = new RatingCompat(factory2);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) context, "context");
            return onCreateView((View) null, str, context, attributeSet);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) context, "context");
            onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
            onFacebookMessengerClick read = onFacebookMessengerClick.MediaMetadataCompat;
            if (read == null) {
                read = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
                onFacebookMessengerClick.MediaMetadataCompat = read;
            }
            ThirdPartyWebActivity thirdPartyWebActivity = new ThirdPartyWebActivity(str, context, attributeSet, view, this.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.write((Object) thirdPartyWebActivity, "originalRequest");
            return new PrivacyCSentWebViewActivity(read.MediaBrowserCompat$ItemReceiver, 0, thirdPartyWebActivity).write(thirdPartyWebActivity).read;
        }
    }

    /* renamed from: o.MarketingCSentWebViewActivity$RatingCompat */
    static class RatingCompat implements onCallUsClick {
        private final LayoutInflater.Factory2 MediaBrowserCompat$ItemReceiver;

        public RatingCompat(LayoutInflater.Factory2 factory2) {
            onGetStartedClick.write((Object) factory2, "factory2");
            this.MediaBrowserCompat$ItemReceiver = factory2;
        }

        /* access modifiers changed from: protected */
        public final LayoutInflater.Factory2 write() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public View IconCompatParcelizer(View view, String str, Context context, AttributeSet attributeSet) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) context, "context");
            return this.MediaBrowserCompat$ItemReceiver.onCreateView(view, str, context, attributeSet);
        }
    }

    /* renamed from: o.MarketingCSentWebViewActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends MediaMetadataCompat {
        private final C6947x45091141 read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(LayoutInflater.Factory2 factory2, MarketingCSentWebViewActivity marketingCSentWebViewActivity) {
            super(factory2);
            onGetStartedClick.write((Object) factory2, "factory2");
            onGetStartedClick.write((Object) marketingCSentWebViewActivity, "inflater");
            this.read = new C6947x45091141(factory2, marketingCSentWebViewActivity);
        }

        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) context, "context");
            onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
            onFacebookMessengerClick read2 = onFacebookMessengerClick.MediaMetadataCompat;
            if (read2 == null) {
                read2 = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
                onFacebookMessengerClick.MediaMetadataCompat = read2;
            }
            ThirdPartyWebActivity thirdPartyWebActivity = new ThirdPartyWebActivity(str, context, attributeSet, view, this.read);
            onGetStartedClick.write((Object) thirdPartyWebActivity, "originalRequest");
            return new PrivacyCSentWebViewActivity(read2.MediaBrowserCompat$ItemReceiver, 0, thirdPartyWebActivity).write(thirdPartyWebActivity).read;
        }
    }

    /* renamed from: o.MarketingCSentWebViewActivity$write */
    public static final class write {
        static {
            clickNext[] clicknextArr = new clickNext[1];
            clickNext write = FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(write.class), "CONSTRUCTOR_ARGS_FIELD", "getCONSTRUCTOR_ARGS_FIELD()Ljava/lang/reflect/Field;"));
        }

        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static final /* synthetic */ Field MediaBrowserCompat$ItemReceiver() {
            HmlVerifyEmailActivity IconCompatParcelizer = MarketingCSentWebViewActivity.write;
            write write = MarketingCSentWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver;
            return (Field) IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    static {
        String[] strArr = {"android.widget.", "android.webkit."};
        onGetStartedClick.write((Object) strArr, "elements");
        MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(strArr);
        FundActionsSuccessActivity fundActionsSuccessActivity = C6946xa1f888a0.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        write = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        Method method;
        onGetStartedClick.write((Object) xmlPullParser, "parser");
        if (!this.MediaDescriptionCompat) {
            onFacebookMessengerClick.IconCompatParcelizer iconCompatParcelizer = onFacebookMessengerClick.write;
            onFacebookMessengerClick read2 = onFacebookMessengerClick.MediaMetadataCompat;
            if (read2 == null) {
                read2 = new onFacebookMessengerClick.write().MediaBrowserCompat$CustomActionResultReceiver();
                onFacebookMessengerClick.MediaMetadataCompat = read2;
            }
            if (read2.IconCompatParcelizer) {
                if (!(getContext() instanceof LayoutInflater.Factory2)) {
                    this.MediaDescriptionCompat = true;
                } else {
                    Class<LayoutInflater> cls = LayoutInflater.class;
                    onGetStartedClick.write((Object) cls, "receiver$0");
                    onGetStartedClick.write((Object) "setPrivateFactory", "methodName");
                    Method[] methods = cls.getMethods();
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i];
                        onGetStartedClick.IconCompatParcelizer((Object) method, "method");
                        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) method.getName(), (Object) "setPrivateFactory")) {
                            method.setAccessible(true);
                            break;
                        }
                        i++;
                    }
                    Object[] objArr = new Object[1];
                    Context context = getContext();
                    if (context != null) {
                        objArr[0] = new IconCompatParcelizer((LayoutInflater.Factory2) context, this);
                        onGetStartedClick.write((Object) this, "target");
                        onGetStartedClick.write((Object) objArr, "args");
                        if (method != null) {
                            try {
                                method.invoke(this, Arrays.copyOf(objArr, 1));
                            } catch (IllegalAccessException e) {
                                Log.d("ReflectionUtils", "Can't access method using reflection", e);
                            } catch (InvocationTargetException e2) {
                                Log.d("ReflectionUtils", "Can't invoke method using reflection", e2);
                            }
                        }
                        this.MediaDescriptionCompat = true;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater.Factory2");
                    }
                }
            }
        }
        View inflate = super.inflate(xmlPullParser, viewGroup, z);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "super.inflate(parser, root, attachToRoot)");
        return inflate;
    }
}
