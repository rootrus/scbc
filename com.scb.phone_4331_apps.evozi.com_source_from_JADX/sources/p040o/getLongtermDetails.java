package p040o;

import android.view.View;
import com.scb.phone.view.adapter.profilemanagement.LanguageSettingAdapter;

/* renamed from: o.getLongtermDetails */
public final /* synthetic */ class getLongtermDetails implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ LanguageSettingAdapter write;

    public /* synthetic */ getLongtermDetails(LanguageSettingAdapter languageSettingAdapter, int i) {
        this.write = languageSettingAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        LanguageSettingAdapter languageSettingAdapter = this.write;
        int i = this.MediaBrowserCompat$ItemReceiver;
        languageSettingAdapter.MediaBrowserCompat$ItemReceiver = "";
        languageSettingAdapter.MediaBrowserCompat$SearchResultReceiver = i;
        languageSettingAdapter.read.write(languageSettingAdapter.write.get(i).read);
        languageSettingAdapter.IconCompatParcelizer.write();
    }
}
