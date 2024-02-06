package com.scb.phone.view.adapter.transferandpay.billpayment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.TestActivity;
import p040o.TestActivity$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class BillPaymentSearchAdapter extends TestActivity<CrashlyticsReport.Session.Event.Application.Execution, BillPaymentSearchViewHolder> {
    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        return new BillPaymentSearchViewHolder(viewGroup);
    }

    public final class BillPaymentSearchViewHolder_ViewBinding implements Unbinder {
        private BillPaymentSearchViewHolder IconCompatParcelizer;

        public BillPaymentSearchViewHolder_ViewBinding(BillPaymentSearchViewHolder billPaymentSearchViewHolder, View view) {
            this.IconCompatParcelizer = billPaymentSearchViewHolder;
            billPaymentSearchViewHolder.gridLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_grid_layout, "field 'gridLayout'", RelativeLayout.class);
            billPaymentSearchViewHolder.listLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_list_layout, "field 'listLayout'", RelativeLayout.class);
            billPaymentSearchViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_name_text_view_list, "field 'tvName'", TextView.class);
            billPaymentSearchViewHolder.tvCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_code_text_view_list, "field 'tvCode'", TextView.class);
            billPaymentSearchViewHolder.imgAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view_list, "field 'imgAvatar'", ImageView.class);
        }

        public final void read() {
            BillPaymentSearchViewHolder billPaymentSearchViewHolder = this.IconCompatParcelizer;
            if (billPaymentSearchViewHolder != null) {
                this.IconCompatParcelizer = null;
                billPaymentSearchViewHolder.gridLayout = null;
                billPaymentSearchViewHolder.listLayout = null;
                billPaymentSearchViewHolder.tvName = null;
                billPaymentSearchViewHolder.tvCode = null;
                billPaymentSearchViewHolder.imgAvatar = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static final class BillPaymentSearchViewHolder extends TestActivity.read<CrashlyticsReport.Session.Event.Application.Execution> {
        @BindView
        public RelativeLayout gridLayout;
        @BindView
        public ImageView imgAvatar;
        @BindView
        public RelativeLayout listLayout;
        @BindView
        public TextView tvCode;
        @BindView
        public TextView tvName;

        public final /* synthetic */ void write(Object obj, String str, TestActivity$MediaBrowserCompat$ItemReceiver testActivity$MediaBrowserCompat$ItemReceiver) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            onGetStartedClick.write((Object) execution, "item");
            onGetStartedClick.write((Object) str, "highlight");
            RelativeLayout relativeLayout = this.gridLayout;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("gridLayout");
            }
            relativeLayout.setVisibility(8);
            View view = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            Context context = view.getContext();
            Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281);
            int read2 = setLastBaselineToBottomHeight.read(context, R.color.f66402131099796);
            ImageView imageView = this.imgAvatar;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imgAvatar");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, write, imageView, execution.MediaBrowserCompat$CustomActionResultReceiver(), dimensionPixelOffset, read2);
            TextView textView = this.tvName;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
            }
            String read3 = execution.read();
            onGetStartedClick.IconCompatParcelizer((Object) read3, "item.billerName");
            View view2 = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
            textView.setText(MediaBrowserCompat$ItemReceiver(read3, str, setLastBaselineToBottomHeight.read(view2.getContext(), R.color.f67252131099881), (MetricAffectingSpan) null));
            TextView textView2 = this.tvCode;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCode");
            }
            textView2.setText(execution.MediaMetadataCompat);
            this.write.setOnClickListener(new read(testActivity$MediaBrowserCompat$ItemReceiver, execution));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BillPaymentSearchViewHolder(ViewGroup viewGroup) {
            super(viewGroup);
            onGetStartedClick.write((Object) viewGroup, "parent");
            ButterKnife.IconCompatParcelizer(this, this.write);
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution IconCompatParcelizer;
            private /* synthetic */ TestActivity$MediaBrowserCompat$ItemReceiver read;

            read(TestActivity$MediaBrowserCompat$ItemReceiver testActivity$MediaBrowserCompat$ItemReceiver, CrashlyticsReport.Session.Event.Application.Execution execution) {
                this.read = testActivity$MediaBrowserCompat$ItemReceiver;
                this.IconCompatParcelizer = execution;
            }

            public final void onClick(View view) {
                TestActivity$MediaBrowserCompat$ItemReceiver testActivity$MediaBrowserCompat$ItemReceiver = this.read;
                if (testActivity$MediaBrowserCompat$ItemReceiver != null) {
                    testActivity$MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer);
                }
            }
        }
    }
}
