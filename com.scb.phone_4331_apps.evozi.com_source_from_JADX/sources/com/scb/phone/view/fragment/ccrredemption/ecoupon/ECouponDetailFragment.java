package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponCommonActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import org.bouncycastle.i18n.MessageBundle;
import p040o.Component;
import p040o.Component$$Lambda$3;
import p040o.FieldNamingPolicy;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.Maps;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.getFirstName;
import p040o.intoSet;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ECouponDetailFragment extends BaseFragment implements getFirstName.write {
    public static final C5880x13fedaf9 IconCompatParcelizer = new C5880x13fedaf9((byte) 0);
    private chain MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private intoSet MediaDescriptionCompat;
    @BindView
    public Button btnNext;
    @BindView
    public LinearLayout conditionLayout;
    @BindView
    public ImageView imageCover;
    @HmlPinActivity
    public FieldNamingPolicy.C33421 presenter;
    @BindView
    public TextView txvAvailability;
    @BindView
    public TextView txvCondition;
    @BindView
    public TextView txvDescription;
    @BindView
    public TextView txvName;
    @BindView
    public TextView txvPoint;
    @BindView
    public TextView txvPointWarning;
    @BindView
    public TextView txvValidityDate;
    @BindView
    public TextView txvWarningTime;
    @BindView
    public LinearLayout warningTimeSection;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86862131493913, viewGroup, false);
    }

    /* JADX WARNING: type inference failed for: r1v33, types: [o.FieldNamingPolicy$3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            super.onViewCreated(r7, r8)
            butterknife.ButterKnife.IconCompatParcelizer(r6, r7)
            o.FieldNamingPolicy$1 r7 = r6.presenter
            if (r7 != 0) goto L_0x0014
            java.lang.String r8 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0014:
            r8 = r6
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r8 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r8
            r7.MediaBrowserCompat$ItemReceiver(r8)
            java.lang.String r8 = r6.MediaBrowserCompat$MediaItem
            java.lang.String r0 = "myRewardPoint"
            if (r8 != 0) goto L_0x0023
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0023:
            o.intoSet r1 = r6.MediaDescriptionCompat
            java.lang.String r2 = "productDisplayModel"
            if (r1 != 0) goto L_0x002c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x002c:
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            r7.IconCompatParcelizer = r8
            r7.MediaBrowserCompat$ItemReceiver = r1
            o.FieldNamingPolicy$1$MediaMetadataCompat r8 = p040o.FieldNamingPolicy.C33421.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r8 = (p040o.FundFactSheetActivity) r8
            if (r8 == 0) goto L_0x0042
            o.FieldNamingPolicy$3 r1 = new o.FieldNamingPolicy$3
            r1.<init>()
            r8 = r1
        L_0x0042:
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r1 = r7.RatingCompat
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x004c
            r1 = r4
            goto L_0x004d
        L_0x004c:
            r1 = r3
        L_0x004d:
            if (r1 == 0) goto L_0x0054
            T r1 = r7.RatingCompat
            r8.IconCompatParcelizer(r1)
        L_0x0054:
            o.intoSet r8 = r7.MediaBrowserCompat$ItemReceiver
            if (r8 != 0) goto L_0x005b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x005b:
            o.FieldNamingPolicy$1$RatingCompat r1 = new o.FieldNamingPolicy$1$RatingCompat
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x0068
            r2 = r4
            goto L_0x0069
        L_0x0068:
            r2 = r3
        L_0x0069:
            if (r2 == 0) goto L_0x0070
            T r2 = r7.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x0070:
            o.FieldNamingPolicy$1$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.FieldNamingPolicy$1$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x007d
            r2 = r4
            goto L_0x007e
        L_0x007d:
            r2 = r3
        L_0x007e:
            if (r2 == 0) goto L_0x0085
            T r2 = r7.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x0085:
            o.FieldNamingPolicy$1$MediaBrowserCompat$MediaItem r1 = new o.FieldNamingPolicy$1$MediaBrowserCompat$MediaItem
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x0092
            r2 = r4
            goto L_0x0093
        L_0x0092:
            r2 = r3
        L_0x0093:
            if (r2 == 0) goto L_0x009a
            T r2 = r7.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x009a:
            o.FieldNamingPolicy$1$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r1 = new o.FieldNamingPolicy$1$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x00a7
            r2 = r4
            goto L_0x00a8
        L_0x00a7:
            r2 = r3
        L_0x00a8:
            if (r2 == 0) goto L_0x00af
            T r2 = r7.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x00af:
            o.FieldNamingPolicy$1$MediaDescriptionCompat r1 = new o.FieldNamingPolicy$1$MediaDescriptionCompat
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x00bc
            r2 = r4
            goto L_0x00bd
        L_0x00bc:
            r2 = r3
        L_0x00bd:
            if (r2 == 0) goto L_0x00c4
            T r2 = r7.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x00c4:
            boolean r1 = r8.RatingCompat
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r8.MediaMetadataCompat
            if (r1 != 0) goto L_0x00ce
            r1 = r4
            goto L_0x00cf
        L_0x00ce:
            r1 = r3
        L_0x00cf:
            o.FieldNamingPolicy$1$IconCompatParcelizer r2 = p040o.FieldNamingPolicy.C33421.IconCompatParcelizer.read
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            r7.write(r1, r2)
            o.FieldNamingPolicy$1$MediaBrowserCompat$SearchResultReceiver r1 = new o.FieldNamingPolicy$1$MediaBrowserCompat$SearchResultReceiver
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x00e3
            r2 = r4
            goto L_0x00e4
        L_0x00e3:
            r2 = r3
        L_0x00e4:
            if (r2 == 0) goto L_0x00eb
            T r2 = r7.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x00eb:
            java.lang.String r1 = r7.IconCompatParcelizer
            if (r1 != 0) goto L_0x00f2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x00f2:
            java.math.BigDecimal r0 = p040o.getICheckDeserializerRtti.ParcelableVolumeInfo(r1)
            int r0 = r0.intValue()
            java.lang.Integer r1 = r8.PlaybackStateCompat$CustomAction
            java.lang.String r2 = "redeemPoint"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            int r2 = r1.intValue()
            int r2 = p040o.onGetStartedClick.IconCompatParcelizer((int) r0, (int) r2)
            if (r2 >= 0) goto L_0x010d
            r2 = r4
            goto L_0x010e
        L_0x010d:
            r2 = r3
        L_0x010e:
            o.FieldNamingPolicy$1$MediaSessionCompat$Token r5 = new o.FieldNamingPolicy$1$MediaSessionCompat$Token
            r5.<init>(r7, r1, r0)
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            r7.write(r2, r5)
            o.FieldNamingPolicy$1$MediaBrowserCompat$ItemReceiver r0 = new o.FieldNamingPolicy$1$MediaBrowserCompat$ItemReceiver
            r0.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r7.RatingCompat
            if (r1 == 0) goto L_0x0125
            r1 = r4
            goto L_0x0126
        L_0x0125:
            r1 = r3
        L_0x0126:
            if (r1 == 0) goto L_0x012d
            T r1 = r7.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x012d:
            java.lang.Integer r0 = r8.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0134
            java.lang.String r0 = ""
            goto L_0x0142
        L_0x0134:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r0)
            java.lang.Integer r1 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = r0.format(r1)
        L_0x0142:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x014d
            boolean r0 = p040o.GoodToKnowActivity.read(r0)
            if (r0 != 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r3 = r4
        L_0x014e:
            r0 = r3 ^ 1
            o.FieldNamingPolicy$1$MediaSessionCompat$ResultReceiverWrapper r1 = new o.FieldNamingPolicy$1$MediaSessionCompat$ResultReceiverWrapper
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            r7.write(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            chain chain = (chain) arguments.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaBrowserCompat$CustomActionResultReceiver = chain;
            }
            chain chain2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            String str = chain2.setGroupDividerEnabled;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.rewardPoints");
            this.MediaBrowserCompat$MediaItem = str;
            intoSet intoset = (intoSet) arguments.getParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY");
            if (intoset != null) {
                onGetStartedClick.IconCompatParcelizer((Object) intoset, "product");
                this.MediaDescriptionCompat = intoset;
            }
            intoSet intoset2 = this.MediaDescriptionCompat;
            if (intoset2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            intoset2.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        }
    }

    public final void onDestroy() {
        FieldNamingPolicy.C33421 r0 = this.presenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        r0.onDestroy();
        ImageView imageView = this.imageCover;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCover");
        }
        imageView.setImageDrawable((Drawable) null);
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        getContext();
        ImageView imageView = this.imageCover;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCover");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
        sb.append(str);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder, imageView, sb.toString());
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "amount");
        TextView textView = this.txvAvailability;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        textView.setText(str);
    }

    public final void MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.txvName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvName");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, "description");
        TextView textView = this.txvDescription;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvDescription");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "date");
        TextView textView = this.txvValidityDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvValidityDate");
        }
        textView.setText(str);
    }

    public final void MediaSessionCompat$QueueItem(String str) {
        onGetStartedClick.write((Object) str, "minute");
        TextView textView = this.txvValidityDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvValidityDate");
        }
        textView.setText(getString(R.string.e_coupon_detail_use_with_in_minutes, str));
    }

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "point");
        TextView textView = this.txvPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvPoint");
        }
        textView.setText(str);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "condition");
        TextView textView = this.txvCondition;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvCondition");
        }
        textView.setText(str);
    }

    public final void IconCompatParcelizer() {
        LinearLayout linearLayout = this.conditionLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("conditionLayout");
        }
        linearLayout.setVisibility(8);
    }

    public final void RatingCompat(String str) {
        onGetStartedClick.write((Object) str, "needPoint");
        TextView textView = this.txvPointWarning;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvPointWarning");
        }
        textView.setVisibility(0);
        String string = getString(R.string.e_coupon_detail_point_warning_value, str);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.e_cou…warning_value, needPoint)");
        textView.setText(string);
    }

    public final void MediaSessionCompat$Token(String str) {
        onGetStartedClick.write((Object) str, "minute");
        TextView textView = this.txvWarningTime;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvWarningTime");
        }
        textView.setVisibility(0);
        String string = getString(R.string.e_coupon_detail_time_warning, str);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.e_cou…ail_time_warning, minute)");
        textView.setText(string);
        LinearLayout linearLayout = this.warningTimeSection;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("warningTimeSection");
        }
        linearLayout.setVisibility(0);
    }

    public final void read() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ImageView imageView = this.imageCover;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCover");
        }
        imageView.setImageResource(R.drawable.donations_place_holder);
    }

    public final void write(Component.C31841 r7, Component$$Lambda$3 component$$Lambda$3) {
        onGetStartedClick.write((Object) r7, "quotaLimit");
        onGetStartedClick.write((Object) component$$Lambda$3, "quantity");
        Context context = getContext();
        if (context != null) {
            ECouponCommonActivity.IconCompatParcelizer iconCompatParcelizer = ECouponCommonActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            intoSet intoset = this.MediaDescriptionCompat;
            if (intoset == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) chain, "creditCardDisplay");
            onGetStartedClick.write((Object) intoset, "productDisplayModel");
            Intent intent = new Intent(context, ECouponCommonActivity.class);
            intent.putExtra("EXTRA_PAGE_TYPE_KEY", FieldNamingPolicy.C33496.E_COUPON_QUANTITY_PAGE);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            intent.putExtra("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset);
            intent.putExtra("EXTRA_E_COUPON_QUOTA_LIMIT_KEY", r7);
            intent.putExtra("EXTRA_E_COUPON_QUANTITY_KEY", component$$Lambda$3);
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
    }

    public final void read(Component.C31841 r5, Component$$Lambda$3 component$$Lambda$3) {
        onGetStartedClick.write((Object) r5, "quotaLimit");
        onGetStartedClick.write((Object) component$$Lambda$3, "quantity");
        Context context = getContext();
        if (context != null) {
            ECouponCommonActivity.IconCompatParcelizer iconCompatParcelizer = ECouponCommonActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            intoSet intoset = this.MediaDescriptionCompat;
            if (intoset == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = ECouponCommonActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(context, chain, intoset, r5, component$$Lambda$3);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, MediaBrowserCompat$CustomActionResultReceiver2).read();
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
    }

    @OnClick
    public final void onNextClick() {
        FieldNamingPolicy.C33421 r0 = this.presenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        String str = chain.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
        intoSet intoset = this.MediaDescriptionCompat;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        onGetStartedClick.write((Object) str, "cardNo");
        onGetStartedClick.write((Object) intoset, "productDisplayModel");
        writeUInt64NoTag.IconCompatParcelizer read = new FieldNamingPolicy.C33421.read(r0, str, intoset);
        if (r0.RatingCompat != null) {
            read.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ecoupon_detail");
        }
    }

    public final void write() {
        TextView textView = this.txvAvailability;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        TextView textView2 = this.txvAvailability;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        textView.setBackground(setLastBaselineToBottomHeight.write(textView2.getContext(), R.drawable.trapezoid_red));
        TextView textView3 = this.txvAvailability;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        textView3.setGravity(17);
        TextView textView4 = this.txvAvailability;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        TextView textView5 = this.txvAvailability;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        textView4.setTextColor(setLastBaselineToBottomHeight.read(textView5.getContext(), R.color.f71012131100257));
        TextView textView6 = this.txvAvailability;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        textView6.setPaddingRelative((int) getResources().getDimension(R.dimen.f72552131165454), 0, (int) getResources().getDimension(R.dimen.f72582131165465), 0);
        TextView textView7 = this.txvAvailability;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txvAvailability");
        }
        String string = getString(R.string.e_coupon_detail_sold_out);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.e_coupon_detail_sold_out)");
        textView7.setText(string);
    }
}
