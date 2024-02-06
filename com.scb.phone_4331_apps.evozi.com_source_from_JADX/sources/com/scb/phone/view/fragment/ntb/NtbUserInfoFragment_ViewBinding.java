package com.scb.phone.view.fragment.ntb;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class NtbUserInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private NtbUserInfoFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public NtbUserInfoFragment_ViewBinding(final NtbUserInfoFragment ntbUserInfoFragment, View view) {
        super(ntbUserInfoFragment, view);
        this.MediaBrowserCompat$ItemReceiver = ntbUserInfoFragment;
        ntbUserInfoFragment.mNameInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txt_ntb_user_info_name_input, "field 'mNameInput'", CommonInputViewGroup.class);
        ntbUserInfoFragment.mEmailInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txt_ntb_user_info_email_input, "field 'mEmailInput'", CommonInputViewGroup.class);
        ntbUserInfoFragment.mMobileNumberInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txt_ntb_user_info_mobile_phone_input, "field 'mMobileNumberInput'", CommonInputViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_ntb_user_info_left, "field 'mNtbUserInfoLeftImageView' and method 'onClickPrevNavigation'");
        ntbUserInfoFragment.mNtbUserInfoLeftImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.btn_ntb_user_info_left, "field 'mNtbUserInfoLeftImageView'", ImageView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NtbUserInfoFragment.this.onClickPrevNavigation();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_ntb_user_info_right, "field 'mNtbUserInfoRightImageView' and method 'onClickNextNavigation'");
        ntbUserInfoFragment.mNtbUserInfoRightImageView = (ImageView) onStart.write(IconCompatParcelizer3, R.id.btn_ntb_user_info_right, "field 'mNtbUserInfoRightImageView'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NtbUserInfoFragment.this.onClickNextNavigation();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'mBtnAction' and method 'onClickSubmit'");
        ntbUserInfoFragment.mBtnAction = (Button) onStart.write(IconCompatParcelizer4, R.id.btn_action, "field 'mBtnAction'", Button.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NtbUserInfoFragment.this.onClickSubmit();
            }
        });
        ntbUserInfoFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_ntb_user_info_image_profile, "field 'mViewPager'", ViewPager.class);
        ntbUserInfoFragment.mIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_ntb_user_info_image_profile, "field 'mIndicator'", CircleIndicator.class);
    }

    public final void read() {
        NtbUserInfoFragment ntbUserInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (ntbUserInfoFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            ntbUserInfoFragment.mNameInput = null;
            ntbUserInfoFragment.mEmailInput = null;
            ntbUserInfoFragment.mMobileNumberInput = null;
            ntbUserInfoFragment.mNtbUserInfoLeftImageView = null;
            ntbUserInfoFragment.mNtbUserInfoRightImageView = null;
            ntbUserInfoFragment.mBtnAction = null;
            ntbUserInfoFragment.mViewPager = null;
            ntbUserInfoFragment.mIndicator = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
