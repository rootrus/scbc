package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.BarcodeReaderEngineManager;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DetectionModule;
import p040o.DetectionModule_GetFaceDetectorFactory;
import p040o.DetectionModule_GetForcedDocumentDetectorFactory;
import p040o.DocumentDetector_Factory;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.JuristicService;
import p040o.getClassId;
import p040o.getPercentAverageImageBrightness;
import p040o.nativeHeight;
import p040o.newForcedGpuDocumentDetector;
import p040o.proxyGetForcedDocumentDetector;
import p040o.updateNTBContactInfo;
import p040o.validateOta;

public class TakePhotoFragment extends BaseTakePhotoFragment implements getPercentAverageImageBrightness {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$MediaItem;
    @BindView
    TextView infoNoPhoto;
    @BindView
    LinearLayout linearAttached;
    @BindView
    LinearLayout linearAttaching;
    @BindView
    LinearLayout linearNoAttached;
    @BindView
    DefaultButton retakeButton;
    @HmlPinActivity
    public getClassId takePhotoPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90062131494233, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.takePhotoPresenter.MediaBrowserCompat$ItemReceiver(this);
        getClassId getclassid = this.takePhotoPresenter;
        DetectionModule_GetFaceDetectorFactory detectionModule_GetFaceDetectorFactory = DetectionModule_GetFaceDetectorFactory.MediaBrowserCompat$ItemReceiver;
        if (getclassid.RatingCompat != null) {
            z = true;
        }
        if (z) {
            detectionModule_GetFaceDetectorFactory.IconCompatParcelizer(getclassid.RatingCompat);
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.takePhotoPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = 0;
        this.infoNoPhoto.setVisibility(z ? 0 : 8);
        this.linearAttaching.setVisibility(z2 ? 0 : 8);
        this.linearAttached.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout = this.linearNoAttached;
        if (!z4) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    @OnClick
    public void onRetakePhotoClick() {
        getClassId getclassid = this.takePhotoPresenter;
        newForcedGpuDocumentDetector newforcedgpudocumentdetector = newForcedGpuDocumentDetector.MediaBrowserCompat$ItemReceiver;
        if (getclassid.RatingCompat != null) {
            newforcedgpudocumentdetector.IconCompatParcelizer(getclassid.RatingCompat);
        }
    }

    public final void write(boolean z) {
        if (z) {
            this.retakeButton.setText(getString(R.string.easycash_referral_product_retake_photo));
        } else {
            this.retakeButton.setText(getString(R.string.easycash_referral_product_take_photo));
        }
    }

    public final void IconCompatParcelizer(String str) {
        TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver takePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$MediaItem;
        if (takePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            takePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver.write(str);
        }
    }

    public final void read(String str, int i) {
        this.IconCompatParcelizer = FragmentBuilder_BindDepositSelectorFragment.write(str, i).write(new updateNTBContactInfo(this.takePhotoPresenter), new validateOta(this.takePhotoPresenter));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        getClassId getclassid = this.takePhotoPresenter;
        DocumentDetector_Factory documentDetector_Factory = DocumentDetector_Factory.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (getclassid.RatingCompat != null) {
            documentDetector_Factory.IconCompatParcelizer(getclassid.RatingCompat);
        }
        if (i != 10003) {
            return;
        }
        if (i2 == -1 && getContext() != null) {
            write();
        } else if (i2 == 0) {
            getClassId getclassid2 = this.takePhotoPresenter;
            nativeHeight nativeheight = nativeHeight.read;
            if (getclassid2.RatingCompat != null) {
                nativeheight.IconCompatParcelizer(getclassid2.RatingCompat);
            }
            if (getclassid2.MediaBrowserCompat$ItemReceiver) {
                BarcodeReaderEngineManager barcodeReaderEngineManager = BarcodeReaderEngineManager.MediaBrowserCompat$ItemReceiver;
                if (getclassid2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    barcodeReaderEngineManager.IconCompatParcelizer(getclassid2.RatingCompat);
                    return;
                }
                return;
            }
            proxyGetForcedDocumentDetector proxygetforceddocumentdetector = proxyGetForcedDocumentDetector.MediaBrowserCompat$ItemReceiver;
            if (getclassid2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                proxygetforceddocumentdetector.IconCompatParcelizer(getclassid2.RatingCompat);
            }
        } else {
            getClassId getclassid3 = this.takePhotoPresenter;
            getclassid3.MediaBrowserCompat$ItemReceiver = false;
            DetectionModule_GetForcedDocumentDetectorFactory detectionModule_GetForcedDocumentDetectorFactory = DetectionModule_GetForcedDocumentDetectorFactory.read;
            if (getclassid3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                detectionModule_GetForcedDocumentDetectorFactory.IconCompatParcelizer(getclassid3.RatingCompat);
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$MediaItem = (TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver) context;
        } else if (getParentFragment() instanceof TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$MediaItem = (TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver) getParentFragment();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            write();
        }
    }

    private void write() {
        boolean z = true;
        if (!TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                int i = point.x;
                int i2 = point.y;
                getClassId getclassid = this.takePhotoPresenter;
                DetectionModule detectionModule = new DetectionModule(this.MediaBrowserCompat$CustomActionResultReceiver, Math.min(i, i2));
                if (getclassid.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    detectionModule.IconCompatParcelizer(getclassid.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        getClassId getclassid2 = this.takePhotoPresenter;
        getclassid2.MediaBrowserCompat$ItemReceiver = false;
        DetectionModule_GetForcedDocumentDetectorFactory detectionModule_GetForcedDocumentDetectorFactory = DetectionModule_GetForcedDocumentDetectorFactory.read;
        if (getclassid2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            detectionModule_GetForcedDocumentDetectorFactory.IconCompatParcelizer(getclassid2.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        JuristicService.MediaBrowserCompat$ItemReceiver(this);
    }
}
