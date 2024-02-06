package com.scb.phone.view.activity.debitatm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.debitcard.DebitCardCoachMarkActivity;
import com.scb.phone.view.adapter.debitatm.DebitCardDetailAdapter;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.debitatm.C1117x5be075b9;
import com.scb.phone.view.fragment.debitatm.DebitCardRewardTabFragment;
import com.scb.phone.view.fragment.debitatm.DebitCardServiceTabFragment;
import com.scb.phone.view.fragment.debitatm.DebitCardTransactionTabFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.Arrays;
import java.util.List;
import p040o.C1423x2520faf1;
import p040o.CrashlyticsRegistrar$$Lambda$1;
import p040o.Lazy;
import p040o.MalformedJsonException;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NotFoundException;
import p040o.ZTRMV;
import p040o.dispose;
import p040o.getStringValues;
import p040o.proxyGetIIdDeserializerOnDevice$MediaBrowserCompat$ItemReceiver;
import p040o.setDecoderFactory;
import p040o.setTapText;
import p040o.setTorchOn;
import p040o.setViewRotation;
import p040o.validateAddress;
import p059me.relex.circleindicator.CircleIndicator;

public class DebitCardDetailActivity extends BaseActivity implements C1423x2520faf1, C1117x5be075b9, NestedScrollView.IconCompatParcelizer, DebitCardTransactionTabFragment.read {
    private DebitCardRewardTabFragment AlertController$RecycleListView;
    private DebitCardTransactionTabFragment Keep;
    public proxyGetIIdDeserializerOnDevice$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    private ZTRMV MediaBrowserCompat$SearchResultReceiver = new ZTRMV();
    private ViewPager$MediaBrowserCompat$MediaItem MediaDescriptionCompat = new ViewPager$MediaBrowserCompat$MediaItem() {
        public final void onPageSelected(int i) {
            int currentItem = DebitCardDetailActivity.this.vpContent.getCurrentItem();
            DebitCardDetailActivity.this.MediaBrowserCompat$MediaItem.read((Lazy) DebitCardDetailActivity.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(i), currentItem);
        }
    };
    /* access modifiers changed from: private */
    public DebitCardDetailAdapter MediaMetadataCompat;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private TabLayout$MediaBrowserCompat$ItemReceiver MediaSessionCompat$Token = new TabLayout$MediaBrowserCompat$ItemReceiver() {
        public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
            int currentItem = DebitCardDetailActivity.this.vpCardView.getCurrentItem();
            DebitCardDetailActivity.this.MediaBrowserCompat$MediaItem.read((Lazy) DebitCardDetailActivity.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(currentItem), iconCompatParcelizer.read);
            WrapContentViewPager wrapContentViewPager = DebitCardDetailActivity.this.vpContent;
            wrapContentViewPager.IconCompatParcelizer = iconCompatParcelizer.read;
            wrapContentViewPager.requestLayout();
        }
    };
    @BindView
    View accountErrorView;
    @BindView
    CustomTabLayout debitTabLayout;
    @BindView
    ImageView imgIconAccount;
    @BindView
    CircleIndicator indicator;
    @BindView
    NestedScrollView scrollView;
    private DebitCardServiceTabFragment setHasDecor;
    @BindView
    TextView tvAccountNumber;
    @BindView
    TextView tvBalanceLabel;
    @BindView
    TextView tvBalanceValue;
    @BindView
    ViewPager vpCardView;
    @BindView
    WrapContentViewPager vpContent;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, DebitCardDetailActivity.class);
    }

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, DebitCardDetailActivity.class).addFlags(603979776);
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof DebitCardTransactionTabFragment) {
            this.Keep = (DebitCardTransactionTabFragment) fragment;
        } else if (fragment instanceof DebitCardRewardTabFragment) {
            this.AlertController$RecycleListView = (DebitCardRewardTabFragment) fragment;
        } else if (fragment instanceof DebitCardServiceTabFragment) {
            DebitCardServiceTabFragment debitCardServiceTabFragment = (DebitCardServiceTabFragment) fragment;
            this.setHasDecor = debitCardServiceTabFragment;
            debitCardServiceTabFragment.MediaBrowserCompat$CustomActionResultReceiver = this;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77252131492950);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.debit_card_title);
        setTabContainer();
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debit_atm_card_detail");
        this.MediaBrowserCompat$MediaItem.write(this);
        this.MediaBrowserCompat$MediaItem.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<Lazy> list) {
        DebitCardDetailAdapter debitCardDetailAdapter = this.MediaMetadataCompat;
        debitCardDetailAdapter.MediaBrowserCompat$CustomActionResultReceiver = list;
        debitCardDetailAdapter.notifyDataSetChanged();
    }

    public final void write(String str) {
        TextView textView = this.tvBalanceValue;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(getString(R.string.prepaid_baht));
        textView.setText(sb.toString());
        this.tvBalanceValue.setVisibility(0);
        this.tvBalanceLabel.setVisibility(0);
        this.imgIconAccount.setVisibility(0);
        this.accountErrorView.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str) {
        this.tvAccountNumber.setVisibility(0);
        this.tvAccountNumber.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(Lazy lazy) {
        DebitCardTransactionTabFragment debitCardTransactionTabFragment = this.Keep;
        if (debitCardTransactionTabFragment != null) {
            String str = lazy.read;
            String str2 = lazy.MediaBrowserCompat$MediaItem;
            debitCardTransactionTabFragment.MediaBrowserCompat$SearchResultReceiver = str2;
            debitCardTransactionTabFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(str, str2);
        }
    }

    public final void write(Lazy lazy) {
        DebitCardRewardTabFragment debitCardRewardTabFragment = this.AlertController$RecycleListView;
        if (debitCardRewardTabFragment != null) {
            debitCardRewardTabFragment.MediaBrowserCompat$CustomActionResultReceiver = this.MediaSessionCompat$ResultReceiverWrapper;
            dispose dispose = debitCardRewardTabFragment.tabDebitCardPointPresenter;
            boolean z = true;
            if (lazy.AlertController$RecycleListView == 0) {
                NotFoundException notFoundException = new NotFoundException(lazy);
                if (dispose.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    notFoundException.IconCompatParcelizer(dispose.RatingCompat);
                }
            } else if (lazy.f2750x50fd9e4a != null || lazy.MediaBrowserCompat$SearchResultReceiver == null) {
                setTorchOn settorchon = setTorchOn.IconCompatParcelizer;
                if (dispose.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    settorchon.IconCompatParcelizer(dispose.RatingCompat);
                }
            } else if (lazy.MediaBrowserCompat$SearchResultReceiver == null || "0".equalsIgnoreCase(lazy.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer)) {
                MalformedJsonException malformedJsonException = new MalformedJsonException(lazy);
                if (dispose.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    malformedJsonException.IconCompatParcelizer(dispose.RatingCompat);
                }
            } else {
                setViewRotation setviewrotation = new setViewRotation(lazy);
                if (dispose.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setviewrotation.IconCompatParcelizer(dispose.RatingCompat);
                }
            }
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debit_atm_card_point");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Lazy lazy) {
        DebitCardServiceTabFragment debitCardServiceTabFragment = this.setHasDecor;
        if (debitCardServiceTabFragment != null) {
            debitCardServiceTabFragment.IconCompatParcelizer = lazy;
            debitCardServiceTabFragment.tabDebitCardServicePresenter.write = lazy;
            getStringValues getstringvalues = debitCardServiceTabFragment.tabDebitCardServicePresenter;
            String[] strArr = debitCardServiceTabFragment.IconCompatParcelizer.IconCompatParcelizer;
            boolean z = true;
            setDecoderFactory setdecoderfactory = new setDecoderFactory(getstringvalues, strArr != null && (Arrays.asList(strArr).contains("CARD_LOCK") || Arrays.asList(strArr).contains("CARD_UNLOCK")), strArr);
            if (getstringvalues.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setdecoderfactory.IconCompatParcelizer(getstringvalues.RatingCompat);
            }
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debit_atm_card_service");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.indicator.setVisibility(8);
    }

    public final void read() {
        Intent IconCompatParcelizer = DebitCardCoachMarkActivity.IconCompatParcelizer(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        this.tvBalanceLabel.setVisibility(8);
        this.tvBalanceValue.setVisibility(8);
        this.tvAccountNumber.setVisibility(8);
        this.imgIconAccount.setVisibility(8);
        this.accountErrorView.setVisibility(0);
    }

    public final void MediaSessionCompat$Token() {
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_LOCK_CARD_REFRESH");
        sendBroadcast(intent);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_LOCK_CARD_REFRESH");
        sendBroadcast(intent);
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        if (i >= i2 && this.vpContent.getCurrentItem() == 0 && i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250 && this.vpContent.getCurrentItem() == 0) {
            int currentItem = this.vpCardView.getCurrentItem();
            DebitCardTransactionTabFragment debitCardTransactionTabFragment = this.Keep;
            debitCardTransactionTabFragment.MediaBrowserCompat$CustomActionResultReceiver.read(((Lazy) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(currentItem)).MediaBrowserCompat$MediaItem);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14174x50fd9e4a() {
        if (this.MediaMetadataCompat.getCount() > 0) {
            this.MediaBrowserCompat$MediaItem.read((Lazy) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(0), 0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            this.MediaBrowserCompat$MediaItem.write();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.scrollView.setVisibility(0);
    }

    public final void IconCompatParcelizer(CrashlyticsRegistrar$$Lambda$1 crashlyticsRegistrar$$Lambda$1) {
        this.MediaBrowserCompat$MediaItem.read(crashlyticsRegistrar$$Lambda$1.MediaBrowserCompat$ItemReceiver);
        this.MediaSessionCompat$ResultReceiverWrapper = crashlyticsRegistrar$$Lambda$1.read;
        this.MediaMetadataCompat = new DebitCardDetailAdapter(crashlyticsRegistrar$$Lambda$1.IconCompatParcelizer);
        List<Lazy> list = crashlyticsRegistrar$$Lambda$1.MediaBrowserCompat$ItemReceiver;
        DebitCardDetailAdapter debitCardDetailAdapter = this.MediaMetadataCompat;
        debitCardDetailAdapter.MediaBrowserCompat$CustomActionResultReceiver = list;
        debitCardDetailAdapter.notifyDataSetChanged();
        this.vpCardView.setAdapter(this.MediaMetadataCompat);
        this.vpCardView.addOnPageChangeListener(this.MediaDescriptionCompat);
        this.vpCardView.setClipToPadding(false);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (((float) displayMetrics.widthPixels) * 0.06f);
        this.vpCardView.setPadding(i, 0, i, 0);
        this.vpCardView.setOffscreenPageLimit(1);
        this.vpCardView.setCurrentItem(0);
        this.scrollView.setOnScrollChangeListener(this);
        this.vpContent.setAdapter(new validateAddress(getSupportFragmentManager(), this));
        this.vpContent.setOffscreenPageLimit(2);
        this.debitTabLayout.setupWithViewPager(this.vpContent);
        this.debitTabLayout.addOnTabSelectedListener(this.MediaSessionCompat$Token);
        this.indicator.setViewPager(this.vpCardView);
    }
}
