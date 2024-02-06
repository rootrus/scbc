package com.scb.phone.view.custom.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.CrashlyticsReport;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FragmentBuilder_BindBaseSuccessFragment;
import p040o.SessionReportingCoordinator$$Lambda$1;
import p040o.abandon;
import p040o.deliverCancellation;
import p040o.getViewModelStore;
import p040o.isReset;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.performCreate;

public final class ItemAdditionalMetaDataCustom extends ItemCustom<SessionReportingCoordinator$$Lambda$1> {
    private FragmentBuilder_BindBaseFragment IconCompatParcelizer;
    private HashMap<String, Boolean> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();
    /* access modifiers changed from: private */
    public FragmentBuilder_BindBaseSuccessFragment MediaBrowserCompat$ItemReceiver;
    @BindView
    public LinearLayout container;
    private List<CrashlyticsReport.Session.OperatingSystem.Builder> write;

    public final class TypeTextView_ViewBinding implements Unbinder {
        private TypeTextView write;

        public TypeTextView_ViewBinding(TypeTextView typeTextView, View view) {
            this.write = typeTextView;
            typeTextView.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
            typeTextView.headerTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text_view, "field 'headerTextView'", TextView.class);
            typeTextView.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
            typeTextView.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        }

        public final void read() {
            TypeTextView typeTextView = this.write;
            if (typeTextView != null) {
                this.write = null;
                typeTextView.titleTextView = null;
                typeTextView.headerTextView = null;
                typeTextView.descriptionTextView = null;
                typeTextView.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class TypeMiniQrView_ViewBinding implements Unbinder {
        private TypeMiniQrView MediaBrowserCompat$ItemReceiver;

        public TypeMiniQrView_ViewBinding(TypeMiniQrView typeMiniQrView, View view) {
            this.MediaBrowserCompat$ItemReceiver = typeMiniQrView;
            typeMiniQrView.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description_text, "field 'tvTitle'", TextView.class);
            typeMiniQrView.imageQrCode = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image, "field 'imageQrCode'", ImageView.class);
            typeMiniQrView.tvHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_reference_id_text, "field 'tvHeader'", TextView.class);
            typeMiniQrView.tvDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description, "field 'tvDescription'", TextView.class);
        }

        public final void read() {
            TypeMiniQrView typeMiniQrView = this.MediaBrowserCompat$ItemReceiver;
            if (typeMiniQrView != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                typeMiniQrView.tvTitle = null;
                typeMiniQrView.imageQrCode = null;
                typeMiniQrView.tvHeader = null;
                typeMiniQrView.tvDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class TypeTextWithImageView_ViewBinding implements Unbinder {
        private TypeTextWithImageView MediaBrowserCompat$ItemReceiver;

        public TypeTextWithImageView_ViewBinding(TypeTextWithImageView typeTextWithImageView, View view) {
            this.MediaBrowserCompat$ItemReceiver = typeTextWithImageView;
            typeTextWithImageView.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
            typeTextWithImageView.headerTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text_view, "field 'headerTextView'", TextView.class);
            typeTextWithImageView.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
            typeTextWithImageView.imageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_chubb, "field 'imageView'", ImageView.class);
            typeTextWithImageView.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        }

        public final void read() {
            TypeTextWithImageView typeTextWithImageView = this.MediaBrowserCompat$ItemReceiver;
            if (typeTextWithImageView != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                typeTextWithImageView.titleTextView = null;
                typeTextWithImageView.headerTextView = null;
                typeTextWithImageView.descriptionTextView = null;
                typeTextWithImageView.imageView = null;
                typeTextWithImageView.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom) {
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list = itemAdditionalMetaDataCustom.write;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentInfoDisplays");
        }
        return list;
    }

    public final void setContainer(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.container = linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemAdditionalMetaDataCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemAdditionalMetaDataCustom(Context context, FragmentBuilder_BindBaseFragment fragmentBuilder_BindBaseFragment) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        this.IconCompatParcelizer = fragmentBuilder_BindBaseFragment;
        if (fragmentBuilder_BindBaseFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = new read(this);
        }
    }

    public static final class read implements FragmentBuilder_BindBaseSuccessFragment {
        private /* synthetic */ ItemAdditionalMetaDataCustom read;

        read(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom) {
            this.read = itemAdditionalMetaDataCustom;
        }

        public final void read(String str) {
            onGetStartedClick.write((Object) str, "key");
            ItemAdditionalMetaDataCustom.write(this.read, str, true);
            ItemAdditionalMetaDataCustom.read(this.read);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        LayoutInflater.from(context).inflate(R.layout.f81412131493367, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x032a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUpWithDisplay(p040o.SessionReportingCoordinator$$Lambda$1 r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "display"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            o.onNotNowClick$read r2 = new o.onNotNowClick$read
            r2.<init>()
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "display.paymentInfoDisplays"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
            r0.write = r3
            o.FragmentBuilder_BindBaseFragment r5 = r0.IconCompatParcelizer
            java.lang.String r6 = "_text"
            java.lang.String r7 = "MINI_QR"
            java.lang.String r9 = "TEXT_WITH_IMAGE"
            java.lang.String r11 = "TEXT"
            r12 = 2571565(0x273d2d, float:3.60353E-39)
            java.lang.String r13 = "Index overflow has happened."
            java.lang.String r14 = "paymentInfoDisplays"
            if (r5 == 0) goto L_0x00d2
            if (r3 != 0) goto L_0x002f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r14)
        L_0x002f:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x0036:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x00d2
            java.lang.Object r16 = r3.next()
            if (r5 < 0) goto L_0x00ca
            r15 = r16
            o.CrashlyticsReport$Session$OperatingSystem$Builder r15 = (p040o.CrashlyticsReport.Session.OperatingSystem.Builder) r15
            java.lang.String r8 = r15.MediaBrowserCompat$MediaItem
            if (r8 == 0) goto L_0x00c3
            int r10 = r8.hashCode()
            if (r10 == r12) goto L_0x00a1
            java.lang.String r18 = ""
            r12 = 173710036(0xa5a9ad4, float:1.0525438E-32)
            if (r10 == r12) goto L_0x0077
            r12 = 1782537993(0x6a3f5f09, float:5.7838406E25)
            if (r10 != r12) goto L_0x00c3
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x00c3
            java.lang.String r8 = r15.read
            if (r8 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r8 = r18
        L_0x0069:
            o.FragmentBuilder_BindBaseFragment r10 = r0.IconCompatParcelizer
            if (r10 == 0) goto L_0x00c3
            java.util.HashMap<java.lang.String, java.lang.Boolean> r10 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r10.put(r8, r12)
            goto L_0x00c3
        L_0x0077:
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00c3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r10 = r15.MediaBrowserCompat$ItemReceiver
            if (r10 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r10 = r18
        L_0x008c:
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            o.FragmentBuilder_BindBaseFragment r10 = r0.IconCompatParcelizer
            if (r10 == 0) goto L_0x00c3
            java.util.HashMap<java.lang.String, java.lang.Boolean> r10 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r10.put(r8, r12)
            goto L_0x00c3
        L_0x00a1:
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x00c3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            o.FragmentBuilder_BindBaseFragment r10 = r0.IconCompatParcelizer
            if (r10 == 0) goto L_0x00c3
            java.util.HashMap<java.lang.String, java.lang.Boolean> r10 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r10.put(r8, r12)
        L_0x00c3:
            int r5 = r5 + 1
            r12 = 2571565(0x273d2d, float:3.60353E-39)
            goto L_0x0036
        L_0x00ca:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r13)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x00d2:
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x00de:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x033c
            java.lang.Object r4 = r1.next()
            if (r3 < 0) goto L_0x0334
            o.CrashlyticsReport$Session$OperatingSystem$Builder r4 = (p040o.CrashlyticsReport.Session.OperatingSystem.Builder) r4
            java.lang.String r5 = r4.MediaBrowserCompat$MediaItem
            if (r5 == 0) goto L_0x030d
            int r8 = r5.hashCode()
            java.lang.String r10 = "rootView"
            java.lang.String r12 = "context"
            java.lang.String r15 = "paymentInfoDisplay"
            r18 = r1
            r1 = 2571565(0x273d2d, float:3.60353E-39)
            if (r8 == r1) goto L_0x0213
            r1 = 173710036(0xa5a9ad4, float:1.0525438E-32)
            if (r8 == r1) goto L_0x01f2
            r1 = 1782537993(0x6a3f5f09, float:5.7838406E25)
            if (r8 != r1) goto L_0x01ee
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01ee
            android.content.Context r5 = r22.getContext()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r12)
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeMiniQrView r8 = new com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeMiniQrView
            r8.<init>(r0, r5)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r15)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r15)
            android.widget.TextView r5 = r8.tvTitle
            if (r5 != 0) goto L_0x012c
            java.lang.String r15 = "tvTitle"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r15)
        L_0x012c:
            java.lang.String r15 = r4.MediaBrowserCompat$SearchResultReceiver
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r5.setText(r15)
            o.FundOnboardingSuccessActivity r5 = p040o.FundOnboardingSuccessActivity.IconCompatParcelizer
            r15 = 1
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.String r1 = r4.read
            r17 = 0
            r5[r17] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r15)
            java.lang.String r5 = "%s.jpg"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r5)
            r8.MediaBrowserCompat$CustomActionResultReceiver = r1
            android.content.Context r1 = r8.getContext()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r12)
            java.io.File r5 = new java.io.File
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r12 = "pullslip"
            r5.<init>(r1, r12)
            java.lang.String r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 != 0) goto L_0x016a
            java.lang.String r12 = "fileName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x016a:
            java.io.File r12 = new java.io.File
            r12.<init>(r5, r1)
            boolean r1 = r12.exists()
            if (r1 != 0) goto L_0x0191
            java.lang.String r1 = r4.read
            o.execute r5 = p040o.execute.M
            r12 = 400(0x190, float:5.6E-43)
            o.DebitCardResetOtpActivity r1 = p040o.getICheckDeserializerRtti.write(r1, r12, r12, r5)
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeMiniQrView$IconCompatParcelizer r5 = new com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeMiniQrView$IconCompatParcelizer
            r5.<init>(r8, r4)
            o.DebitCardMarketConductDeepLinkActivity r5 = (p040o.DebitCardMarketConductDeepLinkActivity) r5
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeMiniQrView$read r12 = new com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeMiniQrView$read
            r12.<init>(r8, r4)
            o.DebitCardMarketConductDeepLinkActivity r12 = (p040o.DebitCardMarketConductDeepLinkActivity) r12
            r1.subscribe(r5, r12)
            goto L_0x01a6
        L_0x0191:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            java.lang.String r5 = r12.getAbsolutePath()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r5, r1)
            java.lang.String r5 = "bitmap"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r5)
            r8.IconCompatParcelizer(r1, r4)
        L_0x01a6:
            android.widget.TextView r1 = r8.tvHeader
            if (r1 != 0) goto L_0x01af
            java.lang.String r5 = "tvHeader"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x01af:
            java.lang.String r5 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.setText(r5)
            java.lang.String r1 = r4.IconCompatParcelizer
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x01c6
            int r1 = r1.length()
            if (r1 != 0) goto L_0x01c3
            goto L_0x01c6
        L_0x01c3:
            r1 = r17
            goto L_0x01c7
        L_0x01c6:
            r1 = 1
        L_0x01c7:
            java.lang.String r5 = "tvDescription"
            if (r1 != 0) goto L_0x01da
            android.widget.TextView r1 = r8.tvDescription
            if (r1 != 0) goto L_0x01d2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x01d2:
            java.lang.String r4 = r4.IconCompatParcelizer
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            goto L_0x01e6
        L_0x01da:
            android.widget.TextView r1 = r8.tvDescription
            if (r1 != 0) goto L_0x01e1
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x01e1:
            r4 = 8
            r1.setVisibility(r4)
        L_0x01e6:
            android.view.View r1 = r8.getRootView()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r10)
            goto L_0x020d
        L_0x01ee:
            r17 = 0
            goto L_0x0308
        L_0x01f2:
            r17 = 0
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0308
            android.content.Context r1 = r22.getContext()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r12)
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeTextWithImageView r5 = new com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeTextWithImageView
            r5.<init>(r0, r1)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r15)
            android.view.View r1 = r5.read(r4, r3)
        L_0x020d:
            r20 = r7
            r21 = r9
            goto L_0x0316
        L_0x0213:
            r1 = 8
            r17 = 0
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x0308
            android.content.Context r5 = r22.getContext()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r12)
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeTextView r8 = new com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$TypeTextView
            r8.<init>(r0, r5)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r15)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r15)
            java.lang.String r5 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r12 = r4.IconCompatParcelizer
            android.widget.TextView r15 = r8.titleTextView
            java.lang.String r19 = "titleTextView"
            if (r15 != 0) goto L_0x023c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r19)
        L_0x023c:
            java.lang.String r1 = r4.MediaBrowserCompat$SearchResultReceiver
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r15.setText(r1)
            android.widget.TextView r1 = r8.headerTextView
            java.lang.String r15 = "headerTextView"
            if (r1 != 0) goto L_0x024c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r15)
        L_0x024c:
            r20 = r7
            java.lang.String r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            android.widget.TextView r1 = r8.descriptionTextView
            java.lang.String r7 = "descriptionTextView"
            if (r1 != 0) goto L_0x025e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x025e:
            r21 = r9
            java.lang.String r9 = r4.IconCompatParcelizer
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r1.setText(r9)
            android.widget.TextView r1 = r8.titleTextView
            if (r1 != 0) goto L_0x026e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r19)
        L_0x026e:
            java.lang.String r4 = r4.MediaBrowserCompat$SearchResultReceiver
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x027d
            int r4 = r4.length()
            if (r4 == 0) goto L_0x027d
            r4 = r17
            goto L_0x027e
        L_0x027d:
            r4 = 1
        L_0x027e:
            if (r4 == 0) goto L_0x0283
            r4 = 8
            goto L_0x0285
        L_0x0283:
            r4 = r17
        L_0x0285:
            r1.setVisibility(r4)
            android.widget.TextView r1 = r8.headerTextView
            if (r1 != 0) goto L_0x028f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r15)
        L_0x028f:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x029c
            int r4 = r5.length()
            if (r4 == 0) goto L_0x029c
            r15 = r17
            goto L_0x029d
        L_0x029c:
            r15 = 1
        L_0x029d:
            if (r15 == 0) goto L_0x02a2
            r4 = 8
            goto L_0x02a4
        L_0x02a2:
            r4 = r17
        L_0x02a4:
            r1.setVisibility(r4)
            android.widget.TextView r1 = r8.descriptionTextView
            if (r1 != 0) goto L_0x02ae
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x02ae:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L_0x02bb
            int r4 = r12.length()
            if (r4 == 0) goto L_0x02bb
            r15 = r17
            goto L_0x02bc
        L_0x02bb:
            r15 = 1
        L_0x02bc:
            if (r15 == 0) goto L_0x02c1
            r4 = 8
            goto L_0x02c3
        L_0x02c1:
            r4 = r17
        L_0x02c3:
            r1.setVisibility(r4)
            android.view.View r1 = r8.divider
            if (r1 != 0) goto L_0x02cf
            java.lang.String r4 = "divider"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x02cf:
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom r4 = r8.MediaBrowserCompat$ItemReceiver
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r4 = r4.write
            if (r4 != 0) goto L_0x02d8
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r14)
        L_0x02d8:
            int r4 = r4.size()
            r5 = 1
            int r4 = r4 - r5
            if (r3 != r4) goto L_0x02e3
            r15 = 8
            goto L_0x02e5
        L_0x02e3:
            r15 = r17
        L_0x02e5:
            r1.setVisibility(r15)
            com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom r1 = r8.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindBaseSuccessFragment r1 = r1.MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0300
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r1.read(r4)
        L_0x0300:
            android.view.View r1 = r8.getRootView()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r10)
            goto L_0x0316
        L_0x0308:
            r20 = r7
            r21 = r9
            goto L_0x0315
        L_0x030d:
            r18 = r1
            r20 = r7
            r21 = r9
            r17 = 0
        L_0x0315:
            r1 = 0
        L_0x0316:
            r2.MediaBrowserCompat$ItemReceiver = r1
            T r1 = r2.MediaBrowserCompat$ItemReceiver
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x032a
            android.widget.LinearLayout r4 = r0.container
            if (r4 != 0) goto L_0x0327
            java.lang.String r5 = "container"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x0327:
            r4.addView(r1)
        L_0x032a:
            int r3 = r3 + 1
            r1 = r18
            r7 = r20
            r9 = r21
            goto L_0x00de
        L_0x0334:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r13)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x033c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom.setUpWithDisplay(o.SessionReportingCoordinator$$Lambda$1):void");
    }

    public final class TypeMiniQrView extends LinearLayout {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @BindView
        public ImageView imageQrCode;
        @BindView
        public TextView tvDescription;
        @BindView
        public TextView tvHeader;
        @BindView
        public TextView tvTitle;
        private /* synthetic */ ItemAdditionalMetaDataCustom write;

        static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Bitmap> {
            private /* synthetic */ TypeMiniQrView IconCompatParcelizer;
            private /* synthetic */ CrashlyticsReport.Session.OperatingSystem.Builder MediaBrowserCompat$ItemReceiver;

            IconCompatParcelizer(TypeMiniQrView typeMiniQrView, CrashlyticsReport.Session.OperatingSystem.Builder builder) {
                this.IconCompatParcelizer = typeMiniQrView;
                this.MediaBrowserCompat$ItemReceiver = builder;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                TypeMiniQrView typeMiniQrView = this.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) bitmap, "it");
                typeMiniQrView.IconCompatParcelizer(bitmap, this.MediaBrowserCompat$ItemReceiver);
            }
        }

        static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
            private /* synthetic */ TypeMiniQrView IconCompatParcelizer;
            private /* synthetic */ CrashlyticsReport.Session.OperatingSystem.Builder MediaBrowserCompat$CustomActionResultReceiver;

            read(TypeMiniQrView typeMiniQrView, CrashlyticsReport.Session.OperatingSystem.Builder builder) {
                this.IconCompatParcelizer = typeMiniQrView;
                this.MediaBrowserCompat$CustomActionResultReceiver = builder;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                Throwable th = (Throwable) obj;
                TypeMiniQrView typeMiniQrView = this.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) th, "it");
                TypeMiniQrView.MediaBrowserCompat$ItemReceiver(typeMiniQrView, th, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        public final void setTvTitle(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.tvTitle = textView;
        }

        public final void setImageQrCode(ImageView imageView) {
            onGetStartedClick.write((Object) imageView, "<set-?>");
            this.imageQrCode = imageView;
        }

        public final void setTvHeader(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.tvHeader = textView;
        }

        public final void setTvDescription(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.tvDescription = textView;
        }

        public final void setFileName(String str) {
            onGetStartedClick.write((Object) str, "<set-?>");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public /* synthetic */ TypeMiniQrView(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, Context context) {
            this(itemAdditionalMetaDataCustom, context, (AttributeSet) null, 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private TypeMiniQrView(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, Context context, AttributeSet attributeSet, int i) {
            super(context, (AttributeSet) null, 0);
            onGetStartedClick.write((Object) context, "context");
            this.write = itemAdditionalMetaDataCustom;
            LayoutInflater.from(getContext()).inflate(R.layout.f83522131493578, this, true);
            setOrientation(1);
            ButterKnife.IconCompatParcelizer(this, getRootView());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
            throw r6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void IconCompatParcelizer(android.graphics.Bitmap r5, p040o.CrashlyticsReport.Session.OperatingSystem.Builder r6) {
            /*
                r4 = this;
                android.content.Context r0 = r4.getContext()
                java.lang.String r1 = "context"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                java.io.File r1 = new java.io.File
                java.io.File r0 = r0.getCacheDir()
                java.lang.String r2 = "pullslip"
                r1.<init>(r0, r2)
                boolean r0 = r1.exists()
                if (r0 != 0) goto L_0x001d
                r1.mkdirs()
            L_0x001d:
                java.lang.String r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                if (r0 != 0) goto L_0x0026
                java.lang.String r2 = "fileName"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
            L_0x0026:
                java.io.File r2 = new java.io.File
                r2.<init>(r1, r0)
                java.io.FileOutputStream r0 = new java.io.FileOutputStream
                r1 = 0
                r0.<init>(r2, r1)
                java.io.Closeable r0 = (java.io.Closeable) r0
                r1 = r0
                java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch:{ all -> 0x0061 }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0061 }
                r3 = 70
                java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch:{ all -> 0x0061 }
                r5.compress(r2, r3, r1)     // Catch:{ all -> 0x0061 }
                r1 = 0
                p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
                android.widget.ImageView r0 = r4.imageQrCode
                if (r0 != 0) goto L_0x004c
                java.lang.String r1 = "imageQrCode"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x004c:
                r0.setImageBitmap(r5)
                com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom r5 = r4.write
                o.FragmentBuilder_BindBaseSuccessFragment r5 = r5.MediaBrowserCompat$ItemReceiver
                if (r5 == 0) goto L_0x0060
                java.lang.String r6 = r6.read
                if (r6 != 0) goto L_0x005d
                java.lang.String r6 = ""
            L_0x005d:
                r5.read(r6)
            L_0x0060:
                return
            L_0x0061:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0063 }
            L_0x0063:
                r6 = move-exception
                p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom.TypeMiniQrView.IconCompatParcelizer(android.graphics.Bitmap, o.CrashlyticsReport$Session$OperatingSystem$Builder):void");
        }

        public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(TypeMiniQrView typeMiniQrView, Throwable th, CrashlyticsReport.Session.OperatingSystem.Builder builder) {
            onCheckBoxClick.IconCompatParcelizer(th);
            ImageView imageView = typeMiniQrView.imageQrCode;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageQrCode");
            }
            imageView.setVisibility(8);
            FragmentBuilder_BindBaseSuccessFragment MediaBrowserCompat$ItemReceiver = typeMiniQrView.write.MediaBrowserCompat$ItemReceiver;
            if (MediaBrowserCompat$ItemReceiver != null) {
                String str = builder.read;
                if (str == null) {
                    str = "";
                }
                MediaBrowserCompat$ItemReceiver.read(str);
            }
        }
    }

    public final class TypeTextView extends LinearLayout {
        final /* synthetic */ ItemAdditionalMetaDataCustom MediaBrowserCompat$ItemReceiver;
        @BindView
        public TextView descriptionTextView;
        @BindView
        public View divider;
        @BindView
        public TextView headerTextView;
        @BindView
        public TextView titleTextView;

        public final void setTitleTextView(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.titleTextView = textView;
        }

        public final void setHeaderTextView(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.headerTextView = textView;
        }

        public final void setDescriptionTextView(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.descriptionTextView = textView;
        }

        public final void setDivider(View view) {
            onGetStartedClick.write((Object) view, "<set-?>");
            this.divider = view;
        }

        public /* synthetic */ TypeTextView(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, Context context) {
            this(itemAdditionalMetaDataCustom, context, (AttributeSet) null, 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private TypeTextView(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, Context context, AttributeSet attributeSet, int i) {
            super(context, (AttributeSet) null, 0);
            onGetStartedClick.write((Object) context, "context");
            this.MediaBrowserCompat$ItemReceiver = itemAdditionalMetaDataCustom;
            LayoutInflater.from(getContext()).inflate(R.layout.f83532131493579, this, true);
            setOrientation(1);
            ButterKnife.IconCompatParcelizer(this, getRootView());
        }
    }

    public final class TypeTextWithImageView extends LinearLayout {
        @BindView
        public TextView descriptionTextView;
        @BindView
        public View divider;
        @BindView
        public TextView headerTextView;
        @BindView
        public ImageView imageView;
        final /* synthetic */ ItemAdditionalMetaDataCustom read;
        @BindView
        public TextView titleTextView;

        public final void setTitleTextView(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.titleTextView = textView;
        }

        public final void setHeaderTextView(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.headerTextView = textView;
        }

        public final void setDescriptionTextView(TextView textView) {
            onGetStartedClick.write((Object) textView, "<set-?>");
            this.descriptionTextView = textView;
        }

        public final void setImageView(ImageView imageView2) {
            onGetStartedClick.write((Object) imageView2, "<set-?>");
            this.imageView = imageView2;
        }

        public final void setDivider(View view) {
            onGetStartedClick.write((Object) view, "<set-?>");
            this.divider = view;
        }

        public /* synthetic */ TypeTextWithImageView(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, Context context) {
            this(itemAdditionalMetaDataCustom, context, (AttributeSet) null, 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private TypeTextWithImageView(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, Context context, AttributeSet attributeSet, int i) {
            super(context, (AttributeSet) null, 0);
            onGetStartedClick.write((Object) context, "context");
            this.read = itemAdditionalMetaDataCustom;
            LayoutInflater.from(getContext()).inflate(R.layout.f83542131493580, this, true);
            setOrientation(1);
            ButterKnife.IconCompatParcelizer(this, getRootView());
        }

        public final View read(CrashlyticsReport.Session.OperatingSystem.Builder builder, int i) {
            onGetStartedClick.write((Object) builder, "paymentInfoDisplay");
            TextView textView = this.titleTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleTextView");
            }
            textView.setText(builder.MediaBrowserCompat$SearchResultReceiver);
            TextView textView2 = this.headerTextView;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerTextView");
            }
            textView2.setText(builder.MediaBrowserCompat$CustomActionResultReceiver);
            TextView textView3 = this.descriptionTextView;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionTextView");
            }
            textView3.setText(builder.IconCompatParcelizer);
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            onGetStartedClick.IconCompatParcelizer((Object) mainLooper, "Looper.getMainLooper()");
            int i2 = 0;
            if (currentThread == mainLooper.getThread()) {
                getViewModelStore<Bitmap> read2 = Glide.MediaBrowserCompat$ItemReceiver(getContext()).read();
                read2.MediaBrowserCompat$ItemReceiver = builder.MediaBrowserCompat$ItemReceiver;
                read2.IconCompatParcelizer = true;
                getViewModelStore getviewmodelstore = (getViewModelStore) read2.MediaBrowserCompat$ItemReceiver((abandon<?>) ((isReset) new isReset().IconCompatParcelizer((int) R.color.f66202131099776)).MediaBrowserCompat$CustomActionResultReceiver(performCreate.MediaBrowserCompat$ItemReceiver)).read((int) R.color.f66182131099773);
                getviewmodelstore.read = null;
                getviewmodelstore.write(new IconCompatParcelizer(this, i, builder)).MediaBrowserCompat$ItemReceiver();
            } else {
                try {
                    getViewModelStore<Bitmap> read3 = Glide.MediaBrowserCompat$ItemReceiver(getContext()).read();
                    read3.MediaBrowserCompat$ItemReceiver = builder.MediaBrowserCompat$ItemReceiver;
                    read3.IconCompatParcelizer = true;
                    Bitmap bitmap = (Bitmap) ((getViewModelStore) read3.read((int) R.color.f66182131099773)).MediaBrowserCompat$ItemReceiver((abandon<?>) ((isReset) new isReset().IconCompatParcelizer((int) R.color.f66202131099776)).MediaBrowserCompat$CustomActionResultReceiver(performCreate.MediaBrowserCompat$ItemReceiver)).MediaBrowserCompat$ItemReceiver().get();
                    ImageView imageView2 = this.imageView;
                    if (imageView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageView");
                    }
                    imageView2.setImageBitmap(bitmap);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't get bitmap from cache: ");
                    sb.append(e.getMessage());
                    onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), new Object[0]);
                }
                FragmentBuilder_BindBaseSuccessFragment MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver;
                if (MediaBrowserCompat$ItemReceiver != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i);
                    String str = builder.MediaBrowserCompat$ItemReceiver;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    MediaBrowserCompat$ItemReceiver.read(sb2.toString());
                }
            }
            View view = this.divider;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
            }
            if (i == ItemAdditionalMetaDataCustom.MediaBrowserCompat$CustomActionResultReceiver(this.read).size() - 1) {
                i2 = 8;
            }
            view.setVisibility(i2);
            View rootView = getRootView();
            onGetStartedClick.IconCompatParcelizer((Object) rootView, "rootView");
            return rootView;
        }

        public static final class IconCompatParcelizer implements deliverCancellation<Bitmap> {
            private /* synthetic */ TypeTextWithImageView MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ CrashlyticsReport.Session.OperatingSystem.Builder MediaBrowserCompat$ItemReceiver;
            private /* synthetic */ int write;

            IconCompatParcelizer(TypeTextWithImageView typeTextWithImageView, int i, CrashlyticsReport.Session.OperatingSystem.Builder builder) {
                this.MediaBrowserCompat$CustomActionResultReceiver = typeTextWithImageView;
                this.write = i;
                this.MediaBrowserCompat$ItemReceiver = builder;
            }

            public final /* synthetic */ boolean IconCompatParcelizer(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = this.MediaBrowserCompat$CustomActionResultReceiver.imageView;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageView");
                }
                imageView.setImageBitmap(bitmap);
                FragmentBuilder_BindBaseSuccessFragment MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver;
                if (MediaBrowserCompat$ItemReceiver2 == null) {
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.write);
                String str = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                MediaBrowserCompat$ItemReceiver2.read(sb.toString());
                return true;
            }

            public final boolean write(GlideException glideException) {
                onCheckBoxClick.IconCompatParcelizer(glideException);
                FragmentBuilder_BindBaseSuccessFragment MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver;
                if (MediaBrowserCompat$ItemReceiver2 == null) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.write);
                String str = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                MediaBrowserCompat$ItemReceiver2.read(sb.toString());
                return false;
            }
        }
    }

    public static final /* synthetic */ void read(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom) {
        FragmentBuilder_BindBaseFragment fragmentBuilder_BindBaseFragment = itemAdditionalMetaDataCustom.IconCompatParcelizer;
        if (fragmentBuilder_BindBaseFragment != null) {
            int size = itemAdditionalMetaDataCustom.MediaBrowserCompat$CustomActionResultReceiver.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : itemAdditionalMetaDataCustom.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (size == linkedHashMap.size()) {
                fragmentBuilder_BindBaseFragment.MediaBrowserCompat$SearchResultReceiver();
            }
        }
    }

    public static final /* synthetic */ void write(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, String str, boolean z) {
        if (itemAdditionalMetaDataCustom.IconCompatParcelizer != null) {
            itemAdditionalMetaDataCustom.MediaBrowserCompat$CustomActionResultReceiver.put(str, Boolean.TRUE);
        }
    }
}
