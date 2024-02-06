package com.scb.phone.view.activity.additionaldocument;

import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import java.io.File;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;

public class ZoomDocumentActivity extends BaseActivity {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    @BindView
    public ImgReviewEditCntrl imageReview;

    @OnClick
    public final void onDoneClicked() {
        finish();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80262131493251);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("IMAGE_PATH_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(IMAGE_PATH_TAG)");
        onGetStartedClick.write((Object) stringExtra, "path");
        ImgReviewEditCntrl imgReviewEditCntrl = this.imageReview;
        if (imgReviewEditCntrl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        imgReviewEditCntrl.setImage(new Image(new File(stringExtra), FragmentBuilder_BindDepositSelectorFragment.RatingCompat(stringExtra)));
    }

    public void onDestroy() {
        super.onDestroy();
        ImgReviewEditCntrl imgReviewEditCntrl = this.imageReview;
        if (imgReviewEditCntrl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        if (imgReviewEditCntrl.getImage() != null) {
            ImgReviewEditCntrl imgReviewEditCntrl2 = this.imageReview;
            if (imgReviewEditCntrl2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
            }
            imgReviewEditCntrl2.getImage().imageClearBitmap();
            ImgReviewEditCntrl imgReviewEditCntrl3 = this.imageReview;
            if (imgReviewEditCntrl3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
            }
            imgReviewEditCntrl3.clearImage();
        }
    }
}
