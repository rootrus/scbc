package com.scb.phone.view.fragment.ccrredemption.product;

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
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageAirlineMembershipDetailsActivity;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageQuantitySelectionActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRRegistrationLandingActivity;
import com.scb.phone.view.activity.ccrredemption.product.QuantitySelectionActivity;
import com.scb.phone.view.activity.ccrredemption.review.ReviewRedemptionActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.Locale;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ComponentContainer;
import p040o.HmlPinActivity;
import p040o.IdCaptureBackActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.JsonElement;
import p040o.LongSerializationPolicy;
import p040o.Maps;
import p040o.MyECouponActivity_ViewBinding;
import p040o.abandon;
import p040o.checkNotPrimitive;
import p040o.createInstance;
import p040o.getAsBigDecimal;
import p040o.getAsBooleanWrapper;
import p040o.getAsJsonArray;
import p040o.getAsJsonNull;
import p040o.getAsJsonObject;
import p040o.hashCode;
import p040o.hashCode$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.intoSet;
import p040o.isEagerInDefaultApp;
import p040o.isJsonArray;
import p040o.isJsonPrimitive;
import p040o.isOcrRead;
import p040o.isReset;
import p040o.lambda$intoSet$2;
import p040o.lambda$of$1;
import p040o.performCreate;
import p040o.setTapText;
import p040o.zzpf;

