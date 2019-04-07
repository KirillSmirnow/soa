package ml.thistle.soa.shared.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponse {

    private final String accessToken;
    private final String refreshToken;
    private final int expiresIn;

    public TokenResponse(@JsonProperty("access_token") String accessToken,
                         @JsonProperty("refresh_token") String refreshToken,
                         @JsonProperty("expires_in") int expiresIn) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
    }

    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("refreshToken")
    public String getRefreshToken() {
        return refreshToken;
    }

    @JsonProperty("expiresIn")
    public int getExpiresIn() {
        return expiresIn;
    }
}
