package java100.app.service;

@SuppressWarnings("rawtypes")
public interface FacebookService {
    <T> T me(String accessToken, Class<T> type);
}