public class ProductDetailFragment extends BaseFragment implements isOcrRead, IdCaptureBackActivity.C69021 {
    private isEagerInDefaultApp MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button button;
    @HmlPinActivity
    public hashCode glide;
    @BindView
    ImageView imvProductDetail;
    @BindView
    LinearLayout pointsPlusMoneySection;
    @HmlPinActivity
    public checkNotPrimitive productDetailPresenter;
    @BindView
    LinearLayout rewardTierLayout;
    @BindView
    TextView rewardTierText;
    @BindView
    TextView txvPointsPerUnit;
    @BindView
    TextView txvPointsPlusMoneyPerUnit;
    @BindView
    TextView txvProductDetails;
    @BindView
    TextView txvProductItemCode;
    @BindView
    TextView txvProductsName;
    @BindView
    TextView unavailablePrivilegeText;
    @BindView
    LinearLayout viewRegisterOpr;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89032131494130, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        isEagerInDefaultApp iseagerindefaultapp = (isEagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductDetailActivity.PRODUCT_DTO_EXTRA");
        this.MediaBrowserCompat$CustomActionResultReceiver = iseagerindefaultapp;
        iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        this.productDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.productDetailPresenter.IconCompatParcelizer = this;
        checkNotPrimitive checknotprimitive = this.productDetailPresenter;
        isEagerInDefaultApp iseagerindefaultapp2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        checknotprimitive.MediaBrowserCompat$ItemReceiver = iseagerindefaultapp2;
        if (!iseagerindefaultapp2.MediaBrowserCompat$MediaItem) {
            isJsonPrimitive isjsonprimitive = isJsonPrimitive.MediaBrowserCompat$ItemReceiver;
            if (checknotprimitive.RatingCompat != null) {
                isjsonprimitive.IconCompatParcelizer(checknotprimitive.RatingCompat);
            }
            intoSet intoset = iseagerindefaultapp2.MediaSessionCompat$ResultReceiverWrapper;
            if (intoset.ParcelableVolumeInfo == null || intoset.IconCompatParcelizer == null || intoset.MediaBrowserCompat$MediaItem == null) {
                getAsBigDecimal getasbigdecimal = getAsBigDecimal.write;
                if (checknotprimitive.RatingCompat != null) {
                    getasbigdecimal.IconCompatParcelizer(checknotprimitive.RatingCompat);
                }
            } else {
                LongSerializationPolicy.C36001 r3 = LongSerializationPolicy.C36001.MediaBrowserCompat$ItemReceiver;
                if (checknotprimitive.RatingCompat != null) {
                    r3.IconCompatParcelizer(checknotprimitive.RatingCompat);
                }
            }
            int parseInt = Integer.parseInt(iseagerindefaultapp2.MediaSessionCompat$Token.replaceAll(",", ""));
            int intValue = iseagerindefaultapp2.MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat$CustomAction.intValue();
            if (intoset.setHasDecor == zzpf.zza.MILEAGE && parseInt < intValue) {
                createInstance createinstance = createInstance.IconCompatParcelizer;
                if (checknotprimitive.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    createinstance.IconCompatParcelizer(checknotprimitive.RatingCompat);
                }
            }
        } else if (iseagerindefaultapp2.MediaBrowserCompat$MediaItem && !iseagerindefaultapp2.MediaSessionCompat$QueueItem) {
            JsonElement jsonElement = new JsonElement(iseagerindefaultapp2);
            if (checknotprimitive.RatingCompat != null) {
                z = true;
            }
            if (z) {
                jsonElement.IconCompatParcelizer(checknotprimitive.RatingCompat);
            }
        } else if (iseagerindefaultapp2.MediaBrowserCompat$MediaItem && iseagerindefaultapp2.MediaSessionCompat$QueueItem) {
            if (iseagerindefaultapp2.MediaMetadataCompat) {
                getAsJsonNull getasjsonnull = new getAsJsonNull(checknotprimitive, iseagerindefaultapp2);
                if (checknotprimitive.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getasjsonnull.IconCompatParcelizer(checknotprimitive.RatingCompat);
                }
            } else {
                getAsJsonArray getasjsonarray = getAsJsonArray.write;
                if (checknotprimitive.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getasjsonarray.IconCompatParcelizer(checknotprimitive.RatingCompat);
                }
            }
        }
        intoSet intoset2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
        String str = intoset2.MediaDescriptionCompat;
        if (str != null) {
            hashCode hashcode = this.glide;
            StringBuilder sb = new StringBuilder();
            sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb.append(str);
            hashcode.MediaBrowserCompat$ItemReceiver(sb.toString()).MediaBrowserCompat$ItemReceiver((abandon<?>) ((isReset) ((isReset) ((isReset) new isReset().read(true)).MediaBrowserCompat$CustomActionResultReceiver(performCreate.read)).IconCompatParcelizer((int) R.drawable.donations_place_holder)).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder)).MediaBrowserCompat$ItemReceiver(this.imvProductDetail);
        } else {
            this.imvProductDetail.setImageResource(R.drawable.donations_place_holder);
        }
        this.txvProductsName.setText(intoset2.MediaSessionCompat$QueueItem);
        this.txvProductDetails.setText(intoset2.AlertController$RecycleListView);
        this.txvProductItemCode.setText(intoset2.MediaSessionCompat$Token);
        this.txvPointsPerUnit.setText(intoset2.read());
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onPointsClick() {
        checkNotPrimitive checknotprimitive = this.productDetailPresenter;
        if (checknotprimitive.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem) {
            boolean z = false;
            if (checknotprimitive.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.setHasDecor == zzpf.zza.MILEAGE) {
                lambda$of$1 lambda_of_1 = new lambda$of$1();
                lambda_of_1.IconCompatParcelizer = checknotprimitive.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                lambda_of_1.MediaBrowserCompat$CustomActionResultReceiver = checknotprimitive.MediaBrowserCompat$ItemReceiver.write;
                lambda_of_1.RatingCompat = checknotprimitive.MediaBrowserCompat$ItemReceiver.RatingCompat;
                lambda_of_1.MediaDescriptionCompat = checknotprimitive.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
                lambda_of_1.MediaMetadataCompat = checknotprimitive.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
                lambda_of_1.MediaBrowserCompat$SearchResultReceiver = checknotprimitive.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
                lambda_of_1.read = 1;
                lambda_of_1.MediaSessionCompat$ResultReceiverWrapper = NumberFormat.getInstance(Locale.getDefault()).format(checknotprimitive.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.f2870x50fd9e4a.IconCompatParcelizer);
                lambda_of_1.MediaBrowserCompat$ItemReceiver = true;
                lambda_of_1.MediaSessionCompat$QueueItem = checknotprimitive.MediaBrowserCompat$ItemReceiver.Keep;
                lambda_of_1.f2886x50fd9e4a = DiskLruCache.VERSION_1;
                getAsBooleanWrapper getasbooleanwrapper = new getAsBooleanWrapper(lambda_of_1);
                if (checknotprimitive.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getasbooleanwrapper.IconCompatParcelizer(checknotprimitive.RatingCompat);
                    return;
                }
                return;
            }
            getAsJsonObject getasjsonobject = new getAsJsonObject(checknotprimitive);
            if (checknotprimitive.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getasjsonobject.IconCompatParcelizer(checknotprimitive.RatingCompat);
            }
        } else if (checknotprimitive.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.setHasDecor == zzpf.zza.MILEAGE) {
            checknotprimitive.IconCompatParcelizer.IconCompatParcelizer(checknotprimitive.MediaBrowserCompat$ItemReceiver);
        } else {
            checknotprimitive.IconCompatParcelizer.write(checknotprimitive.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.pointsPlusMoneySection.setVisibility(8);
    }

    public final void MediaMetadataCompat() {
        TextView textView = this.txvPointsPlusMoneyPerUnit;
        intoSet intoset = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
        String format = NumberFormat.getInstance(Locale.getDefault()).format(intoset.ParcelableVolumeInfo);
        String format2 = NumberFormat.getInstance(Locale.getDefault()).format(intoset.IconCompatParcelizer);
        Maps.MapDifferenceImpl mapDifferenceImpl = intoset.setBackgroundResource;
        textView.setText(mapDifferenceImpl.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points_plus_cash, new Object[]{format, format2, intoset.MediaBrowserCompat$MediaItem}));
    }

    public final void write(isEagerInDefaultApp iseagerindefaultapp) {
        Intent IconCompatParcelizer = QuantitySelectionActivity.IconCompatParcelizer(getContext(), iseagerindefaultapp);
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
            startActivityForResult(IconCompatParcelizer, 103);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        this.button.setEnabled(false);
    }

    public final void write() {
        this.button.setEnabled(true);
    }

    public final void RatingCompat() {
        this.rewardTierLayout.setVisibility(8);
        this.button.setText(getResources().getString(R.string.continue_label));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.unavailablePrivilegeText.setVisibility(8);
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.unavailablePrivilegeText.setVisibility(0);
    }

    public final void read() {
        this.viewRegisterOpr.setVisibility(8);
    }

    public final void MediaDescriptionCompat() {
        this.viewRegisterOpr.setVisibility(0);
    }

    public final void write(lambda$intoSet$2 lambda_intoset_2) {
        Intent MediaBrowserCompat$ItemReceiver = ReviewRedemptionActivity.MediaBrowserCompat$ItemReceiver(getContext(), lambda_intoset_2);
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
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(lambda$of$1 lambda_of_1) {
        Intent IconCompatParcelizer = MileageAirlineMembershipDetailsActivity.IconCompatParcelizer(getContext(), lambda_of_1);
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
            startActivityForResult(IconCompatParcelizer, 103);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(isEagerInDefaultApp iseagerindefaultapp) {
        Intent IconCompatParcelizer = MileageQuantitySelectionActivity.IconCompatParcelizer(getContext(), iseagerindefaultapp);
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
            startActivityForResult(IconCompatParcelizer, 103);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 103 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @OnClick
    public void onRegisterClick() {
        checkNotPrimitive checknotprimitive = this.productDetailPresenter;
        isEagerInDefaultApp iseagerindefaultapp = this.MediaBrowserCompat$CustomActionResultReceiver;
        ComponentContainer componentContainer = new ComponentContainer();
        componentContainer.MediaMetadataCompat = iseagerindefaultapp.read;
        componentContainer.MediaBrowserCompat$SearchResultReceiver = iseagerindefaultapp.MediaBrowserCompat$SearchResultReceiver;
        componentContainer.write = iseagerindefaultapp.IconCompatParcelizer;
        componentContainer.IconCompatParcelizer = iseagerindefaultapp.MediaBrowserCompat$ItemReceiver;
        componentContainer.MediaBrowserCompat$CustomActionResultReceiver = iseagerindefaultapp.RatingCompat;
        componentContainer.RatingCompat = iseagerindefaultapp.write;
        componentContainer.MediaBrowserCompat$ItemReceiver = iseagerindefaultapp.MediaSessionCompat$Token;
        componentContainer.read = iseagerindefaultapp.MediaBrowserCompat$CustomActionResultReceiver;
        componentContainer.MediaDescriptionCompat = iseagerindefaultapp.f2874x50fd9e4a;
        componentContainer.ParcelableVolumeInfo = iseagerindefaultapp.Keep;
        componentContainer.MediaSessionCompat$ResultReceiverWrapper = iseagerindefaultapp.MediaDescriptionCompat;
        isJsonArray isjsonarray = new isJsonArray(componentContainer);
        if (checknotprimitive.RatingCompat != null) {
            isjsonarray.IconCompatParcelizer(checknotprimitive.RatingCompat);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        hashCode hashcode = this.glide;
        if (hashcode != null) {
            hashcode.MediaBrowserCompat$CustomActionResultReceiver(new hashCode$MediaBrowserCompat$CustomActionResultReceiver(this.imvProductDetail));
            this.glide = null;
        }
        this.imvProductDetail.setImageDrawable((Drawable) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(ComponentContainer componentContainer) {
        componentContainer.Keep = "Product detail page";
        Intent write = OPRRegistrationLandingActivity.write(getContext(), componentContainer);
        write.addFlags(603979776);
        write.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", false);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.pointsPlusMoneySection.setVisibility(8);
        this.rewardTierLayout.setVisibility(0);
        this.rewardTierText.setText(this.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper.setHasDecor == zzpf.zza.MILEAGE) {
            this.button.setText(getResources().getString(R.string.next_label));
        } else {
            this.button.setText(getResources().getString(R.string.redeem));
        }
    }
}
