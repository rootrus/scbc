package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.sme.gifting.GiftTutorialViewPagerAdapter;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C4734hU;
import p040o.C4738hY;
import p040o.C6398x266504ee;
import p040o.CrashlyticsReport;
import p040o.DateFormatTitleFormatter;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.calculatePurposefulLoan;
import p040o.setInstructionMsg;
import p040o.setTapText;
import p040o.showTextMessage;
import p059me.relex.circleindicator.CircleIndicator;

public class GiftSelectionActivity extends BaseActivity implements C6398x266504ee, ViewTreeObserver.OnGlobalLayoutListener, ViewPager.MediaMetadataCompat {
    @BindView
    ImageView blurBackgroundImageView;
    @HmlPinActivity
    public showTextMessage giftSelectionPresenter;
    @BindView
    LinearLayout giftTutorialContainer;
    @BindView
    CircleIndicator giftTutorialIndicator;
    @BindView
    ViewPager giftTutorialViewPager;
    @BindView
    RelativeLayout rootView;
    @BindView
    CustomTabLayout tabLayout;
    @BindView
    ViewPager viewPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78132131493038);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.giftSelectionPresenter.MediaBrowserCompat$ItemReceiver(this);
        showTextMessage showtextmessage = this.giftSelectionPresenter;
        if (showtextmessage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat()) {
            if (showtextmessage.RatingCompat != null) {
                showtextmessage.RatingCompat.AlertController$RecycleListView();
            }
            showtextmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            showtextmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new showTextMessage.IconCompatParcelizer(showtextmessage, (byte) 0));
        }
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gifts_selection_title));
        mo13676d_("gifts_present_landing");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gifts_selection_title));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93012131558404, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.gift_selection_icon) {
            Intent intent = new Intent(this, GiftingActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list, List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list2) {
        this.viewPager.setAdapter(new calculatePurposefulLoan(this, getSupportFragmentManager(), list, list2));
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.viewPager.addOnPageChangeListener(this);
    }

    public void onGlobalLayout() {
        boolean z;
        this.rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        showTextMessage showtextmessage = this.giftSelectionPresenter;
        boolean z2 = true;
        if (!showtextmessage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat()) {
            showtextmessage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.AppCompatActivity();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (showtextmessage.RatingCompat != null) {
                C4738hY hYVar = new C4738hY(showtextmessage);
                if (showtextmessage.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    hYVar.IconCompatParcelizer(showtextmessage.RatingCompat);
                }
            }
        }
    }

    public final void write(List<CrashlyticsReport.CustomAttribute> list) {
        FragmentBuilder_BindDepositSelectorFragment.write((Context) this, this.rootView, this.blurBackgroundImageView);
        this.giftTutorialViewPager.setAdapter(new GiftTutorialViewPagerAdapter(this, list, new DateFormatTitleFormatter(this)));
        this.giftTutorialIndicator.setViewPager(this.giftTutorialViewPager);
        this.giftTutorialContainer.setVisibility(0);
    }

    public /* synthetic */ void lambda$setTutorial$0$GiftSelectionActivity(View view) {
        showTextMessage showtextmessage = this.giftSelectionPresenter;
        int currentItem = this.giftTutorialViewPager.getCurrentItem();
        int count = this.giftTutorialViewPager.getAdapter().getCount();
        boolean z = true;
        int i = currentItem + 1;
        if (!(showtextmessage.RatingCompat != null)) {
            return;
        }
        if (i < count) {
            C4734hU hUVar = new C4734hU(i);
            if (showtextmessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hUVar.IconCompatParcelizer(showtextmessage.RatingCompat);
                return;
            }
            return;
        }
        setInstructionMsg setinstructionmsg = setInstructionMsg.read;
        if (showtextmessage.RatingCompat != null) {
            setinstructionmsg.IconCompatParcelizer(showtextmessage.RatingCompat);
        }
        if (showtextmessage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            showtextmessage.RatingCompat.AlertController$RecycleListView();
        }
        showtextmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        showtextmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new showTextMessage.IconCompatParcelizer(showtextmessage, (byte) 0));
    }

    @OnClick
    public void onCloseTutorial() {
        showTextMessage showtextmessage = this.giftSelectionPresenter;
        boolean z = true;
        if (showtextmessage.RatingCompat != null) {
            setInstructionMsg setinstructionmsg = setInstructionMsg.read;
            if (showtextmessage.RatingCompat != null) {
                setinstructionmsg.IconCompatParcelizer(showtextmessage.RatingCompat);
            }
        }
        if (showtextmessage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            showtextmessage.RatingCompat.AlertController$RecycleListView();
        }
        showtextmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        showtextmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new showTextMessage.IconCompatParcelizer(showtextmessage, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.rootView.removeView(this.giftTutorialContainer);
        this.rootView.removeView(this.blurBackgroundImageView);
    }

    public final void read(int i) {
        this.giftTutorialViewPager.setCurrentItem(i);
    }

    public final void read() {
        RatingCompat(false);
    }

    public void onPageSelected(int i) {
        if (i == 0) {
            mo13676d_("gifts_present_landing");
        } else if (i == 1) {
            mo13676d_("gifts_money_landing");
        }
    }
}
