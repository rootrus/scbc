package com.scb.phone.view.fragment.promptpay;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.promptpay.PromptPayQRActivity;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.promptpay.PromptPayQRScreenshotFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import java.util.concurrent.Callable;
import org.jmrtd.lds.ImageInfo;
import p040o.ActivityBuilder_ContributeManageEmailVerificationSuccessActivity;
import p040o.ActivityBuilder_ContributeMerchantTermsAndConditionsActivity;
import p040o.ActivityBuilder_ContributeMwBankAccountActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.C10100p;
import p040o.C3077xfe724d07;
import p040o.C4891kE;
import p040o.C4922kz;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBottomEdgeTearHeight;
import p040o.getOverflowCount;
import p040o.getOversizeImage;
import p040o.onCheckBoxClick;
import p040o.setTapText;

public class PromptPayQRSuccessFragment extends BaseFragment implements getBottomEdgeTearHeight.write {
    private Uri IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    @BindView
    CustomTransferAndPayItem accountNumberCustomTarget;
    @BindView
    CustomTransferAndPayItem amountCustomTarget;
    @HmlPinActivity
    public C10100p.C5120a promptPayQRSuccessPresenter;
    @BindView
    ImageView qrCodeImageView;

    public static PromptPayQRSuccessFragment IconCompatParcelizer() {
        return new PromptPayQRSuccessFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89082131494135, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.promptPayQRSuccessPresenter.MediaBrowserCompat$ItemReceiver(this);
        C10100p.C5120a aVar = this.promptPayQRSuccessPresenter;
        if (!aVar.write) {
            boolean z = true;
            if (aVar.RatingCompat != null) {
                aVar.write = true;
                C4891kE kEVar = C4891kE.IconCompatParcelizer;
                if (aVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kEVar.IconCompatParcelizer(aVar.RatingCompat);
                }
                aVar.IconCompatParcelizer.IconCompatParcelizer();
                aVar.IconCompatParcelizer.IconCompatParcelizer(new C10100p.C5120a.write(aVar, (byte) 0));
            }
        }
        return inflate;
    }

    public void onResume() {
        super.onResume();
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getActivity().getWindow().setAttributes(attributes);
    }

    public void onPause() {
        super.onPause();
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        getActivity().getWindow().setAttributes(attributes);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap) {
        this.qrCodeImageView.setImageBitmap(bitmap);
    }

