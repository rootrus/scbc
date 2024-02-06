package com.scb.phone.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Unbinder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.custom.item.ItemIconCustom;
import com.scb.phone.view.custom.item.ItemRevampSimpleCustom;
import com.scb.phone.view.custom.item.ItemRevampSuccessfulHeaderCustom;
import com.scb.phone.view.custom.item.ItemSimpleBottomCustom;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import java.util.List;
import org.jmrtd.lds.ImageInfo;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule_GetIExtractionServerRttiFactory;
import p040o.ClsFileOutputStream;
import p040o.ContentFrameLayout;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingFuture;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.awaitEvenIfOnMainThread;
import p040o.capFileCount;
import p040o.computeFloatSizeNoTag;
import p040o.computeUInt64Size;
import p040o.getFundDetails;
import p040o.getKnowledgeAssessment;
import p040o.getOversizeImage;
import p040o.getSessionEventSize;
import p040o.getSwitchOutSearchFunds;
import p040o.getUserId;
import p040o.onStart;
import p040o.race;
import p040o.sanitizeAttribute;
import p040o.setExitButtonEnabled;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.verifyRedeem;
import p040o.writeBytesNoTag;
import p040o.writeSInt32;
import p040o.writeUInt64NoTag;

public class PurchaseSuccessFragment extends ScreenShotFragment<standardStartAndWait> implements CheckCaptureModule_GetIExtractionServerRttiFactory {
    public BulkTransferDeepLinkActivity IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    @BindView
    public TextView buttonReturn;
    @HmlPinActivity
    public Iterables.C352414 componentFactory;
    @BindView
    protected LinearLayout container;
    @BindView
    ImageView curlImageView;
    @BindView
    LinearLayout deepLinkButtonsContainer;
    @BindView
    public LinearLayout extraContainer;
    @BindView
    LinearLayout footerContainer;
    @HmlPinActivity
    public getSessionEventSize presenter;
    @BindView
    TextView purchaseNote;
    @BindView
    TextView remainingMsgTextView;
    @BindView
    Button saveSlip;
    @BindView
    Button shareSlip;
    @HmlPinActivity
    public setExitButtonEnabled themesSlipPresenter;

    public /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ void MediaBrowserCompat$MediaItem(String str) {
    }

    /* access modifiers changed from: protected */
    public int MediaSessionCompat$QueueItem() {
        return R.layout.f86272131493854;
    }

    public class PurchaseScreenshotDisplay_ViewBinding implements Unbinder {
        private PurchaseScreenshotDisplay MediaBrowserCompat$CustomActionResultReceiver;

        public PurchaseScreenshotDisplay_ViewBinding(PurchaseScreenshotDisplay purchaseScreenshotDisplay, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = purchaseScreenshotDisplay;
            purchaseScreenshotDisplay.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container, "field 'container'", LinearLayout.class);
            purchaseScreenshotDisplay.purchaseNote = (TextView) onStart.IconCompatParcelizer(view, R.id.purchase_note, "field 'purchaseNote'", TextView.class);
        }

