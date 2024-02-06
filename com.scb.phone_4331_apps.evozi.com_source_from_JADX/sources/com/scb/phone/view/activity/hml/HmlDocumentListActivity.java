package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.additionaldocument.HmlApiBasedDocumentInstructionsActivity;
import com.scb.phone.view.fragment.hml.HmlDocumentListFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import kotlin.TypeCastException;
import p040o.CrashlyticsController;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IBoundingRectCalculator;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setAutoFocusEnabled;
import p040o.setTapText;
import p040o.zzwd;
import p040o.zzwe;

public class HmlDocumentListActivity extends BaseActivityWithFragment implements IBoundingRectCalculator, HmlDocumentListFragment.IconCompatParcelizer {
    public static final write MediaMetadataCompat = new write((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver = "GENERAL_LOAN";
    private final String MediaDescriptionCompat = setAutoFocusEnabled.IconCompatParcelizer.HML.name();
    private boolean MediaSessionCompat$Token;

    public HmlDocumentListActivity() {
        FundActionsSuccessActivity hmlDocumentListActivity$MediaBrowserCompat$CustomActionResultReceiver = new C5603x58d5635c(this);
        onGetStartedClick.write((Object) hmlDocumentListActivity$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(hmlDocumentListActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final String write() {
        return this.MediaDescriptionCompat;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        HmlDocumentListFragment.read read = HmlDocumentListFragment.IconCompatParcelizer;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_DOC_INFO");
        if (parcelableExtra != null) {
            CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) parcelableExtra;
            Parcelable parcelableExtra2 = getIntent().getParcelableExtra("HML_DOC_FILE_VALIDATION_LIMIT");
            if (parcelableExtra2 != null) {
                zzwe.read read2 = (zzwe.read) parcelableExtra2;
                onGetStartedClick.write((Object) fileNameContainsFilter, "hmlSelectedSubmissionDocument");
                onGetStartedClick.write((Object) read2, "limit");
                HmlDocumentListFragment hmlDocumentListFragment = new HmlDocumentListFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("HML_DOC_INFO", fileNameContainsFilter);
                bundle.putParcelable("HML_DOC_FILE_VALIDATION_LIMIT", read2);
                hmlDocumentListFragment.setArguments(bundle);
                return hmlDocumentListFragment;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.HMLDocumentUploads.HMLDocumentValidation");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.submission.HmlSelectedSubmissionDocument");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(((CrashlyticsController.FileNameContainsFilter) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).write);
        Keep keep = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) keep, "mActionBar");
        Keep keep2 = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) keep2, "mActionBar");
        keep.MediaBrowserCompat$ItemReceiver(keep2.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        onGetStartedClick.write((Object) menu, "menu");
        super.onCreateOptionsMenu(menu);
        if (!this.MediaSessionCompat$Token) {
            return true;
        }
        getMenuInflater().inflate(R.menu.f93092131558414, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem == null || 16908332 != menuItem.getItemId()) {
            if (this.MediaSessionCompat$Token) {
                CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) getIntent().getParcelableExtra("HML_DOC_INFO");
                if (fileNameContainsFilter == null || (str = fileNameContainsFilter.IconCompatParcelizer) == null) {
                    str = "";
                }
                HmlApiBasedDocumentInstructionsActivity.IconCompatParcelizer iconCompatParcelizer = HmlApiBasedDocumentInstructionsActivity.MediaBrowserCompat$SearchResultReceiver;
                Intent write2 = HmlApiBasedDocumentInstructionsActivity.IconCompatParcelizer.write(this, false, zzwd.CAMERA, str);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(this, write2).read();
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                    startActivity(read);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaSessionCompat$Token = z;
        invalidateOptionsMenu();
    }

    public final String au_() {
        return ((CrashlyticsController.FileNameContainsFilter) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).write;
    }
}
