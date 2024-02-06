package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getFirstName;
import p040o.getICheckDeserializerRtti;
import p040o.modifyString;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ECouponBarCodeFragment extends BaseFragment implements getFirstName.IconCompatParcelizer {
    public static final C5879x1e10e92 IconCompatParcelizer = new C5879x1e10e92((byte) 0);
    private String MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public final SimpleDateFormat MediaBrowserCompat$MediaItem = new SimpleDateFormat("mm:ss", Locale.getDefault());
    private String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public CountDownTimer MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private int MediaSessionCompat$Token;
    private String RatingCompat;
    @BindView
    public LinearLayout barCodeLayout;
    @BindView
    public Button buttonDeactivate;
    @BindView
    public ImageView ivBarcode;
    @BindView
    public ImageView ivECouponDetail;
    @BindView
    public ImageView ivQRCode;
    @BindView
    public ImageView ivTimerActive;
    @BindView
    public View lineAboveTimeCountDownLayout;
    @HmlPinActivity
    public modifyString presenter;
    @BindView
    public LinearLayout rootLayout;
    @BindView
    public LinearLayout timeCountDownLayout;
    @BindView
    public TextView tvBarcodeResult;
    @BindView
    public TextView tvDesc;
    @BindView
    public TextView tvQRCodeResult;
    @BindView
    public TextView tvRefIdValue;
    @BindView
    public TextView tvRemark;
    @BindView
    public TextView tvTimeCountDown;
    @BindView
    public TextView tvTimeExpiredTitle;
    @BindView
    public TextView tvTitleCoupon;
    @BindView
    public TextView tvValidityValue;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86852131493912, viewGroup, false);
    }

    public final void onDestroy() {
        CountDownTimer countDownTimer = this.MediaDescriptionCompat;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        modifyString modifystring = this.presenter;
        if (modifystring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        modifystring.onDestroy();
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        modifyString modifystring = this.presenter;
        if (modifystring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new modifyString.read(-1.0f);
        if (modifystring.RatingCompat != null) {
            read.IconCompatParcelizer(modifystring.RatingCompat);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        modifyString modifystring = this.presenter;
        if (modifystring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        modifystring.MediaBrowserCompat$ItemReceiver(this);
        modifyString modifystring2 = this.presenter;
        if (modifystring2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = modifyString.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (modifystring2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(modifystring2.RatingCompat);
        }
        modifyString modifystring3 = this.presenter;
        if (modifystring3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRefNo");
        }
        String str2 = this.RatingCompat;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("refId");
        }
        int i = this.MediaSessionCompat$Token;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemCode");
        }
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "refId");
        onGetStartedClick.write((Object) str3, "itemCode");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = new modifyString.IconCompatParcelizer(modifystring3, str, str2, i, str3);
        if (modifystring3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(modifystring3.RatingCompat);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.write(arguments, "EXTRA_CARD_REF_NO_KEY");
            this.RatingCompat = AlertController$RecycleListView.write(arguments, "EXTRA_REF_ID_KEY");
            this.MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.write(arguments, "EXTRA_ITEM_CODE_KEY");
            this.MediaSessionCompat$Token = arguments.getInt("EXTRA_RELATION_ID_KEY");
            this.MediaMetadataCompat = arguments.getBoolean("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW");
        }
    }

    @OnClick
    public final void onClickDeactivate() {
        modifyString modifystring = this.presenter;
        if (modifystring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRefNo");
        }
        String str2 = this.RatingCompat;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("refId");
        }
        int i = this.MediaSessionCompat$Token;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemCode");
        }
        boolean z = this.MediaMetadataCompat;
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "refId");
        onGetStartedClick.write((Object) str3, "itemCode");
        writeUInt64NoTag.IconCompatParcelizer write = new modifyString.write(modifystring, str, str2, i, str3, z);
        if (modifystring.RatingCompat != null) {
            write.IconCompatParcelizer(modifystring.RatingCompat);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        getContext();
        ImageView imageView = this.ivECouponDetail;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivECouponDetail");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
        sb.append(str);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder, imageView, sb.toString());
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "code");
        CharSequence charSequence = str;
        if (charSequence.length() == 0) {
            TextView textView = this.tvBarcodeResult;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBarcodeResult");
            }
            textView.setVisibility(8);
            ImageView imageView = this.ivBarcode;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivBarcode");
            }
            imageView.setVisibility(8);
            return;
        }
        TextView textView2 = this.tvBarcodeResult;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBarcodeResult");
        }
        textView2.setText(charSequence);
        ImageView imageView2 = this.ivBarcode;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivBarcode");
        }
        Bitmap MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str, 900, 220, new HashMap());
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "Utilities.generateBarcod…DE_WIDTH, BARCODE_HEIGHT)");
        imageView2.setImageBitmap(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    public final void MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, "code");
        CharSequence charSequence = str;
        if (charSequence.length() == 0) {
            TextView textView = this.tvQRCodeResult;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQRCodeResult");
            }
            textView.setVisibility(8);
            ImageView imageView = this.ivQRCode;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivQRCode");
            }
            imageView.setVisibility(8);
            return;
        }
        TextView textView2 = this.tvQRCodeResult;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQRCodeResult");
        }
        textView2.setText(charSequence);
        ImageView imageView2 = this.ivQRCode;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivQRCode");
        }
        Bitmap read = getICheckDeserializerRtti.read(str, 500, 500, new HashMap());
        onGetStartedClick.IconCompatParcelizer((Object) read, "Utilities.generateQRBitM…_CODE_SIZE, QR_CODE_SIZE)");
        imageView2.setImageBitmap(read);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "desc");
        TextView textView = this.tvDesc;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDesc");
        }
        textView.setText(str);
    }

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "refId");
        TextView textView = this.tvRefIdValue;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRefIdValue");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "validity");
        TextView textView = this.tvValidityValue;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvValidityValue");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.tvTitleCoupon;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitleCoupon");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        TextView textView = this.tvTimeExpiredTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTimeExpiredTitle");
        }
        textView.setText(getString(R.string.e_coupon_detail_validity_title_use_within));
    }

    public final void MediaDescriptionCompat() {
        TextView textView = this.tvTimeExpiredTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTimeExpiredTitle");
        }
        textView.setText(getString(R.string.e_coupon_detail_validity_title_expired_on));
    }

    public final void MediaMetadataCompat() {
        TextView textView = this.tvTimeExpiredTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTimeExpiredTitle");
        }
        textView.setText(getString(R.string.e_coupon_detail_validity_title_used_on));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, CreditCardDetailActivity.class);
            intent.setFlags(603979776);
            activity.finish();
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
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        this.MediaDescriptionCompat = new ECouponBarCodeFragment$MediaBrowserCompat$ItemReceiver(this, (long) d).start();
    }

    public final void RatingCompat() {
        ImageView imageView = this.ivTimerActive;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivTimerActive");
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout = this.barCodeLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("barCodeLayout");
        }
        linearLayout.setVisibility(8);
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setVisibility(8);
        TextView textView2 = this.tvTimeCountDown;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTimeCountDown");
        }
        textView2.setText(getString(R.string.e_coupon_expire));
        textView2.setTextColor(setLastBaselineToBottomHeight.read(textView2.getContext(), R.color.f67152131099871));
        Button button = this.buttonDeactivate;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDeactivate");
        }
        button.setVisibility(4);
    }

    public final void IconCompatParcelizer(boolean z) {
        LinearLayout linearLayout = this.rootLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootLayout");
        }
        linearLayout.setVisibility(z ? 0 : 8);
    }

    public final void read(boolean z) {
        LinearLayout linearLayout = this.timeCountDownLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("timeCountDownLayout");
        }
        linearLayout.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        LinearLayout linearLayout = this.barCodeLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("barCodeLayout");
        }
        linearLayout.setVisibility(z ? 0 : 8);
    }

    public final void MediaSessionCompat$QueueItem() {
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setVisibility(8);
    }

    public final void MediaBrowserCompat$MediaItem() {
        Button button = this.buttonDeactivate;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDeactivate");
        }
        button.setVisibility(8);
    }

    public final void read() {
        View view = this.lineAboveTimeCountDownLayout;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("lineAboveTimeCountDownLayout");
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(float r2) {
        /*
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x0011
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0011
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0016
            r0.screenBrightness = r2
        L_0x0016:
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            if (r2 == 0) goto L_0x0025
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0025
            r2.setAttributes(r0)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponBarCodeFragment.IconCompatParcelizer(float):void");
    }

    public final void write() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "successfulpagemyecoupon")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("ecoupon_barcode", zsyr2kArr);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static final /* synthetic */ Handler m3383x50fd9e4a() {
        return new Handler();
    }

    public final void IconCompatParcelizer() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("ecoupon_usebutton", zsyr2kArr);
        }
    }
}
