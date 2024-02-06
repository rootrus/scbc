package p040o;

import java.security.Key;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import org.apache.http.impl.auth.NTLMEngineException;
import p040o.RtpEBillPaymentDetailActivity;

/* renamed from: o.RtpEBillPaymentDetailActivity$MediaBrowserCompat$CustomActionResultReceiver */
public class C9816x17892ef5 {
    private byte[] ActionMenuItemView;
    private long AlertController$RecycleListView;
    private byte[] AppCompatActivity;
    private byte[] AppCompatDelegateImpl$ListMenuDecorView;
    private byte[] AppCompatDialogFragment;
    byte[] IconCompatParcelizer;
    String Keep;
    String MediaBrowserCompat$CustomActionResultReceiver;
    byte[] MediaBrowserCompat$ItemReceiver;
    byte[] MediaBrowserCompat$MediaItem;
    byte[] MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    byte[] f5529x50fd9e4a;
    byte[] MediaDescriptionCompat;
    byte[] MediaMetadataCompat;
    String MediaSessionCompat$QueueItem;
    byte[] MediaSessionCompat$ResultReceiverWrapper;
    Random MediaSessionCompat$Token;
    byte[] ParcelableVolumeInfo;
    private byte[] PlaybackStateCompat;
    private byte[] PlaybackStateCompat$CustomAction;
    byte[] RatingCompat;
    byte[] read;
    private byte[] setBackgroundResource;
    private byte[] setChecked;
    private byte[] setContentView;
    private byte[] setHasDecor;
    byte[] write;

    private C9816x17892ef5(Random random, long j, String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.setContentView = null;
        this.RatingCompat = null;
        this.ParcelableVolumeInfo = null;
        this.setBackgroundResource = null;
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.AppCompatDialogFragment = null;
        this.AppCompatActivity = null;
        this.MediaDescriptionCompat = null;
        this.PlaybackStateCompat = null;
        this.read = null;
        this.AppCompatDelegateImpl$ListMenuDecorView = null;
        this.f5529x50fd9e4a = null;
        this.MediaMetadataCompat = null;
        this.setHasDecor = null;
        this.MediaSessionCompat$Token = random;
        this.AlertController$RecycleListView = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.Keep = str2;
        this.MediaSessionCompat$QueueItem = str3;
        this.IconCompatParcelizer = bArr;
        this.setChecked = bArr2;
        this.write = null;
        this.PlaybackStateCompat$CustomAction = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.ActionMenuItemView = null;
    }

    public C9816x17892ef5(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
        this(random, j, str, str2, str3, bArr, bArr2);
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() throws NTLMEngineException {
        if (this.setContentView == null) {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                this.MediaBrowserCompat$ItemReceiver = RtpEBillPaymentDetailActivity.write(this.MediaSessionCompat$QueueItem);
            }
            this.setContentView = RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
        }
        return this.setContentView;
    }

    /* access modifiers changed from: package-private */
    public byte[] read() throws NTLMEngineException {
        if (this.setBackgroundResource == null) {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = this.Keep;
            if (this.RatingCompat == null) {
                this.RatingCompat = RtpEBillPaymentDetailActivity.read(this.MediaSessionCompat$QueueItem);
            }
            this.setBackgroundResource = RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(str, str2, this.RatingCompat);
        }
        return this.setBackgroundResource;
    }

    public final byte[] MediaDescriptionCompat() throws NTLMEngineException {
        if (this.AppCompatActivity == null) {
            byte[] read2 = read();
            byte[] bArr = this.IconCompatParcelizer;
            if (this.AppCompatDialogFragment == null) {
                if (this.PlaybackStateCompat$CustomAction == null) {
                    this.PlaybackStateCompat$CustomAction = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaSessionCompat$Token);
                }
                byte[] bArr2 = this.PlaybackStateCompat$CustomAction;
                byte[] bArr3 = this.setChecked;
                if (this.ActionMenuItemView == null) {
                    long j = (this.AlertController$RecycleListView + 11644473600000L) * 10000;
                    this.ActionMenuItemView = new byte[8];
                    for (int i = 0; i < 8; i++) {
                        this.ActionMenuItemView[i] = (byte) ((int) j);
                        j >>>= 8;
                    }
                }
                this.AppCompatDialogFragment = RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver(bArr2, bArr3, this.ActionMenuItemView);
            }
            this.AppCompatActivity = RtpEBillPaymentDetailActivity.write(read2, bArr, this.AppCompatDialogFragment);
        }
        return this.AppCompatActivity;
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver() throws NTLMEngineException {
        if (this.PlaybackStateCompat == null) {
            if (this.write == null) {
                this.write = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaSessionCompat$Token);
            }
            byte[] bArr = this.write;
            byte[] bArr2 = new byte[24];
            this.PlaybackStateCompat = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.PlaybackStateCompat;
            Arrays.fill(bArr3, bArr.length, bArr3.length, (byte) 0);
        }
        return this.PlaybackStateCompat;
    }

    public final byte[] write() throws NTLMEngineException {
        if (this.AppCompatDelegateImpl$ListMenuDecorView == null) {
            RtpEBillPaymentDetailActivity.write write2 = new RtpEBillPaymentDetailActivity.write();
            if (this.RatingCompat == null) {
                this.RatingCompat = RtpEBillPaymentDetailActivity.read(this.MediaSessionCompat$QueueItem);
            }
            write2.IconCompatParcelizer(this.RatingCompat);
            this.AppCompatDelegateImpl$ListMenuDecorView = write2.write();
        }
        return this.AppCompatDelegateImpl$ListMenuDecorView;
    }

    public final byte[] IconCompatParcelizer() throws NTLMEngineException {
        if (this.setHasDecor == null) {
            try {
                byte[] bArr = new byte[14];
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    this.MediaBrowserCompat$ItemReceiver = RtpEBillPaymentDetailActivity.write(this.MediaSessionCompat$QueueItem);
                }
                System.arraycopy(this.MediaBrowserCompat$ItemReceiver, 0, bArr, 0, 8);
                Arrays.fill(bArr, 8, 14, (byte) -67);
                Key read2 = RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver(bArr, 0);
                Key read3 = RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver(bArr, 7);
                byte[] bArr2 = new byte[8];
                System.arraycopy(MediaBrowserCompat$ItemReceiver(), 0, bArr2, 0, 8);
                Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
                instance.init(1, read2);
                byte[] doFinal = instance.doFinal(bArr2);
                Cipher instance2 = Cipher.getInstance("DES/ECB/NoPadding");
                instance2.init(1, read3);
                byte[] doFinal2 = instance2.doFinal(bArr2);
                byte[] bArr3 = new byte[16];
                this.setHasDecor = bArr3;
                System.arraycopy(doFinal, 0, bArr3, 0, doFinal.length);
                System.arraycopy(doFinal2, 0, this.setHasDecor, doFinal.length, doFinal2.length);
            } catch (Exception e) {
                throw new NTLMEngineException(e.getMessage(), e);
            }
        }
        return this.setHasDecor;
    }
}
