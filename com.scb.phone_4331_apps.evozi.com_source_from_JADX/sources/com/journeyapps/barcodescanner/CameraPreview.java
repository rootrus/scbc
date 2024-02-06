package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import p040o.BNNM;
import p040o.CGEMV;
import p040o.CGERU;
import p040o.CHBMV;
import p040o.CHEMM;
import p040o.CHER;
import p040o.CHER2;
import p040o.CHERK;
import p040o.MapConstraints;
import p040o.getEnterTransitionCallback;
import p040o.getIExceptionResponseDeserializerOnDevice;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$MediaItem;
import p040o.zzmd;

public class CameraPreview extends ViewGroup {
    /* access modifiers changed from: private */
    public static final String MediaBrowserCompat$CustomActionResultReceiver = CameraPreview.class.getSimpleName();
    private BNNM AlertController$RecycleListView;
    private final SurfaceHolder.Callback AppCompatActivity = new SurfaceHolder.Callback() {
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            BNNM unused = CameraPreview.this.MediaMetadataCompat = null;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(CameraPreview.MediaBrowserCompat$CustomActionResultReceiver, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            BNNM unused = CameraPreview.this.MediaMetadataCompat = new BNNM(i2, i3);
            CameraPreview.this.MediaBrowserCompat$MediaItem();
        }
    };
    private TextureView AppCompatDelegateImpl$ListMenuDecorView;
    private Rect AppCompatDialogFragment;
    private boolean AppCompatViewInflater = false;
    private BNNM IconCompatParcelizer;
    private final Handler.Callback Keep = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            boolean z = true;
            if (message.what == rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_prewiew_size_ready) {
                CameraPreview.write(CameraPreview.this, (BNNM) message.obj);
                return true;
            }
            if (message.what == rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (CameraPreview.this.write == null) {
                    z = false;
                }
                if (z) {
                    CameraPreview.this.MediaBrowserCompat$CustomActionResultReceiver();
                    CameraPreview.this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(exc);
                }
            } else if (message.what == rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_camera_closed) {
                CameraPreview.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
            return false;
        }
    };
    private CHER MediaBrowserCompat$ItemReceiver = new CHER();
    public List<CameraPreview$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$MediaItem = new ArrayList();
    /* access modifiers changed from: private */
    public final CameraPreview$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver = new CameraPreview$MediaBrowserCompat$CustomActionResultReceiver() {
        public final void MediaBrowserCompat$ItemReceiver() {
            for (CameraPreview$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver : CameraPreview.this.MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void write() {
            for (CameraPreview$MediaBrowserCompat$CustomActionResultReceiver write2 : CameraPreview.this.MediaBrowserCompat$MediaItem) {
                write2.write();
            }
        }

        public final void IconCompatParcelizer() {
            for (CameraPreview$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer : CameraPreview.this.MediaBrowserCompat$MediaItem) {
                IconCompatParcelizer.IconCompatParcelizer();
            }
        }

        public final void IconCompatParcelizer(Exception exc) {
            for (CameraPreview$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer : CameraPreview.this.MediaBrowserCompat$MediaItem) {
                IconCompatParcelizer.IconCompatParcelizer(exc);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            for (CameraPreview$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver : CameraPreview.this.MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    };

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private double f3277x50fd9e4a = 0.1d;
    private getEnterTransitionCallback MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public BNNM MediaMetadataCompat;
    private CHER2 MediaSessionCompat$QueueItem = null;
    private int MediaSessionCompat$ResultReceiverWrapper = -1;
    private BNNM MediaSessionCompat$Token = null;
    private boolean ParcelableVolumeInfo = false;
    private CGEMV PlaybackStateCompat;
    /* access modifiers changed from: private */
    public Handler PlaybackStateCompat$CustomAction;
    Rect RatingCompat = null;
    Rect read = null;
    private SurfaceView setBackgroundResource;
    private WindowManager setChecked;
    private boolean setContentView = false;
    private getIExceptionResponseDeserializerOnDevice setHasDecor = new Object() {
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            CameraPreview.this.PlaybackStateCompat$CustomAction.postDelayed(this, 250);
        }

        public final void run() {
            CameraPreview.MediaBrowserCompat$CustomActionResultReceiver(CameraPreview.this);
        }
    };
    public CGERU write;

    /* access modifiers changed from: protected */
    public void write() {
    }

    public CameraPreview(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver(context, (AttributeSet) null);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver(context, attributeSet);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver(context, attributeSet);
    }

    private void MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        MediaBrowserCompat$CustomActionResultReceiver(attributeSet);
        this.setChecked = (WindowManager) context.getSystemService("window");
        this.PlaybackStateCompat$CustomAction = new Handler(this.Keep);
        this.PlaybackStateCompat = new CGEMV();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.AppCompatViewInflater) {
            TextureView textureView = new TextureView(getContext());
            this.AppCompatDelegateImpl$ListMenuDecorView = textureView;
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return false;
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    BNNM unused = CameraPreview.this.MediaMetadataCompat = new BNNM(i, i2);
                    CameraPreview.this.MediaBrowserCompat$MediaItem();
                }
            });
            addView(this.AppCompatDelegateImpl$ListMenuDecorView);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.setBackgroundResource = surfaceView;
        surfaceView.getHolder().addCallback(this.AppCompatActivity);
        addView(this.setBackgroundResource);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.MediaSessionCompat$Token = new BNNM(dimension, dimension2);
        }
        this.AppCompatViewInflater = obtainStyledAttributes.getBoolean(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.MediaSessionCompat$QueueItem = new CHEMM();
        } else if (integer == 2) {
            this.MediaSessionCompat$QueueItem = new CHBMV();
        } else if (integer == 3) {
            this.MediaSessionCompat$QueueItem = new CHERK();
        }
        obtainStyledAttributes.recycle();
    }

    public void setTorch(boolean z) {
        this.setContentView = z;
        CGERU cgeru = this.write;
        if (cgeru != null) {
            cgeru.MediaBrowserCompat$CustomActionResultReceiver(z);
        }
    }

    public void setPreviewScalingStrategy(CHER2 cher2) {
        this.MediaSessionCompat$QueueItem = cher2;
    }

    private static Matrix read(BNNM bnnm, BNNM bnnm2) {
        float f;
        float f2 = ((float) bnnm.read) / ((float) bnnm.IconCompatParcelizer);
        float f3 = ((float) bnnm2.read) / ((float) bnnm2.IconCompatParcelizer);
        float f4 = 1.0f;
        if (f2 < f3) {
            float f5 = f3 / f2;
            f = 1.0f;
            f4 = f5;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        matrix.postTranslate((((float) bnnm.read) - (((float) bnnm.read) * f4)) / 2.0f, (((float) bnnm.IconCompatParcelizer) - (((float) bnnm.IconCompatParcelizer) * f)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$MediaItem() {
        Rect rect;
        BNNM bnnm = this.MediaMetadataCompat;
        if (bnnm != null && this.AlertController$RecycleListView != null && (rect = this.AppCompatDialogFragment) != null) {
            if (this.setBackgroundResource == null || !bnnm.equals(new BNNM(rect.width(), this.AppCompatDialogFragment.height()))) {
                TextureView textureView = this.AppCompatDelegateImpl$ListMenuDecorView;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.AlertController$RecycleListView != null) {
                        this.AppCompatDelegateImpl$ListMenuDecorView.setTransform(read(new BNNM(this.AppCompatDelegateImpl$ListMenuDecorView.getWidth(), this.AppCompatDelegateImpl$ListMenuDecorView.getHeight()), this.AlertController$RecycleListView));
                    }
                    IconCompatParcelizer(new zzmd.zzm.zza.read(this.AppCompatDelegateImpl$ListMenuDecorView.getSurfaceTexture()));
                    return;
                }
                return;
            }
            IconCompatParcelizer(new zzmd.zzm.zza.read(this.setBackgroundResource.getHolder()));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BNNM bnnm = new BNNM(i3 - i, i4 - i2);
        this.IconCompatParcelizer = bnnm;
        CGERU cgeru = this.write;
        if (cgeru != null && cgeru.RatingCompat == null) {
            getEnterTransitionCallback getentertransitioncallback = new getEnterTransitionCallback(this.setChecked.getDefaultDisplay().getRotation(), bnnm);
            this.MediaDescriptionCompat = getentertransitioncallback;
            CHER2 cher2 = this.MediaSessionCompat$QueueItem;
            if (cher2 == null) {
                if (this.AppCompatDelegateImpl$ListMenuDecorView != null) {
                    cher2 = new CHEMM();
                } else {
                    cher2 = new CHBMV();
                }
            }
            getentertransitioncallback.MediaBrowserCompat$CustomActionResultReceiver = cher2;
            CGERU cgeru2 = this.write;
            getEnterTransitionCallback getentertransitioncallback2 = this.MediaDescriptionCompat;
            cgeru2.RatingCompat = getentertransitioncallback2;
            cgeru2.write.MediaMetadataCompat = getentertransitioncallback2;
            CGERU cgeru3 = this.write;
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("Must be called from the main thread.");
            } else if (cgeru3.MediaMetadataCompat) {
                MapConstraints.ConstrainedMultimap.C36372.write write2 = cgeru3.MediaBrowserCompat$ItemReceiver;
                Runnable runnable = cgeru3.MediaBrowserCompat$SearchResultReceiver;
                synchronized (write2.read) {
                    write2.MediaBrowserCompat$CustomActionResultReceiver();
                    write2.write.post(runnable);
                }
                boolean z2 = this.setContentView;
                if (z2) {
                    this.write.MediaBrowserCompat$CustomActionResultReceiver(z2);
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.setBackgroundResource;
        if (surfaceView != null) {
            Rect rect = this.AppCompatDialogFragment;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, this.AppCompatDialogFragment.top, this.AppCompatDialogFragment.right, this.AppCompatDialogFragment.bottom);
            }
        } else {
            TextureView textureView = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public void setCameraSettings(CHER cher) {
        this.MediaBrowserCompat$ItemReceiver = cher;
    }

    public void setFramingRectSize(BNNM bnnm) {
        this.MediaSessionCompat$Token = bnnm;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f3277x50fd9e4a = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setUseTextureView(boolean z) {
        this.AppCompatViewInflater = z;
    }

    private void read() {
        if (this.write != null) {
            Log.w(MediaBrowserCompat$CustomActionResultReceiver, "initCamera called twice");
            return;
        }
        CGERU cgeru = new CGERU(getContext());
        CHER cher = this.MediaBrowserCompat$ItemReceiver;
        if (!cgeru.MediaMetadataCompat) {
            cgeru.read = cher;
            cgeru.write.MediaSessionCompat$QueueItem = cher;
        }
        this.write = cgeru;
        cgeru.ParcelableVolumeInfo = this.PlaybackStateCompat$CustomAction;
        this.write.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaSessionCompat$ResultReceiverWrapper = this.setChecked.getDefaultDisplay().getRotation();
    }

    private void IconCompatParcelizer(zzmd.zzm.zza.read read2) {
        if (!this.ParcelableVolumeInfo && this.write != null) {
            Log.i(MediaBrowserCompat$CustomActionResultReceiver, "Starting preview");
            this.write.MediaSessionCompat$Token = read2;
            CGERU cgeru = this.write;
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("Must be called from the main thread.");
            } else if (cgeru.MediaMetadataCompat) {
                MapConstraints.ConstrainedMultimap.C36372.write write2 = cgeru.MediaBrowserCompat$ItemReceiver;
                Runnable runnable = cgeru.MediaBrowserCompat$MediaItem;
                synchronized (write2.read) {
                    write2.MediaBrowserCompat$CustomActionResultReceiver();
                    write2.write.post(runnable);
                }
                this.ParcelableVolumeInfo = true;
                write();
                this.MediaBrowserCompat$SearchResultReceiver.write();
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.ParcelableVolumeInfo;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.setContentView);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    static /* synthetic */ void write(CameraPreview cameraPreview, BNNM bnnm) {
        cameraPreview.AlertController$RecycleListView = bnnm;
        BNNM bnnm2 = cameraPreview.IconCompatParcelizer;
        if (bnnm2 == null) {
            return;
        }
        if (bnnm2 == null || bnnm == null || cameraPreview.MediaDescriptionCompat == null) {
            cameraPreview.RatingCompat = null;
            cameraPreview.read = null;
            cameraPreview.AppCompatDialogFragment = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = bnnm.read;
        int i2 = cameraPreview.AlertController$RecycleListView.IconCompatParcelizer;
        int i3 = cameraPreview.IconCompatParcelizer.read;
        int i4 = cameraPreview.IconCompatParcelizer.IconCompatParcelizer;
        getEnterTransitionCallback getentertransitioncallback = cameraPreview.MediaDescriptionCompat;
        cameraPreview.AppCompatDialogFragment = getentertransitioncallback.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(cameraPreview.AlertController$RecycleListView, getentertransitioncallback.read);
        Rect rect = new Rect(0, 0, i3, i4);
        Rect rect2 = cameraPreview.AppCompatDialogFragment;
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (cameraPreview.MediaSessionCompat$Token != null) {
            rect3.inset(Math.max(0, (rect3.width() - cameraPreview.MediaSessionCompat$Token.read) / 2), Math.max(0, (rect3.height() - cameraPreview.MediaSessionCompat$Token.IconCompatParcelizer) / 2));
        } else {
            int min = (int) Math.min(((double) rect3.width()) * cameraPreview.f3277x50fd9e4a, ((double) rect3.height()) * cameraPreview.f3277x50fd9e4a);
            rect3.inset(min, min);
            if (rect3.height() > rect3.width()) {
                rect3.inset(0, (rect3.height() - rect3.width()) / 2);
            }
        }
        cameraPreview.read = rect3;
        Rect rect4 = new Rect(cameraPreview.read);
        rect4.offset(-cameraPreview.AppCompatDialogFragment.left, -cameraPreview.AppCompatDialogFragment.top);
        Rect rect5 = new Rect((rect4.left * i) / cameraPreview.AppCompatDialogFragment.width(), (rect4.top * i2) / cameraPreview.AppCompatDialogFragment.height(), (rect4.right * i) / cameraPreview.AppCompatDialogFragment.width(), (rect4.bottom * i2) / cameraPreview.AppCompatDialogFragment.height());
        cameraPreview.RatingCompat = rect5;
        if (rect5.width() <= 0 || cameraPreview.RatingCompat.height() <= 0) {
            cameraPreview.RatingCompat = null;
            cameraPreview.read = null;
            Log.w(MediaBrowserCompat$CustomActionResultReceiver, "Preview frame is too small");
        } else {
            cameraPreview.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
        }
        cameraPreview.requestLayout();
        cameraPreview.MediaBrowserCompat$MediaItem();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CameraPreview cameraPreview) {
        if ((cameraPreview.write != null) && cameraPreview.setChecked.getDefaultDisplay().getRotation() != cameraPreview.MediaSessionCompat$ResultReceiverWrapper) {
            cameraPreview.MediaBrowserCompat$CustomActionResultReceiver();
            cameraPreview.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        TextureView textureView;
        SurfaceView surfaceView;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Log.d(MediaBrowserCompat$CustomActionResultReceiver, "pause()");
            this.MediaSessionCompat$ResultReceiverWrapper = -1;
            CGERU cgeru = this.write;
            if (cgeru == null) {
                this.PlaybackStateCompat$CustomAction.sendEmptyMessage(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_camera_closed);
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                if (cgeru.MediaMetadataCompat) {
                    MapConstraints.ConstrainedMultimap.C36372.write write2 = cgeru.MediaBrowserCompat$ItemReceiver;
                    Runnable runnable = cgeru.MediaBrowserCompat$CustomActionResultReceiver;
                    synchronized (write2.read) {
                        write2.MediaBrowserCompat$CustomActionResultReceiver();
                        write2.write.post(runnable);
                    }
                } else {
                    cgeru.IconCompatParcelizer = true;
                }
                cgeru.MediaMetadataCompat = false;
                this.write = null;
                this.ParcelableVolumeInfo = false;
            } else {
                throw new IllegalStateException("Must be called from the main thread.");
            }
            if (this.MediaMetadataCompat == null && (surfaceView = this.setBackgroundResource) != null) {
                surfaceView.getHolder().removeCallback(this.AppCompatActivity);
            }
            if (this.MediaMetadataCompat == null && (textureView = this.AppCompatDelegateImpl$ListMenuDecorView) != null) {
                textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.IconCompatParcelizer = null;
            this.AlertController$RecycleListView = null;
            this.RatingCompat = null;
            CGEMV cgemv = this.PlaybackStateCompat;
            OrientationEventListener orientationEventListener = cgemv.read;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
            cgemv.read = null;
            cgemv.write = null;
            cgemv.IconCompatParcelizer = null;
            this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Log.d(MediaBrowserCompat$CustomActionResultReceiver, "resume()");
            read();
            if (this.MediaMetadataCompat != null) {
                MediaBrowserCompat$MediaItem();
            } else {
                SurfaceView surfaceView = this.setBackgroundResource;
                if (surfaceView != null) {
                    surfaceView.getHolder().addCallback(this.AppCompatActivity);
                } else {
                    TextureView textureView = this.AppCompatDelegateImpl$ListMenuDecorView;
                    if (textureView != null) {
                        if (textureView.isAvailable()) {
                            new TextureView.SurfaceTextureListener() {
                                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                                    return false;
                                }

                                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                }

                                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                                    onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                                }

                                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                                    BNNM unused = CameraPreview.this.MediaMetadataCompat = new BNNM(i, i2);
                                    CameraPreview.this.MediaBrowserCompat$MediaItem();
                                }
                            }.onSurfaceTextureAvailable(this.AppCompatDelegateImpl$ListMenuDecorView.getSurfaceTexture(), this.AppCompatDelegateImpl$ListMenuDecorView.getWidth(), this.AppCompatDelegateImpl$ListMenuDecorView.getHeight());
                        } else {
                            this.AppCompatDelegateImpl$ListMenuDecorView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                                    return false;
                                }

                                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                }

                                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                                    onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                                }

                                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                                    BNNM unused = CameraPreview.this.MediaMetadataCompat = new BNNM(i, i2);
                                    CameraPreview.this.MediaBrowserCompat$MediaItem();
                                }
                            });
                        }
                    }
                }
            }
            requestLayout();
            this.PlaybackStateCompat.write(getContext(), this.setHasDecor);
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
