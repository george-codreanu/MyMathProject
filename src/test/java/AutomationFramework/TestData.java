package AutomationFramework;

public class TestData {

    // ---------------------------- General

    public static final String APP_PACKAGE = "ro.raiffeisen.smartmobile.development";
    public static final String APP_ACTIVITY = "ro.raiffeisen.smartmobile.main.loggedout.MainLoggedOutActivity";
    public static final String RAIFF_APP_NAME = "SmartMobile (development)";
    public static final String APP_VERSION = "v.0.5.10";

    public static final String TEST_PF_01_USERNAME = "testpf01";
    public static final String TEST_PF_01_PASSWORD = "test1234";

    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";


    // -------------------------- Assert wards
    public static final String LABEL = " label";
    public static final String PLACEHOLDER = " placeholder";
    public static final String BUTTON = " button";
    public static final String TITLE = " title";

    public static final String IS_CORRECT = " is correct - ";
    public static final String IS_NOT_CORRECT = " is not correct - ";
    public static final String LABEL_IS_CORRECT = LABEL + IS_CORRECT;
    public static final String LABEL_IS_NOT_CORRECT = LABEL + IS_NOT_CORRECT;
    public static final String IS_ENABLED_AND_DISPLAYED = " is enabled and displayed - ";
    public static final String IS_ENABLED = " is enabled -";
    public static final String IS_NOT_ENABLED = " is not enabled -";



    // -------------------------------------------------------------------- Waiting Time
    public static final int SHORT_WAIT = 5;
    public static final int MEDIUM_WAIT = 10;
    public static final int LONG_WAIT = 20;


    // -------------------------------------------------------------------- TEST GROUPS
    // ---------- Client Group
    public static final String ANDROID_GROUP = "Android";
    public static final String IOS_GROUP = "iOS";

    // ---------- Suite Group
    public static final String SMOKE_GROUP = "Smoke";
    public static final String SANITY_GROUP = "Sanity";

    // ---------- Feature Group
    public static final String LOGIN_GROUP = "Login";
    public static final String CONTACT_GROUP  = "Contact";
    public static final String LOCATOR_GROUP = "Locator";
    public static final String INTEREST_RATES_GROUP = "IntRate";

    // ---------- Type Group
    public static final String UI_GROUP = "UI";
    public static final String FNCT_GROUP = "Functionality";



    // -------------------------------------------------------------------- STATIC TEXT
    // ---------------------------- GENERAL TEXT
    public static final String RAIFF_APP = "raiffeisen app";
    public static final String PHONE_CONTACT_DEVICE = "phone contact device";
    public static final String GOOGLE_MAIL_WELCOME_MESSAGE = "google mail welcome message";
    public static final String JUST_ONCE_BUTTON = "just once button";
    public static final String CALL_BUTTON = "call buton";
    public static final String SHARE_BUTTON = "share button";
    public static final String PHONE_ICON = "phone icon";
    public static final String CALL = "Call";
    public static final String SHARE = "Share";


    // ----------------------------------------------------- Login
    // --- elements
    public static final String LOGIN_TAB = "login tab";
    public static final String AUTH = "authentication";
    public static final String RO_LANGUAGE = "RO language";
    public static final String EN_LANGUAGE = "EN language";
    public static final String WELCOME_MESSAGE_LABEL = "welcome message label";
    public static final String RO_LANGUAGE_BUTTON = "RO language button";
    public static final String EN_LANGUAGE_BUTTON = "EN LANGUAGE button";
    public static final String USERNAME_FIELD = "username field";
    public static final String PASSWORD_FIELD = "password field";
    public static final String FORGOT_PASSWORD_LINK = "forgor password link";
    public static final String AUTH_BUTTON = "authentication button";
    public static final String AUTH_ERROR = "authentication error";
    // --- RO
    public static final String RO = "RO";
    public static final String RO_WELCOME_MESSAGE = "Bine ai venit la";
    public static final String RO_USERNAME_FIELD = "Nume utilizator";
    public static final String RO_PASSWORD_FIELD = "Parolă";
    public static final String RO_FORGOT_PASSWORD_LINL = "Ai uitat parola?";
    public static final String RO_AUTH_BUTTON = "Autentificare";
    public static final String RO_AUTHENTICATION_ERROR_MESSAGE = "Nume utilizator sau parola incorecte.";

