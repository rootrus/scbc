package com.scb.phone.view.adapter.otp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindCcSofCreditCardOnlyFragment;
import p040o.deleteAnnotation;
import p040o.getContents;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MobileListAdapter extends RecyclerView.IconCompatParcelizer<MobileListCustomView> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    public FragmentBuilder_BindCcSofCreditCardOnlyFragment read;
    public List<getContents> write = new ArrayList();

    public class MobileListCustomView_ViewBinding implements Unbinder {
        private MobileListCustomView IconCompatParcelizer;
        private View MediaBrowserCompat$CustomActionResultReceiver;

        public MobileListCustomView_ViewBinding(final MobileListCustomView mobileListCustomView, View view) {
            this.IconCompatParcelizer = mobileListCustomView;
            mobileListCustomView.linearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.holder_linear_layout, "field 'linearLayout'", LinearLayout.class);
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.mobile_checkbox, "field 'mobileCheckbox' and method 'onMobileCheckBoxClick'");
            mobileListCustomView.mobileCheckbox = (CheckBox) onStart.write(IconCompatParcelizer2, R.id.mobile_checkbox, "field 'mobileCheckbox'", CheckBox.class);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    MobileListCustomView.this.onMobileCheckBoxClick();
                }
            });
            mobileListCustomView.mobileTextValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile_number_value, "field 'mobileTextValue'", TextView.class);
            mobileListCustomView.dividerView = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'dividerView'");
            mobileListCustomView.footerDividerView = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'footerDividerView'");
        }

        public final void read() {
            MobileListCustomView mobileListCustomView = this.IconCompatParcelizer;
            if (mobileListCustomView != null) {
                this.IconCompatParcelizer = null;
                mobileListCustomView.linearLayout = null;
                mobileListCustomView.mobileCheckbox = null;
                mobileListCustomView.mobileTextValue = null;
                mobileListCustomView.dividerView = null;
                mobileListCustomView.footerDividerView = null;
                this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MobileListCustomView mobileListCustomView = (MobileListCustomView) setcontentview;
        getContents getcontents = this.write.get(i);
        mobileListCustomView.mobileCheckbox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        mobileListCustomView.mobileTextValue.setText(getcontents.IconCompatParcelizer);
        mobileListCustomView.mobileCheckbox.setChecked(getcontents.read);
        mobileListCustomView.linearLayout.setOnClickListener(new deleteAnnotation(this, mobileListCustomView, getcontents, i));
        if (this.write.size() - 1 == i) {
            mobileListCustomView.dividerView.setVisibility(8);
            mobileListCustomView.footerDividerView.setVisibility(0);
            return;
        }
        mobileListCustomView.dividerView.setVisibility(0);
        mobileListCustomView.footerDividerView.setVisibility(8);
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public class MobileListCustomView extends RecyclerView.setContentView {
        public boolean Keep = false;
        @BindView
        View dividerView;
        @BindView
        View footerDividerView;
        @BindView
        LinearLayout linearLayout;
        @BindView
        public CheckBox mobileCheckbox;
        @BindView
        TextView mobileTextValue;
        public boolean setHasDecor = false;

        MobileListCustomView(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        @OnClick
        public void onMobileCheckBoxClick() {
            if (!this.setHasDecor) {
                this.Keep = true;
                this.write.callOnClick();
            }
            this.Keep = false;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new MobileListCustomView(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84252131493651, (ViewGroup) null));
    }
}
