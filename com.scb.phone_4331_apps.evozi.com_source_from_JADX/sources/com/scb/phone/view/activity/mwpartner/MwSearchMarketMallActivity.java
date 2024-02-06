package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.chequemanagement.C5579x61d4c5a4;
import com.scb.phone.view.adapter.mwpartner.MwMarketMallSearchAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.CalendarMode;
import p040o.CameraSource;
import p040o.CharMatcher;
import p040o.CustomCheckboxView_ViewBinding;
import p040o.CustomDoubleCircleBorderView;
import p040o.CustomExternalSelector;
import p040o.CustomProfileImageView;
import p040o.CustomProfileImageView_ViewBinding;
import p040o.Group;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.TaskRunner;
import p040o.access$2300;
import p040o.getProject$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.isInRange;
import p040o.setBorderWidth;
import p040o.setFilledIconRes;
import p040o.setIconTop;
import p040o.setImageUrl;
import p040o.setLinkText;

public class MwSearchMarketMallActivity extends BaseActivity implements getProject$MediaBrowserCompat$CustomActionResultReceiver, MwMarketMallSearchAdapter.read {
    private CustomDoubleCircleBorderView MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public MwMarketMallSearchAdapter MediaBrowserCompat$SearchResultReceiver;
    public List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> MediaDescriptionCompat;
    @HmlPinActivity
    public TaskRunner.C3841a presenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    ImageButton searchClearButton;
    @BindView
    EditText searchEditText;

    public static Intent write(Context context) {
        return new Intent(context, MwSearchMarketMallActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78942131493119);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_shop_address_title);
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        TaskRunner.C3841a aVar = this.presenter;
        if (aVar.RatingCompat != null) {
            aVar.RatingCompat.AlertController$RecycleListView();
        }
        CharMatcher.LookupTable lookupTable = aVar.MediaBrowserCompat$ItemReceiver;
        lookupTable.write(lookupTable.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver("DepartmentType", (String) null), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<C5579x61d4c5a4>() {
            public final /* synthetic */ void onNext(Object obj) {
                C5579x61d4c5a4 chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver = (C5579x61d4c5a4) obj;
                super.onNext(chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver);
                UnmodifiableIterator read2 = C3841a.this.read;
                onGetStartedClick.write((Object) chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver, "merchantCategory");
                AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder(read2.read(chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver.write));
                C3841a aVar = C3841a.this;
                getFieldname getfieldname = new getFieldname(crashlyticsReportSessionApplicationOrganizationEncoder);
                if (aVar.RatingCompat != null) {
                    getfieldname.IconCompatParcelizer(aVar.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                C3841a.this.MediaBrowserCompat$ItemReceiver(C3841a.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                C3841a aVar = C3841a.this;
                C4092bc bcVar = C4092bc.MediaBrowserCompat$CustomActionResultReceiver;
                if (aVar.RatingCompat != null) {
                    bcVar.IconCompatParcelizer(aVar.RatingCompat);
                }
            }

            public final void onComplete() {
                super.onComplete();
                C3841a.IconCompatParcelizer(C3841a.this);
            }
        });
        MwMarketMallSearchAdapter mwMarketMallSearchAdapter = new MwMarketMallSearchAdapter(new ArrayList());
        this.MediaBrowserCompat$SearchResultReceiver = mwMarketMallSearchAdapter;
        mwMarketMallSearchAdapter.write = this;
        this.recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new Group(getBaseContext()));
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        EditText editText = this.searchEditText;
        setIconTop IconCompatParcelizer2 = setIconTop.IconCompatParcelizer();
        editText.addTextChangedListener(new TextWatcher(IconCompatParcelizer2) {
            private /* synthetic */ setIconTop MediaBrowserCompat$CustomActionResultReceiver;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(charSequence.toString());
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    MwMarketMallSearchAdapter write2 = MwSearchMarketMallActivity.this.MediaBrowserCompat$SearchResultReceiver;
                    write2.read.clear();
                    write2.IconCompatParcelizer.write();
                    MwSearchMarketMallActivity.this.searchClearButton.setVisibility(8);
                    return;
                }
                MwSearchMarketMallActivity.this.searchClearButton.setVisibility(0);
            }
        });
        this.MediaBrowserCompat$MediaItem = CameraSource.CameraSourceException.read(new CustomProfileImageView(new isInRange(this), setImageUrl.ERROR_NOT_IMPLEMENTED, setBorderWidth.read()), new CameraSource.CameraSourceException(new CustomExternalSelector(IconCompatParcelizer2.IconCompatParcelizer(500, TimeUnit.MILLISECONDS, setLinkText.IconCompatParcelizer()).MediaBrowserCompat$ItemReceiver, new setFilledIconRes(CalendarMode.write))).MediaBrowserCompat$ItemReceiver(setLinkText.write()).IconCompatParcelizer(CustomCheckboxView_ViewBinding.write(), CustomProfileImageView_ViewBinding.IconCompatParcelizer));
    }

    @OnClick
    public void clearButtonClick() {
        this.searchEditText.setText("");
        MwMarketMallSearchAdapter mwMarketMallSearchAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        mwMarketMallSearchAdapter.read.clear();
        mwMarketMallSearchAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder) {
        Intent intent = new Intent();
        intent.putExtra("MARKET_MALL_DISPLAY", crashlyticsReportFilesPayloadEncoder);
        setResult(-1, intent);
        finish();
    }

    public final void write(List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> list) {
        this.MediaDescriptionCompat = list;
    }

    public final void MediaBrowserCompat$ItemReceiver(List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> list) {
        MwMarketMallSearchAdapter mwMarketMallSearchAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        mwMarketMallSearchAdapter.read.clear();
        mwMarketMallSearchAdapter.read.addAll(list);
        mwMarketMallSearchAdapter.IconCompatParcelizer.write();
    }

    public class IconCompatParcelizer {
        public IconCompatParcelizer() {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$MediaItem.write();
    }
}
