package com.scb.phone.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.C5557x651a8694;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C1152x3c012820;
import p040o.C3177x59cf6fde;
import p040o.CodedOutputStream;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FragmentBuilder_BindDeejungTransferSlipFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.GoogleSigninService;
import p040o.HmlETBLandingActivity;
import p040o.HmlETBPersonalInfoActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TestActivity;
import p040o.TestActivity$MediaBrowserCompat$ItemReceiver;
import p040o.TestActivity.read;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public abstract class BasePartialSearchActivity<T, VH extends TestActivity.read<T>> extends BaseActivity implements C1152x3c012820, TestActivity$MediaBrowserCompat$ItemReceiver<T> {
    public static final BasePartialSearchActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new BasePartialSearchActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private long MediaDescriptionCompat = 1;
    private String MediaMetadataCompat = "^[0-9a-zA-Z\\u0E00-\\u0E7F _*'\"#&()@.,/:-]+$";
    @BindView
    protected ImageButton btClear;
    @BindView
    protected ImageButton btScan;
    @BindView
    protected AppCompatEditText etSearch;
    @BindView
    protected ImageView ivError;
    @BindView
    protected LinearLayout layoutContainer;
    @BindView
    protected ConstraintLayout layoutEmpty;
    @BindView
    protected LinearLayout layoutSearchHint;
    @BindView
    protected LinearLayout layoutSearchResult;
    @BindView
    protected RelativeLayout layoutTxnLoading;
    @BindView
    protected RecyclerView recyclerView;
    @BindView
    protected NestedScrollView scrollContainer;
    @BindView
    protected TextView tvErrorDescription;
    @BindView
    protected TextView tvErrorTitle;
    @BindView
    protected TextView tvSearchHintDescription;
    @BindView
    protected TextView tvTotalRecords;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract void mo13737x50fd9e4a();

    public abstract void MediaSessionCompat$QueueItem();

    public abstract TestActivity<T, VH> MediaSessionCompat$ResultReceiverWrapper();

    public abstract CodedOutputStream.OutOfSpaceException<C1152x3c012820> MediaSessionCompat$Token();

    static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<String> {
        private /* synthetic */ BasePartialSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(BasePartialSearchActivity basePartialSearchActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = basePartialSearchActivity;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = (String) obj;
            CodedOutputStream.OutOfSpaceException<C1152x3c012820> MediaSessionCompat$Token = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token();
            onGetStartedClick.IconCompatParcelizer((Object) str, "keyword");
            onGetStartedClick.write((Object) str, "keyword");
            MediaSessionCompat$Token.IconCompatParcelizer = str;
            MediaSessionCompat$Token.write = "";
            if (!MediaSessionCompat$Token.IconCompatParcelizer().IconCompatParcelizer && MediaSessionCompat$Token.IconCompatParcelizer.length() >= 3) {
                MediaSessionCompat$Token.IconCompatParcelizer(str);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79162131493141);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.auto_biller_search_title);
        MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver(this);
        CodedOutputStream.OutOfSpaceException<C1152x3c012820> MediaSessionCompat$Token = MediaSessionCompat$Token();
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3177x59cf6fde.write;
        if (MediaSessionCompat$Token.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(MediaSessionCompat$Token.RatingCompat);
        }
    }

    public final void write() {
        TestActivity MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        MediaSessionCompat$ResultReceiverWrapper.write.clear();
        MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.write();
        LinearLayout linearLayout = this.layoutContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.layoutSearchHint;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        linearLayout2.setVisibility(0);
        ConstraintLayout constraintLayout = this.layoutEmpty;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout3 = this.layoutSearchResult;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        linearLayout3.setVisibility(8);
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(8);
        ImageButton imageButton = this.btScan;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btScan");
        }
        imageButton.setVisibility(0);
        super.ay_();
        LinearLayout linearLayout4 = this.layoutContainer;
        if (linearLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        linearLayout4.setVisibility(0);
        RelativeLayout relativeLayout = this.layoutTxnLoading;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        relativeLayout.setVisibility(8);
    }

    public final void Keep() {
        super.Keep();
        TestActivity MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        MediaSessionCompat$ResultReceiverWrapper.write.clear();
        MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.write();
        LinearLayout linearLayout = this.layoutContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        linearLayout.setVisibility(8);
        RelativeLayout relativeLayout = this.layoutTxnLoading;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        relativeLayout.setVisibility(8);
    }

    public final void ay_() {
        super.ay_();
        LinearLayout linearLayout = this.layoutContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        linearLayout.setVisibility(0);
        RelativeLayout relativeLayout = this.layoutTxnLoading;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        relativeLayout.setVisibility(8);
    }

    public final void write(String str) {
        LinearLayout linearLayout = this.layoutSearchHint;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        linearLayout.setVisibility(8);
        ConstraintLayout constraintLayout = this.layoutEmpty;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.layoutSearchResult;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        linearLayout2.setVisibility(0);
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(0);
        if (str != null) {
            TextView textView2 = this.tvTotalRecords;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
            }
            textView2.setText(getString(R.string.auto_biller_search_found_item, new Object[]{str}));
            return;
        }
        TextView textView3 = this.tvTotalRecords;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView3.setText(getString(R.string.auto_biller_search_found_item, new Object[]{"0"}));
    }

    public final void MediaBrowserCompat$MediaItem() {
        TestActivity MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        MediaSessionCompat$ResultReceiverWrapper.write.clear();
        MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.write();
        MediaSessionCompat$QueueItem();
    }

    public final void read(List<? extends Object> list) {
        onGetStartedClick.write((Object) list, "resultLists");
        TestActivity MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        onGetStartedClick.write((Object) list, "items");
        int IconCompatParcelizer2 = MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer();
        for (Object add : list) {
            MediaSessionCompat$ResultReceiverWrapper.write.add(add);
        }
        MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2 - 1, MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer() - 1);
    }

    public final void MediaDescriptionCompat() {
        TestActivity MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        MediaSessionCompat$ResultReceiverWrapper.write.clear();
        MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.write();
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(8);
        mo13737x50fd9e4a();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, String str, String str2) {
        ConstraintLayout constraintLayout = this.layoutEmpty;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        constraintLayout.setVisibility(0);
        LinearLayout linearLayout = this.layoutSearchHint;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.layoutSearchResult;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        linearLayout2.setVisibility(8);
        ImageView imageView = this.ivError;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivError");
        }
        imageView.setImageDrawable(setLastBaselineToBottomHeight.write(this, i));
        TextView textView = this.tvErrorTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorTitle");
        }
        textView.setText(str);
        TextView textView2 = this.tvErrorDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorDescription");
        }
        textView2.setText(str2);
    }

    static final class read implements NestedScrollView.IconCompatParcelizer {
        private /* synthetic */ BasePartialSearchActivity IconCompatParcelizer;

        read(BasePartialSearchActivity basePartialSearchActivity) {
            this.IconCompatParcelizer = basePartialSearchActivity;
        }

        public final void write(NestedScrollView nestedScrollView, int i, int i2) {
            BasePartialSearchActivity.write(this.IconCompatParcelizer, i, i2);
            onGetStartedClick.IconCompatParcelizer((Object) nestedScrollView, "scrollView");
            boolean z = true;
            View childAt = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1);
            if (childAt != null) {
                boolean z2 = i >= (childAt.getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) + -250;
                if (i <= i2) {
                    z = false;
                }
                if (z2 && z) {
                    CodedOutputStream.OutOfSpaceException<C1152x3c012820> MediaSessionCompat$Token = this.IconCompatParcelizer.MediaSessionCompat$Token();
                    if (!MediaSessionCompat$Token.IconCompatParcelizer().IconCompatParcelizer) {
                        MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ImageButton imageButton = this.btClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btClear");
        }
        imageButton.setVisibility(0);
        ImageButton imageButton2 = this.btScan;
        if (imageButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btScan");
        }
        imageButton2.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ImageButton imageButton = this.btClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btClear");
        }
        imageButton.setVisibility(8);
        ImageButton imageButton2 = this.btScan;
        if (imageButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btScan");
        }
        imageButton2.setVisibility(0);
    }

    public final void MediaMetadataCompat() {
        RelativeLayout relativeLayout = this.layoutTxnLoading;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        relativeLayout.setVisibility(0);
    }

    public final void read() {
        RelativeLayout relativeLayout = this.layoutTxnLoading;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        relativeLayout.setVisibility(8);
    }

    @OnClick
    public final void onClearClick() {
        AppCompatEditText appCompatEditText = this.etSearch;
        if (appCompatEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        appCompatEditText.setText((CharSequence) null);
        CodedOutputStream.OutOfSpaceException<C1152x3c012820> MediaSessionCompat$Token = MediaSessionCompat$Token();
        MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver();
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = CodedOutputStream.OutOfSpaceException.write.read;
        if (MediaSessionCompat$Token.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(MediaSessionCompat$Token.RatingCompat);
        }
    }

    @OnClick
    public final void onScanClick() {
        Intent IconCompatParcelizer2 = ScanPaymentActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchSubscription");
        }
        bulkTransferDeepLinkActivity.dispose();
        MediaSessionCompat$Token().onDestroy();
        super.onDestroy();
    }

    public static final /* synthetic */ void write(BasePartialSearchActivity basePartialSearchActivity, int i, int i2) {
        AppCompatEditText appCompatEditText = basePartialSearchActivity.etSearch;
        if (appCompatEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        if (appCompatEditText.isFocused() && i != i2) {
            basePartialSearchActivity.PlaybackStateCompat$CustomAction();
        }
    }

    public final void IconCompatParcelizer() {
        AppCompatEditText appCompatEditText = this.etSearch;
        if (appCompatEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        boolean z = true;
        appCompatEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(this.MediaMetadataCompat)});
        C5557x651a8694 basePartialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = new C5557x651a8694(MediaSessionCompat$Token(), MediaSessionCompat$ResultReceiverWrapper());
        AppCompatEditText appCompatEditText2 = this.etSearch;
        if (appCompatEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        EditText editText = appCompatEditText2;
        onGetStartedClick.write((Object) editText, "searchView");
        HmlETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "PublishSubject.create()");
        editText.addTextChangedListener(new C5557x651a8694.write(basePartialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver));
        BulkTransferDeepLinkActivity subscribe = MediaBrowserCompat$CustomActionResultReceiver.debounce(this.MediaDescriptionCompat, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new IconCompatParcelizer(this));
        onGetStartedClick.IconCompatParcelizer((Object) subscribe, "this.fromView(etSearch)\n…).onTextSearch(keyword) }");
        this.MediaBrowserCompat$MediaItem = subscribe;
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setNestedScrollingEnabled(false);
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView4.setAdapter(MediaSessionCompat$ResultReceiverWrapper());
        TestActivity MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        TestActivity$MediaBrowserCompat$ItemReceiver<? super T> testActivity$MediaBrowserCompat$ItemReceiver = this;
        onGetStartedClick.write((Object) testActivity$MediaBrowserCompat$ItemReceiver, "clickListener");
        MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver = testActivity$MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindDeejungTransferSlipFragment.read read2 = FragmentBuilder_BindDeejungTransferSlipFragment.MediaBrowserCompat$ItemReceiver;
        if (Build.VERSION.SDK_INT < 26) {
            z = false;
        }
        if (z) {
            NestedScrollView nestedScrollView = this.scrollContainer;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("scrollContainer");
            }
            nestedScrollView.setDefaultFocusHighlightEnabled(false);
        }
        NestedScrollView nestedScrollView2 = this.scrollContainer;
        if (nestedScrollView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("scrollContainer");
        }
        nestedScrollView2.setOnScrollChangeListener(new read(this));
        LinearLayout linearLayout = this.layoutContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.layoutSearchHint;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        linearLayout2.setVisibility(0);
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(8);
        ConstraintLayout constraintLayout = this.layoutEmpty;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout3 = this.layoutSearchResult;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        linearLayout3.setVisibility(8);
        AppCompatEditText appCompatEditText3 = this.etSearch;
        if (appCompatEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        appCompatEditText3.setHint(R.string.auto_biller_search_input_placeholder);
        TextView textView2 = this.tvSearchHintDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSearchHintDescription");
        }
        textView2.setText(R.string.auto_biller_search_initial_state);
    }
}
