package p040o;

import android.net.NetworkInfo;
import android.os.Handler;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.FragmentBuilder_BindFillInformationFragment */
public final class FragmentBuilder_BindFillInformationFragment extends FragmentBuilder_BindFundInvestmentExperienceFragment {
    private final FragmentBuilder_BindExportStatementSuccessfulFragment IconCompatParcelizer;
    private final FragmentBuilder_BindFundAwaitingTransactionsTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int write() {
        return 2;
    }

    public FragmentBuilder_BindFillInformationFragment(FragmentBuilder_BindExportStatementSuccessfulFragment fragmentBuilder_BindExportStatementSuccessfulFragment, FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindExportStatementSuccessfulFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindFundAwaitingTransactionsTabFragment;
    }

    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        String scheme = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* renamed from: o.FragmentBuilder_BindFillInformationFragment$write */
    static class write extends IOException {
        write(String str) {
            super(str);
        }
    }

    /* renamed from: o.FragmentBuilder_BindFillInformationFragment$read */
    static final class read extends IOException {
        final int IconCompatParcelizer;
        final int write = 0;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        read(int r2, int r3) {
            /*
                r1 = this;
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "HTTP "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                r1.<init>(r3)
                r1.IconCompatParcelizer = r2
                r2 = 0
                r1.write = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindFillInformationFragment.read.<init>(int, int):void");
        }
    }

    public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (FragmentBuilder_BindFatcaLandingQuestionFragment.IconCompatParcelizer(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!FragmentBuilder_BindFatcaLandingQuestionFragment.MediaBrowserCompat$CustomActionResultReceiver(i)) {
                builder.noCache();
            }
            if (!FragmentBuilder_BindFatcaLandingQuestionFragment.MediaBrowserCompat$ItemReceiver(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(url.build());
        ResponseBody body = IconCompatParcelizer2.body();
        if (IconCompatParcelizer2.isSuccessful()) {
            Picasso.read read2 = IconCompatParcelizer2.cacheResponse() == null ? Picasso.read.NETWORK : Picasso.read.DISK;
            if (read2 == Picasso.read.DISK && body.contentLength() == 0) {
                body.close();
                throw new write("Received response with 0 content-length header.");
            }
            if (read2 == Picasso.read.NETWORK && body.contentLength() > 0) {
                FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                long contentLength = body.contentLength();
                Handler handler = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaBrowserCompat$MediaItem;
                handler.sendMessage(handler.obtainMessage(4, Long.valueOf(contentLength)));
            }
            return new C6534x586e8bf0((HowToAddAccountStep2Activity) body.source(), read2);
        }
        body.close();
        throw new read(IconCompatParcelizer2.code(), 0);
    }
}