    // --- EN
    public static final String EN = "EN";
    public static final String EN_WELCOME_MESSAGE = "Welcome to";
    public static final String EN_USERNAME_FIELD = "Username";
    public static final String EN_PASSWORD_FIELD = "Password";
    public static final String EN_FORGOT_PASSWORD_LINL = "I forgot my password";
    public static final String EN_AUTH_BUTTON = "Authenticate";
    public static final String EN_AUTHENTICATION_ERROR_MESSAGE = "Invalid username or password.";
    public static final String LOGIN_TAB_LABEL = "Login";


    // ----------------------------------------------------- Locator
    // --- HardCode Data
    public static final String[] AGENTIA_FLOREASCA_CITY_CENTER_DATA = {"AGENTIA FLOREASCA CITY CENTER", "7 m", "Calea  Floreasca 246 D Sector 1 Bucuresti", "0213062133", "For another 0 hours 5 minutes", "09:00-17:30", "13:00-13:30"};
    public static final String TIME_WITHIN_WORKING_HOURS = "20180423.110000";
    public static final String TIME_WITHIN_CLOSING_HOURS = "20120423.130000";
    public static final String TIME_WITHIN_LUNCH_BREAK = "20120423.130000";
    // --- elements
    public static final String LOCATOR_TAB = "locator tab";
    public static final String LOCATOR_HEADER = "locator header";
    public static final String SEARCH_BAR = "search bar";
    public static final String RESET_SEARCH_BAR = "reset search bar";
    public static final String LOCATE_ME_BUTTON = "locate me button";
    public static final String BEARING_RESET_BUTTON = "bearing reset button";
    public static final String RECENT_HISTORY_TITLE = "recent history title";
    public static final String RECENT_HISTORY_BUTTON= "recent history button";
    public static final String SUGGESTIONS_TITLE = "suggestions title";
    public static final String YOU_HAVE_CHOSEN_LABEL = "you have chosen label";
    public static final String POI_NAME = "poi name";
    public static final String NAVIGATION_BUTTON = "navigation button";
    public static final String WALKING_DISTANCE = "waking distance";
    public static final String STATUS = "status";
    public static final String STATUS_TIME_LEFT = "status time left";
    public static final String LOCATION_ICON = "location icon";
    public static final String WORKING_HOURS_ICON = "working hours icon";
    public static final String POI_ADDRESS = "poi address";
    public static final String POI_PHONE_NUMBER = "poi phone number";
    public static final String FIRST_OPTION = "0";
    public static final String SECOND_OPTION = "1";
    public static final String THIRD_OPTION = "2";
    public static final String FORTH_OPTION = "3";
    public static final String FIFTH_OPTION = "4";
    // --- BOTH LANGUAGES
    public static final String BOTH_LOCATOR = "Locator";
    // --- RO
    public static final String RO_SEARCH_BAR_PLACEHOLDER = "Cauta Agenție,ATM,MFM,Stradă";
    public static final String RO_RECENT_HISTORY_TITLE = "Ai căutat recent";
    public static final String RO_RECENT_HISTORY_BUTTON = "NU EXISTĂ ISTORIC DE CAUTARE";
    public static final String RO_SUGGESTION_TITLE = "În apropierea ta";
    public static final String RO_CHOICE_LABEL = "Ai ales";
    public static final String RO_OPEN = "Deschis";
    public static final String RO_LUNCH = "Pranz";
    public static final String RO_CLOSED = "Inchis";
    public static final String RO_MONDAY = "luni";
    public static final String RO_TUESDAY = "marti";
    public static final String RO_WEDNESDAY = "miercuri";
    public static final String RO_THURSDAY = "joi";
    public static final String RO_FRIDAY = "vineri";
    public static final String RO_SATURDAY= "sambata";
    public static final String RO_SUNDAY= "duminca";
    // --- EN
    public static final String EN_SEARCH_BAR_PLACEHOLDER = "Search for Branch,ATM,MFM,Street";
    public static final String EN_RECENT_HISTORY_TITLE = "Your recent search";
    public static final String EN_RECENT_HISTORY_BUTTON = "NO SEARCH HISTORY";
    public static final String EN_SUGGESTION_TITLE = "Close to you";
    public static final String EN_CHOICE_LABEL = "You have chosen";
    public static final String EN_OPEN = "Open";
    public static final String EN_LUNCH = "Lunch";
    public static final String EN_CLOSED = "Closed";
    public static final String EN_MONDAY = "monday";
    public static final String EN_TUESDAY = "tuesday";
    public static final String EN_WEDNESDAY = "wednesday";
    public static final String EN_THURSDAY = "thursday";
    public static final String EN_FRIDAY = "friday";
    public static final String EN_SATURDAY= "saturday";
    public static final String EN_SUNDAY= "sunday";