        public final void read() {
            PurchaseScreenshotDisplay purchaseScreenshotDisplay = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (purchaseScreenshotDisplay != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                purchaseScreenshotDisplay.container = null;
                purchaseScreenshotDisplay.purchaseNote = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static final /* synthetic */ void write(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((PurchaseSuccessFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onReturnButton() {
        getSessionEventSize getsessioneventsize = this.presenter;
        writeBytesNoTag writebytesnotag = writeBytesNoTag.MediaBrowserCompat$ItemReceiver;
        if (getsessioneventsize.RatingCompat != null) {
            writebytesnotag.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    public static PurchaseSuccessFragment IconCompatParcelizer(standardStartAndWait standardstartandwait) {
        PurchaseSuccessFragment purchaseSuccessFragment = new PurchaseSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.PURCHASE_SUCCESS_DISPLAY", standardstartandwait);
        purchaseSuccessFragment.setArguments(bundle);
        return purchaseSuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(MediaSessionCompat$QueueItem(), viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
    }

    public final void write(Throwable th) {
        getSessionEventSize getsessioneventsize = this.presenter;
        Log.e("PurSuccessPresenter", "onSaveScreenshotError: ", th);
        computeUInt64Size computeuint64size = computeUInt64Size.MediaBrowserCompat$CustomActionResultReceiver;
        if (getsessioneventsize.RatingCompat != null) {
            computeuint64size.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        getSessionEventSize getsessioneventsize = this.presenter;
        boolean z2 = true;
        if (z) {
            computeFloatSizeNoTag computefloatsizenotag = new computeFloatSizeNoTag(str);
            if (getsessioneventsize.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                computefloatsizenotag.IconCompatParcelizer(getsessioneventsize.RatingCompat);
                return;
            }
            return;
        }
        writeSInt32 writesint32 = writeSInt32.IconCompatParcelizer;
        if (getsessioneventsize.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            writesint32.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    @OnClick
    @Optional
    public void onShareSlipButtonClick() {
        getSessionEventSize getsessioneventsize = this.presenter;
        ClsFileOutputStream clsFileOutputStream = new ClsFileOutputStream(getsessioneventsize);
        if (getsessioneventsize.RatingCompat != null) {
            clsFileOutputStream.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    @OnClick
    @Optional
    public void onSaveSlipButtonClick() {
        getSessionEventSize getsessioneventsize = this.presenter;
        ClsFileOutputStream.C31751 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).read(getSessionEventSize.this.IconCompatParcelizer, true);
            }
        };
        if (getsessioneventsize.RatingCompat != null) {
            r1.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getArguments() != null && getArguments().getParcelable("com.scb.phone.PURCHASE_SUCCESS_DISPLAY") != null) {
            read((standardStartAndWait) getArguments().getParcelable("com.scb.phone.PURCHASE_SUCCESS_DISPLAY"));
        }
    }

    public void read(standardStartAndWait standardstartandwait) {
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
    }

    public final void IconCompatParcelizer(List<ForwardingFuture> list) {
        for (ForwardingFuture next : list) {
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver2 = this.componentFactory.MediaBrowserCompat$CustomActionResultReceiver(getContext(), next);
            MediaBrowserCompat$CustomActionResultReceiver2.setUpWithDisplay(next);
            this.container.addView(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    public final void read(String str) {
        TextView textView = this.remainingMsgTextView;
        if (textView != null) {
            textView.setVisibility(str != null ? 0 : 8);
            this.remainingMsgTextView.setText(str);
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write(String str) {
        TextView textView = this.purchaseNote;
        if (textView != null) {
            textView.setVisibility(str != null ? 0 : 8);
            this.purchaseNote.setText(str);
        }
    }

    public void IconCompatParcelizer() {
        HomeActivity.write(getContext(), true);
    }

    public final void write() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            String string = getString(R.string.saved_slip);
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.root_view, string, getoversizeimage);
            }
        }
    }

    public final void read() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            String string = getString(R.string.saved_slip_error);
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.root_view, string, getoversizeimage);
            }
        }
    }

    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public void IconCompatParcelizer(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver = new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter);
        PurchaseScreenshotDisplay purchaseScreenshotDisplay = new PurchaseScreenshotDisplay(R.layout.f91692131494396, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), getSessionEventSize.write(standardstartandwait), z, this.componentFactory, z2);
        this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver, purchaseScreenshotDisplay, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new getKnowledgeAssessment(this, z), new getSwitchOutSearchFunds(this));
        purchaseScreenshotDisplay.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z, Uri uri) throws Exception {
        getSessionEventSize getsessioneventsize = this.presenter;
        String obj = uri.toString();
        boolean z2 = true;
        if (z) {
            computeFloatSizeNoTag computefloatsizenotag = new computeFloatSizeNoTag(obj);
            if (getsessioneventsize.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                computefloatsizenotag.IconCompatParcelizer(getsessioneventsize.RatingCompat);
                return;
            }
            return;
        }
        writeSInt32 writesint32 = writeSInt32.IconCompatParcelizer;
        if (getsessioneventsize.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            writesint32.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) throws Exception {
        getSessionEventSize getsessioneventsize = this.presenter;
        Log.e("PurSuccessPresenter", "onSaveScreenshotError: ", th);
        computeUInt64Size computeuint64size = computeUInt64Size.MediaBrowserCompat$CustomActionResultReceiver;
        if (getsessioneventsize.RatingCompat != null) {
            computeuint64size.IconCompatParcelizer(getsessioneventsize.RatingCompat);
        }
    }

    public final void write(boolean z) {
        this.saveSlip.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.saveSlip.setBackgroundResource(z ? R.drawable.bg_button : R.drawable.bg_button_transparent);
        this.saveSlip.setTextColor(ContentFrameLayout.write(getResources(), z ? R.color.f71012131100257 : R.color.f67252131099881, (Resources.Theme) null));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.shareSlip.setVisibility(z ? 0 : 8);
    }

    public final void write(int i) {
        Context context = getContext();
        if (context != null && this.curlImageView != null) {
            this.curlImageView.setBackgroundColor(setLastBaselineToBottomHeight.read(context, i));
        }
    }

    public final void IconCompatParcelizer(sanitizeAttribute sanitizeattribute) {
        ItemCustom MediaBrowserCompat$CustomActionResultReceiver2 = this.componentFactory.MediaBrowserCompat$CustomActionResultReceiver(getContext(), sanitizeattribute);
        MediaBrowserCompat$CustomActionResultReceiver2.setUpWithDisplay(sanitizeattribute);
        LinearLayout linearLayout = this.footerContainer;
        if (linearLayout != null) {
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        LinearLayout linearLayout = this.footerContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(List<getUserId> list) {
        LinearLayout linearLayout = this.deepLinkButtonsContainer;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            if (list == null || list.isEmpty()) {
                this.deepLinkButtonsContainer.setVisibility(8);
                return;
            }
            this.deepLinkButtonsContainer.setVisibility(0);
            LayoutInflater from = LayoutInflater.from(getActivity());
            Resources resources = getActivity().getResources();
            int applyDimension = (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(applyDimension, applyDimension, applyDimension, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
            for (int i = 0; i < list.size(); i++) {
                getUserId getuserid = list.get(i);
                if (!TextUtils.isEmpty(getuserid.write)) {
                    Button button = (Button) from.inflate(R.layout.f81152131493341, (ViewGroup) null);
                    button.setText(getuserid.IconCompatParcelizer);
                    button.setOnClickListener(new getFundDetails(this, getuserid));
                    if (!(list.size() == 1 || i == list.size() - 1)) {
                        button.setLayoutParams(layoutParams);
                    }
                    this.deepLinkButtonsContainer.addView(button);
                }
            }
        }
    }

    public static class PurchaseScreenshotDisplay extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        public boolean IconCompatParcelizer = false;
        private Iterables.C352414 MediaBrowserCompat$MediaItem;
        @BindView
        public LinearLayout container;
        @BindView
        protected TextView purchaseNote;
        private standardStartAndWait read;

        public PurchaseScreenshotDisplay(int i, String str, standardStartAndWait standardstartandwait, boolean z, Iterables.C352414 r5, boolean z2) {
            super(i, str, z, z2);
            this.read = standardstartandwait;
            this.MediaBrowserCompat$MediaItem = r5;
        }

        public void read(View view) {
            TextView textView;
            MediaBrowserCompat$CustomActionResultReceiver(this.read.MediaDescriptionCompat, view.getContext());
            String str = this.read.IconCompatParcelizer;
            if (str != null && (textView = this.purchaseNote) != null) {
                textView.setVisibility(0);
                this.purchaseNote.setText(str);
            }
        }

        /* access modifiers changed from: protected */
        public final void MediaBrowserCompat$CustomActionResultReceiver(List<ForwardingFuture> list, Context context) {
            for (ForwardingFuture next : list) {
                ItemCustom MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(context, next);
                if (this.IconCompatParcelizer) {
                    if (MediaBrowserCompat$CustomActionResultReceiver instanceof ItemRevampSuccessfulHeaderCustom) {
                        ((ItemRevampSuccessfulHeaderCustom) MediaBrowserCompat$CustomActionResultReceiver).read();
                    } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof ItemRevampSimpleCustom) {
                        ((ItemRevampSimpleCustom) MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver(((race) next).MediaSessionCompat$ResultReceiverWrapper);
                    }
                }
                if (MediaBrowserCompat$CustomActionResultReceiver instanceof ItemIconCustom) {
                    if (((awaitEvenIfOnMainThread) next).MediaSessionCompat$ResultReceiverWrapper) {
                        ((ItemIconCustom) MediaBrowserCompat$CustomActionResultReceiver).layoutCustomItemIcon.setVisibility(8);
                    }
                } else if ((MediaBrowserCompat$CustomActionResultReceiver instanceof ItemSimpleBottomCustom) && ((capFileCount) next).MediaSessionCompat$QueueItem) {
                    ((ItemSimpleBottomCustom) MediaBrowserCompat$CustomActionResultReceiver).setVisibility(8);
                }
                MediaBrowserCompat$CustomActionResultReceiver.setUpWithDisplay(next);
                this.container.addView(MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        /* access modifiers changed from: protected */
        public final void read(String str) {
            TextView textView;
            if (str != null && (textView = this.purchaseNote) != null) {
                textView.setVisibility(0);
                this.purchaseNote.setText(str);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
    }

    public final void IconCompatParcelizer(String str) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("share_slip_action");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* bridge */ /* synthetic */ void read(standardStartAndWait standardstartandwait, boolean z) {
        verifyRedeem.read(this, standardstartandwait, false, z);
    }
}
