package ex_17_Aug_2024.WrapperClasses.enumEx;

public enum APIConstants {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private final String url;

    APIConstants(String url) {
        this.url=url;
    }

    public String getUrl(){
        return url;
    }


}