    // ----------------------------------------------------- Interest Rates
    // --- elements
    public static final String INTEREST_RATES_TAB = "interest rates tab";
    public static final String INTEREST_RATES_HEADER = "interest rates header";
    // --- BOTH LANGUAGES
    // --- RO
    // --- EN

    public static final String ROBOR = "ROBOR";
    public static final String EURIBOR = "EURIBOR";
    public static final String LIBOR = "LIBOR";


    // ----------------------------------------------------- Contact
    // --- elements
    public static final String CONTACT_TAB = "contact tab";
    public static final String CONTACT_HEADER = "contact header";
    public static final String QUESTION = "question";
    public static final String SUGGESTION = "suggestion";
    public static final String PHONE_DETAILS = "phone details";
    public static final String PHONE_NUMBER = "phone number";
    public static final String EMAIL = "email";
    public static final String EMAIL_ADDRESS = "email address";
    public static final String WEBSITE = "website";
    public static final String WEBSITE_ADDRESS = "website address";
    public static final String FOLLOW_US = "follow us";

    public static final String PHONE_ARROW = "phone arrow";
    public static final String EMAIL_ICON = "email icon";
    public static final String EMAIL_ARROW = "email arrow";
    public static final String WEBSITE_ICON = "website icon";
    public static final String WEBSITE_ARROW = "website arrow";
    public static final String FACEBOOK_ICON = "facebook icon";
    public static final String LINKEDIN_ICON = "linkedin icon";
    public static final String YOUTUBE_ICON = "youtube icon";
    public static final String INSTAGRAM_ICON = "instagram icon";

    // --- BOTH LANGUAGES
    public static final String BOTH_CONTACT = "Contact";
    public static final String BOTH_PHONE_NUMBER = "+4 021 306 55 55";
    public static final String BOTH_EMAIL_ADDRESS = "online@raiffeisen.ro";
    public static final String BOTH_WEBSITE_ADDRESS = "www.raiffeisen.ro";

    // --- RO
    public static final String RO_CONTACT_DETAILS = "Detalii contact";
    public static final String RO_QUESTION = "Ai vreo întrebare?";
    public static final String RO_SUGGESTION = "Dorești să ne sugerezi ceva?";
    public static final String RO_PHONE_DETAILS = "24/7 din țară sau străinătate";
    public static final String RO_EMAIL_LABEL = "Trimite email la";
    public static final String RO_WEBSITE_LABEL = "Vizitează-ne la";
    public static final String RO_FOLLOW_US = "URMĂREȘTE-NE PE SOCIAL MEDIA";

    // --- EN
    public static final String EN_CONTACT_DETAILS = "Contact Details";
    public static final String EN_QUESTION = "Do you have a question?";
    public static final String EN_SUGGESTION = "Are you suggesting something?";
    public static final String EN_PHONE_DETAILS = "24/7 from local or abroad";
    public static final String EN_EMAIL_LABEL = "Send email at";
    public static final String EN_WEBSITE_LABEL = "Visit us at";
    public static final String EN_FOLLOW_US = "FOLLOW US ON";



    // ----------------------------------------------------- Exchange Rates
    // --- elements
    public static final String EXCHANGE_RATES_TAB = "exchange rates tab";
    public static final String EXCHANGE_RATES_SUBTAB = "exchange rates subtab";
    public static final String COVERTER_SUBTAB = "converter subtab";
    // --- BOTH LANGUAGES
    // --- RO
    // --- EN



}
