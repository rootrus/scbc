package p040o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.ModifyQuickBalanceActivity */
public final class ModifyQuickBalanceActivity {
    /* access modifiers changed from: private */
    public static final Logger IconCompatParcelizer = Logger.getLogger(ModifyQuickBalanceActivity.class.getName());

    private ModifyQuickBalanceActivity() {
    }

    public static PinLoginActivity MediaBrowserCompat$CustomActionResultReceiver(HowToAddAccountActivity howToAddAccountActivity) {
        if (howToAddAccountActivity != null) {
            return new SetupQuickPromptPayActivity(howToAddAccountActivity);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static onLoginButtonClick read(QuickPromptPayActivity quickPromptPayActivity) {
        if (quickPromptPayActivity != null) {
            return new QuickPromptPayReviewActivity(quickPromptPayActivity);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static HowToAddAccountActivity write(File file) throws FileNotFoundException {
        if (file != null) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final ModifyQuickPromptPayActivity modifyQuickPromptPayActivity = new ModifyQuickPromptPayActivity();
            return new HowToAddAccountActivity() {
                public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("byteCount < 0: ");
                        sb.append(j);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (i == 0) {
                        return 0;
                    } else {
                        modifyQuickPromptPayActivity.throwIfReached();
                        BaseQuickTopUpReviewActivity write = onmenupromptpayclick.write(1);
                        int read2 = fileInputStream.read(write.MediaBrowserCompat$CustomActionResultReceiver, write.IconCompatParcelizer, (int) Math.min(j, (long) (2048 - write.IconCompatParcelizer)));
                        if (read2 == -1) {
                            return -1;
                        }
                        write.IconCompatParcelizer += read2;
                        long j2 = (long) read2;
                        onmenupromptpayclick.IconCompatParcelizer += j2;
                        return j2;
                    }
                }

                public final void close() throws IOException {
                    fileInputStream.close();
                }

                public final ModifyQuickPromptPayActivity timeout() {
                    return modifyQuickPromptPayActivity;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("source(");
                    sb.append(fileInputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    public static QuickPromptPayActivity MediaBrowserCompat$CustomActionResultReceiver(File file) throws FileNotFoundException {
        if (file != null) {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            final ModifyQuickPromptPayActivity modifyQuickPromptPayActivity = new ModifyQuickPromptPayActivity();
            return new QuickPromptPayActivity() {
                public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                    ModifyQuickTopUpActivity.IconCompatParcelizer(onmenupromptpayclick.IconCompatParcelizer, 0, j);
                    while (j > 0) {
                        r0.throwIfReached();
                        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = onmenupromptpayclick.read;
                        int min = (int) Math.min(j, (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat));
                        r2.write(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, min);
                        baseQuickTopUpReviewActivity.MediaMetadataCompat += min;
                        long j2 = (long) min;
                        j -= j2;
                        onmenupromptpayclick.IconCompatParcelizer -= j2;
                        if (baseQuickTopUpReviewActivity.MediaMetadataCompat == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
                            onmenupromptpayclick.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                            HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
                        }
                    }
                }

                public final void flush() throws IOException {
                    r2.flush();
                }

                public final void close() throws IOException {
                    r2.close();
                }

                public final ModifyQuickPromptPayActivity timeout() {
                    return r0;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sink(");
                    sb.append(r2);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    public static QuickPromptPayActivity read(File file) throws FileNotFoundException {
        if (file != null) {
            final FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            final ModifyQuickPromptPayActivity modifyQuickPromptPayActivity = new ModifyQuickPromptPayActivity();
            return new QuickPromptPayActivity() {
                public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                    ModifyQuickTopUpActivity.IconCompatParcelizer(onmenupromptpayclick.IconCompatParcelizer, 0, j);
                    while (j > 0) {
                        r0.throwIfReached();
                        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = onmenupromptpayclick.read;
                        int min = (int) Math.min(j, (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat));
                        r2.write(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, min);
                        baseQuickTopUpReviewActivity.MediaMetadataCompat += min;
                        long j2 = (long) min;
                        j -= j2;
                        onmenupromptpayclick.IconCompatParcelizer -= j2;
                        if (baseQuickTopUpReviewActivity.MediaMetadataCompat == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
                            onmenupromptpayclick.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                            HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
                        }
                    }
                }

                public final void flush() throws IOException {
                    r2.flush();
                }

                public final void close() throws IOException {
                    r2.close();
                }

                public final ModifyQuickPromptPayActivity timeout() {
                    return r0;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sink(");
                    sb.append(r2);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    public static QuickPromptPayActivity read(final Socket socket) throws IOException {
        if (socket != null) {
            final C97844 r0 = new PinChangeSuccessActivity_ViewBinding() {
                /* access modifiers changed from: protected */
                public final IOException newTimeoutException(IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void timedOut() {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        Logger IconCompatParcelizer2 = ModifyQuickBalanceActivity.IconCompatParcelizer;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to close timed out socket ");
                        sb.append(socket);
                        IconCompatParcelizer2.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                            throw e2;
                        }
                        Logger IconCompatParcelizer3 = ModifyQuickBalanceActivity.IconCompatParcelizer;
                        Level level2 = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to close timed out socket ");
                        sb2.append(socket);
                        IconCompatParcelizer3.log(level2, sb2.toString(), e2);
                    }
                }
            };
            final OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return r0.sink(new QuickPromptPayActivity() {
                    public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                        ModifyQuickTopUpActivity.IconCompatParcelizer(onmenupromptpayclick.IconCompatParcelizer, 0, j);
                        while (j > 0) {
                            r0.throwIfReached();
                            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = onmenupromptpayclick.read;
                            int min = (int) Math.min(j, (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat));
                            outputStream.write(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, min);
                            baseQuickTopUpReviewActivity.MediaMetadataCompat += min;
                            long j2 = (long) min;
                            j -= j2;
                            onmenupromptpayclick.IconCompatParcelizer -= j2;
                            if (baseQuickTopUpReviewActivity.MediaMetadataCompat == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
                                onmenupromptpayclick.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                                HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
                            }
                        }
                    }

                    public final void flush() throws IOException {
                        outputStream.flush();
                    }

                    public final void close() throws IOException {
                        outputStream.close();
                    }

                    public final ModifyQuickPromptPayActivity timeout() {
                        return r0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("sink(");
                        sb.append(outputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                });
            }
            throw new IllegalArgumentException("out == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static HowToAddAccountActivity MediaBrowserCompat$CustomActionResultReceiver(final Socket socket) throws IOException {
        if (socket != null) {
            final C97844 r0 = new PinChangeSuccessActivity_ViewBinding() {
                /* access modifiers changed from: protected */
                public final IOException newTimeoutException(IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void timedOut() {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        Logger IconCompatParcelizer2 = ModifyQuickBalanceActivity.IconCompatParcelizer;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to close timed out socket ");
                        sb.append(socket);
                        IconCompatParcelizer2.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                            throw e2;
                        }
                        Logger IconCompatParcelizer3 = ModifyQuickBalanceActivity.IconCompatParcelizer;
                        Level level2 = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to close timed out socket ");
                        sb2.append(socket);
                        IconCompatParcelizer3.log(level2, sb2.toString(), e2);
                    }
                }
            };
            final InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return r0.source(new HowToAddAccountActivity() {
                    public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                        if (i < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("byteCount < 0: ");
                            sb.append(j);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (i == 0) {
                            return 0;
                        } else {
                            modifyQuickPromptPayActivity.throwIfReached();
                            BaseQuickTopUpReviewActivity write = onmenupromptpayclick.write(1);
                            int read2 = fileInputStream.read(write.MediaBrowserCompat$CustomActionResultReceiver, write.IconCompatParcelizer, (int) Math.min(j, (long) (2048 - write.IconCompatParcelizer)));
                            if (read2 == -1) {
                                return -1;
                            }
                            write.IconCompatParcelizer += read2;
                            long j2 = (long) read2;
                            onmenupromptpayclick.IconCompatParcelizer += j2;
                            return j2;
                        }
                    }

                    public final void close() throws IOException {
                        fileInputStream.close();
                    }

                    public final ModifyQuickPromptPayActivity timeout() {
                        return modifyQuickPromptPayActivity;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("source(");
                        sb.append(fileInputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                });
            }
            throw new IllegalArgumentException("in == null");
        }
        throw new IllegalArgumentException("socket == null");
    }
}
