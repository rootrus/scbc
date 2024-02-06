package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseLocalModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import org.bouncycastle.crypto.tls.CipherSuite;

public class zzog {
    private final Context zzad;
    private MappedByteBuffer zzaqj;
    private final FirebaseLocalModel zzaqk;

    public zzog(Context context, FirebaseLocalModel firebaseLocalModel) {
        this.zzad = context;
        this.zzaqk = firebaseLocalModel;
    }

    public void zzlu() throws FirebaseMLException {
    }

    public MappedByteBuffer load() throws FirebaseMLException {
        Preconditions.checkNotNull(this.zzad, "Context can not be null");
        Preconditions.checkNotNull(this.zzaqk, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.zzaqj;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        if (this.zzaqk.getFilePath() != null) {
            try {
                FileChannel channel = new RandomAccessFile(this.zzaqk.getFilePath(), "r").getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                this.zzaqj = map;
                return map;
            } catch (IOException e) {
                String valueOf = String.valueOf(this.zzaqk.getFilePath());
                throw new FirebaseMLException(valueOf.length() != 0 ? "Can not open the local file: ".concat(valueOf) : new String("Can not open the local file: "), 14, e);
            }
        } else if (this.zzaqk.getAssetFilePath() == null) {
            return null;
        } else {
            String assetFilePath = this.zzaqk.getAssetFilePath();
            try {
                AssetFileDescriptor openFd = this.zzad.getAssets().openFd(assetFilePath);
                MappedByteBuffer map2 = new FileInputStream(openFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                this.zzaqj = map2;
                return map2;
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder(String.valueOf(assetFilePath).length() + CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
                sb.append("Can not load the file from asset: ");
                sb.append(assetFilePath);
                sb.append(". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression");
                throw new FirebaseMLException(sb.toString(), 14, e2);
            }
        }
    }
}
