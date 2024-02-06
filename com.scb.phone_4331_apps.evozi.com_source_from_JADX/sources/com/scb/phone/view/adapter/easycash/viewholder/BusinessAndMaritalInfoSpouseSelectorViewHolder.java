package com.scb.phone.view.adapter.easycash.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AppData;
import p040o.onGetStartedClick;

public final class BusinessAndMaritalInfoSpouseSelectorViewHolder extends RecyclerView.setContentView {
    @BindView
    public Spinner spinnerSpouse;
    @BindView
    public TextView tvTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessAndMaritalInfoSpouseSelectorViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public static final class read extends ArrayAdapter<String> {
        private /* synthetic */ AppData MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(Context context, List list, AppData appData) {
            super(context, R.layout.f84862131493713, list);
            this.MediaBrowserCompat$ItemReceiver = appData;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            onGetStartedClick.write((Object) viewGroup, "parent");
            View view2 = super.getView(i, view, viewGroup);
            onGetStartedClick.IconCompatParcelizer((Object) view2, "super.getView(position, convertView, parent)");
            View findViewById = view2.findViewById(16908308);
            if (findViewById != null) {
                TextView textView = (TextView) findViewById;
                if (i == getCount()) {
                    textView.setText(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                    textView.setTextColor(-7829368);
                }
                return view2;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }

        public final int getCount() {
            return super.getCount() - 1;
        }
    }
}
