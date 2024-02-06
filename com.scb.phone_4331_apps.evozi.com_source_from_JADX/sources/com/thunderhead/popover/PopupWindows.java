package com.thunderhead.popover;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import p040o.AlertController$RecycleListView;
import p040o.AmortizationMerchantsActivity_ViewBinding;
import p040o.C6830xb8d87ad6;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.MyECouponActivity_ViewBinding;

public class PopupWindows implements PopupWindow.OnDismissListener {
    public WindowManager AlertController$RecycleListView;
    public View MediaSessionCompat$ResultReceiverWrapper;
    public Activity MediaSessionCompat$Token;
    public boolean ParcelableVolumeInfo = false;
    public PopupWindow setHasDecor;
    private BackPressedListenerView write;

    public PopupWindows(Activity activity) {
        IconCompatParcelizer(activity);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Activity activity) {
        this.MediaSessionCompat$Token = activity;
        PopupWindow popupWindow = this.setHasDecor;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener((PopupWindow.OnDismissListener) null);
            PopupWindow popupWindow2 = this.setHasDecor;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
                MediaBrowserCompat$ItemReceiver();
            }
        }
        PopupWindow popupWindow3 = new PopupWindow(AlertController$RecycleListView.MediaDescriptionCompat((Context) this.MediaSessionCompat$Token));
        this.setHasDecor = popupWindow3;
        popupWindow3.setTouchable(true);
        this.setHasDecor.setFocusable(true);
        this.setHasDecor.setOutsideTouchable(true);
        this.setHasDecor.setTouchInterceptor(new AmortizationMerchantsActivity_ViewBinding(this));
        this.setHasDecor.setOnDismissListener(this);
        this.AlertController$RecycleListView = (WindowManager) this.MediaSessionCompat$Token.getSystemService("window");
    }

    public void onDismiss() {
        if (this.ParcelableVolumeInfo) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6830xb8d87ad6.IconCompatParcelizer);
        }
        MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver(View view, int i, int i2) {
        PopupWindow popupWindow = this.setHasDecor;
        if (popupWindow != null) {
            popupWindow.showAtLocation(view, 0, i, i2);
            BackPressedListenerView backPressedListenerView = new BackPressedListenerView(this.MediaSessionCompat$Token);
            this.write = backPressedListenerView;
            backPressedListenerView.setId(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_backpressed_window_id);
            this.AlertController$RecycleListView.addView(this.write, BackPressedListenerView.read(view));
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        try {
            if (this.write != null) {
                this.AlertController$RecycleListView.removeView(this.write);
            }
            if (!(this.write == null || this.write.getParent() == null)) {
                this.AlertController$RecycleListView.removeViewImmediate(this.write);
            }
            this.write = null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
        PopupWindow popupWindow = this.setHasDecor;
        if (popupWindow != null) {
            popupWindow.setContentView((View) null);
            this.setHasDecor = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            MyECouponActivity_ViewBinding.write("setContentView was not called with a view to display.");
            return;
        }
        this.setHasDecor.setBackgroundDrawable(new ColorDrawable(this.MediaSessionCompat$Token.getResources().getColor(17170445)));
        this.setHasDecor.setWidth(i);
        this.setHasDecor.setHeight(-2);
        this.setHasDecor.setContentView(this.MediaSessionCompat$ResultReceiverWrapper);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        this.MediaSessionCompat$ResultReceiverWrapper = view;
        this.setHasDecor.setContentView(view);
    }

    public final void IconCompatParcelizer() {
        PopupWindow popupWindow = this.setHasDecor;
        if (popupWindow != null) {
            popupWindow.dismiss();
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        PopupWindow popupWindow = this.setHasDecor;
        if (popupWindow != null && popupWindow.isShowing()) {
            try {
                this.setHasDecor.dismiss();
                MediaBrowserCompat$ItemReceiver();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
    }

    public class BackPressedListenerView extends FrameLayout {
        static WindowManager.LayoutParams read(View view) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.flags = 48;
            layoutParams.token = view.getWindowToken();
            layoutParams.gravity = 8388659;
            layoutParams.type = 1000;
            layoutParams.format = -3;
            layoutParams.softInputMode = 1;
            layoutParams.setTitle("BackPressedPopUpWindow");
            return layoutParams;
        }

        public BackPressedListenerView(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (keyEvent.getKeyCode() != 4) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
                return super.dispatchKeyEvent(keyEvent);
            } else {
                PopupWindows.this.ParcelableVolumeInfo = true;
                PopupWindows.this.IconCompatParcelizer();
                return true;
            }
        }
    }
}
