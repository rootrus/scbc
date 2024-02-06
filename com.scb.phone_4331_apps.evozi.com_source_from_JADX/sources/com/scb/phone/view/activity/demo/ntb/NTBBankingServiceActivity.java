package com.scb.phone.view.activity.demo.ntb;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.DraggableFloatingActionButton;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import p040o.C4041ao;
import p040o.C6498x19dfc59c;
import p040o.C7288oS;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.IdParameters;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getOversizeImage;
import p040o.nContextSetPriority;

public class NTBBankingServiceActivity extends BaseActivity implements IdParameters.IdState.write, ViewTreeObserver.OnGlobalLayoutListener {
    private int MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private int MediaMetadataCompat;
    @BindView
    FrameLayout mRootView;
    @BindView
    protected DraggableFloatingActionButton ntbButton;
    @BindView
    ImageView tutorialImageView;
    @BindView
    FrameLayout tutorialView;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79062131493131);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("ntb_banking");
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onBackPressed() {
        if (this.tutorialView.getVisibility() == 0) {
            this.tutorialView.setVisibility(8);
        } else {
            super.onBackPressed();
        }
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.MediaBrowserCompat$SearchResultReceiver = this.mRootView.getWidth();
        this.MediaMetadataCompat = this.mRootView.getHeight();
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            IconCompatParcelizer(str);
        }
    }

    public final void IconCompatParcelizer(String str) {
        if (this.MediaBrowserCompat$SearchResultReceiver == 0 || this.MediaMetadataCompat == 0) {
            this.MediaDescriptionCompat = str;
            return;
        }
        this.tutorialImageView.setOnClickListener(new C4041ao.C4043a(this));
        AlertController$RecycleListView();
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (config != null) {
            read.write = config;
            int i = (int) (((float) this.MediaMetadataCompat) * 0.7f);
            write.MediaBrowserCompat$CustomActionResultReceiver.read((int) (((float) this.MediaBrowserCompat$SearchResultReceiver) * 0.7f), i);
            write.read(this.tutorialImageView, new FragmentBuilder_BindEkycFragment() {
                public final void MediaBrowserCompat$ItemReceiver() {
                    NTBBankingServiceActivity.this.aj_();
                    NTBBankingServiceActivity.this.tutorialView.setVisibility(0);
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                    NTBBankingServiceActivity.this.aj_();
                    NTBBankingServiceActivity.this.tutorialView.setVisibility(8);
                    NTBBankingServiceActivity nTBBankingServiceActivity = NTBBankingServiceActivity.this;
                    nTBBankingServiceActivity.write(nTBBankingServiceActivity, R.id.view_group_root, nTBBankingServiceActivity.getString(R.string.ntb_lifestyle_content_is_unavailable), getOversizeImage.ERROR);
                }
            });
            this.MediaDescriptionCompat = null;
            return;
        }
        throw new IllegalArgumentException("config == null");
    }

    public /* synthetic */ void lambda$showCoachMark$0$NTBBankingServiceActivity(View view) {
        this.tutorialView.setVisibility(8);
    }

    public final void write(String str) {
        if (this.ntbButton != null) {
            Picasso.read().write(str).read(this.ntbButton, (FragmentBuilder_BindEkycFragment) null);
            this.ntbButton.setBackgroundTintList(ColorStateList.valueOf(0));
            DraggableFloatingActionButton draggableFloatingActionButton = this.ntbButton;
            if (draggableFloatingActionButton.IconCompatParcelizer == null) {
                draggableFloatingActionButton.IconCompatParcelizer = draggableFloatingActionButton.write();
            }
            draggableFloatingActionButton.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((nContextSetPriority.IconCompatParcelizer) null, true);
            this.ntbButton.setOnClickListener(new C7288oS(this));
        }
    }

    public /* synthetic */ void lambda$showFloatingButton$1$NTBBankingServiceActivity(View view) {
        WeakReference<BaseActivity> weakReference = new WeakReference<>(this);
        C6498x19dfc59c fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver = new C6498x19dfc59c((byte) 0);
        fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.write = weakReference;
        fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA");
        FragmentBuilder_BindDepositMoreInfoFragment.read(fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver);
    }
}
