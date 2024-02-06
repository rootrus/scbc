package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.adapter.investment.offshorecurrency.CurrencyAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.LevelnessListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachDst;
import p040o.jsonToUserData;
import p040o.newPassportParameters;
import p040o.setTapText;
import p040o.showCropRectangle;
import p040o.showHighlights;
import p040o.userDataToJson;

public class OffshoreCurrencyActivity extends BaseActivity implements newPassportParameters {
    @BindView
    Button buttonTradeNow;
    @HmlPinActivity
    public LevelnessListener presenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    TextView sourceTV;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, jsonToUserData jsontouserdata) {
        Intent intent = new Intent(context, OffshoreCurrencyActivity.class);
        intent.putExtra("EXTRA_DISPLAY", jsontouserdata);
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("scbs_offshore");
        setContentView(R.layout.f79102131493135);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.offshore_stocks);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        LevelnessListener levelnessListener = this.presenter;
        jsonToUserData jsontouserdata = (jsonToUserData) getIntent().getParcelableExtra("EXTRA_DISPLAY");
        levelnessListener.write = jsontouserdata;
        showHighlights showhighlights = new showHighlights(levelnessListener, jsontouserdata);
        if (levelnessListener.RatingCompat != null) {
            showhighlights.IconCompatParcelizer(levelnessListener.RatingCompat);
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        this.recyclerView.setNestedScrollingEnabled(false);
    }

    @OnClick
    public void onClickTrade() {
        forEachDst foreachdst = new forEachDst();
        foreachdst.read("source", "SCBS_offshore_currency");
        foreachdst.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "trade_now");
        LevelnessListener levelnessListener = this.presenter;
        showCropRectangle showcroprectangle = new showCropRectangle(levelnessListener);
        if (levelnessListener.RatingCompat != null) {
            showcroprectangle.IconCompatParcelizer(levelnessListener.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.offshore_stocks);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<userDataToJson> list) {
        this.recyclerView.setAdapter(new CurrencyAdapter(list));
    }

    public final void IconCompatParcelizer(String str) {
        this.sourceTV.setText(str);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.buttonTradeNow.setVisibility(z ? 0 : 8);
    }

    public final void read(String str) {
        Intent MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaBrowserCompat$ItemReceiver(this, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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
}