    public final void IconCompatParcelizer(C3077xfe724d07.Builder builder) {
        this.accountNumberCustomTarget.setValue(builder.MediaBrowserCompat$ItemReceiver.RatingCompat);
        if (builder.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver == 0.0d) {
            this.amountCustomTarget.setValue(getString(R.string.qr_code_generation_specify_amount));
        } else {
            this.amountCustomTarget.setValue(builder.MediaBrowserCompat$ItemReceiver.read);
        }
        boolean z = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        C10100p.C5120a aVar = this.promptPayQRSuccessPresenter;
        C4922kz kzVar = new C4922kz(aVar, false);
        if (aVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            kzVar.IconCompatParcelizer(aVar.RatingCompat);
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).aj_();
        }
    }

    public final void read(getOverflowCount getoverflowcount, String str, Bitmap bitmap, boolean z) {
        Context context = getContext();
        if (!isDetached() && context != null) {
            DebitCardResetOtpActivity.fromCallable(new Callable<Uri>(getoverflowcount, str, bitmap, 5.0d, context, z) {
                private /* synthetic */ double IconCompatParcelizer = 5.0d;
                private /* synthetic */ Bitmap MediaBrowserCompat$CustomActionResultReceiver;
                private /* synthetic */ Context MediaBrowserCompat$ItemReceiver;
                private /* synthetic */ String MediaBrowserCompat$MediaItem;
                private /* synthetic */ getOverflowCount read;
                private /* synthetic */ boolean write;

                {
                    this.read = r1;
                    this.MediaBrowserCompat$MediaItem = r2;
                    this.MediaBrowserCompat$CustomActionResultReceiver = r3;
                    this.MediaBrowserCompat$ItemReceiver = r6;
                    this.write = r7;
                }

                /* access modifiers changed from: private */
                /* renamed from: write */
                public Uri call() throws Exception {
                    Uri uri;
                    String format = String.format("QR_%s.jpg", new Object[]{String.valueOf(Calendar.getInstance().getTimeInMillis())});
                    Bitmap bitmap = null;
                    try {
                        getOverflowCount getoverflowcount = this.read;
                        String str = this.MediaBrowserCompat$MediaItem;
                        Bitmap bitmap2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        double d = this.IconCompatParcelizer;
                        Context context = this.MediaBrowserCompat$ItemReceiver;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        View inflate = LayoutInflater.from(context).inflate(R.layout.f91682131494395, linearLayout, false);
                        PromptPayQRScreenshotFragment promptPayQRScreenshotFragment = new PromptPayQRScreenshotFragment();
                        ButterKnife.IconCompatParcelizer(promptPayQRScreenshotFragment, inflate);
                        promptPayQRScreenshotFragment.accountNumberCustomTarget.setValue(getoverflowcount.RatingCompat);
                        if (getoverflowcount.MediaBrowserCompat$CustomActionResultReceiver == 0.0d) {
                            promptPayQRScreenshotFragment.payerSpecifyAmountTextView.setVisibility(0);
                            promptPayQRScreenshotFragment.amountTextView.setText(context.getString(R.string.qr_code_generation_slip_no_amount));
                        } else {
                            promptPayQRScreenshotFragment.amountTextView.setText(getoverflowcount.read);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            promptPayQRScreenshotFragment.qrCodeImageView.setImageBitmap(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str, bitmap2, d));
                        }
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                        bitmap = AlertController$RecycleListView.IconCompatParcelizer(inflate, displayMetrics.widthPixels, displayMetrics.widthPixels << 2);
                        if (this.write) {
                            uri = AlertController$RecycleListView.read(bitmap, format, this.MediaBrowserCompat$ItemReceiver);
                        } else {
                            uri = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bitmap, this.MediaBrowserCompat$ItemReceiver, "screen_image.jpg");
                        }
                        return uri;
                    } finally {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                }
            }).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new ActivityBuilder_ContributeManageEmailVerificationSuccessActivity(this), new ActivityBuilder_ContributeMerchantTermsAndConditionsActivity(this));
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        ActivityBuilder_ContributeMwBankAccountActivity.IconCompatParcelizer(this);
    }

    public static void write() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.IconCompatParcelizer;
        if (uri == null || uri.toString().isEmpty()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.share_error);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.view_container, string, getoversizeimage);
                    return;
                }
                return;
            }
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", this.IconCompatParcelizer);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                createChooser = setTapText.write(activity2, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onCreateQRCodeButtonClick() {
        if (getActivity() != null) {
            ((PromptPayQRActivity) getActivity()).AlertController$RecycleListView();
            ((PromptPayQRActivity) getActivity()).MediaSessionCompat$Token();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onReturnHomeClick() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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

    public static /* synthetic */ void read(PromptPayQRSuccessFragment promptPayQRSuccessFragment, Uri uri) {
        promptPayQRSuccessFragment.IconCompatParcelizer = uri;
        FragmentActivity activity = promptPayQRSuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && promptPayQRSuccessFragment.getUserVisibleHint() && activity != null && promptPayQRSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = promptPayQRSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = promptPayQRSuccessFragment.getString(R.string.qr_code_generation_save_successful);
                if (promptPayQRSuccessFragment.getActivity() != null) {
                    ((BaseActivity) promptPayQRSuccessFragment.getActivity()).write(activity2, R.id.view_container, string, getoversizeimage);
                }
            }
            promptPayQRSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver = false;
        }
    }

    public static /* synthetic */ void write(PromptPayQRSuccessFragment promptPayQRSuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = promptPayQRSuccessFragment.getActivity();
        if (!promptPayQRSuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = promptPayQRSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = promptPayQRSuccessFragment.getString(R.string.qr_code_generation_save_error);
                if (promptPayQRSuccessFragment.getActivity() != null) {
                    ((BaseActivity) promptPayQRSuccessFragment.getActivity()).write(activity2, R.id.view_container, string, getoversizeimage);
                }
            }
        }
    }
}
