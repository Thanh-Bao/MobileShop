package model_utility;

import model_ConnectDB.DataSource;

public class Config {

//	   _____    ____    _           ____            _   _                
//	   / ____|  / __ \  | |         / __ \          | | (_)               
//	  | (___   | |  | | | |        | |  | |  _ __   | |  _   _ __     ___ 
//	   \___ \  | |  | | | |        | |  | | | '_ \  | | | | | '_ \   / _ \
//	   ____) | | |__| | | |____    | |__| | | | | | | | | | | | | | |  __/
//	  |_____/   \___\_\ |______|    \____/  |_| |_| |_| |_| |_| |_|  \___|
//	___________________________________________________________________________________________  ______________________________________________________ ______________________________________________________ ___________________________________________________________________________________________________________________________________________________                                                                  
//	public static final String SERVER_NAME = "jdbc:sqlserver://MOBILESHOP.mssql.somee.com:1433";
//	public static final String DATABASE_NAME = "MOBILESHOP";
//	public static final String USERNAME_DB = "lazadamimax3_SQLLogin_1";
//	public static final String PASSWORD_DB = "p5crwl1u5s";

//	__________________________________________________________________________________________________________________________________________________________________________________________________________________
//	  _____    ____    _              _                          _   _                     _   
//	  / ____|  / __ \  | |            | |                        | | | |                   | |  
//	 | (___   | |  | | | |            | |   ___     ___    __ _  | | | |__     ___    ___  | |_ 
//	  \___ \  | |  | | | |            | |  / _ \   / __|  / _` | | | | '_ \   / _ \  / __| | __|
//	  ____) | | |__| | | |____        | | | (_) | | (__  | (_| | | | | | | | | (_) | \__ \ | |_ 
//	 |_____/   \___\_\ |______|       |_|  \___/   \___|  \__,_| |_| |_| |_|  \___/  |___/  \__|
//	___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
	public static final String SERVER_NAME = "jdbc:sqlserver://103.130.212.219:1433";
	public static final String DATABASE_NAME = "MOBILESHOP";
	public static final String USERNAME_DB = "sa";
	public static final String PASSWORD_DB = "v![ALBg,6tqH#vG";
///	_______________________________________________________________________________________________________________________________________________________________________

	public static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	Số kết nối đồng thời
	public static final int DB_MAX_CONNECTIONS = 10;
//	____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//	#####public static final String STRING_CONNECTION = "jdbc:sqlserver://localhost:1433;DATABASE_NAME=Demo;user=sa;password=sa";

	// for Send Mail
	// OTP_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
	public static final String OWNER_EMAIL = "lazadamimax3@gmail.com";
	public static final String MAIL_PASSWORD = "Admin123@#";
//	___________________________________________________________________________________________________________________________________________________________________________________________________
	// Login bằng google
//	https://console.developers.google.com/apis/credentials/oauthclient/513013153147-13nhsbm8a1gtp4i1vq2l9j228f1q8691.apps.googleusercontent.com?project=demologinservlet&supportedpurview=project

	public static String GOOGLE_CLIENT_ID = "513013153147-13nhsbm8a1gtp4i1vq2l9j228f1q8691.apps.googleusercontent.com";
	public static String GOOGLE_CLIENT_SECRET = "9vMjUVMMfYB3PfMxU4FD6heb";
	public static String GOOGLE_REDIRECT_URI = "http://localhost:8080/MobileShop/login-google";
	public static String GOOGLE_URL_HREF_JSP = "https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri="
			+ GOOGLE_REDIRECT_URI
			+ "&response_type=code&client_id=513013153147-13nhsbm8a1gtp4i1vq2l9j228f1q8691.apps.googleusercontent.com&approval_prompt=force";

	public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
	public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
	public static String GOOGLE_GRANT_TYPE = "authorization_code";

	// CẤU HÌNH OTP
	public static final int OTP_LIVE_SECOND = 60;

	// CẤU HÌNH COOKIE GHI NHỚ ĐĂNG NHẬP
	// tên token ghi nhớ đăng nhập lưu trong cookie browser
	public static final String NAME_TOKEN_REMEMBER_LOGIN = "0h5rg67";
	public static final int MAX_TIME_REMEMBER_LOGIN = 1000 * 3600 * 24 * 30;

	// recaptcha google
	public static final String SITE_KEY = "6LelZAsTAAAAAAv1ADYDnq8AzbmPmbMvjh-xhfgB";
	public static final String SECRET_KEY = "6LelZAsTAAAAAKa_s6g2yuJzByYlk0FH_6iTkZJC";

