package com.scb.phone.presentation.presenter.emailverification;

import android.text.TextUtils;
import com.scb.phone.domain.interactor.emailverification.UpdateEmailUseCase;
import okhttp3.internal.cache.DiskLruCache;
import p040o.HmlPinActivity;
import p040o.PhenotypeFlag;
import p040o.QuickAnalysisSettings;
import p040o.RegularImmutableBiMap;
import p040o.getBlurCountPercentThreshold;
import p040o.getBlurDetection;
import p040o.getBlurThreshold;
import p040o.getContours;
import p040o.getEulerY;
import p040o.getGlareDetection;
import p040o.getRestrictiveEndorsementPresent;
import p040o.setGlareDetected;
import p040o.setGlareDetectionIntensityFraction;
import p040o.setMissingBorder;
import p040o.setMissingBordersDetection;
import p040o.setOverlySkewed;
import p040o.setViewBoundariesImage;
import p040o.writeUInt64NoTag;
import p040o.zzbc;

public class ManageEmailInputPresenter extends writeUInt64NoTag<getRestrictiveEndorsementPresent> {
    public String MediaBrowserCompat$ItemReceiver;
    @HmlPinActivity
    public getEulerY getUserProfileUseCase;
    public String read;
    @HmlPinActivity
    public getContours updateEmailLocallyUseCase;
    @HmlPinActivity
    public UpdateEmailUseCase updateEmailUseCase;
    @HmlPinActivity
    public PhenotypeFlag.zza validateEmailUseCase;

    @HmlPinActivity
    public ManageEmailInputPresenter(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final void IconCompatParcelizer() {
        boolean z = true;
        if (this.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView() == null || this.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaDescriptionCompat == null || this.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaDescriptionCompat.isEmpty()) {
            setGlareDetected setglaredetected = setGlareDetected.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setglaredetected.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = this.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaDescriptionCompat;
        setViewBoundariesImage setviewboundariesimage = setViewBoundariesImage.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setviewboundariesimage.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = true;
        if (!TextUtils.isEmpty(this.read) || TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver)) {
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            UpdateEmailUseCase updateEmailUseCase2 = this.updateEmailUseCase;
            updateEmailUseCase2.read(updateEmailUseCase2.read(this.read), new getGlareDetection(this), new getBlurDetection(this));
            return;
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        UpdateEmailUseCase updateEmailUseCase3 = this.updateEmailUseCase;
        updateEmailUseCase3.read(updateEmailUseCase3.read(), new QuickAnalysisSettings(this), new getBlurDetection(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean z = true;
        if (TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver)) {
            setMissingBorder setmissingborder = setMissingBorder.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setmissingborder.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (!this.MediaBrowserCompat$ItemReceiver.equalsIgnoreCase(this.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaDescriptionCompat) || !this.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(DiskLruCache.VERSION_1)) {
            setMissingBordersDetection setmissingbordersdetection = setMissingBordersDetection.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setmissingbordersdetection.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            setMissingBorder setmissingborder2 = setMissingBorder.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setmissingborder2.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ManageEmailInputPresenter manageEmailInputPresenter, Boolean bool) {
        boolean z = true;
        if (manageEmailInputPresenter.RatingCompat != null) {
            manageEmailInputPresenter.RatingCompat.aj_();
        }
        if (bool.booleanValue()) {
            manageEmailInputPresenter.updateEmailLocallyUseCase.MediaBrowserCompat$ItemReceiver(manageEmailInputPresenter.read, "0", "0");
            setGlareDetectionIntensityFraction setglaredetectionintensityfraction = setGlareDetectionIntensityFraction.read;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setglaredetectionintensityfraction.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
            }
        }
    }

    public static /* synthetic */ void read(ManageEmailInputPresenter manageEmailInputPresenter, zzbc.zzf zzf) {
        boolean z = true;
        if (manageEmailInputPresenter.RatingCompat != null) {
            manageEmailInputPresenter.RatingCompat.aj_();
        }
        getContours getcontours = manageEmailInputPresenter.updateEmailLocallyUseCase;
        String str = manageEmailInputPresenter.read;
        getcontours.MediaBrowserCompat$ItemReceiver(str, "0", TextUtils.isEmpty(str) ? "0" : null);
        if (TextUtils.isEmpty(manageEmailInputPresenter.read)) {
            setGlareDetectionIntensityFraction setglaredetectionintensityfraction = setGlareDetectionIntensityFraction.read;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setglaredetectionintensityfraction.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
                return;
            }
            return;
        }
        getBlurCountPercentThreshold getblurcountpercentthreshold = new getBlurCountPercentThreshold(zzf);
        if (manageEmailInputPresenter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getblurcountpercentthreshold.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
        }
    }

    public static /* synthetic */ void write(ManageEmailInputPresenter manageEmailInputPresenter, Throwable th) {
        boolean z = true;
        if (manageEmailInputPresenter.RatingCompat != null) {
            manageEmailInputPresenter.RatingCompat.aj_();
        }
        if (th instanceof UpdateEmailUseCase.Error1047) {
            setMissingBordersDetection setmissingbordersdetection = setMissingBordersDetection.read;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setmissingbordersdetection.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
            }
        } else if (th instanceof UpdateEmailUseCase.Error3000) {
            getBlurThreshold getblurthreshold = new getBlurThreshold(manageEmailInputPresenter);
            if (manageEmailInputPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getblurthreshold.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
            }
        } else {
            setOverlySkewed setoverlyskewed = new setOverlySkewed(manageEmailInputPresenter, th);
            if (manageEmailInputPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setoverlyskewed.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
            }
        }
    }
}
