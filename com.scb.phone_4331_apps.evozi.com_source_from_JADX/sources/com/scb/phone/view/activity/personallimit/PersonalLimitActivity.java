package com.scb.phone.view.activity.personallimit;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import com.scb.phone.view.fragment.personallimit.PersonalLimitFragment;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.StreetViewSource;
import p040o.dispatchSaveInstanceState;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getLar$MediaBrowserCompat$ItemReceiver;
import p040o.getOversizeImage;
import p040o.getRamSize;
import p040o.getRamSize$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTitleMarginStart;

public class PersonalLimitActivity extends BaseActivity implements OtpPinFragment.write, getLar$MediaBrowserCompat$ItemReceiver, getAdditionalBottomScanLinesHeight {
    private PersonalLimitFragment MediaBrowserCompat$MediaItem;
    private String[] MediaDescriptionCompat = {"LIMIT_TAG", "OTP_MOBILE_LIST_FRAGMENT_TAG", "OTP_PIN_FRAGMENT_TAG"};
    @HmlPinActivity
    public getRamSize changeLimitPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79242131493149);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.limit_title));
        this.changeLimitPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = new PersonalLimitFragment();
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.container, this.MediaBrowserCompat$MediaItem, "LIMIT_TAG");
        read.write();
        getSupportFragmentManager().MediaBrowserCompat$ItemReceiver((setTitleMarginStart.IconCompatParcelizer) new dispatchSaveInstanceState(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    private void write(String str, String str2, String str3, boolean z) {
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        CardView read = supportFragmentManager.read();
        for (String str4 : this.MediaDescriptionCompat) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str4);
            if (findFragmentByTag != null) {
                if (!z || str4.equals("LIMIT_TAG")) {
                    read.MediaBrowserCompat$ItemReceiver(findFragmentByTag);
                } else {
                    supportFragmentManager.RatingCompat();
                    read.write(findFragmentByTag);
                }
            }
        }
        Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(str);
        String str5 = mo3026D_().equalsIgnoreCase("en") ? "FastEasyChangeLimit_EN" : "FastEasyChangeLimit_TH";
        if (findFragmentByTag2 != null) {
            read.IconCompatParcelizer(findFragmentByTag2);
            if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
                OtpPinFragment otpPinFragment = (OtpPinFragment) findFragmentByTag2;
                otpPinFragment.MediaMetadataCompat = str2;
                otpPinFragment.IconCompatParcelizer = str3;
                otpPinFragment.MediaBrowserCompat$CustomActionResultReceiver = str5;
            }
        } else if ("OTP_MOBILE_LIST_FRAGMENT_TAG".equals(str)) {
            read.write(R.id.container, new MobileListFragment(), "OTP_MOBILE_LIST_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG");
        } else if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
            OtpPinFragment otpPinFragment2 = new OtpPinFragment();
            otpPinFragment2.MediaMetadataCompat = str2;
            otpPinFragment2.IconCompatParcelizer = str3;
            otpPinFragment2.MediaBrowserCompat$CustomActionResultReceiver = str5;
            read.write(R.id.container, otpPinFragment2, "OTP_PIN_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_PIN_FRAGMENT_TAG");
        }
        read.write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.limit_title));
    }

    public final void write(String str, String str2) {
        AlertController$RecycleListView();
        getRamSize getramsize = this.changeLimitPresenter;
        StreetViewSource streetViewSource = getramsize.MediaBrowserCompat$ItemReceiver;
        streetViewSource.MediaBrowserCompat$CustomActionResultReceiver(str, str2, streetViewSource.MediaBrowserCompat$ItemReceiver.write());
        getramsize.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getRamSize$MediaBrowserCompat$CustomActionResultReceiver(getramsize, (byte) 0));
    }

    public final void read() {
        aj_();
        write("LIMIT_TAG", (String) null, (String) null, true);
        PersonalLimitFragment personalLimitFragment = this.MediaBrowserCompat$MediaItem;
        getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
        FragmentActivity activity = personalLimitFragment.getActivity();
        if (activity != null) {
            String string = personalLimitFragment.getString(R.string.limit_success_change);
            if (personalLimitFragment.getActivity() != null) {
                ((BaseActivity) personalLimitFragment.getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
            }
        }
        personalLimitFragment.limitPresenter.MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer() {
        aj_();
        write("LIMIT_TAG", (String) null, (String) null, true);
        this.MediaBrowserCompat$MediaItem.limitPresenter.write();
    }

    public final void IconCompatParcelizer(String str) {
        aj_();
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        write(str, str2, str3, false);
    }

    public void onDestroy() {
        this.MediaBrowserCompat$MediaItem.onDestroy();
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r5 = this;
            o.setTitleMarginStart r0 = r5.getSupportFragmentManager()
            r1 = 2131297116(0x7f09035c, float:1.8212168E38)
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            boolean r0 = r0 instanceof com.scb.phone.view.fragment.personallimit.PersonalLimitFragment
            if (r0 == 0) goto L_0x0054
            com.scb.phone.view.fragment.personallimit.PersonalLimitFragment r0 = r5.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x0054
            o.removeAppStatsWriteFileListener r0 = r0.limitPresenter
            java.util.List<o.expandIfNecessary> r1 = r0.IconCompatParcelizer
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0031
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r1.next()
            o.expandIfNecessary r4 = (p040o.expandIfNecessary) r4
            boolean r4 = r4.IconCompatParcelizer
            if (r4 == 0) goto L_0x001f
            r1 = r2
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            if (r1 == 0) goto L_0x0044
            o.aM r1 = p040o.C3975aM.MediaBrowserCompat$CustomActionResultReceiver
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            if (r2 == 0) goto L_0x0043
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0043:
            return
        L_0x0044:
            o.logSessionEvent r1 = p040o.logSessionEvent.read
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = r3
        L_0x004c:
            if (r2 == 0) goto L_0x0053
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0053:
            return
        L_0x0054:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.personallimit.PersonalLimitActivity.onBackPressed():void");
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.SUCCESS);
    }
}