	// Giới hạn số lượng sản phẩm giỏ hàng
	public static final int MAX_PRODUCT = 5;
	public static final int MAX_QUANTITY_OF_PRODUCT = 5;

}

//____                 ____                           _______ _                      
//|  _ \               / __ \                         |__   __| |                     
//| |_) | __ _ _ __   | |  | |_   _ _   _  ___ _ __      | |  | |__  _   _  ___   ___ 
//|  _ < / _` | '_ \  | |  | | | | | | | |/ _ \ '_ \     | |  | '_ \| | | |/ _ \ / __|
//| |_) | (_| | | | | | |__| | |_| | |_| |  __/ | | |    | |  | | | | |_| | (_) | (__ 
//|____/ \__,_|_| |_|  \___\_\\__,_|\__, |\___|_| |_|    |_|  |_| |_|\__,_|\___/ \___|
//                                  __/ |                                            
//                                 |___/       

//__      __    __  __       _     _ _           _                 
//\ \    / /   |  \/  |     | |   (_) |         | |                
// \ \  / /__  | \  / | ___ | |__  _| | ___  ___| |__   ___  _ __  
//  \ \/ / _ \ | |\/| |/ _ \| '_ \| | |/ _ \/ __| '_ \ / _ \| '_ \ 
//   \  /  __/ | |  | | (_) | |_) | | |  __/\__ \ | | | (_) | |_) |
//    \/ \___| |_|  |_|\___/|_.__/|_|_|\___||___/_| |_|\___/| .__/ 
//                                                          | |    
//                                                          |_|    

//_____  _    _ __  ___  _____ _______ _____ 
//|  __ \| |  | /_ |/ _ \|  __ \__   __/ ____|
//| |  | | |__| || | (_) | |  | | | | | |     
//| |  | |  __  || |> _ <| |  | | | | | |     
//| |__| | |  | || | (_) | |__| | | | | |____ 
//|_____/|_|  |_||_|\___/|_____/  |_|  \_____|

//_______                _______ _                 _       ____                __  ___  __ ____   ___   ___  __ ______ 
//|__   __|              |__   __| |               | |     |  _ \              /_ |/ _ \/_ |___ \ / _ \ / _ \/_ |____  |
//  | |_ __ __ _ _ __      | |  | |__   __ _ _ __ | |__   | |_) | __ _  ___    | | (_) || | __) | | | | | | || |   / / 
//  | | '__/ _` | '_ \     | |  | '_ \ / _` | '_ \| '_ \  |  _ < / _` |/ _ \   | |> _ < | ||__ <| | | | | | || |  / /  
//  | | | | (_| | | | |    | |  | | | | (_| | | | | | | | | |_) | (_| | (_) |  | | (_) || |___) | |_| | |_| || | / /   
//  |_|_|  \__,_|_| |_|    |_|  |_| |_|\__,_|_| |_|_| |_| |____/ \__,_|\___/   |_|\___/ |_|____/ \___/ \___/ |_|/_/    
//                                                                                                                  

//_   _                                _    _               _____                    
//| \ | |                              | |  | |             |  __ \                   
//|  \| | __ _ _   _ _   _  ___ _ __   | |__| |_   _ _   _  | |  | | __ _ _ __   __ _ 
//| . ` |/ _` | | | | | | |/ _ \ '_ \  |  __  | | | | | | | | |  | |/ _` | '_ \ / _` |
//| |\  | (_| | |_| | |_| |  __/ | | | | |  | | |_| | |_| | | |__| | (_| | | | | (_| |
//|_| \_|\__, |\__,_|\__, |\___|_| |_| |_|  |_|\__,_|\__,_| |_____/ \__,_|_| |_|\__, |
//       __/ |       __/ |                                                      __/ |
//      |___/       |___/                                                      |___/ 

//_   _                               __      __            _____                        
//| \ | |                              \ \    / /           / ____|                       
//|  \| | __ _ _   _ _   _  ___ _ __    \ \  / /_ _ _ __   | |    _   _  ___  _ __   __ _ 
//| . ` |/ _` | | | | | | |/ _ \ '_ \    \ \/ / _` | '_ \  | |   | | | |/ _ \| '_ \ / _` |
//| |\  | (_| | |_| | |_| |  __/ | | |    \  / (_| | | | | | |___| |_| | (_) | | | | (_| |
//|_| \_|\__, |\__,_|\__, |\___|_| |_|     \/ \__,_|_| |_|  \_____\__,_|\___/|_| |_|\__, |
//       __/ |       __/ |                                                          __/ |
//      |___/       |___/                                                          |___/ 
