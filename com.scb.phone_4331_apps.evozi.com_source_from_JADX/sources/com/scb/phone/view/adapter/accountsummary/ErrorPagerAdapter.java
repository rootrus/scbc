package com.scb.phone.view.adapter.accountsummary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.access$2200;
import p040o.onActivityCreated;

public class ErrorPagerAdapter extends onActivityCreated {
    private ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.NORMAL_ERROR;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;
    @BindView
    AppCompatTextView message;
    private access$2200 read;
    @BindView
    AppCompatTextView title;
    private View.OnClickListener write;

    public int getCount() {
        return 1;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ErrorPagerAdapter(Context context, access$2200 access_2200) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.read = null;
    }

    public ErrorPagerAdapter(Context context, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.read = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public ErrorPagerAdapter(Context context, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver, View.OnClickListener onClickListener) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.read = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
        this.write = onClickListener;
    }

    public ErrorPagerAdapter(Context context, access$2200 access_2200, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver, View.OnClickListener onClickListener) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.read = access_2200;
        this.MediaBrowserCompat$CustomActionResultReceiver = errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
        this.write = onClickListener;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$1 */
    static /* synthetic */ class C57241 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver[] r0 = com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver r1 = com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.ACCOUNT_SUMMARY_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver r1 = com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.DEBIT_SUMMARY_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver r1 = com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.WARNING_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver r1 = com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.AUTO_RESIZE_MESSAGE_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver r1 = com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.NORMAL_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter.C57241.<clinit>():void");
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        int i2 = C57241.read[this.MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
        if (i2 == 1) {
            view = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f81852131493411, (ViewGroup) null);
        } else if (i2 == 2) {
            view = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f81862131493412, (ViewGroup) null);
        } else if (i2 == 3) {
            view = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f81872131493413, (ViewGroup) null);
        } else if (i2 != 4) {
            view = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f81842131493410, (ViewGroup) null);
        } else {
            view = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f81832131493409, (ViewGroup) null);
        }
        ButterKnife.IconCompatParcelizer(this, view);
        access$2200 access_2200 = this.read;
        if (access_2200 != null) {
            this.title.setText(access_2200.MediaBrowserCompat$ItemReceiver);
            this.message.setText(this.read.IconCompatParcelizer);
        }
        viewGroup.addView(view, 0);
        View.OnClickListener onClickListener = this.write;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        return view;
    }
}
