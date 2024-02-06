package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;

/* renamed from: o.nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver */
class nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<animateCameraWithDurationAndCallback> {
    private String IconCompatParcelizer;
    final /* synthetic */ nativeWriteImageToFileBuffer MediaBrowserCompat$CustomActionResultReceiver;
    private Interner write;

    public final /* synthetic */ void onNext(Object obj) {
        animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = (animateCameraWithDurationAndCallback) obj;
        nativeWriteImageToFileBuffer.RatingCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
        setUuidFromUtf8Bytes write2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token.write("MOB".equals(this.write.RatingCompat) ? animateCameraWithCallback.MOB : animateCameraWithCallback.CID, this.write, animatecamerawithdurationandcallback, "", (String) null, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.setItemInvoker(), this.IconCompatParcelizer);
        boolean z = false;
        if (animatecamerawithdurationandcallback.MediaSessionCompat$Token) {
            if (animatecamerawithdurationandcallback.MediaBrowserCompat$SearchResultReceiver) {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = this.MediaBrowserCompat$CustomActionResultReceiver;
                getEdgeStrengthUniform getedgestrengthuniform = new getEdgeStrengthUniform(this, animatecamerawithdurationandcallback, write2);
                if (nativewriteimagetofilebuffer.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getedgestrengthuniform.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
                    return;
                }
                return;
            }
            write2.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(write2.write(), true));
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            Shader shader = new Shader(write2);
            if (nativewriteimagetofilebuffer2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                shader.IconCompatParcelizer(nativewriteimagetofilebuffer2.RatingCompat);
            }
        } else if (animatecamerawithdurationandcallback.MediaBrowserCompat$SearchResultReceiver) {
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            PassThroughShader passThroughShader = new PassThroughShader(this, animatecamerawithdurationandcallback, write2);
            if (nativewriteimagetofilebuffer3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                passThroughShader.IconCompatParcelizer(nativewriteimagetofilebuffer3.RatingCompat);
            }
        } else {
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            getContextManager getcontextmanager = new getContextManager(write2);
            if (nativewriteimagetofilebuffer4.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getcontextmanager.IconCompatParcelizer(nativewriteimagetofilebuffer4.RatingCompat);
            }
        }
    }

    nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer, Interner interner, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativewriteimagetofilebuffer;
        this.write = interner;
        this.IconCompatParcelizer = str;
    }

    public final void onError(Throwable th) {
        String str;
        if (writeUInt64NoTag.MediaBrowserCompat$ItemReceiver(th)) {
            nativeWriteImageToFileBuffer.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = this.MediaBrowserCompat$CustomActionResultReceiver;
            getSecondPassTexelWidthUniform getsecondpasstexelwidthuniform = getSecondPassTexelWidthUniform.MediaBrowserCompat$ItemReceiver;
            if (nativewriteimagetofilebuffer.RatingCompat != null) {
                getsecondpasstexelwidthuniform.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
            }
        } else if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null) {
                str = "";
            } else {
                str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
            }
            if ("3005".equalsIgnoreCase(str)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getMinValueUniform(this)));
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
