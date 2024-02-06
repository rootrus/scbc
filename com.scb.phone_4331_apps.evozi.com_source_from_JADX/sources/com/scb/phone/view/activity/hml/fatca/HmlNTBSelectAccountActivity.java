package com.scb.phone.view.activity.hml.fatca;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.account.C6011xf9bd9c67;
import com.scb.phone.view.fragment.hml.account.HmlSelectAccountFragment;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.onGetStartedClick;

public final class HmlNTBSelectAccountActivity extends BaseActivityWithFragment implements FragmentBuilder_BindChangeChannelStatementReviewFragment.read {
    public final /* synthetic */ void IconCompatParcelizer(String str) {
    }

    public final /* synthetic */ void an_() {
    }

    public final /* synthetic */ void ao_() {
    }

    public final /* synthetic */ void ap_() {
    }

    /* renamed from: m_ */
    public final /* synthetic */ void mo34015m_(String str) {
    }

    public final String au_() {
        String string = getString(R.string.select_account_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.select_account_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        C6011xf9bd9c67 hmlSelectAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlSelectAccountFragment.IconCompatParcelizer;
        return new HmlSelectAccountFragment();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof HmlSelectAccountFragment) {
            HmlSelectAccountFragment hmlSelectAccountFragment = (HmlSelectAccountFragment) findFragmentById;
            if (hmlSelectAccountFragment.getChildFragmentManager().write() == 0) {
                hmlSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
                return true;
            }
            hmlSelectAccountFragment.getChildFragmentManager().RatingCompat();
            hmlSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver.ao_();
            return true;
        }
        super.onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof HmlSelectAccountFragment) {
            HmlSelectAccountFragment hmlSelectAccountFragment = (HmlSelectAccountFragment) findFragmentById;
            if (hmlSelectAccountFragment.getChildFragmentManager().write() == 0) {
                hmlSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
                return;
            }
            hmlSelectAccountFragment.getChildFragmentManager().RatingCompat();
            hmlSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver.ao_();
            return;
        }
        super.onBackPressed();
    }
}
