package p040o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: o.onSubmit */
public final class onSubmit {
    public static final NsipPartnerPaymentOtpActivity read(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "$receiver");
        return new ShortcutRouterActivity(howToAddAccountStep2Activity);
    }

    public static final NsipPartnerPaymentReviewActivity read(PinChangeActivity pinChangeActivity) {
        onGetStartedClick.write((Object) pinChangeActivity, "$receiver");
        return new onCitizenTabClicked(pinChangeActivity);
    }

    public static final HowToAddAccountStep2Activity IconCompatParcelizer(InputStream inputStream) {
        onGetStartedClick.write((Object) inputStream, "$receiver");
        return new NsipPartnerPaymentSuccessActivity(inputStream, new PinChangeActivity_ViewBinding());
    }

    public static final PinChangeActivity write() {
        return new PartnerLandingAdapter$PartnerHorizontalGroup();
    }

    public static final PinChangeActivity write(Socket socket) throws IOException {
        onGetStartedClick.write((Object) socket, "$receiver");
        FingerprintHelperInterface$FingerprintException fingerprintHelperInterface$FingerprintException = new FingerprintHelperInterface$FingerprintException(socket);
        OutputStream outputStream = socket.getOutputStream();
        onGetStartedClick.IconCompatParcelizer((Object) outputStream, "getOutputStream()");
        return fingerprintHelperInterface$FingerprintException.sink(new lambda$init$2$BasePersonalInfoActivity(outputStream, fingerprintHelperInterface$FingerprintException));
    }

    public static final HowToAddAccountStep2Activity read(Socket socket) throws IOException {
        onGetStartedClick.write((Object) socket, "$receiver");
        FingerprintHelperInterface$FingerprintException fingerprintHelperInterface$FingerprintException = new FingerprintHelperInterface$FingerprintException(socket);
        InputStream inputStream = socket.getInputStream();
        onGetStartedClick.IconCompatParcelizer((Object) inputStream, "getInputStream()");
        return fingerprintHelperInterface$FingerprintException.source(new NsipPartnerPaymentSuccessActivity(inputStream, fingerprintHelperInterface$FingerprintException));
    }

    public static /* synthetic */ PinChangeActivity write(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "$receiver");
        OutputStream fileOutputStream = new FileOutputStream(file, false);
        onGetStartedClick.write((Object) fileOutputStream, "$receiver");
        return new lambda$init$2$BasePersonalInfoActivity(fileOutputStream, new PinChangeActivity_ViewBinding());
    }

    public static final PinChangeActivity MediaBrowserCompat$CustomActionResultReceiver(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "$receiver");
        OutputStream fileOutputStream = new FileOutputStream(file, true);
        onGetStartedClick.write((Object) fileOutputStream, "$receiver");
        return new lambda$init$2$BasePersonalInfoActivity(fileOutputStream, new PinChangeActivity_ViewBinding());
    }

    public static final HowToAddAccountStep2Activity IconCompatParcelizer(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "$receiver");
        InputStream fileInputStream = new FileInputStream(file);
        onGetStartedClick.write((Object) fileInputStream, "$receiver");
        return new NsipPartnerPaymentSuccessActivity(fileInputStream, new PinChangeActivity_ViewBinding());
    }

    public static final boolean write(AssertionError assertionError) {
        onGetStartedClick.write((Object) assertionError, "$receiver");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? GoodToKnowActivity.read(message, "getsockname failed", false) : false;
    }

    public static final PinChangeActivity read(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "$receiver");
        OutputStream fileOutputStream = new FileOutputStream(file, false);
        onGetStartedClick.write((Object) fileOutputStream, "$receiver");
        return new lambda$init$2$BasePersonalInfoActivity(fileOutputStream, new PinChangeActivity_ViewBinding());
    }
}
