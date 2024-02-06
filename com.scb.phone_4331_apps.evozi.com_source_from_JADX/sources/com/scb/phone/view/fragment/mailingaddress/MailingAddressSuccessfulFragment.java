package com.scb.phone.view.fragment.mailingaddress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.DataField;
import p040o.HmlPinActivity;
import p040o.getEnvMemorySize;
import p040o.getEnvMemorySize$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.readElement;
import p040o.writeUInt64NoTag;

public final class MailingAddressSuccessfulFragment extends BaseFragment implements DataField {
    public static final C6088xf7ad1500 IconCompatParcelizer = new C6088xf7ad1500((byte) 0);
    private write MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getEnvMemorySize presenter;
    @BindView
    public TextView tvRef;
    @BindView
    public TextView tvTime;

    public interface write {
        void MediaSessionCompat$QueueItem();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof write)) {
            activity = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (write) activity;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86142131493841, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(\n      …rKnife.bind(this, view) }");
        return inflate;
    }

    public final void onActivityCreated(Bundle bundle) {
        readElement readelement;
        super.onActivityCreated(bundle);
        getEnvMemorySize getenvmemorysize = this.presenter;
        if (getenvmemorysize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvmemorysize.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && (readelement = (readElement) arguments.getParcelable("PARCELABLE_ADDRESS_SUCCESS")) != null) {
            writeUInt64NoTag.IconCompatParcelizer write2 = new getEnvMemorySize.write(readelement);
            if (getenvmemorysize.RatingCompat != null) {
                write2.IconCompatParcelizer(getenvmemorysize.RatingCompat);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        getEnvMemorySize getenvmemorysize = this.presenter;
        if (getenvmemorysize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvmemorysize.onDestroy();
    }

    @OnClick
    public final void onDoneClick() {
        getEnvMemorySize getenvmemorysize = this.presenter;
        if (getenvmemorysize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getEnvMemorySize$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        if (getenvmemorysize.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getenvmemorysize.RatingCompat);
        }
    }

    public final void write(readElement readelement) {
        onGetStartedClick.write((Object) readelement, "display");
        TextView textView = this.tvTime;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTime");
        }
        textView.setText(readelement.MediaBrowserCompat$ItemReceiver);
        TextView textView2 = this.tvRef;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRef");
        }
        textView2.setText(readelement.write);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.MediaSessionCompat$QueueItem();
        }
    }
}
