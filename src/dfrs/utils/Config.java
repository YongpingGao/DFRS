package dfrs.utils;

public class Config {
	public static final boolean TEST = false;
	public static final String DEPARTURE_DATE = "2016/12/25";
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	//RM
	private static final String RM_HOST_1 = "HUALAPAI";//"JENA";
	private static final String RM_HOST_2 = "INAJA";//"JICARILLA";
	private static final String RM_HOST_3 = "IONE";//"KAIBAB";
	private static final String RM_HOST_4 = "JAMUL";//"KALISPEL";
	//SERVER
	private static final String SERVER_HOST_1 = RM_HOST_1;//"KASHIA";//"JENA";
	private static final String SERVER_HOST_2 = RM_HOST_2;//"KAWEENAW";//"JICARILLA";
	private static final String SERVER_HOST_3 = RM_HOST_3;//"KLAMATH";//"KAIBAB";
	private static final String SERVER_HOST_4 = RM_HOST_4;//"LUMMI";//"KALISPEL";
	//FE
	private static final String FE_HOST = RM_HOST_4;//"KAIBAB";
	//SEQUENCER
	private static final String SE_HOST = RM_HOST_4;//"KAIBAB";
	public static final int SE_RECEIVER_FE_UDP_PROT = 8888;
	
	public static final String FE_CORBA_PORT = "1050";
	public static final int FE_RECEIVE_SERVER_PORT_1 = 8101;
	public static final int FE_RECEIVE_SERVER_PORT_2 = 8102;
	public static final int FE_RECEIVE_SERVER_PORT_3 = 8103;
	public static final int FE_RECEIVE_SERVER_PORT_4 = 8104;
	//SEATS CLASS
	public static final String FIRST_CLASS = "First";
	public static final String BUSINESS_CLASS = "Business";
	public static final String ECONOMY_CLASS = "Economy";
	public static final String ALL_CLASS = "All";
	public static final String DEPARTURE = "DEPARTURE";
	public static final String DATE = "DATE";
	public static final String DESTINATION = "DESTINATION";
	
	public static String getFeHost() {
		if(TEST)
			return "localhost";
		return FE_HOST;
	}
	public static String getRmHost1() {
		if(TEST)
			return "localhost";
		return RM_HOST_1;
	}
	public static String getRmHost2() {
		if(TEST)
			return "localhost";
		return RM_HOST_2;
	}
	public static String getRmHost3() {
		if(TEST)
			return "localhost";
		return RM_HOST_3;
	}
	public static String getRmHost4() {
		if(TEST)
			return "localhost";
		return RM_HOST_4;
	}
	public static String getServerHost1() {
		if(TEST)
			return "localhost";
		return SERVER_HOST_1;
	}
	public static String getServerHost2() {
		if(TEST)
			return "localhost";
		return SERVER_HOST_2;
	}
	public static String getServerHost3() {
		if(TEST)
			return "localhost";
		return SERVER_HOST_3;
	}
	public static String getServerHost4() {
		if(TEST)
			return "localhost";
		return SERVER_HOST_4;
	}
	public static String getSeHost() {
		if(TEST)
			return "localhost";
		return SE_HOST;
	}
	
 
}
