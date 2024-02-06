package oauth.signpost.exception;

public class OAuthNotAuthorizedException extends OAuthException {
    public OAuthNotAuthorizedException() {
        super("Authorization failed (server replied with a 401). This can happen if the consumer key was not correct or the signatures did not match.");
    }
}
