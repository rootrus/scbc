package p040o;

import com.google.android.gms.common.api.Api;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: o.DiscoverTopListItemRecyclerAdapter$FundViewHolder */
final class DiscoverTopListItemRecyclerAdapter$FundViewHolder {
    private static final long MediaBrowserCompat$CustomActionResultReceiver = Runtime.getRuntime().maxMemory();

    static int write(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) << 3; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    DiscoverTopListItemRecyclerAdapter$FundViewHolder() {
    }

    static int MediaBrowserCompat$ItemReceiver(InputStream inputStream) {
        long j;
        if (inputStream instanceof DiscoverFundsListAdapter$SuggestedFundHolder) {
            return ((DiscoverFundsListAdapter$SuggestedFundHolder) inputStream).IconCompatParcelizer();
        }
        if (inputStream instanceof CompanyItemViewHolder) {
            return ((CompanyItemViewHolder) inputStream).read;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                if (channel != null) {
                    j = channel.size();
                } else {
                    j = 2147483647L;
                }
                if (j < 2147483647L) {
                    return (int) j;
                }
            } catch (IOException unused) {
            }
        }
        long j2 = MediaBrowserCompat$CustomActionResultReceiver;
        return j2 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j2;
    }

    static int read(int i) throws IOException {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i2 = 4;
        do {
            i >>= 7;
            i2--;
            bArr[i2] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (5 - i2);
    }
}
