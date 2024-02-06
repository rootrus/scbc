package com.scb.phone.view.activity.ccrredemption.product;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.activity.ccrredemption.search.RewardSearchActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C10030kT;
import p040o.C10031kU;
import p040o.C10032kY;
import p040o.HmlPinActivity;
import p040o.IIdExtractorListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTPMV;
import p040o.arrayOf;
import p040o.chain;
import p040o.intoSetBuilder;
import p040o.setTapText;
import p040o.zzvd;
import p040o.zzvg;

public class ProductListActivity extends CCRBaseActivity implements IIdExtractorListener {
    private Unbinder MediaBrowserCompat$MediaItem;
    private intoSetBuilder MediaBrowserCompat$SearchResultReceiver;
    private ZTPMV MediaDescriptionCompat;
    private chain MediaMetadataCompat;
    @BindView
    ImageButton btnFilterSort;
    @BindView
    public ImageView filterAppliedIndicator;
    @HmlPinActivity
    public arrayOf presenter;
    @BindView
    TextView txvRewardPoints;
    @BindView
    TextView txvTitle;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, intoSetBuilder intosetbuilder, chain chain) {
        Intent intent = new Intent(context, ProductListActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CATEGORY_DTO_EXTRA", intosetbuilder);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CREDIT_CARD_DISPLAY_EXTRA", chain);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79462131493171);
        this.MediaDescriptionCompat = new ZTPMV();
        this.MediaBrowserCompat$SearchResultReceiver = (intoSetBuilder) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CATEGORY_DTO_EXTRA");
        this.MediaMetadataCompat = (chain) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CREDIT_CARD_DISPLAY_EXTRA");
        this.MediaBrowserCompat$MediaItem = ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$MediaItem.read();
    }

    @OnClick
    public void onFilterButtonClick() {
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "reward_filter");
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.f91672131494394);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        dialog.show();
        RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.radio_group_sort);
        RadioGroup radioGroup2 = (RadioGroup) dialog.findViewById(R.id.radio_group_filter);
        int i = C10755.MediaBrowserCompat$ItemReceiver[this.presenter.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver().ordinal()];
        radioGroup.check(i != 2 ? i != 3 ? i != 4 ? R.id.rb_popularity : R.id.rb_recent : R.id.rb_points_low_to_high : R.id.rb_points_high_to_low);
        radioGroup2.check(C10755.MediaBrowserCompat$CustomActionResultReceiver[this.presenter.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer().ordinal()] != 2 ? R.id.rb_all_rewards : R.id.rb_rewards_within_points);
        ((Button) dialog.findViewById(R.id.btn_filter_apply)).setOnClickListener(new C10030kT(this, radioGroup, radioGroup2, dialog));
        ((Button) dialog.findViewById(R.id.btn_reset_filter)).setOnClickListener(new C10032kY(radioGroup, radioGroup2));
        ((ImageButton) dialog.findViewById(R.id.btn_filter_sort_dismiss)).setOnClickListener(new C10031kU(dialog));
    }

    public static /* synthetic */ void read(RadioGroup radioGroup, RadioGroup radioGroup2) {
        radioGroup.check(R.id.rb_popularity);
        radioGroup2.check(R.id.rb_all_rewards);
    }

    @OnClick
    public void onSearchButtonClick() {
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
        intoSetBuilder intosetbuilder = this.MediaBrowserCompat$SearchResultReceiver;
        if (intosetbuilder != null) {
            intosetbuilder.RatingCompat = true;
            this.MediaDescriptionCompat.read(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "reward_search");
        intoSetBuilder intosetbuilder2 = this.MediaBrowserCompat$SearchResultReceiver;
        Intent read = RewardSearchActivity.read(this, intosetbuilder2, this.MediaMetadataCompat, intosetbuilder2.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
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

    /* renamed from: com.scb.phone.view.activity.ccrredemption.product.ProductListActivity$5 */
    static /* synthetic */ class C10755 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                o.zzvd[] r0 = p040o.zzvd.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                r1 = 1
                o.zzvd r2 = p040o.zzvd.ALL_REWARDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.zzvd r3 = p040o.zzvd.REWARDS_WITHIN_POINTS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                o.zzvg[] r2 = p040o.zzvg.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                MediaBrowserCompat$ItemReceiver = r2
                o.zzvg r3 = p040o.zzvg.POPULARITY     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0038 }
                o.zzvg r2 = p040o.zzvg.HIGHEST_POINT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0043 }
                o.zzvg r1 = p040o.zzvg.LOWEST_POINT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x004e }
                o.zzvg r1 = p040o.zzvg.NEW_RELEASES     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ccrredemption.product.ProductListActivity.C10755.<clinit>():void");
        }
    }

    public static zzvd read(int i) {
        if (i == R.id.rb_all_rewards) {
            return zzvd.ALL_REWARDS;
        }
        if (i != R.id.rb_rewards_within_points) {
            return zzvd.ALL_REWARDS;
        }
        return zzvd.REWARDS_WITHIN_POINTS;
    }

    public static zzvg MediaBrowserCompat$CustomActionResultReceiver(int i) {
        switch (i) {
            case R.id.rb_points_high_to_low /*2131299707*/:
                return zzvg.HIGHEST_POINT;
            case R.id.rb_points_low_to_high /*2131299708*/:
                return zzvg.LOWEST_POINT;
            case R.id.rb_popularity /*2131299709*/:
                return zzvg.POPULARITY;
            case R.id.rb_recent /*2131299710*/:
                return zzvg.NEW_RELEASES;
            default:
                return zzvg.POPULARITY;
        }
    }

    public final void write() {
        this.btnFilterSort.setEnabled(false);
    }

    public final void read() {
        this.btnFilterSort.setEnabled(true);
    }

    public final void setStackedBackground() {
        this.filterAppliedIndicator.setVisibility(this.presenter.IconCompatParcelizer());
        this.txvRewardPoints.setText(getString(R.string.you_have_points, new Object[]{this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token}));
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
