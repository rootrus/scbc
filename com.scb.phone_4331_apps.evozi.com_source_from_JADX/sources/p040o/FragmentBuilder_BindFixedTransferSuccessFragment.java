package p040o;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: o.FragmentBuilder_BindFixedTransferSuccessFragment */
public final class FragmentBuilder_BindFixedTransferSuccessFragment implements FragmentBuilder_BindExportStatementSuccessfulFragment {
    private Call.Factory MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindFixedTransferSuccessFragment(Context context) {
        this(FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver(context));
    }

    private FragmentBuilder_BindFixedTransferSuccessFragment(File file) {
        this(file, FragmentBuilder_BindFundRedeemSearchListFragment.read(file));
    }

    private FragmentBuilder_BindFixedTransferSuccessFragment(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
    }

    private FragmentBuilder_BindFixedTransferSuccessFragment(OkHttpClient okHttpClient) {
        this.MediaBrowserCompat$ItemReceiver = okHttpClient;
        okHttpClient.cache();
    }

    public final Response IconCompatParcelizer(Request request) throws IOException {
        return this.MediaBrowserCompat$ItemReceiver.newCall(request).execute();
    }
}
