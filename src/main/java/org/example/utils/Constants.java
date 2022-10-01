package org.example.utils;

public class Constants {
    public static String BASE_URL = "https://www.a101.com.tr/";

    public class XPATH {
        public static String ACCEPT_COOKIES = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
        public static String CLOTHING_AND_ACCESORY = "(//a[contains(@href,'/giyim-aksesuar/')])[1]";
        public static String WOMAN_UNDERWEAR = "(//a[contains(@href,'/giyim-aksesuar/kadin-ic-giyim/')])[2]";
        public static String KNEE_HIGH_SOCKS = "Dizaltı Çorap";
        public static String DENIER_TROUSERS_SOCKS_BLACK = "/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3";
        public static String ADD_BASKET = "/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button";
        public static String SHOW_BASKET = "//*[@id=\"js-modal-basket\"]/div[3]/a[3]";
        public static String APPROVE_BASKET = "/html/body/section/div[1]/div[2]/div/div[2]/div/a";
        public static String WITHOUT_SIGNUP = "/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a";
        public static String ENTER_EMAIL = "/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input";
        public static String CONTINUE_BUTTON = "/html/body/section/div[1]/div/div[2]/div/div/form/button";
        public static String CREATE_NEW_ADDRESS = "/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a";
        public static String ADDRESS_TITLE = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input";
        public static String FIRST_NAME = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input";
        public static String SURNAME = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input";
        public static String PHONE_NUMBER = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input";
        public static String CITY_DROPDOWN = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select";
        public static String CITY = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[3]";
        public static String TOWN_DROPDOWN = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select";
        public static String TOWN = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[4]";
        public static String DISTRICT_DROPDOWN = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select";
        public static String DISTRICT = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select/option[3]";
        public static String FULL_ADDRESS = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea";
        public static String SAVE_ADDRESS_BUTTON = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/button[1]";
        public static String CARGO = "/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li[1]/label/div[2]/div";
        public static String SAVE_AND_CONTINUE_BUTTON = "/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button";
    }
}
